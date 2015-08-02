
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
object editMyProfile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.Client,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(client: models.Client):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.25*/("""

"""),_display_(/*3.2*/main("Edit Profile")/*3.22*/ {_display_(Seq[Any](format.raw/*3.24*/("""

"""),format.raw/*5.1*/("""<div class="container">
<div style="overflow: hidden; padding-right: .5em;">
    <h1 align="center">"""),_display_(/*7.25*/client/*7.31*/.name),format.raw/*7.36*/("""</h1>
</div>​

<div class="row-fluid" id="login-div">

    <div class="well span4 offset4" style="background: rgba(234, 239, 244, .5);" align="center">
"""),_display_(/*13.2*/helper/*13.8*/.form(routes.Application.editMyProfile())/*13.49*/ {_display_(Seq[Any](format.raw/*13.51*/("""
"""),format.raw/*14.1*/("""<div class="form-group">
    <label class="col-sm-3 control-label"><h2>Describe Yourself!</h2> </label>
    <div class="col-sm-4">
        <input type="text" class="form-control" name="description" placeholder="Description" size="70" style="height: 70px;" >
    </div>
</div>
        <br>
<button type="submit" class="green" style="height:30px;width:60px">Save</button>
""")))}),format.raw/*22.2*/("""

    """),format.raw/*24.5*/("""</div>
</div>
</div>

<style type="text/css">
    .green"""),format.raw/*29.11*/("""{"""),format.raw/*29.12*/("""
    """),format.raw/*30.5*/("""border-style: solid;
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
    """),format.raw/*50.5*/("""}"""),format.raw/*50.6*/("""

    """),format.raw/*52.5*/("""h1 """),format.raw/*52.8*/("""{"""),format.raw/*52.9*/("""
    """),format.raw/*53.5*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
    font-size: 40px;
    font-style: normal;
    font-variant: normal;
    font-weight: 500;
    line-height: 26.3999996185303px;
    """),format.raw/*59.5*/("""}"""),format.raw/*59.6*/("""

    """),format.raw/*61.5*/("""h2 """),format.raw/*61.8*/("""{"""),format.raw/*61.9*/("""
    """),format.raw/*62.5*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
    font-size: 25px;
    font-style: normal;
    font-variant: normal;
    font-weight: 500;
    line-height: 21px;
    """),format.raw/*68.5*/("""}"""),format.raw/*68.6*/("""

    """),format.raw/*70.5*/("""h3 """),format.raw/*70.8*/("""{"""),format.raw/*70.9*/("""
    """),format.raw/*71.5*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
    font-size: 15px;
    font-style: normal;
    font-variant: normal;
    font-weight: 500;
    line-height: 15.3999996185303px;
    """),format.raw/*77.5*/("""}"""),format.raw/*77.6*/("""
    """),format.raw/*78.5*/("""p """),format.raw/*78.7*/("""{"""),format.raw/*78.8*/("""
    """),format.raw/*79.5*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
    font-size: 17px;
    font-style: normal;
    font-variant: normal;
    font-weight: 400;
    line-height: 20px;
    """),format.raw/*85.5*/("""}"""),format.raw/*85.6*/("""
    """),format.raw/*86.5*/("""blockquote """),format.raw/*86.16*/("""{"""),format.raw/*86.17*/("""
    """),format.raw/*87.5*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
    font-size: 21px;
    font-style: normal;
    font-variant: normal;
    font-weight: 400;
    line-height: 30px;
    """),format.raw/*93.5*/("""}"""),format.raw/*93.6*/("""
    """),format.raw/*94.5*/("""pre """),format.raw/*94.9*/("""{"""),format.raw/*94.10*/("""
    """),format.raw/*95.5*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
    font-size: 13px;
    font-style: normal;
    font-variant: normal;
    font-weight: 400;
    line-height: 18.5714302062988px;
    """),format.raw/*101.5*/("""}"""),format.raw/*101.6*/("""
    """),format.raw/*102.5*/("""body """),format.raw/*102.10*/("""{"""),format.raw/*102.11*/("""
    """),format.raw/*103.5*/("""background-image: url('https://unsplash.imgix.net/40/10294420724_0300cf921d_o.jpg?dpr=2&fit=crop&fm=jpg&h=700&q=75&w=1050');
    """),format.raw/*104.5*/("""}"""),format.raw/*104.6*/("""
"""),format.raw/*105.1*/("""</style>
""")))}),format.raw/*106.2*/("""





"""))}
  }

  def render(client:models.Client): play.twirl.api.HtmlFormat.Appendable = apply(client)

  def f:((models.Client) => play.twirl.api.HtmlFormat.Appendable) = (client) => apply(client)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Aug 02 12:05:45 BST 2015
                  SOURCE: /Users/jiaqichen/Desktop/RandChat/app/views/editMyProfile.scala.html
                  HASH: 32d80cde01cc873aab545648c5b5146b71cc69ef
                  MATRIX: 738->1|849->24|877->27|905->47|944->49|972->51|1099->152|1113->158|1138->163|1317->316|1331->322|1381->363|1421->365|1449->366|1850->737|1883->743|1967->799|1996->800|2028->805|2663->1413|2691->1414|2724->1420|2754->1423|2782->1424|2814->1429|3036->1624|3064->1625|3097->1631|3127->1634|3155->1635|3187->1640|3395->1821|3423->1822|3456->1828|3486->1831|3514->1832|3546->1837|3768->2032|3796->2033|3828->2038|3857->2040|3885->2041|3917->2046|4125->2227|4153->2228|4185->2233|4224->2244|4253->2245|4285->2250|4493->2431|4521->2432|4553->2437|4584->2441|4613->2442|4645->2447|4868->2642|4897->2643|4930->2648|4964->2653|4994->2654|5027->2659|5184->2788|5213->2789|5242->2790|5283->2800
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|35->7|35->7|35->7|41->13|41->13|41->13|41->13|42->14|50->22|52->24|57->29|57->29|58->30|78->50|78->50|80->52|80->52|80->52|81->53|87->59|87->59|89->61|89->61|89->61|90->62|96->68|96->68|98->70|98->70|98->70|99->71|105->77|105->77|106->78|106->78|106->78|107->79|113->85|113->85|114->86|114->86|114->86|115->87|121->93|121->93|122->94|122->94|122->94|123->95|129->101|129->101|130->102|130->102|130->102|131->103|132->104|132->104|133->105|134->106
                  -- GENERATED --
              */
          