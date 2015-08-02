
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
object messageSuccess extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<h2>Message successfully sent! Thank you.</h2>


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
                  SOURCE: /Users/jiaqichen/Desktop/RandChat/app/views/messageSuccess.scala.html
                  HASH: 47a6d36db42fe2dd93102dbc9fe04b63884261e8
                  MATRIX: 807->0|913->80|940->81|971->86|1179->267|1207->268|1239->273|1272->278|1301->279|1333->284|1489->413|1517->414|1545->415
                  LINES: 29->1|33->5|33->5|34->6|40->12|40->12|41->13|41->13|41->13|42->14|43->15|43->15|44->16
                  -- GENERATED --
              */
          