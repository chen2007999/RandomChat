// @SOURCE:/Users/jiaqichen/Desktop/RandChat/conf/routes
// @HASH:48c1e96d57c06adeb532cea97751935e002f2c0f
// @DATE:Sat Aug 01 21:05:02 BST 2015


import scala.language.reflectiveCalls
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String): Unit = {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index0_invoker = createInvoker(
controllers.Application.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:9
private[this] lazy val controllers_Assets_at1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at1_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        

// @LINE:12
private[this] lazy val controllers_Application_logIn2_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logIn"))))
private[this] lazy val controllers_Application_logIn2_invoker = createInvoker(
controllers.Application.logIn(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "logIn", Nil,"POST", """ Check client's login information and determines success or failure""", Routes.prefix + """logIn"""))
        

// @LINE:14
private[this] lazy val controllers_Application_logOut3_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logOut"))))
private[this] lazy val controllers_Application_logOut3_invoker = createInvoker(
controllers.Application.logOut(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "logOut", Nil,"POST", """""", Routes.prefix + """logOut"""))
        

// @LINE:17
private[this] lazy val controllers_Application_register4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("register"))))
private[this] lazy val controllers_Application_register4_invoker = createInvoker(
controllers.Application.register(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "register", Seq(classOf[String]),"GET", """ Take client's registration information and create a new account""", Routes.prefix + """register"""))
        

// @LINE:21
private[this] lazy val controllers_Application_landing5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("landing"))))
private[this] lazy val controllers_Application_landing5_invoker = createInvoker(
controllers.Application.landing(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "landing", Nil,"GET", """ Diaplay the landing page""", Routes.prefix + """landing"""))
        

// @LINE:25
private[this] lazy val controllers_Application_createClient6_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("createClient"))))
private[this] lazy val controllers_Application_createClient6_invoker = createInvoker(
controllers.Application.createClient(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "createClient", Nil,"POST", """ Add a new client to database""", Routes.prefix + """createClient"""))
        

// @LINE:28
private[this] lazy val controllers_Application_deleteClientFromDB7_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("deleteClient/"),DynamicPart("email", """[^/]+""",true),StaticPart("/delete"))))
private[this] lazy val controllers_Application_deleteClientFromDB7_invoker = createInvoker(
controllers.Application.deleteClientFromDB(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "deleteClientFromDB", Seq(classOf[String]),"POST", """ Delete a registered client from database""", Routes.prefix + """deleteClient/$email<[^/]+>/delete"""))
        

// @LINE:31
private[this] lazy val controllers_Application_displayAllClientsFromDB8_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("clients"))))
private[this] lazy val controllers_Application_displayAllClientsFromDB8_invoker = createInvoker(
controllers.Application.displayAllClientsFromDB(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "displayAllClientsFromDB", Nil,"GET", """ Display all clients in the database""", Routes.prefix + """clients"""))
        

// @LINE:35
private[this] lazy val controllers_Application_wsInterface9_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("wsInterface"))))
private[this] lazy val controllers_Application_wsInterface9_invoker = createInvoker(
controllers.Application.wsInterface(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "wsInterface", Nil,"GET", """""", Routes.prefix + """wsInterface"""))
        

// @LINE:37
private[this] lazy val controllers_Application_friendProfile10_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("friendProfile"))))
private[this] lazy val controllers_Application_friendProfile10_invoker = createInvoker(
controllers.Application.friendProfile(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "friendProfile", Nil,"GET", """""", Routes.prefix + """friendProfile"""))
        

// @LINE:38
private[this] lazy val controllers_Application_nextUser11_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("nextUser"))))
private[this] lazy val controllers_Application_nextUser11_invoker = createInvoker(
controllers.Application.nextUser(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "nextUser", Nil,"GET", """""", Routes.prefix + """nextUser"""))
        

// @LINE:39
private[this] lazy val controllers_Application_randChatWS12_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets.javascript.randChatWebSocket.js"))))
private[this] lazy val controllers_Application_randChatWS12_invoker = createInvoker(
controllers.Application.randChatWS(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "randChatWS", Nil,"GET", """""", Routes.prefix + """assets.javascript.randChatWebSocket.js"""))
        

