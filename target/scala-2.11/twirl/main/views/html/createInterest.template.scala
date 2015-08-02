
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
object createInterest extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<div class="container">

    <h1 align="center">Create a new interest page</h1>
    <div class="row-fluid" id="login-div">

        <div class="well span4 offset4" style="background: rgba(234, 239, 244, .5);" align="center">
            """),_display_(/*7.14*/helper/*7.20*/.form(routes.Application.createInterest())/*7.62*/ {_display_(Seq[Any](format.raw/*7.64*/("""
                """),format.raw/*8.17*/("""<div class="form-group">
                    <h3>Interest title</h3>
                    <div class="col-sm-4">
                        <input type="text" class="form-control" name="interest" placeholder="Interest title" size="82.5" style="height: 30px;" >
                    </div>
                </div>
                <div class="form-group">
                    <h3>Interest description</h3>
                    <div class="col-sm-5">
                        <textarea name="description" cols="80" rows="10" placeholder="Interest description"></textarea> <br>
                    </div>
                </div>
                <button type="submit" class="green" style="height:30px;width:60px">Create</button>
            """)))}),format.raw/*21.14*/("""

            """),_display_(/*23.14*/helper/*23.20*/.form(routes.Application.interestsListPage())/*23.65*/ {_display_(Seq[Any](format.raw/*23.67*/("""
            """),format.raw/*24.13*/("""<button type="submit" class="blue" style="height:30px;width:80px">Go back</button>
            """)))}),format.raw/*25.14*/("""
        """),format.raw/*26.9*/("""</div>
    </div>
</div>


<style type="text/css">
.green"""),format.raw/*32.7*/("""{"""),format.raw/*32.8*/("""
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
padding: 4px 1px 4px;
font-size: 15px;
border-color: #3AC162;
background-color: #5FCF80;
"""),format.raw/*53.1*/("""}"""),format.raw/*53.2*/("""

"""),format.raw/*55.1*/(""".blue"""),format.raw/*55.6*/("""{"""),format.raw/*55.7*/("""
"""),format.raw/*56.1*/("""border-style: solid;
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
padding: 4px 1px 4px;
font-size: 15px;
background-color: #397CAC;
border-color: #326E99;
    """),format.raw/*76.5*/("""}"""),format.raw/*76.6*/("""
    """),format.raw/*77.5*/("""h1 """),format.raw/*77.8*/("""{"""),format.raw/*77.9*/("""
    """),format.raw/*78.5*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
    font-size: 40px;
    font-style: normal;
    font-variant: normal;
    font-weight: 500;
    line-height: 26.3999996185303px;
    """),format.raw/*84.5*/("""}"""),format.raw/*84.6*/("""

    """),format.raw/*86.5*/("""h2 """),format.raw/*86.8*/("""{"""),format.raw/*86.9*/("""
    """),format.raw/*87.5*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
    font-size: 25px;
    font-style: normal;
    font-variant: normal;
    font-weight: 500;
    line-height: 21px;
    """),format.raw/*93.5*/("""}"""),format.raw/*93.6*/("""

    """),format.raw/*95.5*/("""h3 """),format.raw/*95.8*/("""{"""),format.raw/*95.9*/("""
    """),format.raw/*96.5*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
    font-size: 15px;
    font-style: normal;
    font-variant: normal;
    font-weight: 500;
    line-height: 15.3999996185303px;
    """),format.raw/*102.5*/("""}"""),format.raw/*102.6*/("""
    """),format.raw/*103.5*/("""p """),format.raw/*103.7*/("""{"""),format.raw/*103.8*/("""
    """),format.raw/*104.5*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
    font-size: 17px;
    font-style: normal;
    font-variant: normal;
    font-weight: 400;
    line-height: 20px;
    """),format.raw/*110.5*/("""}"""),format.raw/*110.6*/("""
    """),format.raw/*111.5*/("""blockquote """),format.raw/*111.16*/("""{"""),format.raw/*111.17*/("""
    """),format.raw/*112.5*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
    font-size: 21px;
    font-style: normal;
    font-variant: normal;
    font-weight: 400;
    line-height: 30px;
    """),format.raw/*118.5*/("""}"""),format.raw/*118.6*/("""
    """),format.raw/*119.5*/("""pre """),format.raw/*119.9*/("""{"""),format.raw/*119.10*/("""
    """),format.raw/*120.5*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
    font-size: 13px;
    font-style: normal;
    font-variant: normal;
    font-weight: 400;
    line-height: 18.5714302062988px;
    """),format.raw/*126.5*/("""}"""),format.raw/*126.6*/("""
    """),format.raw/*127.5*/("""body """),format.raw/*127.10*/("""{"""),format.raw/*127.11*/("""
    """),format.raw/*128.5*/("""background-image: url('https://unsplash.imgix.net/40/10294420724_0300cf921d_o.jpg?dpr=2&fit=crop&fm=jpg&h=700&q=75&w=1050');
    """),format.raw/*129.5*/("""}"""),format.raw/*129.6*/("""

"""),format.raw/*131.1*/("""</style>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Aug 02 12:04:54 BST 2015
                  SOURCE: /Users/jiaqichen/Desktop/RandChat/app/views/createInterest.scala.html
                  HASH: 5f19a9b7d8b78db6e75bff294c877156bbb335f8
                  MATRIX: 807->0|1071->238|1085->244|1135->286|1174->288|1218->305|1977->1033|2019->1048|2034->1054|2088->1099|2128->1101|2169->1114|2296->1210|2332->1219|2416->1276|2444->1277|2472->1278|3027->1806|3055->1807|3084->1809|3116->1814|3144->1815|3172->1816|3731->2348|3759->2349|3791->2354|3821->2357|3849->2358|3881->2363|4103->2558|4131->2559|4164->2565|4194->2568|4222->2569|4254->2574|4462->2755|4490->2756|4523->2762|4553->2765|4581->2766|4613->2771|4836->2966|4865->2967|4898->2972|4928->2974|4957->2975|4990->2980|5199->3161|5228->3162|5261->3167|5301->3178|5331->3179|5364->3184|5573->3365|5602->3366|5635->3371|5667->3375|5697->3376|5730->3381|5953->3576|5982->3577|6015->3582|6049->3587|6079->3588|6112->3593|6269->3722|6298->3723|6328->3725
                  LINES: 29->1|35->7|35->7|35->7|35->7|36->8|49->21|51->23|51->23|51->23|51->23|52->24|53->25|54->26|60->32|60->32|61->33|81->53|81->53|83->55|83->55|83->55|84->56|104->76|104->76|105->77|105->77|105->77|106->78|112->84|112->84|114->86|114->86|114->86|115->87|121->93|121->93|123->95|123->95|123->95|124->96|130->102|130->102|131->103|131->103|131->103|132->104|138->110|138->110|139->111|139->111|139->111|140->112|146->118|146->118|147->119|147->119|147->119|148->120|154->126|154->126|155->127|155->127|155->127|156->128|157->129|157->129|159->131
                  -- GENERATED --
              */
          