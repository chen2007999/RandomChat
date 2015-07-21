// @SOURCE:/Users/jiaqichen/Desktop/RandChat/conf/routes
// @HASH:de5e214b36a711cc3c58481671cff77d11284528
// @DATE:Tue Jul 21 19:17:21 BST 2015


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
        

// @LINE:15
private[this] lazy val controllers_Application_register3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("register"))))
private[this] lazy val controllers_Application_register3_invoker = createInvoker(
controllers.Application.register(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "register", Seq(classOf[String]),"GET", """ Take client's registration information and create a new account""", Routes.prefix + """register"""))
        

// @LINE:19
private[this] lazy val controllers_Application_landing4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("landing"))))
private[this] lazy val controllers_Application_landing4_invoker = createInvoker(
controllers.Application.landing(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "landing", Nil,"GET", """ Diaplay the landing page""", Routes.prefix + """landing"""))
        

// @LINE:23
private[this] lazy val controllers_Application_createClient5_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("createClient"))))
private[this] lazy val controllers_Application_createClient5_invoker = createInvoker(
controllers.Application.createClient(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "createClient", Nil,"POST", """ Add a new client to database""", Routes.prefix + """createClient"""))
        

// @LINE:26
private[this] lazy val controllers_Application_deleteClientFromDB6_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("deleteClient/"),DynamicPart("email", """[^/]+""",true),StaticPart("/delete"))))
private[this] lazy val controllers_Application_deleteClientFromDB6_invoker = createInvoker(
controllers.Application.deleteClientFromDB(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "deleteClientFromDB", Seq(classOf[String]),"POST", """ Delete a registered client from database""", Routes.prefix + """deleteClient/$email<[^/]+>/delete"""))
        

// @LINE:29
private[this] lazy val controllers_Application_displayAllClientsFromDB7_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("clients"))))
private[this] lazy val controllers_Application_displayAllClientsFromDB7_invoker = createInvoker(
controllers.Application.displayAllClientsFromDB(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "displayAllClientsFromDB", Nil,"GET", """ Display all clients in the database""", Routes.prefix + """clients"""))
        

// @LINE:33
private[this] lazy val controllers_Application_wsInterface8_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("wsInterface"))))
private[this] lazy val controllers_Application_wsInterface8_invoker = createInvoker(
controllers.Application.wsInterface(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "wsInterface", Nil,"GET", """""", Routes.prefix + """wsInterface"""))
        

// @LINE:34
private[this] lazy val controllers_Application_nextUser9_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("nextUser"))))
private[this] lazy val controllers_Application_nextUser9_invoker = createInvoker(
controllers.Application.nextUser(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "nextUser", Nil,"GET", """""", Routes.prefix + """nextUser"""))
        

// @LINE:36
private[this] lazy val controllers_Application_wsJs10_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets.javascript.ws.js"))))
private[this] lazy val controllers_Application_wsJs10_invoker = createInvoker(
controllers.Application.wsJs(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "wsJs", Nil,"GET", """""", Routes.prefix + """assets.javascript.ws.js"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logIn""","""controllers.Application.logIn()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """register""","""controllers.Application.register(error:String ?= "")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """landing""","""controllers.Application.landing()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """createClient""","""controllers.Application.createClient()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """deleteClient/$email<[^/]+>/delete""","""controllers.Application.deleteClientFromDB(email:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """clients""","""controllers.Application.displayAllClientsFromDB()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """wsInterface""","""controllers.Application.wsInterface()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """nextUser""","""controllers.Application.nextUser()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets.javascript.ws.js""","""controllers.Application.wsJs()""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
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
        

// @LINE:15
case controllers_Application_register3_route(params) => {
   call(params.fromQuery[String]("error", Some(""))) { (error) =>
        controllers_Application_register3_invoker.call(controllers.Application.register(error))
   }
}
        

// @LINE:19
case controllers_Application_landing4_route(params) => {
   call { 
        controllers_Application_landing4_invoker.call(controllers.Application.landing())
   }
}
        

// @LINE:23
case controllers_Application_createClient5_route(params) => {
   call { 
        controllers_Application_createClient5_invoker.call(controllers.Application.createClient())
   }
}
        

// @LINE:26
case controllers_Application_deleteClientFromDB6_route(params) => {
   call(params.fromPath[String]("email", None)) { (email) =>
        controllers_Application_deleteClientFromDB6_invoker.call(controllers.Application.deleteClientFromDB(email))
   }
}
        

// @LINE:29
case controllers_Application_displayAllClientsFromDB7_route(params) => {
   call { 
        controllers_Application_displayAllClientsFromDB7_invoker.call(controllers.Application.displayAllClientsFromDB())
   }
}
        

// @LINE:33
case controllers_Application_wsInterface8_route(params) => {
   call { 
        controllers_Application_wsInterface8_invoker.call(controllers.Application.wsInterface())
   }
}
        

// @LINE:34
case controllers_Application_nextUser9_route(params) => {
   call { 
        controllers_Application_nextUser9_invoker.call(controllers.Application.nextUser())
   }
}
        

// @LINE:36
case controllers_Application_wsJs10_route(params) => {
   call { 
        controllers_Application_wsJs10_invoker.call(controllers.Application.wsJs())
   }
}
        
}

}
     