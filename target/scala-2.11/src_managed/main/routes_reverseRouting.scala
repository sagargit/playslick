// @SOURCE:/home/srijesh/dev/projects/notes/conf/routes
// @HASH:e24a39eb3217dd5370f23ad0895f62e791edfd04
// @DATE:Fri Apr 22 12:23:27 NPT 2016

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString


// @LINE:22
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:20
// @LINE:18
// @LINE:16
// @LINE:13
class ReverseRegistrations {


// @LINE:18
def saveNote(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "savenote")
}
                        

// @LINE:16
def loginUser(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "loginuser")
}
                        

// @LINE:20
def getNote(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "notetitle")
}
                        

// @LINE:13
def saveUser(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "saveuser")
}
                        

}
                          

// @LINE:22
class ReverseAssets {


// @LINE:22
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:19
// @LINE:15
// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:9
def signUp(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "signup")
}
                        

// @LINE:15
def signOut(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                        

// @LINE:8
def changeToEnglish(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "en")
}
                        

// @LINE:19
def showNoteOption(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "show")
}
                        

// @LINE:7
def changeToSpanish(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "es")
}
                        

// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

// @LINE:11
def aboutUs(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "aboutus")
}
                        

// @LINE:14
// @LINE:10
def signIn(): Call = {
   () match {
// @LINE:10
case ()  =>
  import ReverseRouteContext.empty
  Call("GET", _prefix + { _defaultPrefix } + "signin")
                                         
   }
}
                                                

// @LINE:12
def gallery(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "gallery")
}
                        

}
                          
}
                  


// @LINE:22
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:20
// @LINE:18
// @LINE:16
// @LINE:13
class ReverseRegistrations {


// @LINE:18
def saveNote : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Registrations.saveNote",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "savenote"})
      }
   """
)
                        

// @LINE:16
def loginUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Registrations.loginUser",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "loginuser"})
      }
   """
)
                        

// @LINE:20
def getNote : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Registrations.getNote",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "notetitle"})
      }
   """
)
                        

// @LINE:13
def saveUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Registrations.saveUser",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "saveuser"})
      }
   """
)
                        

}
              

// @LINE:22
class ReverseAssets {


// @LINE:22
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:19
// @LINE:15
// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:9
def signUp : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.signUp",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
      }
   """
)
                        

// @LINE:15
def signOut : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.signOut",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:8
def changeToEnglish : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.changeToEnglish",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "en"})
      }
   """
)
                        

// @LINE:19
def showNoteOption : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.showNoteOption",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "show"})
      }
   """
)
                        

// @LINE:7
def changeToSpanish : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.changeToSpanish",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "es"})
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
                        

// @LINE:11
def aboutUs : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.aboutUs",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "aboutus"})
      }
   """
)
                        

// @LINE:14
// @LINE:10
def signIn : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.signIn",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signin"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "loginuser"})
      }
      }
   """
)
                        

// @LINE:12
def gallery : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.gallery",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "gallery"})
      }
   """
)
                        

}
              
}
        


// @LINE:22
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:20
// @LINE:18
// @LINE:16
// @LINE:13
class ReverseRegistrations {


// @LINE:18
def saveNote(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Registrations.saveNote(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Registrations", "saveNote", Seq(), "POST", """GET    /savenote                           controllers.Application.submitNote""", _prefix + """savenote""")
)
                      

// @LINE:16
def loginUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Registrations.loginUser(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Registrations", "loginUser", Seq(), "POST", """""", _prefix + """loginuser""")
)
                      

// @LINE:20
def getNote(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Registrations.getNote(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Registrations", "getNote", Seq(), "POST", """""", _prefix + """notetitle""")
)
                      

// @LINE:13
def saveUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Registrations.saveUser(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Registrations", "saveUser", Seq(), "POST", """""", _prefix + """saveuser""")
)
                      

}
                          

// @LINE:22
class ReverseAssets {


// @LINE:22
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:19
// @LINE:15
// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:9
def signUp(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.signUp(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "signUp", Seq(), "GET", """""", _prefix + """signup""")
)
                      

// @LINE:15
def signOut(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.signOut(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "signOut", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:8
def changeToEnglish(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.changeToEnglish(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "changeToEnglish", Seq(), "GET", """""", _prefix + """en""")
)
                      

// @LINE:19
def showNoteOption(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.showNoteOption(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "showNoteOption", Seq(), "GET", """""", _prefix + """show""")
)
                      

// @LINE:7
def changeToSpanish(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.changeToSpanish(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "changeToSpanish", Seq(), "GET", """""", _prefix + """es""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:11
def aboutUs(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.aboutUs(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "aboutUs", Seq(), "GET", """""", _prefix + """aboutus""")
)
                      

// @LINE:10
def signIn(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.signIn(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "signIn", Seq(), "GET", """""", _prefix + """signin""")
)
                      

// @LINE:12
def gallery(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.gallery(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "gallery", Seq(), "GET", """""", _prefix + """gallery""")
)
                      

}
                          
}
        
    