
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
object unread extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[java.util.List[Client],java.util.List[Client],java.util.List[UnreadMessage],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(requestClients: java.util.List[Client], confirmationClients : java.util.List[Client], messageForms : java.util.List[UnreadMessage]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.134*/("""

"""),_display_(/*3.2*/main("Unread")/*3.16*/ {_display_(Seq[Any](format.raw/*3.18*/("""

"""),format.raw/*5.1*/("""<h1>Unread</h1>

<ul>
    """),_display_(/*8.6*/for(requestClient <- requestClients) yield /*8.42*/ {_display_(Seq[Any](format.raw/*8.44*/("""
        """),_display_(/*9.10*/helper/*9.16*/.form(routes.Application.findFriendProfileWithClientEmail(requestClient.email, "request"))/*9.106*/ {_display_(Seq[Any](format.raw/*9.108*/("""
        """),format.raw/*10.9*/("""<button type="submit" class="blue"> <h3> """),_display_(/*10.51*/requestClient/*10.64*/.name),format.raw/*10.69*/(""" """),format.raw/*10.70*/("""sent you a friend request</h3></button><br>
        """)))}),format.raw/*11.10*/("""
    """)))}),format.raw/*12.6*/("""
"""),format.raw/*13.1*/("""</ul>

<ul>
    """),_display_(/*16.6*/for(confirmationClient <- confirmationClients) yield /*16.52*/ {_display_(Seq[Any](format.raw/*16.54*/("""
        """),_display_(/*17.10*/helper/*17.16*/.form(routes.Application.findFriendProfileWithClientEmail(confirmationClient.email, "confirmation"))/*17.116*/ {_display_(Seq[Any](format.raw/*17.118*/("""
        """),format.raw/*18.9*/("""<button type="submit" class="blue"> <h3> """),_display_(/*18.51*/confirmationClient/*18.69*/.name),format.raw/*18.74*/(""" """),format.raw/*18.75*/("""has accepeted your friend request</h3></button><br>
        """)))}),format.raw/*19.10*/("""
    """)))}),format.raw/*20.6*/("""
"""),format.raw/*21.1*/("""</ul>

<ul>
    """),_display_(/*24.6*/for(messageForm <- messageForms) yield /*24.38*/ {_display_(Seq[Any](format.raw/*24.40*/("""
        """),_display_(/*25.10*/helper/*25.16*/.form(routes.Application.message(messageForm.email, "updateUnread", messageForm.number))/*25.104*/ {_display_(Seq[Any](format.raw/*25.106*/("""
        """),format.raw/*26.9*/("""<button type="submit" class="blue"> <h3>"""),_display_(/*26.50*/messageForm/*26.61*/.clientName),format.raw/*26.72*/(""" """),format.raw/*26.73*/("""has sent you a message.</h3></button><br>
        """)))}),format.raw/*27.10*/("""
    """)))}),format.raw/*28.6*/("""
"""),format.raw/*29.1*/("""</ul>

<style type="text/css">
.blue"""),format.raw/*32.6*/("""{"""),format.raw/*32.7*/("""
"""),format.raw/*33.1*/("""border-style: solid;
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
background-color: #397CAC;
border-color: #326E99;
"""),format.raw/*53.1*/("""}"""),format.raw/*53.2*/("""

    """),format.raw/*55.5*/("""h1 """),format.raw/*55.8*/("""{"""),format.raw/*55.9*/("""
    """),format.raw/*56.5*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
    font-size: 30px;
    font-style: normal;
    font-variant: normal;
    font-weight: 500;
    line-height: 26.3999996185303px;
    """),format.raw/*62.5*/("""}"""),format.raw/*62.6*/("""

    """),format.raw/*64.5*/("""h2 """),format.raw/*64.8*/("""{"""),format.raw/*64.9*/("""
    """),format.raw/*65.5*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
    font-size: 25px;
    font-style: normal;
    font-variant: normal;
    font-weight: 500;
    line-height: 21px;
    """),format.raw/*71.5*/("""}"""),format.raw/*71.6*/("""

    """),format.raw/*73.5*/("""h3 """),format.raw/*73.8*/("""{"""),format.raw/*73.9*/("""
    """),format.raw/*74.5*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
    font-size: 15px;
    font-style: normal;
    font-variant: normal;
    font-weight: 500;
    line-height: 15.3999996185303px;
    """),format.raw/*80.5*/("""}"""),format.raw/*80.6*/("""
    """),format.raw/*81.5*/("""p """),format.raw/*81.7*/("""{"""),format.raw/*81.8*/("""
    """),format.raw/*82.5*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
    font-size: 17px;
    font-style: normal;
    font-variant: normal;
    font-weight: 400;
    line-height: 20px;
    """),format.raw/*88.5*/("""}"""),format.raw/*88.6*/("""
    """),format.raw/*89.5*/("""blockquote """),format.raw/*89.16*/("""{"""),format.raw/*89.17*/("""
    """),format.raw/*90.5*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
    font-size: 21px;
    font-style: normal;
    font-variant: normal;
    font-weight: 400;
    line-height: 30px;
    """),format.raw/*96.5*/("""}"""),format.raw/*96.6*/("""
    """),format.raw/*97.5*/("""pre """),format.raw/*97.9*/("""{"""),format.raw/*97.10*/("""
    """),format.raw/*98.5*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
    font-size: 13px;
    font-style: normal;
    font-variant: normal;
    font-weight: 400;
    line-height: 18.5714302062988px;
    """),format.raw/*104.5*/("""}"""),format.raw/*104.6*/("""
    """),format.raw/*105.5*/("""body """),format.raw/*105.10*/("""{"""),format.raw/*105.11*/("""
    """),format.raw/*106.5*/("""background-image: url('https://unsplash.imgix.net/40/10294420724_0300cf921d_o.jpg?dpr=2&fit=crop&fm=jpg&h=700&q=75&w=1050');
    """),format.raw/*107.5*/("""}"""),format.raw/*107.6*/("""
"""),format.raw/*108.1*/("""</style>
""")))}),format.raw/*109.2*/("""
"""))}
  }

  def render(requestClients:java.util.List[Client],confirmationClients:java.util.List[Client],messageForms:java.util.List[UnreadMessage]): play.twirl.api.HtmlFormat.Appendable = apply(requestClients,confirmationClients,messageForms)

  def f:((java.util.List[Client],java.util.List[Client],java.util.List[UnreadMessage]) => play.twirl.api.HtmlFormat.Appendable) = (requestClients,confirmationClients,messageForms) => apply(requestClients,confirmationClients,messageForms)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Aug 02 12:07:54 BST 2015
                  SOURCE: /Users/jiaqichen/Desktop/RandChat/app/views/unread.scala.html
                  HASH: 4cbf3f52c51702a45528290d28862c8e63a70cd2
                  MATRIX: 793->1|1014->133|1042->136|1064->150|1103->152|1131->154|1183->181|1234->217|1273->219|1309->229|1323->235|1422->325|1462->327|1498->336|1567->378|1589->391|1615->396|1644->397|1728->450|1764->456|1792->457|1835->474|1897->520|1937->522|1974->532|1989->538|2099->638|2140->640|2176->649|2245->691|2272->709|2298->714|2327->715|2419->776|2455->782|2483->783|2526->800|2574->832|2614->834|2651->844|2666->850|2764->938|2805->940|2841->949|2909->990|2929->1001|2961->1012|2990->1013|3072->1064|3108->1070|3136->1071|3199->1107|3227->1108|3255->1109|3810->1637|3838->1638|3871->1644|3901->1647|3929->1648|3961->1653|4183->1848|4211->1849|4244->1855|4274->1858|4302->1859|4334->1864|4542->2045|4570->2046|4603->2052|4633->2055|4661->2056|4693->2061|4915->2256|4943->2257|4975->2262|5004->2264|5032->2265|5064->2270|5272->2451|5300->2452|5332->2457|5371->2468|5400->2469|5432->2474|5640->2655|5668->2656|5700->2661|5731->2665|5760->2666|5792->2671|6015->2866|6044->2867|6077->2872|6111->2877|6141->2878|6174->2883|6331->3012|6360->3013|6389->3014|6430->3024
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|36->8|36->8|36->8|37->9|37->9|37->9|37->9|38->10|38->10|38->10|38->10|38->10|39->11|40->12|41->13|44->16|44->16|44->16|45->17|45->17|45->17|45->17|46->18|46->18|46->18|46->18|46->18|47->19|48->20|49->21|52->24|52->24|52->24|53->25|53->25|53->25|53->25|54->26|54->26|54->26|54->26|54->26|55->27|56->28|57->29|60->32|60->32|61->33|81->53|81->53|83->55|83->55|83->55|84->56|90->62|90->62|92->64|92->64|92->64|93->65|99->71|99->71|101->73|101->73|101->73|102->74|108->80|108->80|109->81|109->81|109->81|110->82|116->88|116->88|117->89|117->89|117->89|118->90|124->96|124->96|125->97|125->97|125->97|126->98|132->104|132->104|133->105|133->105|133->105|134->106|135->107|135->107|136->108|137->109
                  -- GENERATED --
              */
          