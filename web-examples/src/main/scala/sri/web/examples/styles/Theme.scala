package sri.web.examples.styles

import sri.web.styles.WebStyleSheet

object Theme extends WebStyleSheet {

  val flexOneAndCenter = style(
    display.flex,
    flexDirection.column,
    flex := 1,
    alignItems.center,
    justifyContent.center)

  val vertical = style(display.flex, flexDirection.column)

  val horizontal = style(display.flex, flexDirection.row)

  val flexOneAndDirectionRow = styleE(horizontal)(flex := 1)

  val flexOneAndDirectionVertical = styleE(vertical)(flex := 1)


  val bigText = style(fontWeight := "500",
    fontSize := "1.5em")

}
