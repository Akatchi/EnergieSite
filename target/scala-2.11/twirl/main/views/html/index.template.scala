
package views.html

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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Seq[Gebruiker],Seq[Huishouden],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(gebruikers: Seq[Gebruiker], huishoudens: Seq[Huishouden]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.60*/("""

"""),_display_(/*3.2*/main("Registreer voor je huishouden")/*3.39*/ {_display_(Seq[Any](format.raw/*3.41*/("""
"""),format.raw/*4.1*/("""<div>
  <div>
    <h2>Huishoudens</h2>
    <table>
      <tr><th>Huishouden</th><th>Huisnummer</th><th>Grootte</th></tr>
      """),_display_(/*9.8*/for(huishouden <- huishoudens) yield /*9.38*/{_display_(Seq[Any](format.raw/*9.39*/("""
        """),format.raw/*10.9*/("""<tr><td>"""),_display_(/*10.18*/huishouden/*10.28*/.postcode),format.raw/*10.37*/("""</td><td>"""),_display_(/*10.47*/huishouden/*10.57*/.huisnummer),format.raw/*10.68*/("""</td><td>"""),_display_(/*10.78*/huishouden/*10.88*/.grootte),format.raw/*10.96*/("""</td></tr>
      """)))}),format.raw/*11.8*/("""
    """),format.raw/*12.5*/("""</table>
  </div>

  <div>
    <h2>Registreer</h2>

    <form action="/registreer/gebruiker" method="POST">
      <input name="voornaam" type="text" placeholder="Voornaam"/>
      <input name="achternaam" type="text" placeholder="Achternaam"/>
      <input name="email" type="email" placeholder="E-mail"/>
      <input name="telefoonnummer" type="text" placeholder="Telefoonnummer"/>
      <input type="submit"/>
    </form>

    <h2>Gebruikers aanwezig</h2>
    <table>
      <tr><th>Naam</th><th>E-mail</th><th>Telefoonnummer</th></tr>
      """),_display_(/*29.8*/for(gebruiker <- gebruikers) yield /*29.36*/{_display_(Seq[Any](format.raw/*29.37*/("""
        """),format.raw/*30.9*/("""<tr><td>"""),_display_(/*30.18*/gebruiker/*30.27*/.voornaam),format.raw/*30.36*/(""" """),_display_(/*30.38*/gebruiker/*30.47*/.achternaam),format.raw/*30.58*/("""</td><td>"""),_display_(/*30.68*/gebruiker/*30.77*/.email),format.raw/*30.83*/("""</td><td>"""),_display_(/*30.93*/gebruiker/*30.102*/.telefoonnummer),format.raw/*30.117*/("""</td></tr>
      """)))}),format.raw/*31.8*/("""
    """),format.raw/*32.5*/("""</table>
  </div>
</div>
""")))}),format.raw/*35.2*/("""
"""))
      }
    }
  }

  def render(gebruikers:Seq[Gebruiker],huishoudens:Seq[Huishouden]): play.twirl.api.HtmlFormat.Appendable = apply(gebruikers,huishoudens)

  def f:((Seq[Gebruiker],Seq[Huishouden]) => play.twirl.api.HtmlFormat.Appendable) = (gebruikers,huishoudens) => apply(gebruikers,huishoudens)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Sun Sep 27 18:56:39 CEST 2015
                  SOURCE: /Users/wahidnory/Development/School/EnergieSite/EnergieSite/app/views/index.scala.html
                  HASH: 949a314a363288f60c67005ac5124a2ae1994562
                  MATRIX: 551->1|704->59|732->62|777->99|816->101|843->102|996->230|1041->260|1079->261|1115->270|1151->279|1170->289|1200->298|1237->308|1256->318|1288->329|1325->339|1344->349|1373->357|1421->375|1453->380|2024->925|2068->953|2107->954|2143->963|2179->972|2197->981|2227->990|2256->992|2274->1001|2306->1012|2343->1022|2361->1031|2388->1037|2425->1047|2444->1056|2481->1071|2529->1089|2561->1094|2617->1120
                  LINES: 20->1|25->1|27->3|27->3|27->3|28->4|33->9|33->9|33->9|34->10|34->10|34->10|34->10|34->10|34->10|34->10|34->10|34->10|34->10|35->11|36->12|53->29|53->29|53->29|54->30|54->30|54->30|54->30|54->30|54->30|54->30|54->30|54->30|54->30|54->30|54->30|54->30|55->31|56->32|59->35
                  -- GENERATED --
              */
          