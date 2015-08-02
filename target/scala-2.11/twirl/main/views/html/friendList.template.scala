
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
object friendList extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[java.util.List[Client],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(friends : java.util.List[Client]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.36*/("""

"""),format.raw/*3.1*/("""<h1>Friends</h1>

"""),_display_(/*5.2*/for(friend <- friends) yield /*5.24*/ {_display_(Seq[Any](format.raw/*5.26*/("""
    """),_display_(/*6.6*/helper/*6.12*/.form(routes.Application.findFriendProfileWithClientEmail(friend.email, "nothing"))/*6.95*/ {_display_(Seq[Any](format.raw/*6.97*/("""
    """),format.raw/*7.5*/("""<button type="submit" class="green"> <h2>"""),_display_(/*7.47*/friend/*7.53*/.name),format.raw/*7.58*/(""" """),format.raw/*7.59*/("""← """),_display_(/*7.62*/friend/*7.68*/.description),format.raw/*7.80*/("""</h2></button>
    """)))}),format.raw/*8.6*/("""
""")))}),format.raw/*9.2*/("""

"""),format.raw/*11.1*/("""<style type="text/css">
    .green """),format.raw/*12.12*/("""{"""),format.raw/*12.13*/("""

    """),format.raw/*14.5*/("""border-style: solid;
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

    """),format.raw/*35.5*/("""}"""),format.raw/*35.6*/("""
    """),format.raw/*36.5*/("""h1 """),format.raw/*36.8*/("""{"""),format.raw/*36.9*/("""
    """),format.raw/*37.5*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
    font-size: 30px;
    font-style: normal;
    font-variant: normal;
    font-weight: 500;
    line-height: 26.3999996185303px;
    """),format.raw/*43.5*/("""}"""),format.raw/*43.6*/("""

    """),format.raw/*45.5*/("""h2 """),format.raw/*45.8*/("""{"""),format.raw/*45.9*/("""
    """),format.raw/*46.5*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
    font-size: 25px;
    font-style: normal;
    font-variant: normal;
    font-weight: 500;
    line-height: 21px;
    """),format.raw/*52.5*/("""}"""),format.raw/*52.6*/("""

    """),format.raw/*54.5*/("""h3 """),format.raw/*54.8*/("""{"""),format.raw/*54.9*/("""
    """),format.raw/*55.5*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
    font-size: 15px;
    font-style: normal;
    font-variant: normal;
    font-weight: 500;
    line-height: 15.3999996185303px;
    """),format.raw/*61.5*/("""}"""),format.raw/*61.6*/("""
    """),format.raw/*62.5*/("""p """),format.raw/*62.7*/("""{"""),format.raw/*62.8*/("""
    """),format.raw/*63.5*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
    font-size: 17px;
    font-style: normal;
    font-variant: normal;
    font-weight: 400;
    line-height: 20px;
    """),format.raw/*69.5*/("""}"""),format.raw/*69.6*/("""
    """),format.raw/*70.5*/("""blockquote """),format.raw/*70.16*/("""{"""),format.raw/*70.17*/("""
    """),format.raw/*71.5*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
    font-size: 21px;
    font-style: normal;
    font-variant: normal;
    font-weight: 400;
    line-height: 30px;
    """),format.raw/*77.5*/("""}"""),format.raw/*77.6*/("""
    """),format.raw/*78.5*/("""pre """),format.raw/*78.9*/("""{"""),format.raw/*78.10*/("""
    """),format.raw/*79.5*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
    font-size: 13px;
    font-style: normal;
    font-variant: normal;
    font-weight: 400;
    line-height: 18.5714302062988px;
    """),format.raw/*85.5*/("""}"""),format.raw/*85.6*/("""
    """),format.raw/*86.5*/("""body """),format.raw/*86.10*/("""{"""),format.raw/*86.11*/("""
    """),format.raw/*87.5*/("""background-image: url('https://unsplash.imgix.net/40/10294420724_0300cf921d_o.jpg?dpr=2&fit=crop&fm=jpg&h=700&q=75&w=1050');
    """),format.raw/*88.5*/("""}"""),format.raw/*88.6*/("""
"""),format.raw/*89.1*/("""</style>
"""))}
  }

  def render(friends:java.util.List[Client]): play.twirl.api.HtmlFormat.Appendable = apply(friends)

  def f:((java.util.List[Client]) => play.twirl.api.HtmlFormat.Appendable) = (friends) => apply(friends)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Aug 02 12:04:20 BST 2015
                  SOURCE: /Users/jiaqichen/Desktop/RandChat/app/views/friendList.scala.html
                  HASH: 128c5f322c18ae56be5475130a35a0e0e7d38dca
                  MATRIX: 744->1|866->35|894->37|938->56|975->78|1014->80|1045->86|1059->92|1150->175|1189->177|1220->182|1288->224|1302->230|1327->235|1355->236|1384->239|1398->245|1430->257|1479->277|1510->279|1539->281|1602->316|1631->317|1664->323|2301->933|2329->934|2361->939|2391->942|2419->943|2451->948|2673->1143|2701->1144|2734->1150|2764->1153|2792->1154|2824->1159|3032->1340|3060->1341|3093->1347|3123->1350|3151->1351|3183->1356|3405->1551|3433->1552|3465->1557|3494->1559|3522->1560|3554->1565|3762->1746|3790->1747|3822->1752|3861->1763|3890->1764|3922->1769|4130->1950|4158->1951|4190->1956|4221->1960|4250->1961|4282->1966|4504->2161|4532->2162|4564->2167|4597->2172|4626->2173|4658->2178|4814->2307|4842->2308|4870->2309
                  LINES: 26->1|29->1|31->3|33->5|33->5|33->5|34->6|34->6|34->6|34->6|35->7|35->7|35->7|35->7|35->7|35->7|35->7|35->7|36->8|37->9|39->11|40->12|40->12|42->14|63->35|63->35|64->36|64->36|64->36|65->37|71->43|71->43|73->45|73->45|73->45|74->46|80->52|80->52|82->54|82->54|82->54|83->55|89->61|89->61|90->62|90->62|90->62|91->63|97->69|97->69|98->70|98->70|98->70|99->71|105->77|105->77|106->78|106->78|106->78|107->79|113->85|113->85|114->86|114->86|114->86|115->87|116->88|116->88|117->89
                  -- GENERATED --
              */
          