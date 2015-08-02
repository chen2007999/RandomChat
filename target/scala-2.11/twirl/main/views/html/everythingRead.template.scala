
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
object everythingRead extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<h2>Everything has been read.</h2>


<style type="text/css">
h2 """),format.raw/*5.4*/("""{"""),format.raw/*5.5*/("""
"""),format.raw/*6.1*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
font-size: 25px;
font-style: normal;
font-variant: normal;
font-weight: 500;
line-height: 21px;
"""),format.raw/*12.1*/("""}"""),format.raw/*12.2*/("""
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
                  DATE: Sun Aug 02 12:05:45 BST 2015
                  SOURCE: /Users/jiaqichen/Desktop/RandChat/app/views/everythingRead.scala.html
                  HASH: fbaef40febd706891dbb0de39b66128e7875566b
                  MATRIX: 807->0|897->64|924->65|951->66|1135->223|1163->224|1195->229|1228->234|1257->235|1289->240|1445->369|1473->370|1501->371
                  LINES: 29->1|33->5|33->5|34->6|40->12|40->12|41->13|41->13|41->13|42->14|43->15|43->15|44->16
                  -- GENERATED --
              */
          