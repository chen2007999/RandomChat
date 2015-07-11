
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
object randChat extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*2.1*/("""$(function()"""),format.raw/*2.13*/("""{"""),format.raw/*2.14*/("""

"""),format.raw/*4.1*/("""// get websocket class, firefox has a different way to get it
var WS = window['MozWebSocket'] ? window['MozWebSocket'] : WebSocket;

// open pewpew with websocket
var socket = new WS('"""),_display_(/*8.23*/routes/*8.29*/.Application.wsInterface().webSocketURL(request)),format.raw/*8.77*/("""');

var writeMessages = function(event)"""),format.raw/*10.36*/("""{"""),format.raw/*10.37*/("""
"""),format.raw/*11.1*/("""$('#socket-messages').prepend('<p>'+event.data+'</p>');
"""),format.raw/*12.1*/("""}"""),format.raw/*12.2*/("""

"""),format.raw/*14.1*/("""socket.onmessage = writeMessages;

// if enter (charcode 13) is pushed, send message, then clear input field
$('#socket-input').keyup(function(event)"""),format.raw/*17.41*/("""{"""),format.raw/*17.42*/("""
"""),format.raw/*18.1*/("""var charCode = (event.which) ? event.which : event.keyCode ;

if(charCode === 13)"""),format.raw/*20.20*/("""{"""),format.raw/*20.21*/("""
"""),format.raw/*21.1*/("""socket.send($(this).val());
$(this).val('');
"""),format.raw/*23.1*/("""}"""),format.raw/*23.2*/("""
"""),format.raw/*24.1*/("""}"""),format.raw/*24.2*/(""");
"""),format.raw/*25.1*/("""}"""),format.raw/*25.2*/(""");
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sat Jul 11 10:44:17 BST 2015
                  SOURCE: /Users/jiaqichen/Desktop/RandChat/app/views/randChat.scala.js
                  HASH: 16fdc5a624122051f34ab222f44db6d07950b529
                  MATRIX: 801->1|840->13|868->14|896->16|1107->201|1121->207|1189->255|1257->295|1286->296|1314->297|1397->353|1425->354|1454->356|1631->505|1660->506|1688->507|1797->588|1826->589|1854->590|1926->635|1954->636|1982->637|2010->638|2040->641|2068->642
                  LINES: 29->2|29->2|29->2|31->4|35->8|35->8|35->8|37->10|37->10|38->11|39->12|39->12|41->14|44->17|44->17|45->18|47->20|47->20|48->21|50->23|50->23|51->24|51->24|52->25|52->25
                  -- GENERATED --
              */
          