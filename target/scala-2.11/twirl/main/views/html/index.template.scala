
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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.Client,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(client: models.Client):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.25*/("""

"""),_display_(/*3.2*/main("RandChat")/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""

    """),format.raw/*5.5*/("""<h1>Simple chat</h1>
    <h3>current user: """),_display_(/*6.24*/Application/*6.35*/.currentClient.getName()),format.raw/*6.59*/("""</h3>
    <h3>the other side: """),_display_(/*7.26*/Application/*7.37*/.theOtherUserName),format.raw/*7.54*/(""" """),format.raw/*7.55*/("""</h3>

    <div id="the-other-side"></div>
    <div id="socket-messages"></div>

    <input type="text" id="socket-input" placeholder="message to send" />


    <script type="text/javascript" charset="utf-8" src=""""),_display_(/*15.58*/routes/*15.64*/.Application.wsJs()),format.raw/*15.83*/(""""></script>

""")))}),format.raw/*17.2*/("""

"""))}
  }

  def render(client:models.Client): play.twirl.api.HtmlFormat.Appendable = apply(client)

  def f:((models.Client) => play.twirl.api.HtmlFormat.Appendable) = (client) => apply(client)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Jul 15 21:26:39 BST 2015
                  SOURCE: /Users/jiaqichen/Desktop/RandChat/app/views/index.scala.html
                  HASH: abfd5817bd8e6441c3838868c2a69a7d8f53acbc
                  MATRIX: 730->1|841->24|869->27|893->43|932->45|964->51|1034->95|1053->106|1097->130|1154->161|1173->172|1210->189|1238->190|1479->404|1494->410|1534->429|1578->443
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|34->6|34->6|34->6|35->7|35->7|35->7|35->7|43->15|43->15|43->15|45->17
                  -- GENERATED --
              */
          