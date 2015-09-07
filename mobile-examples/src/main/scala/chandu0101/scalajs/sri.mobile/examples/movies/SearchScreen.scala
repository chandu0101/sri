package chandu0101.scalajs.sri.mobile.examples.movies

import chandu0101.scalajs.sri.mobile.styles.NativeStyleSheet
import org.scalajs.dom
import org.scalajs.dom.ext.Ajax

import scala.async.Async._

//import scala.concurrent.ExecutionContext.Implicits.global

import chandu0101.scalajs.sri.core.ElementFactory._
import chandu0101.scalajs.sri.core.{ReactComponent, ReactElement, RefType}
import chandu0101.scalajs.sri.mobile._
import chandu0101.scalajs.sri.mobile.components._

import scala.scalajs.concurrent.JSExecutionContext.Implicits.runNow
import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{JSON, URIUtils, UndefOr}


object SearchScreen {

  val API_URL = "http://api.rottentomatoes.com/api/public/v1.0/"
  val API_KEYS = List("7waqfqbprs7pajbz28mqf6vz", "y4vwv8m33hed9ety83jmv52f")


  object NoMovies {

    @ScalaJSDefined
    class Component extends ReactComponent[Props, Unit] {
      def render() = {
        var text = ""
        if (props.filter.nonEmpty) text = s"No results for ${props.filter}"
        else if (!props.isLoading) text = "No movies found"
        View(style = styles.container)(
          Text(style = styles.noMoviesText)(text)
        )
      }
    }

    case class Props(filter: String, isLoading: Boolean)

    val factory = getComponentFactory(js.constructorOf[Component],classOf[Component])

    def apply(filter: String, isLoading: Boolean, key: UndefOr[String] = js.undefined, ref: RefType = null) = createElement(factory, Props(filter, isLoading), key = key, ref = ref)

  }

  object SearchBar {

    @ScalaJSDefined
    class Component extends ReactComponent[Props, Unit] {

      def render() = View(style = styles.searchBar)(
        TextInput(autoCapitalize = AutoCapitalize.NONE, autoCorrect = false,
          onChange = props.onChange, onFocus = props.onFocus, placeholder = "Search a movie..", style = styles.searchBarInput
        )(),
        ActivityIndicatorIOS(animating = props.isLoading, style = styles.spinner)()
      )
    }

    case class Props(onChange: NEvent => Unit, onFocus: NEvent => Unit, isLoading: Boolean)

    val factory = getComponentFactory(js.constructorOf[Component],classOf[Component])

    def apply(onChange: NEvent => Unit, onFocus: NEvent => Unit, isLoading: Boolean, key: UndefOr[String] = js.undefined, ref: RefType = null) = createElement(factory, Props(onChange, onFocus, isLoading), key = key, ref = ref)

  }

  val LOADING = collection.mutable.Map.empty[String, Boolean].withDefaultValue(false)

  case class ResultsCache(dataForQuery: Map[String, js.Array[js.Dynamic]] = Map().withDefaultValue(js.Array()), nextPageNumberForQuery: Map[String, Int] = Map().withDefaultValue(0), totalForQuery: Map[String, Int] = Map().withDefaultValue(0))

  case class State(isLoading: Boolean = false, isLoadingTail: Boolean = false, dataSource: ListViewDataSource[js.Dynamic, String] = createListViewDataSource((row1: js.Dynamic, row2: js.Dynamic) => row1 != row2),queryNumber: Int = 0)


  @ScalaJSDefined
  class Component extends ReactComponent[Unit, State] {

    initialState(State())

    def render() = {
      val content: ReactElement = if (state.dataSource.getRowCount() == 0) NoMovies(filter, state.isLoading)
      else ListView[js.Dynamic, String](
        ref = storeListViewRef _,
        dataSource = state.dataSource,
        renderRow = renderRow,
        onEndReached = onEndReached _,
        renderFooter = renderFooter _,
        showsVerticalScrollIndicator = false,
        keyboardShouldPersistTaps = true,
        automaticallyAdjustContentInsets = false
      )()
      View(style = styles.container)(
        SearchBar(onSearchChange, onSearchInputFocus, state.isLoading),
        View(style = styles.separator)(),
        content
      )

    }


    override def componentDidMount(): Unit = {
      searchMovies("")
    }

    var resultsCache = ResultsCache()

    var timeoutID: Int = _

    var listViewMounted: ListViewM = null

    var filter = ""

    def storeListViewRef(ref: ListViewM) = {
      if (!js.isUndefined(ref) && ref != null) listViewMounted = ref
    }


    def _urlForQueryAndPage(query: String, pageNumber: Int) = {
      val apiKey = API_KEYS(state.queryNumber % API_KEYS.length)
      if (query.nonEmpty) s"${API_URL}movies.json?apikey=${apiKey}&q=${URIUtils.encodeURIComponent(query)}&page_limit=20&page=$pageNumber"
      else s"${API_URL}lists/movies/in_theaters.json?apikey=${apiKey}&page_limit=20&page=${pageNumber}"
    }

