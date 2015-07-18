
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

Seq[Any](format.raw/*2.1*/("""$(function()"""),format.raw/*2.13*/("""{"""),format.raw/*2.14*/("""

        """),format.raw/*4.9*/("""var WS = window['MozWebSocket'] ? MozWebSocket : WebSocket
        var socket = new WS(""""),_display_(/*5.31*/routes/*5.37*/.Application.wsInterface().webSocketURL(request)),format.raw/*5.85*/("""")


        var writeMessages = function(event)"""),format.raw/*8.44*/("""{"""),format.raw/*8.45*/("""
            """),format.raw/*9.13*/("""$('#socket-messages').append('<p>'+event.data+'</p>');
        """),format.raw/*10.9*/("""}"""),format.raw/*10.10*/("""

         """),format.raw/*12.10*/("""socket.onmessage = writeMessages;

        $('#socket-input').keyup(function(event)"""),format.raw/*14.49*/("""{"""),format.raw/*14.50*/("""

             """),format.raw/*16.14*/("""var charCode = (event.which) ? event.which : event.keyCode ;

            // if enter (charcode 13) is pushed, send message, then clear input field
            if(charCode === 13)"""),format.raw/*19.32*/("""{"""),format.raw/*19.33*/("""
              """),format.raw/*20.15*/("""socket.send($(this).val());
              $(this).val('');
            """),format.raw/*22.13*/("""}"""),format.raw/*22.14*/("""
        """),format.raw/*23.9*/("""}"""),format.raw/*23.10*/(""");
"""),format.raw/*24.1*/("""}"""),format.raw/*24.2*/(""");
"""))}
  }

  def render(): play.twirl.api.JavaScriptFormat.Appendable = apply()

  def f:(() => play.twirl.api.JavaScriptFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sat Jul 18 18:21:52 BST 2015
                  SOURCE: /Users/jiaqichen/Desktop/RandChat/app/views/ws.scala.js
                  HASH: 895622b97486b769f37a8e12e3f6d8d13414fc12
                  MATRIX: 821->1|860->13|888->14|924->24|1039->113|1053->119|1121->167|1196->215|1224->216|1264->229|1354->292|1383->293|1422->304|1533->387|1562->388|1605->403|1812->582|1841->583|1884->598|1983->669|2012->670|2048->679|2077->680|2107->683|2135->684
                  LINES: 29->2|29->2|29->2|31->4|32->5|32->5|32->5|35->8|35->8|36->9|37->10|37->10|39->12|41->14|41->14|43->16|46->19|46->19|47->20|49->22|49->22|50->23|50->23|51->24|51->24
                  -- GENERATED --
              */
          