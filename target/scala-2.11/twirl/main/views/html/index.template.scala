
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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*3.2*/main("Small things jump around")/*3.34*/ {_display_(Seq[Any](format.raw/*3.36*/("""

    """),format.raw/*5.5*/("""<h1>Simple chat</h1>

    <input type="text" id="socket-input" placeholder="message to send" />
    <div id="socket-messages"></div>
    <p id="test"></p>
    <button type="button" onclick="myFunction()">Submit</button>

    <script type="text/javascript" charset="utf-8" src=""""),_display_(/*12.58*/routes/*12.64*/.Application.wsJs()),format.raw/*12.83*/(""""></script>

""")))}),format.raw/*14.2*/("""

"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Jul 12 00:46:04 BST 2015
                  SOURCE: /Users/jiaqichen/Desktop/RandChat/app/views/index.scala.html
                  HASH: 8dc68d999fe3856b5dc619517a9f454a1675812a
                  MATRIX: 798->3|838->35|877->37|909->43|1214->321|1229->327|1269->346|1313->360
                  LINES: 29->3|29->3|29->3|31->5|38->12|38->12|38->12|40->14
                  -- GENERATED --
              */
          