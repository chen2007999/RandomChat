// @SOURCE:/Users/jiaqichen/Desktop/RandChat/conf/routes
// @HASH:48c1e96d57c06adeb532cea97751935e002f2c0f
// @DATE:Sat Aug 01 21:05:02 BST 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:59
// @LINE:58
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:42
// @LINE:41
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:35
// @LINE:31
// @LINE:28
// @LINE:25
// @LINE:21
// @LINE:17
// @LINE:14
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
                          

// @LINE:59
// @LINE:58
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:42
// @LINE:41
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:35
// @LINE:31
// @LINE:28
// @LINE:25
// @LINE:21
// @LINE:17
// @LINE:14
// @LINE:12
// @LINE:6
class ReverseApplication {


// @LINE:50
def createInterest(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "createInterest")
}
                        

// @LINE:44
def showUnread(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "showUnread")
}
                        

// @LINE:42
def acceptFriendRequest(clientEmail:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "acceptFriendRequest/" + implicitly[PathBindable[String]].unbind("clientEmail", dynamicString(clientEmail)))
}
                        

// @LINE:25
def createClient(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "createClient")
}
                        

// @LINE:41
def addFriend(clientEmail:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "addFriend/" + implicitly[PathBindable[String]].unbind("clientEmail", dynamicString(clientEmail)))
}
                        

// @LINE:53
def myProfile(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "myProfile")
}
                        

// @LINE:12
def logIn(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "logIn")
}
                        

// @LINE:28
def deleteClientFromDB(email:String): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "deleteClient/" + implicitly[PathBindable[String]].unbind("email", dynamicString(email)) + "/delete")
}
                        

// @LINE:21
def landing(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "landing")
}
                        

// @LINE:54
def editMyProfilePage(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "editMyProfilePage")
}
                        

// @LINE:45
def unreadNum(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "unreadNum")
}
                        

// @LINE:56
def friendListPage(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "friendListPage")
}
                        

// @LINE:51
def interestPage(interest:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "interestPage/" + implicitly[PathBindable[String]].unbind("interest", dynamicString(interest)))
}
                        

// @LINE:46
def findFriendProfileWithClientEmail(e:String, k:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "findFriendProfileWithClientEmail/" + implicitly[PathBindable[String]].unbind("e", dynamicString(e)) + "/" + implicitly[PathBindable[String]].unbind("k", dynamicString(k)))
}
                        

// @LINE:39
def randChatWS(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "assets.javascript.randChatWebSocket.js")
}
                        

// @LINE:17
def register(error:String = ""): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "register" + queryString(List(if(error == "") None else Some(implicitly[QueryStringBindable[String]].unbind("error", error)))))
}
                        

// @LINE:55
def editMyProfile(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "editMyProfile")
}
                        

// @LINE:31
def displayAllClientsFromDB(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "clients")
}
                        

// @LINE:48
def interestsListPage(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "interestsListPage")
}
                        

// @LINE:49
def createInterestPage(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "createInterestPage")
}
                        

// @LINE:52
def likeInterest(interest:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "likeInterest/" + implicitly[PathBindable[String]].unbind("interest", dynamicString(interest)))
}
                        

// @LINE:59
def sendMessage(friendEmail:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "sendMessage/" + implicitly[PathBindable[String]].unbind("friendEmail", dynamicString(friendEmail)))
}
                        

// @LINE:37
def friendProfile(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "friendProfile")
}
                        

// @LINE:58
def message(clientEmail:String, key:String, number:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "message/" + implicitly[PathBindable[String]].unbind("clientEmail", dynamicString(clientEmail)) + "/" + implicitly[PathBindable[String]].unbind("key", dynamicString(key)) + "/" + implicitly[PathBindable[Integer]].unbind("number", number))
}
                        

// @LINE:35
def wsInterface(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "wsInterface")
}
                        

// @LINE:14
def logOut(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "logOut")
}
                        

// @LINE:38
def nextUser(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "nextUser")
}
                        

// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

}
                          
}
                  


// @LINE:59
// @LINE:58
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:42
// @LINE:41
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:35
// @LINE:31
// @LINE:28
// @LINE:25
// @LINE:21
// @LINE:17
// @LINE:14
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
              

// @LINE:59
// @LINE:58
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:42
// @LINE:41
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:35
// @LINE:31
// @LINE:28
// @LINE:25
// @LINE:21
// @LINE:17
// @LINE:14
// @LINE:12
// @LINE:6
class ReverseApplication {


// @LINE:50
def createInterest : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.createInterest",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "createInterest"})
      }
   """
)
                        

// @LINE:44
def showUnread : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.showUnread",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "showUnread"})
      }
   """
)
                        

