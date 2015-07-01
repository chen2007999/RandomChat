// @SOURCE:/Users/apple/Desktop/RandChat/conf/routes
// @HASH:e548248260359d5235e1e7a77e832aa55ea083d4
// @DATE:Wed Jul 01 15:28:34 CST 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:29
// @LINE:26
// @LINE:23
// @LINE:19
// @LINE:15
// @LINE:12
// @LINE:9
// @LINE:6
package controllers {

// @LINE:9
class ReverseAssets {


// @LINE:9
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:29
// @LINE:26
// @LINE:23
// @LINE:19
// @LINE:15
// @LINE:12
// @LINE:6
class ReverseApplication {


// @LINE:12
def logIn(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "logIn")
}
                        

// @LINE:19
def landing(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "landing")
}
                        

// @LINE:23
def createUser(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "createUser")
}
                        

// @LINE:15
def register(error:String = ""): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "register" + queryString(List(if(error == "") None else Some(implicitly[QueryStringBindable[String]].unbind("error", error)))))
}
                        

// @LINE:26
def deleteUserFromDB(email:String): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "deleteUser/" + implicitly[PathBindable[String]].unbind("email", dynamicString(email)) + "/delete")
}
                        

// @LINE:29
def displayAllUsersFromDB(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "clients")
}
                        

// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

}
                          
}
                  


// @LINE:29
// @LINE:26
// @LINE:23
// @LINE:19
// @LINE:15
// @LINE:12
// @LINE:9
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:9
class ReverseAssets {


// @LINE:9
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:29
// @LINE:26
// @LINE:23
// @LINE:19
// @LINE:15
// @LINE:12
// @LINE:6
class ReverseApplication {


// @LINE:12
def logIn : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.logIn",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "logIn"})
      }
   """
)
                        

// @LINE:19
def landing : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.landing",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "landing"})
      }
   """
)
                        

// @LINE:23
def createUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.createUser",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "createUser"})
      }
   """
)
                        

// @LINE:15
def register : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.register",
   """
      function(error) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "register" + _qS([(error == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("error", error))])})
      }
   """
)
                        

// @LINE:26
def deleteUserFromDB : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.deleteUserFromDB",
   """
      function(email) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteUser/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("email", encodeURIComponent(email)) + "/delete"})
      }
   """
)
                        

// @LINE:29
def displayAllUsersFromDB : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.displayAllUsersFromDB",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clients"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

}
              
}
        


// @LINE:29
// @LINE:26
// @LINE:23
// @LINE:19
// @LINE:15
// @LINE:12
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:9
class ReverseAssets {


// @LINE:9
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:29
// @LINE:26
// @LINE:23
// @LINE:19
// @LINE:15
// @LINE:12
// @LINE:6
class ReverseApplication {


// @LINE:12
def logIn(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.logIn(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "logIn", Seq(), "POST", """ Check client's login information and determines success or failure""", _prefix + """logIn""")
)
                      

// @LINE:19
def landing(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.landing(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "landing", Seq(), "GET", """ Diaplay the landing page""", _prefix + """landing""")
)
                      

// @LINE:23
def createUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.createUser(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "createUser", Seq(), "POST", """ Add a new client to database""", _prefix + """createUser""")
)
                      

// @LINE:15
def register(error:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.register(error), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "register", Seq(classOf[String]), "GET", """ Take client's registration information and create a new account""", _prefix + """register""")
)
                      

// @LINE:26
def deleteUserFromDB(email:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.deleteUserFromDB(email), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "deleteUserFromDB", Seq(classOf[String]), "POST", """ Delete a registered client from database""", _prefix + """deleteUser/$email<[^/]+>/delete""")
)
                      

// @LINE:29
def displayAllUsersFromDB(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.displayAllUsersFromDB(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "displayAllUsersFromDB", Seq(), "GET", """ Display all clients in the database""", _prefix + """clients""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

}
                          
}
        
    