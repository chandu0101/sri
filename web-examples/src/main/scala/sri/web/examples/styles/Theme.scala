package sri.web.examples.styles

import sri.web.styles.WebStyleSheet

object Theme extends WebStyleSheet {

  val flexOneAndCenter = style(flex := 1,
    alignItems.center,
    justifyContent.center)

  val flexOneAndDirectionRow = style(flex := 1, flexDirection.row)

  val bigText = style(fontWeight := "500",
    fontSize := "1.5em")

}
