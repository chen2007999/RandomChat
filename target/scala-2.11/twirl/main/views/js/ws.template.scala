
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

        """),format.raw/*12.9*/("""var writeName = function()"""),format.raw/*12.35*/("""{"""),format.raw/*12.36*/("""
             """),format.raw/*13.14*/("""document.getElementById("the-other-side").innerHTML = "hey";
        """),format.raw/*14.9*/("""}"""),format.raw/*14.10*/("""


         """),format.raw/*17.10*/("""socket.onmessage = writeMessages;
         socket.onopen = writeName;

        $('#socket-input').keyup(function(event)"""),format.raw/*20.49*/("""{"""),format.raw/*20.50*/("""

             """),format.raw/*22.14*/("""var charCode = (event.which) ? event.which : event.keyCode ;

            // if enter (charcode 13) is pushed, send message, then clear input field
            if(charCode === 13)"""),format.raw/*25.32*/("""{"""),format.raw/*25.33*/("""
               """),format.raw/*26.16*/("""socket.send($(this).val());
              $(this).val('');
            """),format.raw/*28.13*/("""}"""),format.raw/*28.14*/("""
        """),format.raw/*29.9*/("""}"""),format.raw/*29.10*/(""");
"""),format.raw/*30.1*/("""}"""),format.raw/*30.2*/(""");
"""))}
  }

  def render(): play.twirl.api.JavaScriptFormat.Appendable = apply()

  def f:(() => play.twirl.api.JavaScriptFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Jul 15 19:55:17 BST 2015
                  SOURCE: /Users/jiaqichen/Desktop/RandChat/app/views/ws.scala.js
                  HASH: 23ee9a6daa8847e3431f2fa2ea9afceeb76e049f
                  MATRIX: 821->1|860->13|888->14|924->24|1039->113|1053->119|1121->167|1196->215|1224->216|1264->229|1354->292|1383->293|1420->303|1474->329|1503->330|1545->344|1641->413|1670->414|1710->426|1857->545|1886->546|1929->561|2136->740|2165->741|2209->757|2308->828|2337->829|2373->838|2402->839|2432->842|2460->843
                  LINES: 29->2|29->2|29->2|31->4|32->5|32->5|32->5|35->8|35->8|36->9|37->10|37->10|39->12|39->12|39->12|40->13|41->14|41->14|44->17|47->20|47->20|49->22|52->25|52->25|53->26|55->28|55->28|56->29|56->29|57->30|57->30
                  -- GENERATED --
              */
          