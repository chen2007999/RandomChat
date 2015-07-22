
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


"""),_display_(/*20.2*/helper/*20.8*/.form(routes.Application.friendProfile())/*20.49*/ {_display_(Seq[Any](format.raw/*20.51*/("""
"""),format.raw/*21.1*/("""<button type="submit">The other user's profile </button>
""")))}),format.raw/*22.2*/("""

    """),format.raw/*24.5*/("""<div id="the-other-side"></div>
    <div id="socket-messages"></div>

    <input type="text" id="socket-input" placeholder="message to send" />

<button onclick="nextUser()">Next User</button>



    <script type="text/javascript" charset="utf-8" src=""""),_display_(/*33.58*/routes/*33.64*/.Application.wsJs()),format.raw/*33.83*/(""""></script>


""")))}),format.raw/*36.2*/("""

"""))}
  }

  def render(client:models.Client,waiting:java.util.List[Client],chatPairs:java.util.List[Client]): play.twirl.api.HtmlFormat.Appendable = apply(client,waiting,chatPairs)

  def f:((models.Client,java.util.List[Client],java.util.List[Client]) => play.twirl.api.HtmlFormat.Appendable) = (client,waiting,chatPairs) => apply(client,waiting,chatPairs)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Jul 22 22:03:08 BST 2015
                  SOURCE: /Users/jiaqichen/Desktop/RandChat/app/views/index.scala.html
                  HASH: d1c34531f058390233ff206039bfa6f8ac4b7e8e
                  MATRIX: 776->1|957->94|985->97|1009->113|1048->115|1078->120|1110->137|1149->139|1178->142|1223->161|1232->162|1258->168|1294->175|1323->178|1358->197|1398->199|1426->200|1473->220|1483->221|1510->227|1547->234|1581->241|1652->285|1672->296|1717->320|1752->329|1766->335|1816->376|1856->378|1884->379|1972->437|2005->443|2285->696|2300->702|2340->721|2385->736
                  LINES: 26->1|29->1|31->3|31->3|31->3|35->7|35->7|35->7|36->8|36->8|36->8|36->8|37->9|39->11|39->11|39->11|40->12|40->12|40->12|40->12|41->13|44->16|45->17|45->17|45->17|48->20|48->20|48->20|48->20|49->21|50->22|52->24|61->33|61->33|61->33|64->36
                  -- GENERATED --
              */
          