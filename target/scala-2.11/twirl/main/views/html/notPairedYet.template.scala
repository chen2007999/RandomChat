
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
object notPairedYet extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<h2>Not connected to a user yet, please wait for the next user.</h2>


<style type="text/css">
    h2 """),format.raw/*5.8*/("""{"""),format.raw/*5.9*/("""
    """),format.raw/*6.5*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
    font-size: 25px;
    font-style: normal;
    font-variant: normal;
    font-weight: 500;
    line-height: 21px;
    """),format.raw/*12.5*/("""}"""),format.raw/*12.6*/("""
    """),format.raw/*13.5*/("""body """),format.raw/*13.10*/("""{"""),format.raw/*13.11*/("""
    """),format.raw/*14.5*/("""background-image: url('https://unsplash.imgix.net/40/10294420724_0300cf921d_o.jpg?dpr=2&fit=crop&fm=jpg&h=700&q=75&w=1050');
    """),format.raw/*15.5*/("""}"""),format.raw/*15.6*/("""
"""),format.raw/*16.1*/("""</style>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Aug 02 12:07:54 BST 2015
                  SOURCE: /Users/jiaqichen/Desktop/RandChat/app/views/notPairedYet.scala.html
                  HASH: 8408fb158d852f32db8a52500d29f6d5b95574a8
                  MATRIX: 805->0|933->102|960->103|991->108|1199->289|1227->290|1259->295|1292->300|1321->301|1353->306|1509->435|1537->436|1565->437
                  LINES: 29->1|33->5|33->5|34->6|40->12|40->12|41->13|41->13|41->13|42->14|43->15|43->15|44->16
                  -- GENERATED --
              */
          