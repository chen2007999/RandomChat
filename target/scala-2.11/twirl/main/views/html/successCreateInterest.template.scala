
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
object successCreateInterest extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(interestTitle : String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.26*/("""

"""),format.raw/*3.1*/("""<h2>Successfuly created """),_display_(/*3.26*/interestTitle),format.raw/*3.39*/("""!</h2>

"""),_display_(/*5.2*/helper/*5.8*/.form(routes.Application.interestsListPage())/*5.53*/ {_display_(Seq[Any](format.raw/*5.55*/("""
"""),format.raw/*6.1*/("""<button type="submit"class="blue">Go back</button>
""")))}),format.raw/*7.2*/("""


"""),format.raw/*10.1*/("""<style type="text/css">
    h2 """),format.raw/*11.8*/("""{"""),format.raw/*11.9*/("""
    """),format.raw/*12.5*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
    font-size: 25px;
    font-style: normal;
    font-variant: normal;
    font-weight: 500;
    line-height: 21px;
    """),format.raw/*18.5*/("""}"""),format.raw/*18.6*/("""

    """),format.raw/*20.5*/(""".blue"""),format.raw/*20.10*/("""{"""),format.raw/*20.11*/("""
    """),format.raw/*21.5*/("""border-style: solid;
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
    """),format.raw/*41.5*/("""}"""),format.raw/*41.6*/("""
    """),format.raw/*42.5*/("""body """),format.raw/*42.10*/("""{"""),format.raw/*42.11*/("""
    """),format.raw/*43.5*/("""background-image: url('https://unsplash.imgix.net/40/10294420724_0300cf921d_o.jpg?dpr=2&fit=crop&fm=jpg&h=700&q=75&w=1050');
    """),format.raw/*44.5*/("""}"""),format.raw/*44.6*/("""
"""),format.raw/*45.1*/("""</style>"""))}
  }

  def render(interestTitle:String): play.twirl.api.HtmlFormat.Appendable = apply(interestTitle)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (interestTitle) => apply(interestTitle)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Aug 02 12:07:54 BST 2015
                  SOURCE: /Users/jiaqichen/Desktop/RandChat/app/views/successCreateInterest.scala.html
                  HASH: e9ff42d926a272e06712e519917703bdbdf8013e
                  MATRIX: 739->1|851->25|879->27|930->52|963->65|997->74|1010->80|1063->125|1102->127|1129->128|1210->180|1240->183|1298->214|1326->215|1358->220|1566->401|1594->402|1627->408|1660->413|1689->414|1721->419|2356->1027|2384->1028|2416->1033|2449->1038|2478->1039|2510->1044|2666->1173|2694->1174|2722->1175
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|33->5|33->5|34->6|35->7|38->10|39->11|39->11|40->12|46->18|46->18|48->20|48->20|48->20|49->21|69->41|69->41|70->42|70->42|70->42|71->43|72->44|72->44|73->45
                  -- GENERATED --
              */
          