
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
object randChat extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.Client,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(client: models.Client):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.25*/("""

"""),_display_(/*3.2*/main("RandChat")/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""


"""),_display_(/*6.2*/helper/*6.8*/.form(routes.Application.logOut())/*6.42*/ {_display_(Seq[Any](format.raw/*6.44*/("""
"""),format.raw/*7.1*/("""<input type="submit" class="red" value="Log Out" style="float: right;height:40px;width:100px">
""")))}),format.raw/*8.2*/("""



"""),format.raw/*12.1*/("""<input type="button" class="blue" value="My Profile" onclick="popUp('myProfile','myWindow','700','620','yes');return false" style="float: right;height:40px;width:100px">

<input type="button" class="blue" value="Interests" onclick="popUp('interestsListPage','myWindow','700','620','yes');return false" style="float: right;height:40px;width:100px">

<input type="button" class="blue" value="Friends" onclick="popUp('friendListPage','myWindow','700','620','yes');return false" style="float: right;height:40px;width:100px">

<input type="button" class="grey" value="Unread" onclick="popUp('showUnread','myWindow','700','620','yes');return false" id="unread" style="float: right;height:40px;width:100px">

<h1>Welcome to RandChat, """),_display_(/*20.27*/client/*20.33*/.name),format.raw/*20.38*/(""".</h1>

<input type="button" id="other" class="green" value="the other user's profile" onclick="popUp('friendProfile','myWindow','700','620','yes');return false"style="height:40px;width:190px"><br/>

<script language="javascript">
var popupWindow = null;
function popUp(url,winName,w,h,scroll)"""),format.raw/*26.39*/("""{"""),format.raw/*26.40*/("""
"""),format.raw/*27.1*/("""LeftPosition = (screen.width) ? (screen.width-w)/2 : 0;
TopPosition = (screen.height) ? (screen.height-h)/2 : 0;
settings =
'height='+h+',width='+w+',top='+TopPosition+',left='+LeftPosition+',scrollbars='+scroll+',resizable'
popupWindow = window.open(url,winName,settings)
"""),format.raw/*32.1*/("""}"""),format.raw/*32.2*/("""
"""),format.raw/*33.1*/("""</script>



<div id="socket-messages" ></div>
<style type="text/css">
#socket-messages"""),format.raw/*39.17*/("""{"""),format.raw/*39.18*/("""
    """),format.raw/*40.5*/("""text-align:left;

    margin-bottom:25px;
    padding:10px;
    background:#fff;
    height:460px;
    width:830px;

    overflow:auto;
"""),format.raw/*49.1*/("""}"""),format.raw/*49.2*/("""

    """),format.raw/*51.5*/(""".green"""),format.raw/*51.11*/("""{"""),format.raw/*51.12*/("""
    """),format.raw/*52.5*/("""border-style: solid;
    border-width: 0px 0px 3px;
    box-shadow: 0 -1px 0 rgba(255, 255, 255, 0.1) inset;
    color: #FFFFFF;
    border-radius: 6px;
    cursor: pointer;
    display: inline-block;
    font-style: normal;
    overflow: hidden;
    text-align: center;
    text-decoration: none;
    text-overflow: ellipsis;
    transition: all 200ms ease-in-out 0s;
    white-space: nowrap;
    font-family: "Gotham Rounded A","Gotham Rounded B",Helvetica,Arial,sans-serif;
    font-weight: 700;
    padding: 4px 1px 4px;
    font-size: 15px;
    border-color: #3AC162;
    background-color: #5FCF80;
    """),format.raw/*72.5*/("""}"""),format.raw/*72.6*/("""

    """),format.raw/*74.5*/(""".red"""),format.raw/*74.9*/("""{"""),format.raw/*74.10*/("""
    """),format.raw/*75.5*/("""border-style: solid;
    border-width: 0px 0px 3px;
    box-shadow: 0 -1px 0 rgba(255, 255, 255, 0.1) inset;
    color: #FFFFFF;
    border-radius: 6px;
    cursor: pointer;
    display: inline-block;
    font-style: normal;
    overflow: hidden;
    text-align: center;
    text-decoration: none;
    text-overflow: ellipsis;
    transition: all 200ms ease-in-out 0s;
    white-space: nowrap;
    font-family: "Gotham Rounded A","Gotham Rounded B",Helvetica,Arial,sans-serif;
    font-weight: 700;
    padding: 4px 1px 4px;
    font-size: 15px;
    background-color: #ED5A5A !important;
    border-color: #EA4343 !important;
    """),format.raw/*95.5*/("""}"""),format.raw/*95.6*/("""

    """),format.raw/*97.5*/(""".blue"""),format.raw/*97.10*/("""{"""),format.raw/*97.11*/("""
    """),format.raw/*98.5*/("""border-style: solid;
    border-width: 0px 0px 3px;
    box-shadow: 0 -1px 0 rgba(255, 255, 255, 0.1) inset;
    color: #FFFFFF;
    border-radius: 6px;
    cursor: pointer;
    display: inline-block;
    font-style: normal;
    overflow: hidden;
    text-align: center;
    text-decoration: none;
    text-overflow: ellipsis;
    transition: all 200ms ease-in-out 0s;
    white-space: nowrap;
    font-family: "Gotham Rounded A","Gotham Rounded B",Helvetica,Arial,sans-serif;
    font-weight: 700;
    padding: 4px 1px 4px;
    font-size: 15px;
    background-color: #397CAC;
    border-color: #326E99;
    """),format.raw/*118.5*/("""}"""),format.raw/*118.6*/("""

    """),format.raw/*120.5*/(""".grey"""),format.raw/*120.10*/("""{"""),format.raw/*120.11*/("""
    """),format.raw/*121.5*/("""border-style: solid;
    border-width: 0px 0px 3px;
    box-shadow: 0 -1px 0 rgba(255, 255, 255, 0.1) inset;
    color: #FFFFFF;
    border-radius: 6px;
    cursor: pointer;
    display: inline-block;
    font-style: normal;
    overflow: hidden;
    text-align: center;
    text-decoration: none;
    text-overflow: ellipsis;
    transition: all 200ms ease-in-out 0s;
    white-space: nowrap;
    font-family: "Gotham Rounded A","Gotham Rounded B",Helvetica,Arial,sans-serif;
    font-weight: 700;
    padding: 4px 1px 4px;
    font-size: 15px;
    background-color: #C6CCD2;
    border-color: #AAB3BB;
    """),format.raw/*141.5*/("""}"""),format.raw/*141.6*/("""

    """),format.raw/*143.5*/("""h1 """),format.raw/*143.8*/("""{"""),format.raw/*143.9*/("""
    """),format.raw/*144.5*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
    font-size: 40px;
    font-style: normal;
    font-variant: normal;
    font-weight: 500;
    line-height: 26.3999996185303px;
    """),format.raw/*150.5*/("""}"""),format.raw/*150.6*/("""
    """),format.raw/*151.5*/("""h3 """),format.raw/*151.8*/("""{"""),format.raw/*151.9*/("""
    """),format.raw/*152.5*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
    font-size: 14px;
    font-style: normal;
    font-variant: normal;
    font-weight: 500;
    line-height: 15.3999996185303px;
    """),format.raw/*158.5*/("""}"""),format.raw/*158.6*/("""
    """),format.raw/*159.5*/("""p """),format.raw/*159.7*/("""{"""),format.raw/*159.8*/("""
    """),format.raw/*160.5*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
    font-size: 17px;
    font-style: normal;
    font-variant: normal;
    font-weight: 400;
    line-height: 20px;
    """),format.raw/*166.5*/("""}"""),format.raw/*166.6*/("""
    """),format.raw/*167.5*/("""blockquote """),format.raw/*167.16*/("""{"""),format.raw/*167.17*/("""
    """),format.raw/*168.5*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
    font-size: 21px;
    font-style: normal;
    font-variant: normal;
    font-weight: 400;
    line-height: 30px;
    """),format.raw/*174.5*/("""}"""),format.raw/*174.6*/("""
    """),format.raw/*175.5*/("""pre """),format.raw/*175.9*/("""{"""),format.raw/*175.10*/("""
    """),format.raw/*176.5*/("""font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
    font-size: 13px;
    font-style: normal;
    font-variant: normal;
    font-weight: 400;
    line-height: 18.5714302062988px;
    """),format.raw/*182.5*/("""}"""),format.raw/*182.6*/("""
    """),format.raw/*183.5*/("""body """),format.raw/*183.10*/("""{"""),format.raw/*183.11*/("""
    """),format.raw/*184.5*/("""background-image: url('https://unsplash.imgix.net/40/10294420724_0300cf921d_o.jpg?dpr=2&fit=crop&fm=jpg&h=700&q=75&w=1050');
    """),format.raw/*185.5*/("""}"""),format.raw/*185.6*/("""

"""),format.raw/*187.1*/("""</style>


    <input type="text" id="socket-input" placeholder="message to send" style="height:30px;width:740px" />




<script type="text/javascript">
function nextUser()
"""),format.raw/*197.1*/("""{"""),format.raw/*197.2*/("""
        """),format.raw/*198.9*/("""$.ajax(
           "/nextUser",
        """),format.raw/*200.9*/("""{"""),format.raw/*200.10*/("""
        """),format.raw/*201.9*/("""type: 'GET',
        dataType: 'text',
        success: function (data, textStatus, jqXHR)"""),format.raw/*203.52*/("""{"""),format.raw/*203.53*/("""
            """),format.raw/*204.13*/("""var rText = jqXHR.responseText;
            $('#socket-messages').append(rText);
        """),format.raw/*206.9*/("""}"""),format.raw/*206.10*/(""",
        error: function (jqXHR, textStatus, errorThown)"""),format.raw/*207.56*/("""{"""),format.raw/*207.57*/("""
            """),format.raw/*208.13*/("""// alert('Load failed');
        """),format.raw/*209.9*/("""}"""),format.raw/*209.10*/(""",
        cache:false
    """),format.raw/*211.5*/("""}"""),format.raw/*211.6*/(""");
"""),format.raw/*212.1*/("""}"""),format.raw/*212.2*/("""
 """),format.raw/*213.2*/("""</script>

<script type="text/javascript">

        $.ajax(
           "/unreadNum",
        """),format.raw/*219.9*/("""{"""),format.raw/*219.10*/("""
        """),format.raw/*220.9*/("""type: 'GET',
        dataType: 'text',
        success: function (data, textStatus, jqXHR)"""),format.raw/*222.52*/("""{"""),format.raw/*222.53*/("""
            """),format.raw/*223.13*/("""var rText = jqXHR.responseText;
            var elem = document.getElementById("unread");
            elem.value = "Unread " + rText;
        """),format.raw/*226.9*/("""}"""),format.raw/*226.10*/(""",
        error: function (jqXHR, textStatus, errorThown)"""),format.raw/*227.56*/("""{"""),format.raw/*227.57*/("""
            """),format.raw/*228.13*/("""// alert('Load failed');
        """),format.raw/*229.9*/("""}"""),format.raw/*229.10*/(""",
        cache:false
    """),format.raw/*231.5*/("""}"""),format.raw/*231.6*/(""");

 </script>


<button onclick="nextUser()" class="red"  style="height:40px;width:100px">Next User</button>

    <script type="text/javascript" charset="utf-8" src=""""),_display_(/*238.58*/routes/*238.64*/.Application.randChatWS()),format.raw/*238.89*/(""""></script>


""")))}),format.raw/*241.2*/("""

"""))}
  }

  def render(client:models.Client): play.twirl.api.HtmlFormat.Appendable = apply(client)

  def f:((models.Client) => play.twirl.api.HtmlFormat.Appendable) = (client) => apply(client)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Aug 02 12:01:55 BST 2015
                  SOURCE: /Users/jiaqichen/Desktop/RandChat/app/views/randChat.scala.html
                  HASH: 89f33f6d883f6805ccca5332ffd541b87158bbe7
                  MATRIX: 733->1|844->24|872->27|896->43|935->45|964->49|977->55|1019->89|1058->91|1085->92|1210->188|1241->192|1996->920|2011->926|2037->931|2358->1224|2387->1225|2415->1226|2715->1499|2743->1500|2771->1501|2886->1588|2915->1589|2947->1594|3110->1730|3138->1731|3171->1737|3205->1743|3234->1744|3266->1749|3901->2357|3929->2358|3962->2364|3993->2368|4022->2369|4054->2374|4711->3004|4739->3005|4772->3011|4805->3016|4834->3017|4866->3022|5502->3630|5531->3631|5565->3637|5599->3642|5629->3643|5662->3648|6298->4256|6327->4257|6361->4263|6392->4266|6421->4267|6454->4272|6677->4467|6706->4468|6739->4473|6770->4476|6799->4477|6832->4482|7055->4677|7084->4678|7117->4683|7147->4685|7176->4686|7209->4691|7418->4872|7447->4873|7480->4878|7520->4889|7550->4890|7583->4895|7792->5076|7821->5077|7854->5082|7886->5086|7916->5087|7949->5092|8172->5287|8201->5288|8234->5293|8268->5298|8298->5299|8331->5304|8488->5433|8517->5434|8547->5436|8748->5609|8777->5610|8814->5619|8882->5659|8912->5660|8949->5669|9068->5759|9098->5760|9140->5773|9257->5862|9287->5863|9373->5920|9403->5921|9445->5934|9506->5967|9536->5968|9590->5994|9619->5995|9650->5998|9679->5999|9709->6001|9830->6094|9860->6095|9897->6104|10016->6194|10046->6195|10088->6208|10258->6350|10288->6351|10374->6408|10404->6409|10446->6422|10507->6455|10537->6456|10591->6482|10620->6483|10816->6651|10832->6657|10879->6682|10925->6697
                  LINES: 26->1|29->1|31->3|31->3|31->3|34->6|34->6|34->6|34->6|35->7|36->8|40->12|48->20|48->20|48->20|54->26|54->26|55->27|60->32|60->32|61->33|67->39|67->39|68->40|77->49|77->49|79->51|79->51|79->51|80->52|100->72|100->72|102->74|102->74|102->74|103->75|123->95|123->95|125->97|125->97|125->97|126->98|146->118|146->118|148->120|148->120|148->120|149->121|169->141|169->141|171->143|171->143|171->143|172->144|178->150|178->150|179->151|179->151|179->151|180->152|186->158|186->158|187->159|187->159|187->159|188->160|194->166|194->166|195->167|195->167|195->167|196->168|202->174|202->174|203->175|203->175|203->175|204->176|210->182|210->182|211->183|211->183|211->183|212->184|213->185|213->185|215->187|225->197|225->197|226->198|228->200|228->200|229->201|231->203|231->203|232->204|234->206|234->206|235->207|235->207|236->208|237->209|237->209|239->211|239->211|240->212|240->212|241->213|247->219|247->219|248->220|250->222|250->222|251->223|254->226|254->226|255->227|255->227|256->228|257->229|257->229|259->231|259->231|266->238|266->238|266->238|269->241
                  -- GENERATED --
              */
          