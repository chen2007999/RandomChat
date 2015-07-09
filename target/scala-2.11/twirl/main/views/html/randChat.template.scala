
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
object randChat extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("RandChat")/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""
"""),format.raw/*4.1*/("""<section>
   <h1>Random Chat</h1>



</section>
<h3>"""),_display_(/*10.6*/message),format.raw/*10.13*/("""</h3>

<input type="text" id="socket-input" />
""")))}),format.raw/*13.2*/("""
"""))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jul 09 21:30:31 BST 2015
                  SOURCE: /Users/jiaqichen/Desktop/RandChat/app/views/randChat.scala.html
                  HASH: 635af2a1b7535949b9af935e26552d6c583e393c
                  MATRIX: 726->1|831->18|859->21|883->37|922->39|949->40|1028->93|1056->100|1134->148
                  LINES: 26->1|29->1|31->3|31->3|31->3|32->4|38->10|38->10|41->13
                  -- GENERATED --
              */
          