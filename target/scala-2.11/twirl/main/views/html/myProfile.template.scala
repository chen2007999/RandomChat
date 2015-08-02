
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
object myProfile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[models.Client,java.util.List[InterestLikes],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(client: models.Client, interestLikes : java.util.List[InterestLikes]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.72*/("""

"""),_display_(/*3.2*/main("My Profile")/*3.20*/ {_display_(Seq[Any](format.raw/*3.22*/("""


"""),_display_(/*6.2*/helper/*6.8*/.form(routes.Application.editMyProfilePage())/*6.53*/ {_display_(Seq[Any](format.raw/*6.55*/("""
"""),format.raw/*7.1*/("""<input type="submit" class="green" value="Edit My Profile" style="float: right">
""")))}),format.raw/*8.2*/("""

"""),format.raw/*10.1*/("""<div style="overflow: hidden; padding-right: .5em;">
<h1>"""),_display_(/*11.6*/client/*11.12*/.name),format.raw/*11.17*/("""</h1>
</div>​

<h2>My Description:</h2>
<h2>"""),_display_(/*15.6*/client/*15.12*/.description),format.raw/*15.24*/("""</h2>
<h3> </h3>

<h2>My Interests:</h2>
"""),_display_(/*19.2*/for(interestLike <- interestLikes) yield /*19.36*/ {_display_(Seq[Any](format.raw/*19.38*/("""
    """),_display_(/*20.6*/helper/*20.12*/.form(routes.Application.interestPage(interestLike.interest))/*20.73*/ {_display_(Seq[Any](format.raw/*20.75*/("""
    """),format.raw/*21.5*/("""<button type="submit" class="blue"> <h3>"""),_display_(/*21.46*/interestLike/*21.58*/.interest),format.raw/*21.67*/(""" """),format.raw/*21.68*/("""- """),_display_(/*21.71*/interestLike/*21.83*/.likes),format.raw/*21.89*/(""" """),format.raw/*21.90*/("""likes</h3></button>
<h4> </h4>
    """)))}),format.raw/*23.6*/("""
""")))}),format.raw/*24.2*/("""

"""),format.raw/*26.1*/("""<style type="text/css">
.blue"""),format.raw/*27.6*/("""{"""),format.raw/*27.7*/("""
"""),format.raw/*28.1*/("""border-style: solid;
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
"""),format.raw/*48.1*/("""}"""),format.raw/*48.2*/("""

    """),format.raw/*50.5*/(""".green"""),format.raw/*50.11*/("""{"""),format.raw/*50.12*/("""
    """),format.raw/*51.5*/("""border-style: solid;
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
    """),format.raw/*71.5*/("""}"""),format.raw/*71.6*/("""
    """),format.raw/*72.5*/("""h1 """),format.raw/*72.8*/("""{"""),format.raw/*72.9*/("""
    """),format.raw/*73.5*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
    font-size: 40px;
    font-style: normal;
    font-variant: normal;
    font-weight: 500;
    line-height: 26.3999996185303px;
    """),format.raw/*79.5*/("""}"""),format.raw/*79.6*/("""
    """),format.raw/*80.5*/("""h2 """),format.raw/*80.8*/("""{"""),format.raw/*80.9*/("""
    """),format.raw/*81.5*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
    font-size: 20px;
    font-style: normal;
    font-variant: normal;
    font-weight: 500;
    line-height: 20px;
    """),format.raw/*87.5*/("""}"""),format.raw/*87.6*/("""
    """),format.raw/*88.5*/("""h3 """),format.raw/*88.8*/("""{"""),format.raw/*88.9*/("""
    """),format.raw/*89.5*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
    font-size: 18px;
    font-style: normal;
    font-variant: normal;
    font-weight: 500;
    line-height: 15.3999996185303px;
    """),format.raw/*95.5*/("""}"""),format.raw/*95.6*/("""
    """),format.raw/*96.5*/("""h4 """),format.raw/*96.8*/("""{"""),format.raw/*96.9*/("""
    """),format.raw/*97.5*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
    font-size: 5px;
    font-style: normal;
    font-variant: normal;
    font-weight: 500;
    line-height: 15.3999996185303px;
    """),format.raw/*103.5*/("""}"""),format.raw/*103.6*/("""
    """),format.raw/*104.5*/("""p """),format.raw/*104.7*/("""{"""),format.raw/*104.8*/("""
    """),format.raw/*105.5*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
    font-size: 17px;
    font-style: normal;
    font-variant: normal;
    font-weight: 400;
    line-height: 20px;
    """),format.raw/*111.5*/("""}"""),format.raw/*111.6*/("""
    """),format.raw/*112.5*/("""blockquote """),format.raw/*112.16*/("""{"""),format.raw/*112.17*/("""
    """),format.raw/*113.5*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
    font-size: 21px;
    font-style: normal;
    font-variant: normal;
    font-weight: 400;
    line-height: 30px;
    """),format.raw/*119.5*/("""}"""),format.raw/*119.6*/("""
    """),format.raw/*120.5*/("""pre """),format.raw/*120.9*/("""{"""),format.raw/*120.10*/("""
    """),format.raw/*121.5*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
    font-size: 13px;
    font-style: normal;
    font-variant: normal;
    font-weight: 400;
    line-height: 18.5714302062988px;
    """),format.raw/*127.5*/("""}"""),format.raw/*127.6*/("""
    """),format.raw/*128.5*/("""body """),format.raw/*128.10*/("""{"""),format.raw/*128.11*/("""
    """),format.raw/*129.5*/("""background-image: url('https://unsplash.imgix.net/40/10294420724_0300cf921d_o.jpg?dpr=2&fit=crop&fm=jpg&h=700&q=75&w=1050');
    """),format.raw/*130.5*/("""}"""),format.raw/*130.6*/("""
"""),format.raw/*131.1*/("""</style>

""")))}))}
  }

  def render(client:models.Client,interestLikes:java.util.List[InterestLikes]): play.twirl.api.HtmlFormat.Appendable = apply(client,interestLikes)

  def f:((models.Client,java.util.List[InterestLikes]) => play.twirl.api.HtmlFormat.Appendable) = (client,interestLikes) => apply(client,interestLikes)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Aug 02 12:07:01 BST 2015
                  SOURCE: /Users/jiaqichen/Desktop/RandChat/app/views/myProfile.scala.html
                  HASH: 97e91f1e7f4b53253a1a93005f73f27d919fd773
                  MATRIX: 764->1|922->71|950->74|976->92|1015->94|1044->98|1057->104|1110->149|1149->151|1176->152|1287->234|1316->236|1400->294|1415->300|1441->305|1512->350|1527->356|1560->368|1628->410|1678->444|1718->446|1750->452|1765->458|1835->519|1875->521|1907->526|1975->567|1996->579|2026->588|2055->589|2085->592|2106->604|2133->610|2162->611|2228->647|2260->649|2289->651|2345->680|2373->681|2401->682|2956->1210|2984->1211|3017->1217|3051->1223|3080->1224|3112->1229|3747->1837|3775->1838|3807->1843|3837->1846|3865->1847|3897->1852|4119->2047|4147->2048|4179->2053|4209->2056|4237->2057|4269->2062|4477->2243|4505->2244|4537->2249|4567->2252|4595->2253|4627->2258|4849->2453|4877->2454|4909->2459|4939->2462|4967->2463|4999->2468|5221->2662|5250->2663|5283->2668|5313->2670|5342->2671|5375->2676|5584->2857|5613->2858|5646->2863|5686->2874|5716->2875|5749->2880|5958->3061|5987->3062|6020->3067|6052->3071|6082->3072|6115->3077|6338->3272|6367->3273|6400->3278|6434->3283|6464->3284|6497->3289|6654->3418|6683->3419|6712->3420
                  LINES: 26->1|29->1|31->3|31->3|31->3|34->6|34->6|34->6|34->6|35->7|36->8|38->10|39->11|39->11|39->11|43->15|43->15|43->15|47->19|47->19|47->19|48->20|48->20|48->20|48->20|49->21|49->21|49->21|49->21|49->21|49->21|49->21|49->21|49->21|51->23|52->24|54->26|55->27|55->27|56->28|76->48|76->48|78->50|78->50|78->50|79->51|99->71|99->71|100->72|100->72|100->72|101->73|107->79|107->79|108->80|108->80|108->80|109->81|115->87|115->87|116->88|116->88|116->88|117->89|123->95|123->95|124->96|124->96|124->96|125->97|131->103|131->103|132->104|132->104|132->104|133->105|139->111|139->111|140->112|140->112|140->112|141->113|147->119|147->119|148->120|148->120|148->120|149->121|155->127|155->127|156->128|156->128|156->128|157->129|158->130|158->130|159->131
                  -- GENERATED --
              */
          