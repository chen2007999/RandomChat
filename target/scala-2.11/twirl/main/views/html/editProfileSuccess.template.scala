
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
object editProfileSuccess extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<h2>Your profile has been updated successfully.</h2>

<style type="text/css">
    h2 """),format.raw/*4.8*/("""{"""),format.raw/*4.9*/("""
    """),format.raw/*5.5*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
    font-size: 25px;
    font-style: normal;
    font-variant: normal;
    font-weight: 500;
    line-height: 21px;
    """),format.raw/*11.5*/("""}"""),format.raw/*11.6*/("""
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
                  DATE: Sun Aug 02 12:05:45 BST 2015
                  SOURCE: /Users/jiaqichen/Desktop/RandChat/app/views/editProfileSuccess.scala.html
                  HASH: 5901914f691c66d3d17af824f7a7f0e89e027cfc
                  MATRIX: 811->0|922->85|949->86|980->91|1188->272|1216->273|1248->278|1281->283|1310->284|1342->289|1498->418|1526->419|1554->420
                  LINES: 29->1|32->4|32->4|33->5|39->11|39->11|40->12|40->12|40->12|41->13|42->14|42->14|43->15
                  -- GENERATED --
              */
          