
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
object randChatWebSocket extends BaseScalaTemplate[play.twirl.api.JavaScriptFormat.Appendable,Format[play.twirl.api.JavaScriptFormat.Appendable]](play.twirl.api.JavaScriptFormat) with play.twirl.api.Template0[play.twirl.api.JavaScriptFormat.Appendable] {

  /**/
  def apply():play.twirl.api.JavaScriptFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*2.1*/("""$(function()"""),format.raw/*2.13*/("""{"""),format.raw/*2.14*/("""

        """),format.raw/*4.9*/("""var WS = window['MozWebSocket'] ? MozWebSocket : WebSocket
        var socket = new WS(""""),_display_(/*5.31*/routes/*5.37*/.Application.wsInterface().webSocketURL(request)),format.raw/*5.85*/("""")


        var writeMessages = function(event)"""),format.raw/*8.44*/("""{"""),format.raw/*8.45*/("""
            """),format.raw/*9.13*/("""if(event.data.localeCompare("NEW UNREAD PLEASE CHECK.") == 0) """),format.raw/*9.75*/("""{"""),format.raw/*9.76*/("""

               """),format.raw/*11.16*/("""var unread = document.getElementById("unread").value;
               var unreadNum = unread.substring(7);
               var unreadNumInt = parseInt(unreadNum);
               unreadNumInt = unreadNumInt + 1;
               if(unreadNumInt == 0) """),format.raw/*15.38*/("""{"""),format.raw/*15.39*/("""
                    """),format.raw/*16.21*/("""document.getElementById("unread").className = "grey";
               """),format.raw/*17.16*/("""}"""),format.raw/*17.17*/(""" """),format.raw/*17.18*/("""else """),format.raw/*17.23*/("""{"""),format.raw/*17.24*/("""
                    """),format.raw/*18.21*/("""document.getElementById("unread").className = "red";
               """),format.raw/*19.16*/("""}"""),format.raw/*19.17*/("""
               """),format.raw/*20.16*/("""var unreadNumStr = unreadNumInt.toString();
               document.getElementById("unread").value="Unread " + unreadNumStr;

            """),format.raw/*23.13*/("""}"""),format.raw/*23.14*/(""" """),format.raw/*23.15*/("""else if (event.data.localeCompare("PLEASE REMOVE ONE UNREAD.") == 0)"""),format.raw/*23.83*/("""{"""),format.raw/*23.84*/("""

               """),format.raw/*25.16*/("""var unread = document.getElementById("unread").value;
               var unreadNum = unread.substring(7);
               var unreadNumInt = parseInt(unreadNum);
               unreadNumInt = unreadNumInt - 1;
               if(unreadNumInt == 0) """),format.raw/*29.38*/("""{"""),format.raw/*29.39*/("""
                     """),format.raw/*30.22*/("""document.getElementById("unread").className = "grey";
                """),format.raw/*31.17*/("""}"""),format.raw/*31.18*/(""" """),format.raw/*31.19*/("""else """),format.raw/*31.24*/("""{"""),format.raw/*31.25*/("""
                     """),format.raw/*32.22*/("""document.getElementById("unread").className = "red";
                """),format.raw/*33.17*/("""}"""),format.raw/*33.18*/("""
               """),format.raw/*34.16*/("""var unreadNumStr = unreadNumInt.toString();
               document.getElementById("unread").value="Unread " + unreadNumStr;

            """),format.raw/*37.13*/("""}"""),format.raw/*37.14*/("""else """),format.raw/*37.19*/("""{"""),format.raw/*37.20*/("""
                """),format.raw/*38.17*/("""var x1 =  Boolean(event.data.indexOf("Waiting to be connected to a user.") > -1);
                var x2 =  Boolean(event.data.indexOf("waiting to be connected to the next user.") > -1);
                var x3 = Boolean(event.data.indexOf("just left, waiting to be connected to the next user.") > -1);
                var x4 =  Boolean(event.data.indexOf("Just got connected to") > -1);
                var otherProfile = document.getElementById('other');
                if(x1 || x2 || x3) """),format.raw/*43.36*/("""{"""),format.raw/*43.37*/("""
                     """),format.raw/*44.22*/("""otherProfile.style.display="none";
                """),format.raw/*45.17*/("""}"""),format.raw/*45.18*/("""
                """),format.raw/*46.17*/("""if(x4) """),format.raw/*46.24*/("""{"""),format.raw/*46.25*/("""
                     """),format.raw/*47.22*/("""otherProfile.style.display="";
                """),format.raw/*48.17*/("""}"""),format.raw/*48.18*/("""
                """),format.raw/*49.17*/("""$('#socket-messages').append('<p>'+event.data+'</p>');
                var objDiv = document.getElementById("socket-messages");
                objDiv.scrollTop = objDiv.scrollHeight;
            """),format.raw/*52.13*/("""}"""),format.raw/*52.14*/("""

        """),format.raw/*54.9*/("""}"""),format.raw/*54.10*/("""

         """),format.raw/*56.10*/("""socket.onmessage = writeMessages;


        $('#socket-input').keyup(function(event)"""),format.raw/*59.49*/("""{"""),format.raw/*59.50*/("""

             """),format.raw/*61.14*/("""var charCode = (event.which) ? event.which : event.keyCode ;

            // if enter (charcode 13) is pushed, send message, then clear input field
            if(charCode === 13)"""),format.raw/*64.32*/("""{"""),format.raw/*64.33*/("""
              """),format.raw/*65.15*/("""socket.send($(this).val());
              $(this).val('');
            """),format.raw/*67.13*/("""}"""),format.raw/*67.14*/("""
        """),format.raw/*68.9*/("""}"""),format.raw/*68.10*/(""");


"""),format.raw/*71.1*/("""}"""),format.raw/*71.2*/(""");
"""))}
  }

  def render(): play.twirl.api.JavaScriptFormat.Appendable = apply()

  def f:(() => play.twirl.api.JavaScriptFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Aug 02 10:26:17 BST 2015
                  SOURCE: /Users/jiaqichen/Desktop/RandChat/app/views/randChatWebSocket.scala.js
                  HASH: d685942e9b08105443534ecb0c8a266770631141
                  MATRIX: 836->1|875->13|903->14|939->24|1054->113|1068->119|1136->167|1211->215|1239->216|1279->229|1368->291|1396->292|1441->309|1715->555|1744->556|1793->577|1890->646|1919->647|1948->648|1981->653|2010->654|2059->675|2155->743|2184->744|2228->760|2394->898|2423->899|2452->900|2548->968|2577->969|2622->986|2896->1232|2925->1233|2975->1255|3073->1325|3102->1326|3131->1327|3164->1332|3193->1333|3243->1355|3340->1424|3369->1425|3413->1441|3579->1579|3608->1580|3641->1585|3670->1586|3715->1603|4234->2094|4263->2095|4313->2117|4392->2168|4421->2169|4466->2186|4501->2193|4530->2194|4580->2216|4655->2263|4684->2264|4729->2281|4953->2477|4982->2478|5019->2488|5048->2489|5087->2500|5199->2584|5228->2585|5271->2600|5478->2779|5507->2780|5550->2795|5649->2866|5678->2867|5714->2876|5743->2877|5775->2882|5803->2883
                  LINES: 29->2|29->2|29->2|31->4|32->5|32->5|32->5|35->8|35->8|36->9|36->9|36->9|38->11|42->15|42->15|43->16|44->17|44->17|44->17|44->17|44->17|45->18|46->19|46->19|47->20|50->23|50->23|50->23|50->23|50->23|52->25|56->29|56->29|57->30|58->31|58->31|58->31|58->31|58->31|59->32|60->33|60->33|61->34|64->37|64->37|64->37|64->37|65->38|70->43|70->43|71->44|72->45|72->45|73->46|73->46|73->46|74->47|75->48|75->48|76->49|79->52|79->52|81->54|81->54|83->56|86->59|86->59|88->61|91->64|91->64|92->65|94->67|94->67|95->68|95->68|98->71|98->71
                  -- GENERATED --
              */
          