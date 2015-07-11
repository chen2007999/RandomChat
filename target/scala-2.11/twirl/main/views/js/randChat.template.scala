
package views.js

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
import views.js._

/**/
object randChat extends BaseScalaTemplate[play.twirl.api.JavaScriptFormat.Appendable,Format[play.twirl.api.JavaScriptFormat.Appendable]](play.twirl.api.JavaScriptFormat) with play.twirl.api.Template0[play.twirl.api.JavaScriptFormat.Appendable] {

  /**/
  def apply():play.twirl.api.JavaScriptFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""$(function()"""),format.raw/*1.13*/("""{"""),format.raw/*1.14*/("""

"""),format.raw/*3.1*/("""// get websocket class, firefox has a different way to get it
var WS = window['MozWebSocket'] ? window['MozWebSocket'] : WebSocket;

// open pewpew with websocket
var socket = new WS('"""),_display_(/*7.23*/routes/*7.29*/.Application.wsInterface().webSocketURL(request)),format.raw/*7.77*/("""');

var writeMessages = function(event)"""),format.raw/*9.36*/("""{"""),format.raw/*9.37*/("""
"""),format.raw/*10.1*/("""$('#socket-messages').prepend('<p>'+event.data+'</p>');
"""),format.raw/*11.1*/("""}"""),format.raw/*11.2*/("""

"""),format.raw/*13.1*/("""socket.onmessage = writeMessages;

// if enter (charcode 13) is pushed, send message, then clear input field
$('#socket-input').keyup(function(event)"""),format.raw/*16.41*/("""{"""),format.raw/*16.42*/("""
"""),format.raw/*17.1*/("""var charCode = (event.which) ? event.which : event.keyCode ;

if(charCode === 13)"""),format.raw/*19.20*/("""{"""),format.raw/*19.21*/("""
"""),format.raw/*20.1*/("""socket.send($(this).val());
$(this).val('');
"""),format.raw/*22.1*/("""}"""),format.raw/*22.2*/("""
"""),format.raw/*23.1*/("""}"""),format.raw/*23.2*/(""");
"""),format.raw/*24.1*/("""}"""),format.raw/*24.2*/(""");
"""))}
  }

  def render(): play.twirl.api.JavaScriptFormat.Appendable = apply()

  def f:(() => play.twirl.api.JavaScriptFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sat Jul 11 10:52:25 BST 2015
                  SOURCE: /Users/jiaqichen/Desktop/RandChat/app/views/randChat.scala.js
                  HASH: 393e018ce800675fbd9e8d203d3d2e2cb27add82
                  MATRIX: 827->0|866->12|894->13|922->15|1133->200|1147->206|1215->254|1282->294|1310->295|1338->296|1421->352|1449->353|1478->355|1655->504|1684->505|1712->506|1821->587|1850->588|1878->589|1950->634|1978->635|2006->636|2034->637|2064->640|2092->641
                  LINES: 29->1|29->1|29->1|31->3|35->7|35->7|35->7|37->9|37->9|38->10|39->11|39->11|41->13|44->16|44->16|45->17|47->19|47->19|48->20|50->22|50->22|51->23|51->23|52->24|52->24
                  -- GENERATED --
              */
          