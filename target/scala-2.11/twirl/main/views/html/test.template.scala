
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
object test extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[java.util.List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(waiting : java.util.List[String]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.36*/("""


"""),_display_(/*4.2*/for(w <- waiting) yield /*4.19*/ {_display_(Seq[Any](format.raw/*4.21*/("""

"""),format.raw/*6.1*/("""<h1>"""),_display_(/*6.6*/w),format.raw/*6.7*/("""</h1>
""")))}))}
  }

  def render(waiting:java.util.List[String]): play.twirl.api.HtmlFormat.Appendable = apply(waiting)

  def f:((java.util.List[String]) => play.twirl.api.HtmlFormat.Appendable) = (waiting) => apply(waiting)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Jul 15 22:02:05 BST 2015
                  SOURCE: /Users/jiaqichen/Desktop/RandChat/app/views/test.scala.html
                  HASH: edd9228e7b0ff4e16572bd61b2109016e94788d6
                  MATRIX: 738->1|860->35|889->39|921->56|960->58|988->60|1018->65|1038->66
                  LINES: 26->1|29->1|32->4|32->4|32->4|34->6|34->6|34->6
                  -- GENERATED --
              */
          