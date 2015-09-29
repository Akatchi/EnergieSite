
package views.html.login

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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[scala.Tuple2[String, String]],Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form: Form[(String, String)])(implicit flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.55*/("""

"""),_display_(/*3.2*/main("Login")/*3.15*/{_display_(Seq[Any](format.raw/*3.16*/("""
    """),_display_(/*4.6*/helper/*4.12*/.form(routes.Login.login, 'class -> "form-signin col-md-3 col-md-offset-4")/*4.87*/ {_display_(Seq[Any](format.raw/*4.89*/("""
        """),_display_(/*5.10*/if(form.hasGlobalErrors)/*5.34*/{_display_(Seq[Any](format.raw/*5.35*/("""
            """),_display_(/*6.14*/for(error <- form.globalErrors) yield /*6.45*/ {_display_(Seq[Any](format.raw/*6.47*/("""
                """),format.raw/*7.17*/("""<div class="has-error">
                    """),_display_(/*8.22*/error/*8.27*/.message),format.raw/*8.35*/("""
                """),format.raw/*9.17*/("""</div>
            """)))}),format.raw/*10.14*/("""
        """)))}),format.raw/*11.10*/("""
        """),_display_(/*12.10*/flash/*12.15*/.get("success").map/*12.34*/ { message =>_display_(Seq[Any](format.raw/*12.47*/("""
            """),format.raw/*13.13*/("""<p class="has-success">
                """),_display_(/*14.18*/message),format.raw/*14.25*/("""
            """),format.raw/*15.13*/("""</p>
        """)))}),format.raw/*16.10*/("""
        """),format.raw/*17.9*/("""<h2 class="form-signin-heading">Please sign in</h2>
        <label for="inputEmail" class="sr-only">Email address</label>
        <input type="email" name="email" class="form-control" placeholder="Email address" value=""""),_display_(/*19.99*/form("form.email")/*19.117*/.value),format.raw/*19.123*/("""" autofocus="" required="false">
        <label for="inputPassword" class="sr-only">Password</label>
        <input type="password" name="password" class="form-control" placeholder="Password" required="false">

        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
    """)))}),format.raw/*24.6*/("""
""")))}))
      }
    }
  }

  def render(form:Form[scala.Tuple2[String, String]],flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(form)(flash)

  def f:((Form[scala.Tuple2[String, String]]) => (Flash) => play.twirl.api.HtmlFormat.Appendable) = (form) => (flash) => apply(form)(flash)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Tue Sep 29 08:20:23 CEST 2015
                  SOURCE: /Users/wahidnory/Development/School/EnergieSite/EnergieSite/app/views/login/index.scala.html
                  HASH: cd96d03fd8f3c335e40e9b9c391a9e83471dbb42
                  MATRIX: 567->1|715->54|743->57|764->70|802->71|833->77|847->83|930->158|969->160|1005->170|1037->194|1075->195|1115->209|1161->240|1200->242|1244->259|1315->304|1328->309|1356->317|1400->334|1451->354|1492->364|1529->374|1543->379|1571->398|1622->411|1663->424|1731->465|1759->472|1800->485|1845->499|1881->508|2128->728|2156->746|2184->752|2518->1056
                  LINES: 20->1|25->1|27->3|27->3|27->3|28->4|28->4|28->4|28->4|29->5|29->5|29->5|30->6|30->6|30->6|31->7|32->8|32->8|32->8|33->9|34->10|35->11|36->12|36->12|36->12|36->12|37->13|38->14|38->14|39->15|40->16|41->17|43->19|43->19|43->19|48->24
                  -- GENERATED --
              */
          