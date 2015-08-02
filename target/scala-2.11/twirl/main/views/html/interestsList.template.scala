
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
object interestsList extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[java.util.List[InterestLikes],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(interestLikes : java.util.List[InterestLikes]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.49*/("""

"""),format.raw/*3.1*/("""<h1>Interests</h1>

"""),_display_(/*5.2*/helper/*5.8*/.form(routes.Application.createInterestPage())/*5.54*/ {_display_(Seq[Any](format.raw/*5.56*/("""
"""),format.raw/*6.1*/("""<button type="submit" class="green"> <h2>+ New Interest</h2></button><br>
""")))}),format.raw/*7.2*/("""

"""),_display_(/*9.2*/for(interestLike <- interestLikes) yield /*9.36*/ {_display_(Seq[Any](format.raw/*9.38*/("""
    """),_display_(/*10.6*/helper/*10.12*/.form(routes.Application.interestPage(interestLike.interest))/*10.73*/ {_display_(Seq[Any](format.raw/*10.75*/("""
    """),format.raw/*11.5*/("""<button type="submit" class="blue"> <h3>"""),_display_(/*11.46*/interestLike/*11.58*/.interest),format.raw/*11.67*/(""" """),format.raw/*11.68*/("""-  """),_display_(/*11.72*/interestLike/*11.84*/.likes),format.raw/*11.90*/(""" """),format.raw/*11.91*/("""likes</h3></button><br>
<h4> </h4>
    """)))}),format.raw/*13.6*/("""
""")))}),format.raw/*14.2*/("""

"""),format.raw/*16.1*/("""<style type="text/css">
    h1 """),format.raw/*17.8*/("""{"""),format.raw/*17.9*/("""
    """),format.raw/*18.5*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
    font-size: 30px;
    font-style: normal;
    font-variant: normal;
    font-weight: 500;
    line-height: 26.3999996185303px;
    """),format.raw/*24.5*/("""}"""),format.raw/*24.6*/("""

    """),format.raw/*26.5*/("""h2 """),format.raw/*26.8*/("""{"""),format.raw/*26.9*/("""
    """),format.raw/*27.5*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
    font-size: 20px;
    font-style: normal;
    font-variant: normal;
    font-weight: 500;
    line-height: 19px;
    """),format.raw/*33.5*/("""}"""),format.raw/*33.6*/("""

    """),format.raw/*35.5*/("""h3 """),format.raw/*35.8*/("""{"""),format.raw/*35.9*/("""
    """),format.raw/*36.5*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
    font-size: 17px;
    font-style: normal;
    font-variant: normal;
    font-weight: 500;
    line-height: 15.3999996185303px;
    """),format.raw/*42.5*/("""}"""),format.raw/*42.6*/("""
    """),format.raw/*43.5*/("""h4 """),format.raw/*43.8*/("""{"""),format.raw/*43.9*/("""
    """),format.raw/*44.5*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
    font-size: 3px;
    font-style: normal;
    font-variant: normal;
    font-weight: 500;
    line-height: 15.3999996185303px;
    """),format.raw/*50.5*/("""}"""),format.raw/*50.6*/("""
    """),format.raw/*51.5*/("""p """),format.raw/*51.7*/("""{"""),format.raw/*51.8*/("""
    """),format.raw/*52.5*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
    font-size: 17px;
    font-style: normal;
    font-variant: normal;
    font-weight: 400;
    line-height: 20px;
    """),format.raw/*58.5*/("""}"""),format.raw/*58.6*/("""
    """),format.raw/*59.5*/("""blockquote """),format.raw/*59.16*/("""{"""),format.raw/*59.17*/("""
    """),format.raw/*60.5*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
    font-size: 21px;
    font-style: normal;
    font-variant: normal;
    font-weight: 400;
    line-height: 30px;
    """),format.raw/*66.5*/("""}"""),format.raw/*66.6*/("""
    """),format.raw/*67.5*/("""pre """),format.raw/*67.9*/("""{"""),format.raw/*67.10*/("""
    """),format.raw/*68.5*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
    font-size: 13px;
    font-style: normal;
    font-variant: normal;
    font-weight: 400;
    line-height: 18.5714302062988px;
    """),format.raw/*74.5*/("""}"""),format.raw/*74.6*/("""
    """),format.raw/*75.5*/(""".green """),format.raw/*75.12*/("""{"""),format.raw/*75.13*/("""

    """),format.raw/*77.5*/("""border-style: solid;
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

    """),format.raw/*98.5*/("""}"""),format.raw/*98.6*/("""

    """),format.raw/*100.5*/(""".blue"""),format.raw/*100.10*/("""{"""),format.raw/*100.11*/("""
    """),format.raw/*101.5*/("""border-style: solid;
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
    """),format.raw/*121.5*/("""}"""),format.raw/*121.6*/("""

    """),format.raw/*123.5*/("""body """),format.raw/*123.10*/("""{"""),format.raw/*123.11*/("""
    """),format.raw/*124.5*/("""background-image: url('https://unsplash.imgix.net/40/10294420724_0300cf921d_o.jpg?dpr=2&fit=crop&fm=jpg&h=700&q=75&w=1050');
    """),format.raw/*125.5*/("""}"""),format.raw/*125.6*/("""

"""),format.raw/*127.1*/("""</style>


"""))}
  }

  def render(interestLikes:java.util.List[InterestLikes]): play.twirl.api.HtmlFormat.Appendable = apply(interestLikes)

  def f:((java.util.List[InterestLikes]) => play.twirl.api.HtmlFormat.Appendable) = (interestLikes) => apply(interestLikes)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Aug 02 12:07:54 BST 2015
                  SOURCE: /Users/jiaqichen/Desktop/RandChat/app/views/interestsList.scala.html
                  HASH: 7e9bb1ad3d890a7f1f51c46426bc19bbf484d9b5
                  MATRIX: 754->1|889->48|917->50|963->71|976->77|1030->123|1069->125|1096->126|1200->201|1228->204|1277->238|1316->240|1348->246|1363->252|1433->313|1473->315|1505->320|1573->361|1594->373|1624->382|1653->383|1684->387|1705->399|1732->405|1761->406|1831->446|1863->448|1892->450|1950->481|1978->482|2010->487|2232->682|2260->683|2293->689|2323->692|2351->693|2383->698|2591->879|2619->880|2652->886|2682->889|2710->890|2742->895|2964->1090|2992->1091|3024->1096|3054->1099|3082->1100|3114->1105|3335->1299|3363->1300|3395->1305|3424->1307|3452->1308|3484->1313|3692->1494|3720->1495|3752->1500|3791->1511|3820->1512|3852->1517|4060->1698|4088->1699|4120->1704|4151->1708|4180->1709|4212->1714|4434->1909|4462->1910|4494->1915|4529->1922|4558->1923|4591->1929|5228->2539|5256->2540|5290->2546|5324->2551|5354->2552|5387->2557|6023->3165|6052->3166|6086->3172|6120->3177|6150->3178|6183->3183|6340->3312|6369->3313|6399->3315
                  LINES: 26->1|29->1|31->3|33->5|33->5|33->5|33->5|34->6|35->7|37->9|37->9|37->9|38->10|38->10|38->10|38->10|39->11|39->11|39->11|39->11|39->11|39->11|39->11|39->11|39->11|41->13|42->14|44->16|45->17|45->17|46->18|52->24|52->24|54->26|54->26|54->26|55->27|61->33|61->33|63->35|63->35|63->35|64->36|70->42|70->42|71->43|71->43|71->43|72->44|78->50|78->50|79->51|79->51|79->51|80->52|86->58|86->58|87->59|87->59|87->59|88->60|94->66|94->66|95->67|95->67|95->67|96->68|102->74|102->74|103->75|103->75|103->75|105->77|126->98|126->98|128->100|128->100|128->100|129->101|149->121|149->121|151->123|151->123|151->123|152->124|153->125|153->125|155->127
                  -- GENERATED --
              */
          