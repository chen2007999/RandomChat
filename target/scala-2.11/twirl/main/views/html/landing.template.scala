
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
object landing extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper.twitterBootstrap._

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
"""),_display_(/*3.2*/main("RandChat")/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""
    """),format.raw/*4.5*/("""<head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href=""""),_display_(/*6.39*/routes/*6.45*/.Assets.at("stylesheets/style.css")),format.raw/*6.80*/("""" type="text/css">
        <link href='http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*8.55*/routes/*8.61*/.Assets.at("stylesheets/bootmetro.css")),format.raw/*8.100*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*9.55*/routes/*9.61*/.Assets.at("stylesheets/bootmetro-responsive.css")),format.raw/*9.111*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*10.55*/routes/*10.61*/.Assets.at("stylesheets/bootmetro-icons.css")),format.raw/*10.106*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*11.55*/routes/*11.61*/.Assets.at("stylesheets/bootmetro-ui-light.css")),format.raw/*11.109*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*12.55*/routes/*12.61*/.Assets.at("stylesheets/datepicker.css")),format.raw/*12.101*/("""">
        <script src=""""),_display_(/*13.23*/routes/*13.29*/.Assets.at("javascripts/bootstrap/jquery.js")),format.raw/*13.74*/(""""></script>
        <script src=""""),_display_(/*14.23*/routes/*14.29*/.Assets.at("javascripts/bootstrap/bootstrap.js")),format.raw/*14.77*/(""""></script>
        <script src=""""),_display_(/*15.23*/routes/*15.29*/.Assets.at("javascripts/bootstrap/bootstrap.min.js")),format.raw/*15.81*/(""""></script>
        
        <style>
            body, html """),format.raw/*18.24*/("""{"""),format.raw/*18.25*/("""
            """),format.raw/*19.13*/("""height: 100%;
            """),format.raw/*20.13*/("""}"""),format.raw/*20.14*/("""
            """),format.raw/*21.13*/(""".mouse-bg """),format.raw/*21.23*/("""{"""),format.raw/*21.24*/("""
            """),format.raw/*22.13*/("""left: 0;
            right: 0;
            bottom: 0;
            top: 0;
            position: fixed;
            """),format.raw/*27.13*/("""}"""),format.raw/*27.14*/("""
            """),format.raw/*28.13*/("""#background """),format.raw/*28.25*/("""{"""),format.raw/*28.26*/("""
            """),format.raw/*29.13*/("""background-image: url('http://tmdup.com/assets/images/new.jpg');
            """),format.raw/*30.13*/("""}"""),format.raw/*30.14*/("""
        """),format.raw/*31.9*/("""</style>

    
<body class="body-landing">
    <div id="background" class="mouse-bg"></div>
    <script src=""""),_display_(/*36.19*/routes/*36.25*/.Assets.at("javascripts/parallax/mouse.parallax.js")),format.raw/*36.77*/(""""></script>
    <script>
    $(document).ready(function() """),format.raw/*38.34*/("""{"""),format.raw/*38.35*/("""
    				"""),format.raw/*39.9*/("""$('#background').mouseParallax("""),format.raw/*39.40*/("""{"""),format.raw/*39.41*/(""" """),format.raw/*39.42*/("""moveFactor: 5 """),format.raw/*39.56*/("""}"""),format.raw/*39.57*/(""");
    			"""),format.raw/*40.8*/("""}"""),format.raw/*40.9*/(""");
    </script>
    <div class="container">
        <h1 align="center">Welcome to RandChat</h1>
        
        <div class="row-fluid" id="login-div"> 
            <div class="well span4 offset4"  style="background: rgba(234, 239, 244, .5);" align="center">
            """),_display_(/*47.14*/helper/*47.20*/.form(routes.Application.logIn())/*47.53*/ {_display_(Seq[Any](format.raw/*47.55*/("""
               """),format.raw/*48.16*/("""<input class="stretch" name="email" placeholder="Email Address"> <br>
               <input class="stretch" type="password" name="password" placeholder="Password">  <br>
               <button class="btstretch" type="submit">Log in</button>
            """)))}),format.raw/*51.14*/("""
            """),_display_(/*52.14*/helper/*52.20*/.form(routes.Application.register(""))/*52.58*/ {_display_(Seq[Any](format.raw/*52.60*/("""
               """),format.raw/*53.16*/("""<button class="btstretch" type="submit">Register</button>
            """)))}),format.raw/*54.14*/("""
            """),format.raw/*55.13*/("""</div>
        </div>
    </div>
</body>
""")))}),format.raw/*59.2*/("""
"""),format.raw/*60.1*/("""</html>
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jul 09 21:04:47 BST 2015
                  SOURCE: /Users/jiaqichen/Desktop/RandChat/app/views/landing.scala.html
                  HASH: 64011ff2e9ae81a92792a96fc7330e2a679ffb9b
                  MATRIX: 832->0|874->51|898->67|937->69|968->74|1118->198|1132->204|1187->239|1406->432|1420->438|1480->477|1563->534|1577->540|1648->590|1732->647|1747->653|1814->698|1898->755|1913->761|1983->809|2067->866|2082->872|2144->912|2196->937|2211->943|2277->988|2338->1022|2353->1028|2422->1076|2483->1110|2498->1116|2571->1168|2659->1228|2688->1229|2729->1242|2783->1268|2812->1269|2853->1282|2891->1292|2920->1293|2961->1306|3104->1421|3133->1422|3174->1435|3214->1447|3243->1448|3284->1461|3389->1538|3418->1539|3454->1548|3591->1658|3606->1664|3679->1716|3765->1774|3794->1775|3830->1784|3889->1815|3918->1816|3947->1817|3989->1831|4018->1832|4055->1842|4083->1843|4383->2116|4398->2122|4440->2155|4480->2157|4524->2173|4809->2427|4850->2441|4865->2447|4912->2485|4952->2487|4996->2503|5098->2574|5139->2587|5211->2629|5239->2630
                  LINES: 29->1|30->3|30->3|30->3|31->4|33->6|33->6|33->6|35->8|35->8|35->8|36->9|36->9|36->9|37->10|37->10|37->10|38->11|38->11|38->11|39->12|39->12|39->12|40->13|40->13|40->13|41->14|41->14|41->14|42->15|42->15|42->15|45->18|45->18|46->19|47->20|47->20|48->21|48->21|48->21|49->22|54->27|54->27|55->28|55->28|55->28|56->29|57->30|57->30|58->31|63->36|63->36|63->36|65->38|65->38|66->39|66->39|66->39|66->39|66->39|66->39|67->40|67->40|74->47|74->47|74->47|74->47|75->48|78->51|79->52|79->52|79->52|79->52|80->53|81->54|82->55|86->59|87->60
                  -- GENERATED --
              */
          