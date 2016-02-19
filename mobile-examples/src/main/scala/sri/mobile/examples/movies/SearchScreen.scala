package sri.mobile.examples.movies

import org.scalajs.dom
import org.scalajs.dom.ext.{Ajax, AjaxException}
import sri.core.{ReactComponent, ReactElement}
import sri.mobile.all._
import sri.mobile.components.ios.ActivityIndicatorIOS
import sri.mobile.examples.movies.android.SearchBarAndroid
import sri.mobile.examples.movies.ios.SearchBarIOS
import sri.universal.ReactEvent
import sri.universal.components._
import sri.universal.styles.UniversalStyleSheet

import scala.async.Async._
import scala.scalajs.concurrent.JSExecutionContext.Implicits.queue
import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{JSON, URIUtils, UndefOr}


object SearchScreen {

  val API_URL = "http://api.rottentomatoes.com/api/public/v1.0/"
  val API_KEYS = List("7waqfqbprs7pajbz28mqf6vz", "y4vwv8m33hed9ety83jmv52f")


  object NoMovies {

    val Component = (props: Props) => {
      var text = ""
      if (props.filter.nonEmpty) text = s"No results for ${props.filter}"
      else if (!props.isLoading) text = "No movies found"
      View(style = styles.container)(
        Text(style = styles.noMoviesText)(text)
      )
    }

    case class Props(filter: String, isLoading: Boolean)

    def apply(filter: String, isLoading: Boolean, key: UndefOr[String] = js.undefined) = createStatelessFunctionElement(Component, Props(filter, isLoading), key = key)

  }


  val LOADING = collection.mutable.Map.empty[String, Boolean].withDefaultValue(false)

  case class ResultsCache(dataForQuery: Map[String, js.Array[js.Dynamic]] = Map().withDefaultValue(js.Array()), nextPageNumberForQuery: Map[String, Int] = Map().withDefaultValue(0), totalForQuery: Map[String, Int] = Map().withDefaultValue(0))

  case class State(isLoading: Boolean = false, isLoadingTail: Boolean = false, dataSource: ListViewDataSource[js.Dynamic, String] = createListViewDataSource((row1: js.Dynamic, row2: js.Dynamic) => row1 != row2), queryNumber: Int = 0)


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
        if (isIOSPlatform)
          SearchBarIOS(onSearchChange, onSearchInputFocus, state.isLoading)
        else SearchBarAndroid(onSearchChange, onSearchInputFocus, state.isLoading),
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
            println(s"Error searching movies with query $query -> ${ex.asInstanceOf[AjaxException].xhr.responseText}")
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


    def renderRow(movie: js.Dynamic, sectionID: String, rowID: String, highlightRow: Boolean): ReactElement = {
      MovieCell(movie = movie, key = movie.title.toString)
    }

    def renderFooter = {
      if (!hasMore || !state.isLoadingTail) View(style = styles.scrollSpinner)()
      else ActivityIndicatorIOS(style = styles.scrollSpinner)()
    }

    def onSearchChange(event: ReactEvent) = {
      val filterLocal = event.nativeEvent.text.toString.toLowerCase()
      dom.window.clearTimeout(timeoutID)
      timeoutID = dom.window.setTimeout(() => searchMovies(filterLocal), 100)
    }

    def dude[T <: js.Object](name: String) = "dude".asInstanceOf[T]

    def onSearchInputFocus(e: ReactEvent) = {
      if (listViewMounted != null) listViewMounted.getScrollResponder().scrollTo(0, 0)
    }
  }


  val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])

  def apply(key: UndefOr[String] = js.undefined, ref: js.Function1[Component, _] = null) = createElementNoProps(ctor, key = key, ref = ref)


  object styles extends UniversalStyleSheet {

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

    val separator = style(
      height := 1,
      backgroundColor := "#eeeeee"
    )

    val scrollSpinner = style(
      marginVertical := 20
    )

  }

}