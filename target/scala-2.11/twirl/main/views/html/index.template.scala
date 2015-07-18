
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[models.Client,java.util.List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(client: models.Client, waiting : java.util.List[String]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.59*/("""

"""),_display_(/*3.2*/main("RandChat")/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""



"""),_display_(/*7.2*/for(w <- waiting) yield /*7.19*/ {_display_(Seq[Any](format.raw/*7.21*/("""
  """),format.raw/*8.3*/("""<h1>User pool: """),_display_(/*8.19*/w),format.raw/*8.20*/("""</h1>
""")))}),format.raw/*9.2*/("""


    """),format.raw/*12.5*/("""<h1>Simple chat</h1>
    <h3>current user: """),_display_(/*13.24*/Application/*13.35*/.currentClient.getName()),format.raw/*13.59*/("""</h3>
    <h3>the other side: """),_display_(/*14.26*/Application/*14.37*/.theOtherUserName),format.raw/*14.54*/(""" """),format.raw/*14.55*/("""</h3>

    <div id="the-other-side"></div>
    <div id="socket-messages"></div>

    <input type="text" id="socket-input" placeholder="message to send" />

"""),_display_(/*21.2*/helper/*21.8*/.form(routes.Application.pairing())/*21.43*/ {_display_(Seq[Any](format.raw/*21.45*/("""
"""),format.raw/*22.1*/("""<button class="btn" href="/landing">Start</button>
""")))}),format.raw/*23.2*/("""

    """),format.raw/*25.5*/("""<script type="text/javascript" charset="utf-8" src=""""),_display_(/*25.58*/routes/*25.64*/.Application.wsJs()),format.raw/*25.83*/(""""></script>
"""),_display_(/*26.2*/helper/*26.8*/.form(routes.Application.showWaiting())/*26.47*/ {_display_(Seq[Any](format.raw/*26.49*/("""
"""),format.raw/*27.1*/("""<button class="btn" href="/landing">Waiting</button>
""")))}),format.raw/*28.2*/("""

""")))}),format.raw/*30.2*/("""

"""))}
  }

  def render(client:models.Client,waiting:java.util.List[String]): play.twirl.api.HtmlFormat.Appendable = apply(client,waiting)

  def f:((models.Client,java.util.List[String]) => play.twirl.api.HtmlFormat.Appendable) = (client,waiting) => apply(client,waiting)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sat Jul 18 08:28:59 BST 2015
                  SOURCE: /Users/jiaqichen/Desktop/RandChat/app/views/index.scala.html
                  HASH: 1909bc80da49e923df8ec6b7b6a86727d20b1e4e
                  MATRIX: 753->1|898->58|926->61|950->77|989->79|1019->84|1051->101|1090->103|1119->106|1161->122|1182->123|1218->130|1252->137|1323->181|1343->192|1388->216|1446->247|1466->258|1504->275|1533->276|1716->433|1730->439|1774->474|1814->476|1842->477|1924->529|1957->535|2037->588|2052->594|2092->613|2131->626|2145->632|2193->671|2233->673|2261->674|2345->728|2378->731
                  LINES: 26->1|29->1|31->3|31->3|31->3|35->7|35->7|35->7|36->8|36->8|36->8|37->9|40->12|41->13|41->13|41->13|42->14|42->14|42->14|42->14|49->21|49->21|49->21|49->21|50->22|51->23|53->25|53->25|53->25|53->25|54->26|54->26|54->26|54->26|55->27|56->28|58->30
                  -- GENERATED --
              */
          