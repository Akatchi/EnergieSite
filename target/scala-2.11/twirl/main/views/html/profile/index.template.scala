
package views.html.profile

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Gebruiker,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(gebruiker: Gebruiker):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.24*/("""

"""),_display_(/*3.2*/main("Overzicht")/*3.19*/{_display_(Seq[Any](format.raw/*3.20*/("""
    """),format.raw/*4.5*/("""<div>
        """),_display_(/*5.10*/gebruiker/*5.19*/.email),format.raw/*5.25*/("""
    """),format.raw/*6.5*/("""</div>
""")))}))
      }
    }
  }

  def render(gebruiker:Gebruiker): play.twirl.api.HtmlFormat.Appendable = apply(gebruiker)

  def f:((Gebruiker) => play.twirl.api.HtmlFormat.Appendable) = (gebruiker) => apply(gebruiker)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Tue Sep 29 09:32:11 CEST 2015
                  SOURCE: /Users/wahidnory/Development/School/EnergieSite/EnergieSite/app/views/profile/index.scala.html
                  HASH: 0680e180888a04e6655ec4f74ef0cccbcd8df060
                  MATRIX: 538->1|655->23|683->26|708->43|746->44|777->49|818->64|835->73|861->79|892->84
                  LINES: 20->1|25->1|27->3|27->3|27->3|28->4|29->5|29->5|29->5|30->6
                  -- GENERATED --
              */
          