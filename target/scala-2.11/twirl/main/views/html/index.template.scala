
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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[models.Client,java.util.List[Client],java.util.List[Client],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(client: models.Client, waiting : java.util.List[Client], chatPairs : java.util.List[Client]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.95*/("""

"""),_display_(/*3.2*/main("RandChat")/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""



"""),_display_(/*7.2*/for(w <- waiting) yield /*7.19*/ {_display_(Seq[Any](format.raw/*7.21*/("""
  """),format.raw/*8.3*/("""<h1>Waiting pool: """),_display_(/*8.22*/w/*8.23*/.email),format.raw/*8.29*/("""</h1>
""")))}),format.raw/*9.2*/("""

"""),_display_(/*11.2*/for(w <- chatPairs) yield /*11.21*/ {_display_(Seq[Any](format.raw/*11.23*/("""
"""),format.raw/*12.1*/("""<h1>ChatPair pool: """),_display_(/*12.21*/w/*12.22*/.email),format.raw/*12.28*/("""</h1>
""")))}),format.raw/*13.2*/("""


    """),format.raw/*16.5*/("""<h1>Simple chat</h1>
    <h3>current user: """),_display_(/*17.24*/Application/*17.35*/.currentClient.getName()),format.raw/*17.59*/("""</h3>
    <h3>the other side: """),_display_(/*18.26*/Application/*18.37*/.theOtherUserName),format.raw/*18.54*/(""" """),format.raw/*18.55*/("""</h3>

    <div id="the-other-side"></div>
    <div id="socket-messages"></div>

    <input type="text" id="socket-input" placeholder="message to send" />

"""),_display_(/*25.2*/helper/*25.8*/.form(routes.Application.nextUser())/*25.44*/ {_display_(Seq[Any](format.raw/*25.46*/("""
"""),format.raw/*26.1*/("""<button type="submit">Next User</button>
""")))}),format.raw/*27.2*/("""

    """),format.raw/*29.5*/("""<script type="text/javascript" charset="utf-8" src=""""),_display_(/*29.58*/routes/*29.64*/.Application.wsJs()),format.raw/*29.83*/(""""></script>


""")))}),format.raw/*32.2*/("""

"""))}
  }

  def render(client:models.Client,waiting:java.util.List[Client],chatPairs:java.util.List[Client]): play.twirl.api.HtmlFormat.Appendable = apply(client,waiting,chatPairs)

  def f:((models.Client,java.util.List[Client],java.util.List[Client]) => play.twirl.api.HtmlFormat.Appendable) = (client,waiting,chatPairs) => apply(client,waiting,chatPairs)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Jul 20 23:09:29 BST 2015
                  SOURCE: /Users/jiaqichen/Desktop/RandChat/app/views/index.scala.html
                  HASH: 092825d19872a34a68597134c5603b1b813c025a
                  MATRIX: 776->1|957->94|985->97|1009->113|1048->115|1078->120|1110->137|1149->139|1178->142|1223->161|1232->162|1258->168|1294->175|1323->178|1358->197|1398->199|1426->200|1473->220|1483->221|1510->227|1547->234|1581->241|1652->285|1672->296|1717->320|1775->351|1795->362|1833->379|1862->380|2045->537|2059->543|2104->579|2144->581|2172->582|2244->624|2277->630|2357->683|2372->689|2412->708|2457->723
                  LINES: 26->1|29->1|31->3|31->3|31->3|35->7|35->7|35->7|36->8|36->8|36->8|36->8|37->9|39->11|39->11|39->11|40->12|40->12|40->12|40->12|41->13|44->16|45->17|45->17|45->17|46->18|46->18|46->18|46->18|53->25|53->25|53->25|53->25|54->26|55->27|57->29|57->29|57->29|57->29|60->32
                  -- GENERATED --
              */
          