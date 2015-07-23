
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
object friendProfile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.Client,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(client: models.Client):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.25*/("""

"""),_display_(/*3.2*/main(client.name)/*3.19*/ {_display_(Seq[Any](format.raw/*3.21*/("""

"""),format.raw/*5.1*/("""<h3>"""),_display_(/*5.6*/client/*5.12*/.name),format.raw/*5.17*/("""</h3>
<h3>"""),_display_(/*6.6*/client/*6.12*/.email),format.raw/*6.18*/("""</h3>
"""),_display_(/*7.2*/client/*7.8*/.image),format.raw/*7.14*/("""


"""),format.raw/*10.1*/("""yeahhh
""")))}))}
  }

  def render(client:models.Client): play.twirl.api.HtmlFormat.Appendable = apply(client)

  def f:((models.Client) => play.twirl.api.HtmlFormat.Appendable) = (client) => apply(client)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jul 23 20:01:36 BST 2015
                  SOURCE: /Users/jiaqichen/Desktop/RandChat/app/views/friendProfile.scala.html
                  HASH: eace560b00ace227f4f5c58d24fbed001c019e18
                  MATRIX: 738->1|849->24|877->27|902->44|941->46|969->48|999->53|1013->59|1038->64|1074->75|1088->81|1114->87|1146->94|1159->100|1185->106|1215->109
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|33->5|33->5|34->6|34->6|34->6|35->7|35->7|35->7|38->10
                  -- GENERATED --
              */
          