// @LINE:42
def acceptFriendRequest : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.acceptFriendRequest",
   """
      function(clientEmail) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "acceptFriendRequest/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("clientEmail", encodeURIComponent(clientEmail))})
      }
   """
)
                        

// @LINE:25
def createClient : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.createClient",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "createClient"})
      }
   """
)
                        

// @LINE:41
def addFriend : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.addFriend",
   """
      function(clientEmail) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addFriend/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("clientEmail", encodeURIComponent(clientEmail))})
      }
   """
)
                        

// @LINE:53
def myProfile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.myProfile",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "myProfile"})
      }
   """
)
                        

// @LINE:12
def logIn : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.logIn",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "logIn"})
      }
   """
)
                        

// @LINE:28
def deleteClientFromDB : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.deleteClientFromDB",
   """
      function(email) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteClient/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("email", encodeURIComponent(email)) + "/delete"})
      }
   """
)
                        

// @LINE:21
def landing : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.landing",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "landing"})
      }
   """
)
                        

// @LINE:54
def editMyProfilePage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.editMyProfilePage",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "editMyProfilePage"})
      }
   """
)
                        

// @LINE:45
def unreadNum : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.unreadNum",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "unreadNum"})
      }
   """
)
                        

// @LINE:56
def friendListPage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.friendListPage",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "friendListPage"})
      }
   """
)
                        

// @LINE:51
def interestPage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.interestPage",
   """
      function(interest) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "interestPage/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("interest", encodeURIComponent(interest))})
      }
   """
)
                        

// @LINE:46
def findFriendProfileWithClientEmail : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.findFriendProfileWithClientEmail",
   """
      function(e,k) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "findFriendProfileWithClientEmail/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("e", encodeURIComponent(e)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("k", encodeURIComponent(k))})
      }
   """
)
                        

// @LINE:39
def randChatWS : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.randChatWS",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets.javascript.randChatWebSocket.js"})
      }
   """
)
                        

// @LINE:17
def register : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.register",
   """
      function(error) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "register" + _qS([(error == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("error", error))])})
      }
   """
)
                        

// @LINE:55
def editMyProfile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.editMyProfile",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "editMyProfile"})
      }
   """
)
                        

// @LINE:31
def displayAllClientsFromDB : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.displayAllClientsFromDB",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clients"})
      }
   """
)
                        

// @LINE:48
def interestsListPage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.interestsListPage",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "interestsListPage"})
      }
   """
)
                        

// @LINE:49
def createInterestPage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.createInterestPage",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "createInterestPage"})
      }
   """
)
                        

// @LINE:52
def likeInterest : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.likeInterest",
   """
      function(interest) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "likeInterest/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("interest", encodeURIComponent(interest))})
      }
   """
)
                        

// @LINE:59
def sendMessage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.sendMessage",
   """
      function(friendEmail) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sendMessage/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("friendEmail", encodeURIComponent(friendEmail))})
      }
   """
)
                        

// @LINE:37
def friendProfile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.friendProfile",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "friendProfile"})
      }
   """
)
                        

// @LINE:58
def message : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.message",
   """
      function(clientEmail,key,number) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "message/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("clientEmail", encodeURIComponent(clientEmail)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("key", encodeURIComponent(key)) + "/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("number", number)})
      }
   """
)
                        

// @LINE:35
def wsInterface : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.wsInterface",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "wsInterface"})
      }
   """
)
                        

// @LINE:14
def logOut : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.logOut",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "logOut"})
      }
   """
)
                        

// @LINE:38
def nextUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.nextUser",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "nextUser"})
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
        


// @LINE:59
// @LINE:58
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:42
// @LINE:41
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:35
// @LINE:31
// @LINE:28
// @LINE:25
// @LINE:21
// @LINE:17
// @LINE:14
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
                          

// @LINE:59
// @LINE:58
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:42
// @LINE:41
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:35
// @LINE:31
// @LINE:28
// @LINE:25
// @LINE:21
// @LINE:17
// @LINE:14
// @LINE:12
// @LINE:6
class ReverseApplication {


// @LINE:50
def createInterest(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.createInterest(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "createInterest", Seq(), "GET", """""", _prefix + """createInterest""")
)
                      

// @LINE:44
def showUnread(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.showUnread(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "showUnread", Seq(), "GET", """""", _prefix + """showUnread""")
)
                      

// @LINE:42
def acceptFriendRequest(clientEmail:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.acceptFriendRequest(clientEmail), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "acceptFriendRequest", Seq(classOf[String]), "GET", """""", _prefix + """acceptFriendRequest/$clientEmail<[^/]+>""")
)
                      

// @LINE:25
def createClient(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.createClient(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "createClient", Seq(), "POST", """ Add a new client to database""", _prefix + """createClient""")
)
                      

// @LINE:41
def addFriend(clientEmail:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.addFriend(clientEmail), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addFriend", Seq(classOf[String]), "GET", """""", _prefix + """addFriend/$clientEmail<[^/]+>""")
)
                      

// @LINE:53
def myProfile(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.myProfile(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "myProfile", Seq(), "GET", """""", _prefix + """myProfile""")
)
                      

// @LINE:12
def logIn(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.logIn(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "logIn", Seq(), "POST", """ Check client's login information and determines success or failure""", _prefix + """logIn""")
)
                      

