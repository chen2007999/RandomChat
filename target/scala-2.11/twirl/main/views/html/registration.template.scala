
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
object registration extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[java.util.List[models.Client],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(clients: java.util.List[models.Client], error: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.57*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>

    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href=""""),_display_(/*6.39*/routes/*6.45*/.Assets.at("stylesheets/style.css")),format.raw/*6.80*/("""" type="text/css">
        <link href='http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*8.55*/routes/*8.61*/.Assets.at("stylesheets/bootmetro.css")),format.raw/*8.100*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*9.55*/routes/*9.61*/.Assets.at("stylesheets/bootmetro-responsive.css")),format.raw/*9.111*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*10.55*/routes/*10.61*/.Assets.at("stylesheets/bootmetro-icons.css")),format.raw/*10.106*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*11.55*/routes/*11.61*/.Assets.at("stylesheets/bootmetro-ui-light.css")),format.raw/*11.109*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*12.55*/routes/*12.61*/.Assets.at("formvalidation/formValidation.css")),format.raw/*12.108*/("""">
        <script src=""""),_display_(/*13.23*/routes/*13.29*/.Assets.at("javascripts/bootstrap/jquery.js")),format.raw/*13.74*/(""""></script>
        <script src=""""),_display_(/*14.23*/routes/*14.29*/.Assets.at("javascripts/bootstrap/bootstrap.js")),format.raw/*14.77*/(""""></script>
        <script src=""""),_display_(/*15.23*/routes/*15.29*/.Assets.at("javascripts/bootstrap/bootstrap.min.js")),format.raw/*15.81*/(""""></script>
        <script src=""""),_display_(/*16.23*/routes/*16.29*/.Assets.at("formvalidation/formValidation.js")),format.raw/*16.75*/(""""></script>
        <script src=""""),_display_(/*17.23*/routes/*17.29*/.Assets.at("formvalidation/bootstrap.js")),format.raw/*17.70*/(""""></script>

        <style>
            body, html """),format.raw/*20.24*/("""{"""),format.raw/*20.25*/("""
            """),format.raw/*21.13*/("""height: 100%;
            """),format.raw/*22.13*/("""}"""),format.raw/*22.14*/("""
            """),format.raw/*23.13*/(""".mouse-bg """),format.raw/*23.23*/("""{"""),format.raw/*23.24*/("""
            """),format.raw/*24.13*/("""left: 0;
            right: 0;
            bottom: 0;
            top: 0;
            position: fixed;
            """),format.raw/*29.13*/("""}"""),format.raw/*29.14*/("""
            """),format.raw/*30.13*/("""#background """),format.raw/*30.25*/("""{"""),format.raw/*30.26*/("""
            """),format.raw/*31.13*/("""background-image: url('http://tmdup.com/assets/images/new.jpg');
            """),format.raw/*32.13*/("""}"""),format.raw/*32.14*/("""
        """),format.raw/*33.9*/("""</style>
            """),_display_(/*34.14*/if(error.length() >0)/*34.35*/{_display_(Seq[Any](format.raw/*34.36*/("""
         """),format.raw/*35.10*/("""<div class="alert">
          <button type="button" class="close" data-dismiss="alert"><a data-dismiss="alert" href="#"></a></button>
          <strong>Warning!</strong> There must have been an error in your entered details. Please try again. """),_display_(/*37.111*/error),format.raw/*37.116*/("""
        """),format.raw/*38.9*/("""</div>
        <script>
            $(".alert").alert()     
        </script>
        """)))}),format.raw/*42.10*/("""
       """),format.raw/*43.8*/("""</div>
       
    </head>

<body class="body-landing">

    <div id="background" class="mouse-bg"></div>
        <script src=""""),_display_(/*50.23*/routes/*50.29*/.Assets.at("javascripts/parallax/mouse.parallax.js")),format.raw/*50.81*/(""""></script>
    <script>
    $(document).ready(function() """),format.raw/*52.34*/("""{"""),format.raw/*52.35*/("""
    				"""),format.raw/*53.9*/("""$('#background').mouseParallax("""),format.raw/*53.40*/("""{"""),format.raw/*53.41*/(""" """),format.raw/*53.42*/("""moveFactor: 5 """),format.raw/*53.56*/("""}"""),format.raw/*53.57*/(""");
    			"""),format.raw/*54.8*/("""}"""),format.raw/*54.9*/(""");
    </script>
    <div class="container">

        <h1 align="center">Create a new account</h1>
        <div class="row-fluid" id="login-div">
        
            <div class="well span4 offset4" style="background: rgba(234, 239, 244, .5);" align="center">
                   <form id="defaultForm" action="/createUser" method="POST" _lpchecked="1">
                    <div class="form-group">
                        <label class="col-sm-3 control-label">Name</label>
                        <div class="col-sm-4">
                        <input style="margin-bottom: 0px;" type="text" class="form-control" name="name" placeholder="Name">
                        </div>
                    </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">Email address</label>
                            <div class="col-sm-5">
                                <input style="margin-bottom: 0px;" type="text" class="form-control" name="email" placeholder="Email address">
                            </div>
                       </div>
                    <div class="form-group">
                        <label class="col-sm-3 control-label">Password</label>
                        <div class="col-sm-5">
                            <input style="margin-bottom: 0px;" type="password" class="form-control" name="password">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-3 control-label">Confirm password</label>
                        <div class="col-sm-3">
                            <input style="margin-bottom: 0px;" type="password" class="form-control" name="password2">
                        </div>
                    </div>
                       <button type="submit">Create</button>
                   </form>
                   """),_display_(/*89.21*/helper/*89.27*/.form(routes.Application.landing())/*89.62*/ {_display_(Seq[Any](format.raw/*89.64*/("""
                       """),format.raw/*90.24*/("""<button type="submit">Go back</button>
                   """)))}),format.raw/*91.21*/("""
               """),format.raw/*92.16*/("""</div>
           </div>
    </div>
 
    <!-- Authentication scripts -->
    <script type="text/javascript">
    $(document).ready(function() """),format.raw/*98.34*/("""{"""),format.raw/*98.35*/("""
        """),format.raw/*99.9*/("""$('#defaultForm').formValidation("""),format.raw/*99.42*/("""{"""),format.raw/*99.43*/("""
            """),format.raw/*100.13*/("""message: 'This value is not valid',
            icon: """),format.raw/*101.19*/("""{"""),format.raw/*101.20*/("""
                """),format.raw/*102.17*/("""valid: 'glyphicon glyphicon-ok',
                invalid: 'glyphicon glyphicon-remove',
                validating: 'glyphicon glyphicon-refresh'
            """),format.raw/*105.13*/("""}"""),format.raw/*105.14*/(""",
            fields: """),format.raw/*106.21*/("""{"""),format.raw/*106.22*/("""
                """),format.raw/*107.17*/("""name: """),format.raw/*107.23*/("""{"""),format.raw/*107.24*/("""
                    """),format.raw/*108.21*/("""row: '.col-sm-4',
                    validators: """),format.raw/*109.33*/("""{"""),format.raw/*109.34*/("""
                        """),format.raw/*110.25*/("""notEmpty: """),format.raw/*110.35*/("""{"""),format.raw/*110.36*/("""
                            """),format.raw/*111.29*/("""message: 'Name is required'
                        """),format.raw/*112.25*/("""}"""),format.raw/*112.26*/("""
                    """),format.raw/*113.21*/("""}"""),format.raw/*113.22*/("""
                """),format.raw/*114.17*/("""}"""),format.raw/*114.18*/(""",
                email: """),format.raw/*115.24*/("""{"""),format.raw/*115.25*/("""
                    """),format.raw/*116.21*/("""validators: """),format.raw/*116.33*/("""{"""),format.raw/*116.34*/("""
                        """),format.raw/*117.25*/("""notEmpty: """),format.raw/*117.35*/("""{"""),format.raw/*117.36*/("""
                            """),format.raw/*118.29*/("""message: 'The email address is required'
                        """),format.raw/*119.25*/("""}"""),format.raw/*119.26*/(""",
                        emailAddress: """),format.raw/*120.39*/("""{"""),format.raw/*120.40*/("""
                            """),format.raw/*121.29*/("""message: 'The input is not a valid email address'
                        """),format.raw/*122.25*/("""}"""),format.raw/*122.26*/("""
                    """),format.raw/*123.21*/("""}"""),format.raw/*123.22*/("""
                """),format.raw/*124.17*/("""}"""),format.raw/*124.18*/(""",
                password: """),format.raw/*125.27*/("""{"""),format.raw/*125.28*/("""
                    """),format.raw/*126.21*/("""validators: """),format.raw/*126.33*/("""{"""),format.raw/*126.34*/("""
                        """),format.raw/*127.25*/("""notEmpty: """),format.raw/*127.35*/("""{"""),format.raw/*127.36*/("""
                            """),format.raw/*128.29*/("""message: 'The password is required'
                        """),format.raw/*129.25*/("""}"""),format.raw/*129.26*/(""",
                        different: """),format.raw/*130.36*/("""{"""),format.raw/*130.37*/("""
                            """),format.raw/*131.29*/("""field: 'username',
                            message: 'The password cannot be the same as username'
                        """),format.raw/*133.25*/("""}"""),format.raw/*133.26*/("""
                    """),format.raw/*134.21*/("""}"""),format.raw/*134.22*/("""
                """),format.raw/*135.17*/("""}"""),format.raw/*135.18*/(""",
                password2: """),format.raw/*136.28*/("""{"""),format.raw/*136.29*/("""
                    """),format.raw/*137.21*/("""validators: """),format.raw/*137.33*/("""{"""),format.raw/*137.34*/("""
                        """),format.raw/*138.25*/("""identical:"""),format.raw/*138.35*/("""{"""),format.raw/*138.36*/("""
                            """),format.raw/*139.29*/("""field: 'password',
                            message: 'Passwords do not match up'
                        """),format.raw/*141.25*/("""}"""),format.raw/*141.26*/("""
                    """),format.raw/*142.21*/("""}"""),format.raw/*142.22*/("""
                """),format.raw/*143.17*/("""}"""),format.raw/*143.18*/("""
            """),format.raw/*144.13*/("""}"""),format.raw/*144.14*/("""
        """),format.raw/*145.9*/("""}"""),format.raw/*145.10*/(""");
    """),format.raw/*146.5*/("""}"""),format.raw/*146.6*/(""");
    </script>
</body>


</html>"""))}
  }

  def render(clients:java.util.List[models.Client],error:String): play.twirl.api.HtmlFormat.Appendable = apply(clients,error)

  def f:((java.util.List[models.Client],String) => play.twirl.api.HtmlFormat.Appendable) = (clients,error) => apply(clients,error)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Jul 01 15:17:56 CST 2015
                  SOURCE: /Users/apple/Desktop/RandChat/app/views/registration.scala.html
                  HASH: 38727182eeb1913791d53ed1d1c921815991d74a
                  MATRIX: 760->1|903->56|930->57|1101->202|1115->208|1170->243|1389->436|1403->442|1463->481|1546->538|1560->544|1631->594|1715->651|1730->657|1797->702|1881->759|1896->765|1966->813|2050->870|2065->876|2134->923|2186->948|2201->954|2267->999|2328->1033|2343->1039|2412->1087|2473->1121|2488->1127|2561->1179|2622->1213|2637->1219|2704->1265|2765->1299|2780->1305|2842->1346|2922->1398|2951->1399|2992->1412|3046->1438|3075->1439|3116->1452|3154->1462|3183->1463|3224->1476|3367->1591|3396->1592|3437->1605|3477->1617|3506->1618|3547->1631|3652->1708|3681->1709|3717->1718|3766->1740|3796->1761|3835->1762|3873->1772|4145->2016|4172->2021|4208->2030|4327->2118|4362->2126|4517->2254|4532->2260|4605->2312|4691->2370|4720->2371|4756->2380|4815->2411|4844->2412|4873->2413|4915->2427|4944->2428|4981->2438|5009->2439|6942->4345|6957->4351|7001->4386|7041->4388|7093->4412|7183->4471|7227->4487|7398->4630|7427->4631|7463->4640|7524->4673|7553->4674|7595->4687|7678->4741|7708->4742|7754->4759|7941->4917|7971->4918|8022->4940|8052->4941|8098->4958|8133->4964|8163->4965|8213->4986|8292->5036|8322->5037|8376->5062|8415->5072|8445->5073|8503->5102|8584->5154|8614->5155|8664->5176|8694->5177|8740->5194|8770->5195|8824->5220|8854->5221|8904->5242|8945->5254|8975->5255|9029->5280|9068->5290|9098->5291|9156->5320|9250->5385|9280->5386|9349->5426|9379->5427|9437->5456|9540->5530|9570->5531|9620->5552|9650->5553|9696->5570|9726->5571|9783->5599|9813->5600|9863->5621|9904->5633|9934->5634|9988->5659|10027->5669|10057->5670|10115->5699|10204->5759|10234->5760|10300->5797|10330->5798|10388->5827|10543->5953|10573->5954|10623->5975|10653->5976|10699->5993|10729->5994|10787->6023|10817->6024|10867->6045|10908->6057|10938->6058|10992->6083|11031->6093|11061->6094|11119->6123|11256->6231|11286->6232|11336->6253|11366->6254|11412->6271|11442->6272|11484->6285|11514->6286|11551->6295|11581->6296|11616->6303|11645->6304
                  LINES: 26->1|29->1|30->2|34->6|34->6|34->6|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|48->20|48->20|49->21|50->22|50->22|51->23|51->23|51->23|52->24|57->29|57->29|58->30|58->30|58->30|59->31|60->32|60->32|61->33|62->34|62->34|62->34|63->35|65->37|65->37|66->38|70->42|71->43|78->50|78->50|78->50|80->52|80->52|81->53|81->53|81->53|81->53|81->53|81->53|82->54|82->54|117->89|117->89|117->89|117->89|118->90|119->91|120->92|126->98|126->98|127->99|127->99|127->99|128->100|129->101|129->101|130->102|133->105|133->105|134->106|134->106|135->107|135->107|135->107|136->108|137->109|137->109|138->110|138->110|138->110|139->111|140->112|140->112|141->113|141->113|142->114|142->114|143->115|143->115|144->116|144->116|144->116|145->117|145->117|145->117|146->118|147->119|147->119|148->120|148->120|149->121|150->122|150->122|151->123|151->123|152->124|152->124|153->125|153->125|154->126|154->126|154->126|155->127|155->127|155->127|156->128|157->129|157->129|158->130|158->130|159->131|161->133|161->133|162->134|162->134|163->135|163->135|164->136|164->136|165->137|165->137|165->137|166->138|166->138|166->138|167->139|169->141|169->141|170->142|170->142|171->143|171->143|172->144|172->144|173->145|173->145|174->146|174->146
                  -- GENERATED --
              */
          