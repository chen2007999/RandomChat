
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
object message extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[models.Client,java.util.List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(client : models.Client, history : java.util.List[String]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.60*/("""

"""),_display_(/*3.2*/main("Message")/*3.17*/ {_display_(Seq[Any](format.raw/*3.19*/("""

"""),format.raw/*5.1*/("""<h1>Messaging """),_display_(/*5.16*/client/*5.22*/.name),format.raw/*5.27*/("""</h1>


"""),_display_(/*8.2*/for(h <- history) yield /*8.19*/ {_display_(Seq[Any](format.raw/*8.21*/("""

"""),format.raw/*10.1*/("""<h3>"""),_display_(/*10.6*/h),format.raw/*10.7*/("""</h3>
""")))}),format.raw/*11.2*/("""


"""),_display_(/*14.2*/helper/*14.8*/.form(routes.Application.sendMessage(client.email))/*14.59*/ {_display_(Seq[Any](format.raw/*14.61*/("""
"""),format.raw/*15.1*/("""<input type="text" id="socket-input" placeholder="message to send" style="height:30px;width:550px" name="content"/>
<button type="Send" class="green">Send</button>
""")))}),format.raw/*17.2*/("""
"""),format.raw/*18.1*/("""<style type="text/css">
.green"""),format.raw/*19.7*/("""{"""),format.raw/*19.8*/("""
"""),format.raw/*20.1*/("""border-style: solid;
border-width: 0px 0px 3px;
box-shadow: 0 -1px 0 rgba(255, 255, 255, 0.1) inset;
color: #FFFFFF;
border-radius: 6px;
cursor: pointer;
display: inline-block;
font-style: normal;
overflow: hidden;
text-align: center;
text-decoration: none;
text-overflow: ellipsis;
transition: all 200ms ease-in-out 0s;
white-space: nowrap;
font-family: "Gotham Rounded A","Gotham Rounded B",Helvetica,Arial,sans-serif;
font-weight: 700;
padding: 4px 8px 4px;
font-size: 15px;
border-color: #3AC162;
background-color: #5FCF80;
"""),format.raw/*40.1*/("""}"""),format.raw/*40.2*/("""
    """),format.raw/*41.5*/("""h1 """),format.raw/*41.8*/("""{"""),format.raw/*41.9*/("""
    """),format.raw/*42.5*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
    font-size: 40px;
    font-style: normal;
    font-variant: normal;
    font-weight: 500;
    line-height: 26.3999996185303px;
    """),format.raw/*48.5*/("""}"""),format.raw/*48.6*/("""
    """),format.raw/*49.5*/("""h3 """),format.raw/*49.8*/("""{"""),format.raw/*49.9*/("""
    """),format.raw/*50.5*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
    font-size: 14px;
    font-style: normal;
    font-variant: normal;
    font-weight: 500;
    line-height: 15.3999996185303px;
    """),format.raw/*56.5*/("""}"""),format.raw/*56.6*/("""
    """),format.raw/*57.5*/("""p """),format.raw/*57.7*/("""{"""),format.raw/*57.8*/("""
    """),format.raw/*58.5*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
    font-size: 17px;
    font-style: normal;
    font-variant: normal;
    font-weight: 400;
    line-height: 20px;
    """),format.raw/*64.5*/("""}"""),format.raw/*64.6*/("""
    """),format.raw/*65.5*/("""blockquote """),format.raw/*65.16*/("""{"""),format.raw/*65.17*/("""
    """),format.raw/*66.5*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
    font-size: 21px;
    font-style: normal;
    font-variant: normal;
    font-weight: 400;
    line-height: 30px;
    """),format.raw/*72.5*/("""}"""),format.raw/*72.6*/("""
    """),format.raw/*73.5*/("""pre """),format.raw/*73.9*/("""{"""),format.raw/*73.10*/("""
    """),format.raw/*74.5*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
    font-size: 13px;
    font-style: normal;
    font-variant: normal;
    font-weight: 400;
    line-height: 18.5714302062988px;
    """),format.raw/*80.5*/("""}"""),format.raw/*80.6*/("""

    """),format.raw/*82.5*/("""body """),format.raw/*82.10*/("""{"""),format.raw/*82.11*/("""
    """),format.raw/*83.5*/("""background-image: url('https://unsplash.imgix.net/40/10294420724_0300cf921d_o.jpg?dpr=2&fit=crop&fm=jpg&h=700&q=75&w=1050');
    """),format.raw/*84.5*/("""}"""),format.raw/*84.6*/("""
"""),format.raw/*85.1*/("""</style>

""")))}),format.raw/*87.2*/("""

"""))}
  }

  def render(client:models.Client,history:java.util.List[String]): play.twirl.api.HtmlFormat.Appendable = apply(client,history)

  def f:((models.Client,java.util.List[String]) => play.twirl.api.HtmlFormat.Appendable) = (client,history) => apply(client,history)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Aug 02 11:50:19 BST 2015
                  SOURCE: /Users/jiaqichen/Desktop/RandChat/app/views/message.scala.html
                  HASH: a536ddc6c359a56b10c6d46461ce259a7e5d377b
                  MATRIX: 755->1|901->59|929->62|952->77|991->79|1019->81|1060->96|1074->102|1099->107|1133->116|1165->133|1204->135|1233->137|1264->142|1285->143|1322->150|1352->154|1366->160|1426->211|1466->213|1494->214|1689->379|1717->380|1774->410|1802->411|1830->412|2385->940|2413->941|2445->946|2475->949|2503->950|2535->955|2757->1150|2785->1151|2817->1156|2847->1159|2875->1160|2907->1165|3129->1360|3157->1361|3189->1366|3218->1368|3246->1369|3278->1374|3486->1555|3514->1556|3546->1561|3585->1572|3614->1573|3646->1578|3854->1759|3882->1760|3914->1765|3945->1769|3974->1770|4006->1775|4228->1970|4256->1971|4289->1977|4322->1982|4351->1983|4383->1988|4539->2117|4567->2118|4595->2119|4636->2130
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|33->5|33->5|36->8|36->8|36->8|38->10|38->10|38->10|39->11|42->14|42->14|42->14|42->14|43->15|45->17|46->18|47->19|47->19|48->20|68->40|68->40|69->41|69->41|69->41|70->42|76->48|76->48|77->49|77->49|77->49|78->50|84->56|84->56|85->57|85->57|85->57|86->58|92->64|92->64|93->65|93->65|93->65|94->66|100->72|100->72|101->73|101->73|101->73|102->74|108->80|108->80|110->82|110->82|110->82|111->83|112->84|112->84|113->85|115->87
                  -- GENERATED --
              */
          