    def getDataSource(movies: js.Array[js.Dynamic]) = {
      state.dataSource.cloneWithRows(movies)
    }

    def searchMovies(query: String) = {
      filter = query
      val cachedResultsForQuery = resultsCache.dataForQuery.getOrElse(query, null)
      if (cachedResultsForQuery != null) {
        if (!LOADING.getOrElse(query, false)) {
          setState(state.copy(dataSource = getDataSource(cachedResultsForQuery), isLoading = false))
        } else {
          setState(state.copy(isLoading = true))
        }
      } else {
        LOADING += query -> true
        resultsCache = resultsCache.copy(dataForQuery = resultsCache.dataForQuery.updated(query, null))
        setState(state.copy(isLoading = true, queryNumber = state.queryNumber + 1, isLoadingTail = false))
        val page = resultsCache.nextPageNumberForQuery.getOrElse(query, 1)
        async {
          val result = await(Ajax.get(_urlForQueryAndPage(query, page)))
          val response = JSON.parse(result.responseText)
          val movies = response.movies.asInstanceOf[js.Array[js.Dynamic]]
          LOADING.update(query, false)
          resultsCache = resultsCache.copy(dataForQuery = resultsCache.dataForQuery.updated(query, movies),
            nextPageNumberForQuery = resultsCache.nextPageNumberForQuery.updated(query, 2),
            totalForQuery = resultsCache.totalForQuery.updated(query, response.total.asInstanceOf[Int]))
          if (filter == query) setState(state.copy(isLoading = false, dataSource = getDataSource(movies)))
        }.recover {
          case ex => {
            LOADING.update(query, false)
            setState(state.copy(isLoading = false))
            println(s"Error searching movies with query $query ")
          }
        }
      }

    }

    def hasMore = {
      val query = filter
      if (resultsCache.dataForQuery.getOrElse(query, null) == null) true
      else resultsCache.totalForQuery(query) != resultsCache.dataForQuery(query).length
    }

    def onEndReached: Unit = {
      val query = filter
      if (hasMore || !state.isLoadingTail || !LOADING(query)) {
        // if we have all elements or fetching don't do anything
        LOADING += query -> true
        setState(state.copy(queryNumber = state.queryNumber + 1, isLoadingTail = true))
        val page = resultsCache.nextPageNumberForQuery(query)
        async {
          val result = await(Ajax.get(_urlForQueryAndPage(query, page)))
          val response = JSON.parse(result.responseText)
          val moviesForQuery = resultsCache.dataForQuery(query)
          LOADING.update(query, false)
          if (js.isUndefined(response.movies)) {
            resultsCache = resultsCache.copy(totalForQuery = resultsCache.totalForQuery.updated(query, moviesForQuery.length))
          } else {
            val movies = response.movies.asInstanceOf[js.Array[js.Dynamic]]
            movies.foreach(m => moviesForQuery.push(m))
            resultsCache = resultsCache.copy(dataForQuery = resultsCache.dataForQuery.updated(query, moviesForQuery),
              nextPageNumberForQuery = resultsCache.nextPageNumberForQuery.updated(query, resultsCache.nextPageNumberForQuery(query) + 1))
          }
          if (filter == query) setState(state.copy(isLoadingTail = false, dataSource = getDataSource(resultsCache.dataForQuery(query))))
        }
      }
    }




    def renderRow(movie: js.Dynamic, sectionID: String, rowID: String): ReactElement = {
      MovieCell(movie = movie, key = movie.title.toString)
    }

    def renderFooter = {
      if (!hasMore || !state.isLoadingTail) View(style = styles.scrollSpinner)()
      else ActivityIndicatorIOS(style = styles.scrollSpinner)()
    }

    def onSearchChange(event: NEvent) = {
      val filterLocal = event.nativeEvent.text.toString.toLowerCase()
      dom.window.clearTimeout(timeoutID)
      timeoutID = dom.window.setTimeout(() => searchMovies(filterLocal), 100)
    }

    def dude[T <: js.Object](name: String) = "dude".asInstanceOf[T]

    def onSearchInputFocus(e: NEvent) = {
      if (listViewMounted != null) listViewMounted.getScrollResponder().scrollTo(0, 0)
    }
  }

  val factory = getComponentFactory(js.constructorOf[Component],classOf[Component])

  def apply(key: UndefOr[String] = js.undefined, ref: RefType = null) = createElementNoProps(factory, key = key, ref = ref)


  object styles extends NativeStyleSheet {

    val container = style(
      flex := 1,
      backgroundColor := "white"
    )
    val centerText = style(
      alignItems.center
    )
    val noMoviesText = style(
      marginTop := 40,
      color := "#888888"
    )
    val searchBar = style(
      marginTop := 20,
      padding := 3,
      paddingLeft := 8,
      flexDirection.row,
      alignItems.center
    )
    val searchBarInput = style(
      fontSize := 15,
      flex := 1,
      height := 30
    )
    val separator = style(
      height := 1,
      backgroundColor := "#eeeeee"
    )
    val spinner = style(
      width := 30
    )
    val scrollSpinner = style(
      marginVertical := 20
    )

  }

}