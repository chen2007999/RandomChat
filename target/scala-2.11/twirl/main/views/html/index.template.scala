
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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*3.2*/main("RandChat")/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""

   """),format.raw/*5.4*/("""Welcome to RandChat

""")))}),format.raw/*7.2*/("""
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jul 07 06:33:53 BST 2015
                  SOURCE: /Users/jiaqichen/Desktop/RandChat/app/views/index.scala.html
                  HASH: c8f03f7f94a43bc6a03076b323d266580ae598d8
                  MATRIX: 798->3|822->19|861->21|892->26|943->48
                  LINES: 29->3|29->3|29->3|31->5|33->7
                  -- GENERATED --
              */
          