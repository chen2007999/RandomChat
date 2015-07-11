
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
    <link rel="stylesheet" href=""""),_display_(/*6.35*/routes/*6.41*/.Assets.at("stylesheets/style.css")),format.raw/*6.76*/("""" type="text/css">
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" type="text/css" href=""""),_display_(/*8.51*/routes/*8.57*/.Assets.at("stylesheets/bootmetro.css")),format.raw/*8.96*/("""">
    <link rel="stylesheet" type="text/css" href=""""),_display_(/*9.51*/routes/*9.57*/.Assets.at("stylesheets/bootmetro-responsive.css")),format.raw/*9.107*/("""">
    <link rel="stylesheet" type="text/css" href=""""),_display_(/*10.51*/routes/*10.57*/.Assets.at("stylesheets/bootmetro-icons.css")),format.raw/*10.102*/("""">
    <link rel="stylesheet" type="text/css" href=""""),_display_(/*11.51*/routes/*11.57*/.Assets.at("stylesheets/bootmetro-ui-light.css")),format.raw/*11.105*/("""">
    <link rel="stylesheet" type="text/css" href=""""),_display_(/*12.51*/routes/*12.57*/.Assets.at("formvalidation/formValidation.css")),format.raw/*12.104*/("""">
    <script src=""""),_display_(/*13.19*/routes/*13.25*/.Assets.at("javascripts/bootstrap/jquery.js")),format.raw/*13.70*/(""""></script>
        <script src=""""),_display_(/*14.23*/routes/*14.29*/.Assets.at("javascripts/bootstrap/bootstrap.js")),format.raw/*14.77*/(""""></script>
    <script src=""""),_display_(/*15.19*/routes/*15.25*/.Assets.at("javascripts/bootstrap/bootstrap.min.js")),format.raw/*15.77*/(""""></script>
        <script src=""""),_display_(/*16.23*/routes/*16.29*/.Assets.at("formvalidation/formValidation.js")),format.raw/*16.75*/(""""></script>
    <script src=""""),_display_(/*17.19*/routes/*17.25*/.Assets.at("formvalidation/bootstrap.js")),format.raw/*17.66*/(""""></script>

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
    """)))}),format.raw/*42.6*/("""
    """),format.raw/*43.5*/("""</div>

</head>

<body class="body-landing">

<div id="background" class="mouse-bg"></div>
<script src=""""),_display_(/*50.15*/routes/*50.21*/.Assets.at("javascripts/parallax/mouse.parallax.js")),format.raw/*50.73*/(""""></script>
    <script>
    $(document).ready(function() """),format.raw/*52.34*/("""{"""),format.raw/*52.35*/("""
    				"""),format.raw/*53.9*/("""$('#background').mouseParallax("""),format.raw/*53.40*/("""{"""),format.raw/*53.41*/(""" """),format.raw/*53.42*/("""moveFactor: 5 """),format.raw/*53.56*/("""}"""),format.raw/*53.57*/(""");
    			"""),format.raw/*54.8*/("""}"""),format.raw/*54.9*/(""");
    </script>