// @LINE:28
def deleteClientFromDB(email:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.deleteClientFromDB(email), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "deleteClientFromDB", Seq(classOf[String]), "POST", """ Delete a registered client from database""", _prefix + """deleteClient/$email<[^/]+>/delete""")
)
                      

// @LINE:21
def landing(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.landing(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "landing", Seq(), "GET", """ Diaplay the landing page""", _prefix + """landing""")
)
                      

// @LINE:54
def editMyProfilePage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.editMyProfilePage(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "editMyProfilePage", Seq(), "GET", """""", _prefix + """editMyProfilePage""")
)
                      

// @LINE:45
def unreadNum(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.unreadNum(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "unreadNum", Seq(), "GET", """""", _prefix + """unreadNum""")
)
                      

// @LINE:56
def friendListPage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.friendListPage(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "friendListPage", Seq(), "GET", """""", _prefix + """friendListPage""")
)
                      

// @LINE:51
def interestPage(interest:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.interestPage(interest), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "interestPage", Seq(classOf[String]), "GET", """""", _prefix + """interestPage/$interest<[^/]+>""")
)
                      

// @LINE:46
def findFriendProfileWithClientEmail(e:String, k:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.findFriendProfileWithClientEmail(e, k), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "findFriendProfileWithClientEmail", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """findFriendProfileWithClientEmail/$e<[^/]+>/$k<[^/]+>""")
)
                      

// @LINE:39
def randChatWS(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.randChatWS(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "randChatWS", Seq(), "GET", """""", _prefix + """assets.javascript.randChatWebSocket.js""")
)
                      

// @LINE:17
def register(error:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.register(error), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "register", Seq(classOf[String]), "GET", """ Take client's registration information and create a new account""", _prefix + """register""")
)
                      

// @LINE:55
def editMyProfile(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.editMyProfile(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "editMyProfile", Seq(), "GET", """""", _prefix + """editMyProfile""")
)
                      

// @LINE:31
def displayAllClientsFromDB(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.displayAllClientsFromDB(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "displayAllClientsFromDB", Seq(), "GET", """ Display all clients in the database""", _prefix + """clients""")
)
                      

// @LINE:48
def interestsListPage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.interestsListPage(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "interestsListPage", Seq(), "GET", """""", _prefix + """interestsListPage""")
)
                      

// @LINE:49
def createInterestPage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.createInterestPage(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "createInterestPage", Seq(), "GET", """""", _prefix + """createInterestPage""")
)
                      

// @LINE:52
def likeInterest(interest:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.likeInterest(interest), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "likeInterest", Seq(classOf[String]), "GET", """""", _prefix + """likeInterest/$interest<[^/]+>""")
)
                      

// @LINE:59
def sendMessage(friendEmail:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.sendMessage(friendEmail), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "sendMessage", Seq(classOf[String]), "GET", """""", _prefix + """sendMessage/$friendEmail<[^/]+>""")
)
                      

// @LINE:37
def friendProfile(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.friendProfile(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "friendProfile", Seq(), "GET", """""", _prefix + """friendProfile""")
)
                      

// @LINE:58
def message(clientEmail:String, key:String, number:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.message(clientEmail, key, number), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "message", Seq(classOf[String], classOf[String], classOf[Integer]), "GET", """""", _prefix + """message/$clientEmail<[^/]+>/$key<[^/]+>/$number<[^/]+>""")
)
                      

// @LINE:35
def wsInterface(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.wsInterface(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "wsInterface", Seq(), "GET", """""", _prefix + """wsInterface""")
)
                      

// @LINE:14
def logOut(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.logOut(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "logOut", Seq(), "POST", """""", _prefix + """logOut""")
)
                      

// @LINE:38
def nextUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.nextUser(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "nextUser", Seq(), "GET", """""", _prefix + """nextUser""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

}
                          
}
        
    