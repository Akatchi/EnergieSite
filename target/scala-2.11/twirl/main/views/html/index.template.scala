
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Seq[Cat],Seq[Dog],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(cats: Seq[Cat], dogs: Seq[Dog]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.34*/("""

"""),_display_(/*3.2*/main("Cat & Dog database")/*3.28*/ {_display_(Seq[Any](format.raw/*3.30*/("""
"""),format.raw/*4.1*/("""<div>
  <div id="cats">
    <h2>Insert a kitty cat here:</h2>

    <form action="/insert/cat" method="POST">
      <input name="name" type="text" placeholder="name your feline friend"/>
      <input name="color" type="text" placeholder="enter the color of this kitty cat"/>
      <input type="submit"/>
    </form>

    <h2>Previously inserted cats:</h2>
    <table>
      <tr><th>Name</th><th>Color</th></tr>
      """),_display_(/*17.8*/for(c <- cats) yield /*17.22*/{_display_(Seq[Any](format.raw/*17.23*/(""" 
      """),format.raw/*18.7*/("""<tr><td>"""),_display_(/*18.16*/c/*18.17*/.name),format.raw/*18.22*/("""</td><td>"""),_display_(/*18.32*/c/*18.33*/.color),format.raw/*18.39*/("""</td></tr>
      """)))}),format.raw/*19.8*/("""
    """),format.raw/*20.5*/("""</table>
  </div>

  <div id="dogs">
    <h2>Insert a kitty dog here:</h2>

    <form action="/insert/dog" method="POST">
      <input name="name" type="text" placeholder="name your canine friend"/>
      <input name="color" type="text" placeholder="enter the color of this kitty dog"/>
      <input type="submit"/>
    </form>

    <h2>Previously inserted dogs:</h2>
    <table>
      <tr><th>Name</th><th>Color</th></tr>
      """),_display_(/*35.8*/for(d <- dogs) yield /*35.22*/{_display_(Seq[Any](format.raw/*35.23*/(""" 
      """),format.raw/*36.7*/("""<tr><td>"""),_display_(/*36.16*/d/*36.17*/.name),format.raw/*36.22*/("""</td><td>"""),_display_(/*36.32*/d/*36.33*/.color),format.raw/*36.39*/("""</td></tr>
      """)))}),format.raw/*37.8*/("""
    """),format.raw/*38.5*/("""</table>
  </div>
</div>
""")))}),format.raw/*41.2*/("""
"""))
      }
    }
  }

  def render(cats:Seq[Cat],dogs:Seq[Dog]): play.twirl.api.HtmlFormat.Appendable = apply(cats,dogs)

  def f:((Seq[Cat],Seq[Dog]) => play.twirl.api.HtmlFormat.Appendable) = (cats,dogs) => apply(cats,dogs)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Wed Sep 23 20:34:29 CEST 2015
                  SOURCE: /home/akatchi/Dropbox/Libraries/Playframework/activator-dist-1.3.6/energie_site/app/views/index.scala.html
                  HASH: 899d806918211559d2c49afe3cbe482896b45022
                  MATRIX: 538->1|665->33|693->36|727->62|766->64|793->65|1236->482|1266->496|1305->497|1340->505|1376->514|1386->515|1412->520|1449->530|1459->531|1486->537|1534->555|1566->560|2022->990|2052->1004|2091->1005|2126->1013|2162->1022|2172->1023|2198->1028|2235->1038|2245->1039|2272->1045|2320->1063|2352->1068|2408->1094
                  LINES: 20->1|25->1|27->3|27->3|27->3|28->4|41->17|41->17|41->17|42->18|42->18|42->18|42->18|42->18|42->18|42->18|43->19|44->20|59->35|59->35|59->35|60->36|60->36|60->36|60->36|60->36|60->36|60->36|61->37|62->38|65->41
                  -- GENERATED --
              */
          