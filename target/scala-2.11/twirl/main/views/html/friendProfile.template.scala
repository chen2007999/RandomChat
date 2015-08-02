
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
object friendProfile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[models.Client,Boolean,Boolean,java.util.List[InterestLikes],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(client: models.Client, requestReceived : Boolean, friendAlready : Boolean, interestLikes : java.util.List[InterestLikes]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.124*/("""

"""),_display_(/*3.2*/main(client.name)/*3.19*/ {_display_(Seq[Any](format.raw/*3.21*/("""

"""),format.raw/*5.1*/("""<h1>"""),_display_(/*5.6*/client/*5.12*/.name),format.raw/*5.17*/("""</h1>

"""),_display_(/*7.2*/helper/*7.8*/.form(routes.Application.message(client.email, "nothing", 0))/*7.69*/ {_display_(Seq[Any](format.raw/*7.71*/("""
"""),format.raw/*8.1*/("""<button type="submit" id="message" class="action">Message</button>
""")))}),format.raw/*9.2*/("""

"""),_display_(/*11.2*/helper/*11.8*/.form(routes.Application.addFriend(client.email))/*11.57*/ {_display_(Seq[Any](format.raw/*11.59*/("""
"""),format.raw/*12.1*/("""<button id="add" type="submit" class="action">add friend</button>
""")))}),format.raw/*13.2*/("""

"""),_display_(/*15.2*/helper/*15.8*/.form(routes.Application.acceptFriendRequest(client.email))/*15.67*/ {_display_(Seq[Any](format.raw/*15.69*/("""
"""),format.raw/*16.1*/("""<button id="accept" type="submit" class="action">accept friend request</button>
""")))}),format.raw/*17.2*/("""

"""),format.raw/*19.1*/("""<h2>Description:</h2>
<h2>"""),_display_(/*20.6*/client/*20.12*/.description),format.raw/*20.24*/("""</h2>

<h2>Interests:</h2>
"""),_display_(/*23.2*/for(interestLike <- interestLikes) yield /*23.36*/ {_display_(Seq[Any](format.raw/*23.38*/("""
    """),_display_(/*24.6*/helper/*24.12*/.form(routes.Application.interestPage(interestLike.interest))/*24.73*/ {_display_(Seq[Any](format.raw/*24.75*/("""
    """),format.raw/*25.5*/("""<button type="submit" class="blue"> <h3>"""),_display_(/*25.46*/interestLike/*25.58*/.interest),format.raw/*25.67*/(""" """),format.raw/*25.68*/("""- """),_display_(/*25.71*/interestLike/*25.83*/.likes),format.raw/*25.89*/(""" """),format.raw/*25.90*/("""likes</h3></button>
<h4> </h4>
    """)))}),format.raw/*27.6*/("""
""")))}),format.raw/*28.2*/("""


"""),format.raw/*31.1*/("""<script type="text/javascript">
            var accept = document.getElementById('accept');
            var add = document.getElementById('add');
            var message = document.getElementById('message');

            if("""),_display_(/*36.17*/friendAlready),format.raw/*36.30*/(""") """),format.raw/*36.32*/("""{"""),format.raw/*36.33*/("""
                """),format.raw/*37.17*/("""message.style.display = "";
                add.style.display = "none";
                accept.style.display = "none";
            """),format.raw/*40.13*/("""}"""),format.raw/*40.14*/(""" """),format.raw/*40.15*/("""else """),format.raw/*40.20*/("""{"""),format.raw/*40.21*/("""
                 """),format.raw/*41.18*/("""if("""),_display_(/*41.22*/requestReceived),format.raw/*41.37*/(""")"""),format.raw/*41.38*/("""{"""),format.raw/*41.39*/("""
                       """),format.raw/*42.24*/("""message.style.display = "none";
                       add.style.display = "none";
                       accept.style.display = "";
                 """),format.raw/*45.18*/("""}"""),format.raw/*45.19*/(""" """),format.raw/*45.20*/("""else """),format.raw/*45.25*/("""{"""),format.raw/*45.26*/("""
                       """),format.raw/*46.24*/("""message.style.display = "none";
                       accept.style.display = "none";
                       add.style.display = "";
                 """),format.raw/*49.18*/("""}"""),format.raw/*49.19*/("""
            """),format.raw/*50.13*/("""}"""),format.raw/*50.14*/("""
"""),format.raw/*51.1*/("""</script>


<style type="text/css">
    h1 """),format.raw/*55.8*/("""{"""),format.raw/*55.9*/("""
    """),format.raw/*56.5*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
    font-size: 40px;
    font-style: normal;
    font-variant: normal;
    font-weight: 500;
    line-height: 26.3999996185303px;
    """),format.raw/*62.5*/("""}"""),format.raw/*62.6*/("""
    """),format.raw/*63.5*/("""h2 """),format.raw/*63.8*/("""{"""),format.raw/*63.9*/("""
    """),format.raw/*64.5*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
    font-size: 20px;
    font-style: normal;
    font-variant: normal;
    font-weight: 500;
    line-height: 20px;
    """),format.raw/*70.5*/("""}"""),format.raw/*70.6*/("""
    """),format.raw/*71.5*/("""h3 """),format.raw/*71.8*/("""{"""),format.raw/*71.9*/("""
    """),format.raw/*72.5*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
    font-size: 18px;
    font-style: normal;
    font-variant: normal;
    font-weight: 500;
    line-height: 15.3999996185303px;
    """),format.raw/*78.5*/("""}"""),format.raw/*78.6*/("""
    """),format.raw/*79.5*/("""h4 """),format.raw/*79.8*/("""{"""),format.raw/*79.9*/("""
    """),format.raw/*80.5*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
    font-size: 5px;
    font-style: normal;
    font-variant: normal;
    font-weight: 500;
    line-height: 15.3999996185303px;
    """),format.raw/*86.5*/("""}"""),format.raw/*86.6*/("""
    """),format.raw/*87.5*/("""p """),format.raw/*87.7*/("""{"""),format.raw/*87.8*/("""
    """),format.raw/*88.5*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
    font-size: 17px;
    font-style: normal;
    font-variant: normal;
    font-weight: 400;
    line-height: 20px;
    """),format.raw/*94.5*/("""}"""),format.raw/*94.6*/("""
    """),format.raw/*95.5*/("""blockquote """),format.raw/*95.16*/("""{"""),format.raw/*95.17*/("""
    """),format.raw/*96.5*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
    font-size: 21px;
    font-style: normal;
    font-variant: normal;
    font-weight: 400;
    line-height: 30px;
    """),format.raw/*102.5*/("""}"""),format.raw/*102.6*/("""
    """),format.raw/*103.5*/("""pre """),format.raw/*103.9*/("""{"""),format.raw/*103.10*/("""
    """),format.raw/*104.5*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
    font-size: 13px;
    font-style: normal;
    font-variant: normal;
    font-weight: 400;
    line-height: 18.5714302062988px;
    """),format.raw/*110.5*/("""}"""),format.raw/*110.6*/("""

    """),format.raw/*112.5*/(""".action"""),format.raw/*112.12*/("""{"""),format.raw/*112.13*/("""
    """),format.raw/*113.5*/("""border-style: solid;
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
    padding: 4px 13px 4px;
    font-size: 15px;
    border-color: #3AC162;
    background-color: #5FCF80;

    """),format.raw/*134.5*/("""}"""),format.raw/*134.6*/("""

    """),format.raw/*136.5*/(""".blue"""),format.raw/*136.10*/("""{"""),format.raw/*136.11*/("""
    """),format.raw/*137.5*/("""border-style: solid;
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
    padding: 3px 6px 3px;
    font-size: 15px;
    background-color: #397CAC;
    border-color: #326E99;
    """),format.raw/*157.5*/("""}"""),format.raw/*157.6*/("""
    """),format.raw/*158.5*/("""body """),format.raw/*158.10*/("""{"""),format.raw/*158.11*/("""
    """),format.raw/*159.5*/("""background-image: url('https://unsplash.imgix.net/40/10294420724_0300cf921d_o.jpg?dpr=2&fit=crop&fm=jpg&h=700&q=75&w=1050');
    """),format.raw/*160.5*/("""}"""),format.raw/*160.6*/("""
"""),format.raw/*161.1*/("""</style>



""")))}))}
  }

  def render(client:models.Client,requestReceived:Boolean,friendAlready:Boolean,interestLikes:java.util.List[InterestLikes]): play.twirl.api.HtmlFormat.Appendable = apply(client,requestReceived,friendAlready,interestLikes)

  def f:((models.Client,Boolean,Boolean,java.util.List[InterestLikes]) => play.twirl.api.HtmlFormat.Appendable) = (client,requestReceived,friendAlready,interestLikes) => apply(client,requestReceived,friendAlready,interestLikes)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Aug 02 12:07:54 BST 2015
                  SOURCE: /Users/jiaqichen/Desktop/RandChat/app/views/friendProfile.scala.html
                  HASH: 20bd43975c2ffa7d5f9864fe7605bbeb9db04344
                  MATRIX: 784->1|995->123|1023->126|1048->143|1087->145|1115->147|1145->152|1159->158|1184->163|1217->171|1230->177|1299->238|1338->240|1365->241|1462->309|1491->312|1505->318|1563->367|1603->369|1631->370|1728->437|1757->440|1771->446|1839->505|1879->507|1907->508|2018->589|2047->591|2100->618|2115->624|2148->636|2202->664|2252->698|2292->700|2324->706|2339->712|2409->773|2449->775|2481->780|2549->821|2570->833|2600->842|2629->843|2659->846|2680->858|2707->864|2736->865|2802->901|2834->903|2864->906|3116->1131|3150->1144|3180->1146|3209->1147|3254->1164|3413->1295|3442->1296|3471->1297|3504->1302|3533->1303|3579->1321|3610->1325|3646->1340|3675->1341|3704->1342|3756->1366|3934->1516|3963->1517|3992->1518|4025->1523|4054->1524|4106->1548|4284->1698|4313->1699|4354->1712|4383->1713|4411->1714|4481->1757|4509->1758|4541->1763|4763->1958|4791->1959|4823->1964|4853->1967|4881->1968|4913->1973|5121->2154|5149->2155|5181->2160|5211->2163|5239->2164|5271->2169|5493->2364|5521->2365|5553->2370|5583->2373|5611->2374|5643->2379|5864->2573|5892->2574|5924->2579|5953->2581|5981->2582|6013->2587|6221->2768|6249->2769|6281->2774|6320->2785|6349->2786|6381->2791|6590->2972|6619->2973|6652->2978|6684->2982|6714->2983|6747->2988|6970->3183|6999->3184|7033->3190|7069->3197|7099->3198|7132->3203|7770->3813|7799->3814|7833->3820|7867->3825|7897->3826|7930->3831|8566->4439|8595->4440|8628->4445|8662->4450|8692->4451|8725->4456|8882->4585|8911->4586|8940->4587
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|33->5|33->5|35->7|35->7|35->7|35->7|36->8|37->9|39->11|39->11|39->11|39->11|40->12|41->13|43->15|43->15|43->15|43->15|44->16|45->17|47->19|48->20|48->20|48->20|51->23|51->23|51->23|52->24|52->24|52->24|52->24|53->25|53->25|53->25|53->25|53->25|53->25|53->25|53->25|53->25|55->27|56->28|59->31|64->36|64->36|64->36|64->36|65->37|68->40|68->40|68->40|68->40|68->40|69->41|69->41|69->41|69->41|69->41|70->42|73->45|73->45|73->45|73->45|73->45|74->46|77->49|77->49|78->50|78->50|79->51|83->55|83->55|84->56|90->62|90->62|91->63|91->63|91->63|92->64|98->70|98->70|99->71|99->71|99->71|100->72|106->78|106->78|107->79|107->79|107->79|108->80|114->86|114->86|115->87|115->87|115->87|116->88|122->94|122->94|123->95|123->95|123->95|124->96|130->102|130->102|131->103|131->103|131->103|132->104|138->110|138->110|140->112|140->112|140->112|141->113|162->134|162->134|164->136|164->136|164->136|165->137|185->157|185->157|186->158|186->158|186->158|187->159|188->160|188->160|189->161
                  -- GENERATED --
              */
          