// @LINE:41
private[this] lazy val controllers_Application_addFriend13_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("addFriend/"),DynamicPart("clientEmail", """[^/]+""",true))))
private[this] lazy val controllers_Application_addFriend13_invoker = createInvoker(
controllers.Application.addFriend(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addFriend", Seq(classOf[String]),"GET", """""", Routes.prefix + """addFriend/$clientEmail<[^/]+>"""))
        

// @LINE:42
private[this] lazy val controllers_Application_acceptFriendRequest14_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("acceptFriendRequest/"),DynamicPart("clientEmail", """[^/]+""",true))))
private[this] lazy val controllers_Application_acceptFriendRequest14_invoker = createInvoker(
controllers.Application.acceptFriendRequest(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "acceptFriendRequest", Seq(classOf[String]),"GET", """""", Routes.prefix + """acceptFriendRequest/$clientEmail<[^/]+>"""))
        

// @LINE:44
private[this] lazy val controllers_Application_showUnread15_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("showUnread"))))
private[this] lazy val controllers_Application_showUnread15_invoker = createInvoker(
controllers.Application.showUnread(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "showUnread", Nil,"GET", """""", Routes.prefix + """showUnread"""))
        

// @LINE:45
private[this] lazy val controllers_Application_unreadNum16_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("unreadNum"))))
private[this] lazy val controllers_Application_unreadNum16_invoker = createInvoker(
controllers.Application.unreadNum(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "unreadNum", Nil,"GET", """""", Routes.prefix + """unreadNum"""))
        

// @LINE:46
private[this] lazy val controllers_Application_findFriendProfileWithClientEmail17_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("findFriendProfileWithClientEmail/"),DynamicPart("e", """[^/]+""",true),StaticPart("/"),DynamicPart("k", """[^/]+""",true))))
private[this] lazy val controllers_Application_findFriendProfileWithClientEmail17_invoker = createInvoker(
controllers.Application.findFriendProfileWithClientEmail(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "findFriendProfileWithClientEmail", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """findFriendProfileWithClientEmail/$e<[^/]+>/$k<[^/]+>"""))
        

// @LINE:48
private[this] lazy val controllers_Application_interestsListPage18_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("interestsListPage"))))
private[this] lazy val controllers_Application_interestsListPage18_invoker = createInvoker(
controllers.Application.interestsListPage(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "interestsListPage", Nil,"GET", """""", Routes.prefix + """interestsListPage"""))
        

// @LINE:49
private[this] lazy val controllers_Application_createInterestPage19_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("createInterestPage"))))
private[this] lazy val controllers_Application_createInterestPage19_invoker = createInvoker(
controllers.Application.createInterestPage(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "createInterestPage", Nil,"GET", """""", Routes.prefix + """createInterestPage"""))
        

// @LINE:50
private[this] lazy val controllers_Application_createInterest20_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("createInterest"))))
private[this] lazy val controllers_Application_createInterest20_invoker = createInvoker(
controllers.Application.createInterest(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "createInterest", Nil,"GET", """""", Routes.prefix + """createInterest"""))
        

// @LINE:51
private[this] lazy val controllers_Application_interestPage21_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("interestPage/"),DynamicPart("interest", """[^/]+""",true))))
private[this] lazy val controllers_Application_interestPage21_invoker = createInvoker(
controllers.Application.interestPage(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "interestPage", Seq(classOf[String]),"GET", """""", Routes.prefix + """interestPage/$interest<[^/]+>"""))
        

// @LINE:52
private[this] lazy val controllers_Application_likeInterest22_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("likeInterest/"),DynamicPart("interest", """[^/]+""",true))))
private[this] lazy val controllers_Application_likeInterest22_invoker = createInvoker(
controllers.Application.likeInterest(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "likeInterest", Seq(classOf[String]),"GET", """""", Routes.prefix + """likeInterest/$interest<[^/]+>"""))
        

// @LINE:53
private[this] lazy val controllers_Application_myProfile23_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("myProfile"))))
private[this] lazy val controllers_Application_myProfile23_invoker = createInvoker(
controllers.Application.myProfile(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "myProfile", Nil,"GET", """""", Routes.prefix + """myProfile"""))
        

// @LINE:54
private[this] lazy val controllers_Application_editMyProfilePage24_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("editMyProfilePage"))))
private[this] lazy val controllers_Application_editMyProfilePage24_invoker = createInvoker(
controllers.Application.editMyProfilePage(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "editMyProfilePage", Nil,"GET", """""", Routes.prefix + """editMyProfilePage"""))
        

// @LINE:55
private[this] lazy val controllers_Application_editMyProfile25_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("editMyProfile"))))
private[this] lazy val controllers_Application_editMyProfile25_invoker = createInvoker(
controllers.Application.editMyProfile(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "editMyProfile", Nil,"GET", """""", Routes.prefix + """editMyProfile"""))
        

// @LINE:56
private[this] lazy val controllers_Application_friendListPage26_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("friendListPage"))))
private[this] lazy val controllers_Application_friendListPage26_invoker = createInvoker(
controllers.Application.friendListPage(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "friendListPage", Nil,"GET", """""", Routes.prefix + """friendListPage"""))
        

// @LINE:58
private[this] lazy val controllers_Application_message27_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("message/"),DynamicPart("clientEmail", """[^/]+""",true),StaticPart("/"),DynamicPart("key", """[^/]+""",true),StaticPart("/"),DynamicPart("number", """[^/]+""",true))))
private[this] lazy val controllers_Application_message27_invoker = createInvoker(
controllers.Application.message(fakeValue[String], fakeValue[String], fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "message", Seq(classOf[String], classOf[String], classOf[Integer]),"GET", """""", Routes.prefix + """message/$clientEmail<[^/]+>/$key<[^/]+>/$number<[^/]+>"""))
        

// @LINE:59
private[this] lazy val controllers_Application_sendMessage28_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("sendMessage/"),DynamicPart("friendEmail", """[^/]+""",true))))
private[this] lazy val controllers_Application_sendMessage28_invoker = createInvoker(
controllers.Application.sendMessage(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "sendMessage", Seq(classOf[String]),"GET", """""", Routes.prefix + """sendMessage/$friendEmail<[^/]+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logIn""","""controllers.Application.logIn()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logOut""","""controllers.Application.logOut()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """register""","""controllers.Application.register(error:String ?= "")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """landing""","""controllers.Application.landing()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """createClient""","""controllers.Application.createClient()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """deleteClient/$email<[^/]+>/delete""","""controllers.Application.deleteClientFromDB(email:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """clients""","""controllers.Application.displayAllClientsFromDB()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """wsInterface""","""controllers.Application.wsInterface()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """friendProfile""","""controllers.Application.friendProfile()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """nextUser""","""controllers.Application.nextUser()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets.javascript.randChatWebSocket.js""","""controllers.Application.randChatWS()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """addFriend/$clientEmail<[^/]+>""","""controllers.Application.addFriend(clientEmail:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """acceptFriendRequest/$clientEmail<[^/]+>""","""controllers.Application.acceptFriendRequest(clientEmail:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """showUnread""","""controllers.Application.showUnread()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """unreadNum""","""controllers.Application.unreadNum()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """findFriendProfileWithClientEmail/$e<[^/]+>/$k<[^/]+>""","""controllers.Application.findFriendProfileWithClientEmail(e:String, k:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """interestsListPage""","""controllers.Application.interestsListPage()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """createInterestPage""","""controllers.Application.createInterestPage()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """createInterest""","""controllers.Application.createInterest()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """interestPage/$interest<[^/]+>""","""controllers.Application.interestPage(interest:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """likeInterest/$interest<[^/]+>""","""controllers.Application.likeInterest(interest:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """myProfile""","""controllers.Application.myProfile()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """editMyProfilePage""","""controllers.Application.editMyProfilePage()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """editMyProfile""","""controllers.Application.editMyProfile()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """friendListPage""","""controllers.Application.friendListPage()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """message/$clientEmail<[^/]+>/$key<[^/]+>/$number<[^/]+>""","""controllers.Application.message(clientEmail:String, key:String, number:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """sendMessage/$friendEmail<[^/]+>""","""controllers.Application.sendMessage(friendEmail:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0_route(params) => {
   call { 
        controllers_Application_index0_invoker.call(controllers.Application.index())
   }
}
        

// @LINE:9
case controllers_Assets_at1_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at1_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:12
case controllers_Application_logIn2_route(params) => {
   call { 
        controllers_Application_logIn2_invoker.call(controllers.Application.logIn())
   }
}
        

// @LINE:14
case controllers_Application_logOut3_route(params) => {
   call { 
        controllers_Application_logOut3_invoker.call(controllers.Application.logOut())
   }
}
        

// @LINE:17
case controllers_Application_register4_route(params) => {
   call(params.fromQuery[String]("error", Some(""))) { (error) =>
        controllers_Application_register4_invoker.call(controllers.Application.register(error))
   }
}
        

// @LINE:21
case controllers_Application_landing5_route(params) => {
   call { 
        controllers_Application_landing5_invoker.call(controllers.Application.landing())
   }
}
        

// @LINE:25
case controllers_Application_createClient6_route(params) => {
   call { 
        controllers_Application_createClient6_invoker.call(controllers.Application.createClient())
   }
}
        

// @LINE:28
case controllers_Application_deleteClientFromDB7_route(params) => {
   call(params.fromPath[String]("email", None)) { (email) =>
        controllers_Application_deleteClientFromDB7_invoker.call(controllers.Application.deleteClientFromDB(email))
   }
}
        

// @LINE:31
case controllers_Application_displayAllClientsFromDB8_route(params) => {
   call { 
        controllers_Application_displayAllClientsFromDB8_invoker.call(controllers.Application.displayAllClientsFromDB())
   }
}
        

// @LINE:35
case controllers_Application_wsInterface9_route(params) => {
   call { 
        controllers_Application_wsInterface9_invoker.call(controllers.Application.wsInterface())
   }
}
        

// @LINE:37
case controllers_Application_friendProfile10_route(params) => {
   call { 
        controllers_Application_friendProfile10_invoker.call(controllers.Application.friendProfile())
   }
}
        

// @LINE:38
case controllers_Application_nextUser11_route(params) => {
   call { 
        controllers_Application_nextUser11_invoker.call(controllers.Application.nextUser())
   }
}
        

// @LINE:39
case controllers_Application_randChatWS12_route(params) => {
   call { 
        controllers_Application_randChatWS12_invoker.call(controllers.Application.randChatWS())
   }
}
        

// @LINE:41
case controllers_Application_addFriend13_route(params) => {
   call(params.fromPath[String]("clientEmail", None)) { (clientEmail) =>
        controllers_Application_addFriend13_invoker.call(controllers.Application.addFriend(clientEmail))
   }
}
        

// @LINE:42
case controllers_Application_acceptFriendRequest14_route(params) => {
   call(params.fromPath[String]("clientEmail", None)) { (clientEmail) =>
        controllers_Application_acceptFriendRequest14_invoker.call(controllers.Application.acceptFriendRequest(clientEmail))
   }
}
        

// @LINE:44
case controllers_Application_showUnread15_route(params) => {
   call { 
        controllers_Application_showUnread15_invoker.call(controllers.Application.showUnread())
   }
}
        

// @LINE:45
case controllers_Application_unreadNum16_route(params) => {
   call { 
        controllers_Application_unreadNum16_invoker.call(controllers.Application.unreadNum())
   }
}
        

// @LINE:46
case controllers_Application_findFriendProfileWithClientEmail17_route(params) => {
   call(params.fromPath[String]("e", None), params.fromPath[String]("k", None)) { (e, k) =>
        controllers_Application_findFriendProfileWithClientEmail17_invoker.call(controllers.Application.findFriendProfileWithClientEmail(e, k))
   }
}
        

// @LINE:48
case controllers_Application_interestsListPage18_route(params) => {
   call { 
        controllers_Application_interestsListPage18_invoker.call(controllers.Application.interestsListPage())
   }
}
        

// @LINE:49
case controllers_Application_createInterestPage19_route(params) => {
   call { 
        controllers_Application_createInterestPage19_invoker.call(controllers.Application.createInterestPage())
   }
}
        

// @LINE:50
case controllers_Application_createInterest20_route(params) => {
   call { 
        controllers_Application_createInterest20_invoker.call(controllers.Application.createInterest())
   }
}
        

// @LINE:51
case controllers_Application_interestPage21_route(params) => {
   call(params.fromPath[String]("interest", None)) { (interest) =>
        controllers_Application_interestPage21_invoker.call(controllers.Application.interestPage(interest))
   }
}
        

// @LINE:52
case controllers_Application_likeInterest22_route(params) => {
   call(params.fromPath[String]("interest", None)) { (interest) =>
        controllers_Application_likeInterest22_invoker.call(controllers.Application.likeInterest(interest))
   }
}
        

// @LINE:53
case controllers_Application_myProfile23_route(params) => {
   call { 
        controllers_Application_myProfile23_invoker.call(controllers.Application.myProfile())
   }
}
        

// @LINE:54
case controllers_Application_editMyProfilePage24_route(params) => {
   call { 
        controllers_Application_editMyProfilePage24_invoker.call(controllers.Application.editMyProfilePage())
   }
}
        

// @LINE:55
case controllers_Application_editMyProfile25_route(params) => {
   call { 
        controllers_Application_editMyProfile25_invoker.call(controllers.Application.editMyProfile())
   }
}
        

// @LINE:56
case controllers_Application_friendListPage26_route(params) => {
   call { 
        controllers_Application_friendListPage26_invoker.call(controllers.Application.friendListPage())
   }
}
        

// @LINE:58
case controllers_Application_message27_route(params) => {
   call(params.fromPath[String]("clientEmail", None), params.fromPath[String]("key", None), params.fromPath[Integer]("number", None)) { (clientEmail, key, number) =>
        controllers_Application_message27_invoker.call(controllers.Application.message(clientEmail, key, number))
   }
}
        

// @LINE:59
case controllers_Application_sendMessage28_route(params) => {
   call(params.fromPath[String]("friendEmail", None)) { (friendEmail) =>
        controllers_Application_sendMessage28_invoker.call(controllers.Application.sendMessage(friendEmail))
   }
}
        
}

}
     