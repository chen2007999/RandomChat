
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
    <h3>current user: """),_display_(/*6.24*/client/*6.30*/.email),format.raw/*6.36*/("""</h3>
    <h3>the other side: </h3>

    <div id="socket-messages"></div>

    <input type="text" id="socket-input" placeholder="message to send" />


    <script type="text/javascript" charset="utf-8" src=""""),_display_(/*14.58*/routes/*14.64*/.Application.wsJs()),format.raw/*14.83*/(""""></script>

""")))}),format.raw/*16.2*/("""

"""))}
  }

  def render(client:models.Client): play.twirl.api.HtmlFormat.Appendable = apply(client)

  def f:((models.Client) => play.twirl.api.HtmlFormat.Appendable) = (client) => apply(client)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Jul 12 21:27:57 BST 2015
                  SOURCE: /Users/jiaqichen/Desktop/RandChat/app/views/index.scala.html
                  HASH: 6a4027fd0254fa4ff1aa95b0270c9edddbd5b3a7
                  MATRIX: 730->1|841->24|869->27|893->43|932->45|964->51|1034->95|1048->101|1074->107|1309->315|1324->321|1364->340|1408->354
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|34->6|34->6|34->6|42->14|42->14|42->14|44->16
                  -- GENERATED --
              */
          