<div class="container">

    <h1 align="center">Create a new account</h1>
    <div class="row-fluid" id="login-div">

        <div class="well span4 offset4" style="background: rgba(234, 239, 244, .5);" align="center">
            <form id="defaultForm" action="/createClient" method="POST" _lpchecked="1">
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
            """),_display_(/*89.14*/helper/*89.20*/.form(routes.Application.landing())/*89.55*/ {_display_(Seq[Any](format.raw/*89.57*/("""
            """),format.raw/*90.13*/("""<button type="submit">Go back</button>
            """)))}),format.raw/*91.14*/("""
        """),format.raw/*92.9*/("""</div>
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
                  DATE: Sun Jul 12 00:46:04 BST 2015
                  SOURCE: /Users/jiaqichen/Desktop/RandChat/app/views/registration.scala.html
                  HASH: 9c0653482082731f8c366d3e430b3810662cde21
                  MATRIX: 760->1|903->56|930->57|1089->190|1103->196|1158->231|1369->416|1383->422|1442->461|1521->514|1535->520|1606->570|1686->623|1701->629|1768->674|1848->727|1863->733|1933->781|2013->834|2028->840|2097->887|2145->908|2160->914|2226->959|2287->993|2302->999|2371->1047|2428->1077|2443->1083|2516->1135|2577->1169|2592->1175|2659->1221|2716->1251|2731->1257|2793->1298|2873->1350|2902->1351|2943->1364|2997->1390|3026->1391|3067->1404|3105->1414|3134->1415|3175->1428|3318->1543|3347->1544|3388->1557|3428->1569|3457->1570|3498->1583|3603->1660|3632->1661|3668->1670|3717->1692|3747->1713|3786->1714|3824->1724|4096->1968|4123->1973|4159->1982|4273->2066|4305->2071|4437->2176|4452->2182|4525->2234|4611->2292|4640->2293|4676->2302|4735->2333|4764->2334|4793->2335|4835->2349|4864->2350|4901->2360|4929->2361|6697->4102|6712->4108|6756->4143|6796->4145|6837->4158|6920->4210|6956->4219|7107->4342|7136->4343|7172->4352|7233->4385|7262->4386|7304->4399|7387->4453|7417->4454|7463->4471|7650->4629|7680->4630|7731->4652|7761->4653|7807->4670|7842->4676|7872->4677|7922->4698|8001->4748|8031->4749|8085->4774|8124->4784|8154->4785|8212->4814|8293->4866|8323->4867|8373->4888|8403->4889|8449->4906|8479->4907|8533->4932|8563->4933|8613->4954|8654->4966|8684->4967|8738->4992|8777->5002|8807->5003|8865->5032|8959->5097|8989->5098|9058->5138|9088->5139|9146->5168|9249->5242|9279->5243|9329->5264|9359->5265|9405->5282|9435->5283|9492->5311|9522->5312|9572->5333|9613->5345|9643->5346|9697->5371|9736->5381|9766->5382|9824->5411|9913->5471|9943->5472|10009->5509|10039->5510|10097->5539|10252->5665|10282->5666|10332->5687|10362->5688|10408->5705|10438->5706|10496->5735|10526->5736|10576->5757|10617->5769|10647->5770|10701->5795|10740->5805|10770->5806|10828->5835|10965->5943|10995->5944|11045->5965|11075->5966|11121->5983|11151->5984|11193->5997|11223->5998|11260->6007|11290->6008|11325->6015|11354->6016
                  LINES: 26->1|29->1|30->2|34->6|34->6|34->6|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|48->20|48->20|49->21|50->22|50->22|51->23|51->23|51->23|52->24|57->29|57->29|58->30|58->30|58->30|59->31|60->32|60->32|61->33|62->34|62->34|62->34|63->35|65->37|65->37|66->38|70->42|71->43|78->50|78->50|78->50|80->52|80->52|81->53|81->53|81->53|81->53|81->53|81->53|82->54|82->54|117->89|117->89|117->89|117->89|118->90|119->91|120->92|126->98|126->98|127->99|127->99|127->99|128->100|129->101|129->101|130->102|133->105|133->105|134->106|134->106|135->107|135->107|135->107|136->108|137->109|137->109|138->110|138->110|138->110|139->111|140->112|140->112|141->113|141->113|142->114|142->114|143->115|143->115|144->116|144->116|144->116|145->117|145->117|145->117|146->118|147->119|147->119|148->120|148->120|149->121|150->122|150->122|151->123|151->123|152->124|152->124|153->125|153->125|154->126|154->126|154->126|155->127|155->127|155->127|156->128|157->129|157->129|158->130|158->130|159->131|161->133|161->133|162->134|162->134|163->135|163->135|164->136|164->136|165->137|165->137|165->137|166->138|166->138|166->138|167->139|169->141|169->141|170->142|170->142|171->143|171->143|172->144|172->144|173->145|173->145|174->146|174->146
                  -- GENERATED --
              */
          