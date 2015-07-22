
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



"""),format.raw/*7.1*/("""yeahhh
""")))}))}
  }

  def render(client:models.Client): play.twirl.api.HtmlFormat.Appendable = apply(client)

  def f:((models.Client) => play.twirl.api.HtmlFormat.Appendable) = (client) => apply(client)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Jul 22 22:03:29 BST 2015
                  SOURCE: /Users/jiaqichen/Desktop/RandChat/app/views/friendProfile.scala.html
                  HASH: 4e8f27c9668889d85917a47961fc953ce4a4c0ed
                  MATRIX: 738->1|849->24|877->27|902->44|941->46|971->50
                  LINES: 26->1|29->1|31->3|31->3|31->3|35->7
                  -- GENERATED --
              */
          