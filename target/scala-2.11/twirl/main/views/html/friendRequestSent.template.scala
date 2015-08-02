
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
object friendRequestSent extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<h2>Friend request sent, waiting to be comfirmed..</h2>

<style type="text/css">
h2 """),format.raw/*4.4*/("""{"""),format.raw/*4.5*/("""
"""),format.raw/*5.1*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
font-size: 20px;
font-style: normal;
font-variant: normal;
font-weight: 500;
line-height: 20px;
"""),format.raw/*11.1*/("""}"""),format.raw/*11.2*/("""
    """),format.raw/*12.5*/("""body """),format.raw/*12.10*/("""{"""),format.raw/*12.11*/("""
    """),format.raw/*13.5*/("""background-image: url('https://unsplash.imgix.net/40/10294420724_0300cf921d_o.jpg?dpr=2&fit=crop&fm=jpg&h=700&q=75&w=1050');
    """),format.raw/*14.5*/("""}"""),format.raw/*14.6*/("""
"""),format.raw/*15.1*/("""</style>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Aug 02 12:07:54 BST 2015
                  SOURCE: /Users/jiaqichen/Desktop/RandChat/app/views/friendRequestSent.scala.html
                  HASH: 62b4d823481b6b72d21bbd3e3b7c2fa1e89214f3
                  MATRIX: 810->0|920->84|947->85|974->86|1158->243|1186->244|1218->249|1251->254|1280->255|1312->260|1468->389|1496->390|1524->391
                  LINES: 29->1|32->4|32->4|33->5|39->11|39->11|40->12|40->12|40->12|41->13|42->14|42->14|43->15
                  -- GENERATED --
              */
          