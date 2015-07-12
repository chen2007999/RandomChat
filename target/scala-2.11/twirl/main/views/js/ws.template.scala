
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
        """),format.raw/*2.9*/("""alert("Hello! I am an alert box!!");
        var WS = window['MozWebSocket'] ? MozWebSocket : WebSocket
        var socket = new WS(""""),_display_(/*4.31*/routes/*4.37*/.Application.wsInterface().webSocketURL(request)),format.raw/*4.85*/("""")


        var writeMessages = function(event)"""),format.raw/*7.44*/("""{"""),format.raw/*7.45*/("""
            """),format.raw/*8.13*/("""$('#socket-messages').prepend('<p>'+event.data+'</p>');
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




     function myFunction() """),format.raw/*28.28*/("""{"""),format.raw/*28.29*/("""
        """),format.raw/*29.9*/("""document.getElementById("test").innerHTML = "ddddddw22332d";
     """),format.raw/*30.6*/("""}"""),format.raw/*30.7*/("""


"""))}
  }

  def render(): play.twirl.api.JavaScriptFormat.Appendable = apply()

  def f:(() => play.twirl.api.JavaScriptFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Jul 12 20:39:19 BST 2015
                  SOURCE: /Users/jiaqichen/Desktop/RandChat/app/views/ws.scala.js
                  HASH: 4791ec0c75108bb018f541b0c07815cd793d4aa5
                  MATRIX: 821->0|860->12|888->13|923->22|1083->156|1097->162|1165->210|1240->258|1268->259|1308->272|1398->336|1426->337|1465->348|1576->431|1605->432|1648->447|1855->626|1884->627|1928->643|2027->714|2056->715|2092->724|2121->725|2151->728|2179->729|2241->763|2270->764|2306->773|2399->839|2427->840
                  LINES: 29->1|29->1|29->1|30->2|32->4|32->4|32->4|35->7|35->7|36->8|37->9|37->9|39->11|41->13|41->13|43->15|46->18|46->18|47->19|49->21|49->21|50->22|50->22|51->23|51->23|56->28|56->28|57->29|58->30|58->30
                  -- GENERATED --
              */
          