
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

Seq[Any](format.raw/*1.1*/("""$(function()"""),format.raw/*1.13*/("""{"""),format.raw/*1.14*/("""

        """),format.raw/*3.9*/("""var WS = window['MozWebSocket'] ? MozWebSocket : WebSocket
        var socket = new WS(""""),_display_(/*4.31*/routes/*4.37*/.Application.wsInterface().webSocketURL(request)),format.raw/*4.85*/("""")


        var writeMessages = function(event)"""),format.raw/*7.44*/("""{"""),format.raw/*7.45*/("""
            """),format.raw/*8.13*/("""$('#socket-messages').append('<p>'+event.data+'</p>');
        """),format.raw/*9.9*/("""}"""),format.raw/*9.10*/("""

         """),format.raw/*11.10*/("""socket.onmessage = writeMessages;

        $('#socket-input').keyup(function(event)"""),format.raw/*13.49*/("""{"""),format.raw/*13.50*/("""

             """),format.raw/*15.14*/("""var charCode = (event.which) ? event.which : event.keyCode ;

            // if enter (charcode 13) is pushed, send message, then clear input field
            if(charCode === 13)"""),format.raw/*18.32*/("""{"""),format.raw/*18.33*/("""
               """),format.raw/*19.16*/("""socket.send($(this).val());
              $(this).val('');
            """),format.raw/*21.13*/("""}"""),format.raw/*21.14*/("""
        """),format.raw/*22.9*/("""}"""),format.raw/*22.10*/(""");
"""),format.raw/*23.1*/("""}"""),format.raw/*23.2*/(""");
"""))}
  }

  def render(): play.twirl.api.JavaScriptFormat.Appendable = apply()

  def f:(() => play.twirl.api.JavaScriptFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Jul 12 21:24:30 BST 2015
                  SOURCE: /Users/jiaqichen/Desktop/RandChat/app/views/ws.scala.js
                  HASH: 13ebec038262331e2248924a603b3daa6c609b0b
                  MATRIX: 821->0|860->12|888->13|924->23|1039->112|1053->118|1121->166|1196->214|1224->215|1264->228|1353->291|1381->292|1420->303|1531->386|1560->387|1603->402|1810->581|1839->582|1883->598|1982->669|2011->670|2047->679|2076->680|2106->683|2134->684
                  LINES: 29->1|29->1|29->1|31->3|32->4|32->4|32->4|35->7|35->7|36->8|37->9|37->9|39->11|41->13|41->13|43->15|46->18|46->18|47->19|49->21|49->21|50->22|50->22|51->23|51->23
                  -- GENERATED --
              */
          