
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
object interestPage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[models.Interest,Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(interest : models.Interest, LikesNum : Integer):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.50*/("""


"""),format.raw/*4.1*/("""<h1>"""),_display_(/*4.6*/interest/*4.14*/.interest),format.raw/*4.23*/("""<h1>
    <h2>"""),_display_(/*5.10*/LikesNum),format.raw/*5.18*/(""" """),format.raw/*5.19*/("""likes</h2>


<h2>Description: """),_display_(/*8.19*/interest/*8.27*/.description),format.raw/*8.39*/("""</h2>

    """),_display_(/*10.6*/helper/*10.12*/.form(routes.Application.likeInterest(interest.interest))/*10.69*/ {_display_(Seq[Any](format.raw/*10.71*/("""
    """),format.raw/*11.5*/("""<button type="submit" class="like">Like this!</button>
    """)))}),format.raw/*12.6*/("""

    """),_display_(/*14.6*/helper/*14.12*/.form(routes.Application.interestsListPage())/*14.57*/ {_display_(Seq[Any](format.raw/*14.59*/("""
    """),format.raw/*15.5*/("""<button type="submit" class="blue">Go back</button>
    """)))}),format.raw/*16.6*/("""

    """),format.raw/*18.5*/("""<style type="text/css">

        h1 """),format.raw/*20.12*/("""{"""),format.raw/*20.13*/("""
        """),format.raw/*21.9*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
        font-size: 40px;
        font-style: normal;
        font-variant: normal;
        font-weight: 500;
        line-height: 26.3999996185303px;
        """),format.raw/*27.9*/("""}"""),format.raw/*27.10*/("""
        """),format.raw/*28.9*/("""h2 """),format.raw/*28.12*/("""{"""),format.raw/*28.13*/("""
        """),format.raw/*29.9*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
        font-size: 21px;
        font-style: normal;
        font-variant: normal;
        font-weight: 500;
        line-height: 21px;
        """),format.raw/*35.9*/("""}"""),format.raw/*35.10*/("""
        """),format.raw/*36.9*/("""h3 """),format.raw/*36.12*/("""{"""),format.raw/*36.13*/("""
        """),format.raw/*37.9*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
        font-size: 15px;
        font-style: normal;
        font-variant: normal;
        font-weight: 500;
        line-height: 15.3999996185303px;
        """),format.raw/*43.9*/("""}"""),format.raw/*43.10*/("""
        """),format.raw/*44.9*/("""p """),format.raw/*44.11*/("""{"""),format.raw/*44.12*/("""
        """),format.raw/*45.9*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
        font-size: 17px;
        font-style: normal;
        font-variant: normal;
        font-weight: 400;
        line-height: 20px;
        """),format.raw/*51.9*/("""}"""),format.raw/*51.10*/("""
        """),format.raw/*52.9*/("""blockquote """),format.raw/*52.20*/("""{"""),format.raw/*52.21*/("""
        """),format.raw/*53.9*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
        font-size: 21px;
        font-style: normal;
        font-variant: normal;
        font-weight: 400;
        line-height: 30px;
        """),format.raw/*59.9*/("""}"""),format.raw/*59.10*/("""
        """),format.raw/*60.9*/("""pre """),format.raw/*60.13*/("""{"""),format.raw/*60.14*/("""
        """),format.raw/*61.9*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
        font-size: 13px;
        font-style: normal;
        font-variant: normal;
        font-weight: 400;
        line-height: 18.5714302062988px;
        """),format.raw/*67.9*/("""}"""),format.raw/*67.10*/("""
        """),format.raw/*68.9*/(""".like """),format.raw/*68.15*/("""{"""),format.raw/*68.16*/("""
        """),format.raw/*69.9*/("""border-style: solid;
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

        """),format.raw/*90.9*/("""}"""),format.raw/*90.10*/("""
        """),format.raw/*91.9*/(""".blue"""),format.raw/*91.14*/("""{"""),format.raw/*91.15*/("""
        """),format.raw/*92.9*/("""border-style: solid;
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
        """),format.raw/*112.9*/("""}"""),format.raw/*112.10*/("""
        """),format.raw/*113.9*/("""body """),format.raw/*113.14*/("""{"""),format.raw/*113.15*/("""
        """),format.raw/*114.9*/("""background-image: url('https://unsplash.imgix.net/40/10294420724_0300cf921d_o.jpg?dpr=2&fit=crop&fm=jpg&h=700&q=75&w=1050');
        """),format.raw/*115.9*/("""}"""),format.raw/*115.10*/("""
    """),format.raw/*116.5*/("""</style>
"""))}
  }

  def render(interest:models.Interest,LikesNum:Integer): play.twirl.api.HtmlFormat.Appendable = apply(interest,LikesNum)

  def f:((models.Interest,Integer) => play.twirl.api.HtmlFormat.Appendable) = (interest,LikesNum) => apply(interest,LikesNum)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Aug 02 12:08:59 BST 2015
                  SOURCE: /Users/jiaqichen/Desktop/RandChat/app/views/interestPage.scala.html
                  HASH: 0ac212b2b6658bb6442b9232ca64345b844cc49b
                  MATRIX: 747->1|883->49|912->52|942->57|958->65|987->74|1027->88|1055->96|1083->97|1140->128|1156->136|1188->148|1226->160|1241->166|1307->223|1347->225|1379->230|1469->290|1502->297|1517->303|1571->348|1611->350|1643->355|1730->412|1763->418|1827->454|1856->455|1892->464|2138->683|2167->684|2203->693|2234->696|2263->697|2299->706|2531->911|2560->912|2596->921|2627->924|2656->925|2692->934|2938->1153|2967->1154|3003->1163|3033->1165|3062->1166|3098->1175|3330->1380|3359->1381|3395->1390|3434->1401|3463->1402|3499->1411|3731->1616|3760->1617|3796->1626|3828->1630|3857->1631|3893->1640|4139->1859|4168->1860|4204->1869|4238->1875|4267->1876|4303->1885|5020->2575|5049->2576|5085->2585|5118->2590|5147->2591|5183->2600|5899->3288|5929->3289|5966->3298|6000->3303|6030->3304|6067->3313|6228->3446|6258->3447|6291->3452
                  LINES: 26->1|29->1|32->4|32->4|32->4|32->4|33->5|33->5|33->5|36->8|36->8|36->8|38->10|38->10|38->10|38->10|39->11|40->12|42->14|42->14|42->14|42->14|43->15|44->16|46->18|48->20|48->20|49->21|55->27|55->27|56->28|56->28|56->28|57->29|63->35|63->35|64->36|64->36|64->36|65->37|71->43|71->43|72->44|72->44|72->44|73->45|79->51|79->51|80->52|80->52|80->52|81->53|87->59|87->59|88->60|88->60|88->60|89->61|95->67|95->67|96->68|96->68|96->68|97->69|118->90|118->90|119->91|119->91|119->91|120->92|140->112|140->112|141->113|141->113|141->113|142->114|143->115|143->115|144->116
                  -- GENERATED --
              */
          