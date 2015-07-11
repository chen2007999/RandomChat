
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
object ws extends BaseScalaTemplate[play.twirl.api.JavaScriptFormat.Appendable,Format[play.twirl.api.JavaScriptFormat.Appendable]](play.twirl.api.JavaScriptFormat) with play.twirl.api.Template0[play.twirl.api.JavaScriptFormat.Appendable] {

  /**/
  def apply():play.twirl.api.JavaScriptFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*4.6*/("""$(function()"""),format.raw/*4.18*/("""{"""),format.raw/*4.19*/("""

        """),format.raw/*6.9*/("""var WS = window['MozWebSocket'] ? MozWebSocket : WebSocket
        var socket = new WS(""""),_display_(/*7.31*/routes/*7.37*/.Application.wsInterface().webSocketURL(request)),format.raw/*7.85*/("""")

        var sendMessage = function()"""),format.raw/*9.37*/("""{"""),format.raw/*9.38*/("""
              """),format.raw/*10.15*/("""socket.send($("#socket-input").val())
              $("#socket-input").val('')
        """),format.raw/*12.9*/("""}"""),format.raw/*12.10*/("""


        """),format.raw/*15.9*/("""var writeMessages = function(event)"""),format.raw/*15.44*/("""{"""),format.raw/*15.45*/("""
             """),format.raw/*16.14*/("""$("#socket-messages").html("Last ping: "+event.data);
        """),format.raw/*17.9*/("""}"""),format.raw/*17.10*/("""


         """),format.raw/*20.10*/("""var handleReturnKey = function(e) """),format.raw/*20.44*/("""{"""),format.raw/*20.45*/("""
                """),format.raw/*21.17*/("""if(e.charCode == 13 || e.keyCode == 13) """),format.raw/*21.57*/("""{"""),format.raw/*21.58*/("""
                    """),format.raw/*22.21*/("""//e.preventDefault()
                    sendMessage()
                """),format.raw/*24.17*/("""}"""),format.raw/*24.18*/("""
         """),format.raw/*25.10*/("""}"""),format.raw/*25.11*/("""

        """),format.raw/*27.9*/("""$("#socket-input").keypress(handleReturnKey)
        socket.onmessage = writeMessages



    """),format.raw/*32.5*/("""}"""),format.raw/*32.6*/(""")"""))}
  }

  def render(): play.twirl.api.JavaScriptFormat.Appendable = apply()

  def f:(() => play.twirl.api.JavaScriptFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Jul 12 00:50:38 BST 2015
                  SOURCE: /Users/jiaqichen/Desktop/RandChat/app/views/ws.scala.js
                  HASH: 2cafa7d3daf31ac8933f7149c9ccfcf37f3b9884
                  MATRIX: 821->8|860->20|888->21|924->31|1039->120|1053->126|1121->174|1188->214|1216->215|1259->230|1373->317|1402->318|1440->329|1503->364|1532->365|1574->379|1663->441|1692->442|1732->454|1794->488|1823->489|1868->506|1936->546|1965->547|2014->568|2113->639|2142->640|2180->650|2209->651|2246->661|2366->754|2394->755
                  LINES: 29->4|29->4|29->4|31->6|32->7|32->7|32->7|34->9|34->9|35->10|37->12|37->12|40->15|40->15|40->15|41->16|42->17|42->17|45->20|45->20|45->20|46->21|46->21|46->21|47->22|49->24|49->24|50->25|50->25|52->27|57->32|57->32
                  -- GENERATED --
              */
          