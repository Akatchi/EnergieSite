
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.at("stylesheets/main.css")),format.raw/*8.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*9.59*/routes/*9.65*/.Assets.at("images/favicon.png")),format.raw/*9.97*/("""">
        <link rel="stylesheet" href=""""),_display_(/*10.39*/routes/*10.45*/.Assets.at("lib/bootstrap/css/bootstrap.min.css")),format.raw/*10.94*/("""" type="text/javascript">
    </head>
    <body class="container">
        """),_display_(/*13.10*/content),format.raw/*13.17*/("""
    """),format.raw/*14.5*/("""</body>
        <script src=""""),_display_(/*15.23*/routes/*15.29*/.Assets.at("lib/jquery/jquery.min.js")),format.raw/*15.67*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*16.23*/routes/*16.29*/.Assets.at("lib/bootstrap/js/bootstrap.min.js")),format.raw/*16.76*/("""" type="text/javascript"></script>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Mon Sep 28 13:34:24 CEST 2015
                  SOURCE: /Users/wahidnory/Development/School/EnergieSite/EnergieSite/app/views/main.scala.html
                  HASH: ae14dc7da0d6ce8b2b363eba2c868af7d08b0afe
                  MATRIX: 530->1|655->31|683->33|760->84|785->89|873->151|887->157|941->191|1028->252|1042->258|1094->290|1162->331|1177->337|1247->386|1350->462|1378->469|1410->474|1467->504|1482->510|1541->548|1625->605|1640->611|1708->658
                  LINES: 20->1|25->1|27->3|31->7|31->7|32->8|32->8|32->8|33->9|33->9|33->9|34->10|34->10|34->10|37->13|37->13|38->14|39->15|39->15|39->15|40->16|40->16|40->16
                  -- GENERATED --
              */
          