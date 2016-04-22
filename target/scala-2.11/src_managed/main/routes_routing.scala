// @SOURCE:/home/srijesh/dev/projects/notes/conf/routes
// @HASH:e24a39eb3217dd5370f23ad0895f62e791edfd04
// @DATE:Fri Apr 22 12:23:27 NPT 2016


import scala.language.reflectiveCalls
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

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
controllers.Application.index,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:7
private[this] lazy val controllers_Application_changeToSpanish1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("es"))))
private[this] lazy val controllers_Application_changeToSpanish1_invoker = createInvoker(
controllers.Application.changeToSpanish,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "changeToSpanish", Nil,"GET", """""", Routes.prefix + """es"""))
        

// @LINE:8
private[this] lazy val controllers_Application_changeToEnglish2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("en"))))
private[this] lazy val controllers_Application_changeToEnglish2_invoker = createInvoker(
controllers.Application.changeToEnglish,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "changeToEnglish", Nil,"GET", """""", Routes.prefix + """en"""))
        

// @LINE:9
private[this] lazy val controllers_Application_signUp3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup"))))
private[this] lazy val controllers_Application_signUp3_invoker = createInvoker(
controllers.Application.signUp,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "signUp", Nil,"GET", """""", Routes.prefix + """signup"""))
        

// @LINE:10
private[this] lazy val controllers_Application_signIn4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signin"))))
private[this] lazy val controllers_Application_signIn4_invoker = createInvoker(
controllers.Application.signIn,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "signIn", Nil,"GET", """""", Routes.prefix + """signin"""))
        

// @LINE:11
private[this] lazy val controllers_Application_aboutUs5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("aboutus"))))
private[this] lazy val controllers_Application_aboutUs5_invoker = createInvoker(
controllers.Application.aboutUs,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "aboutUs", Nil,"GET", """""", Routes.prefix + """aboutus"""))
        

// @LINE:12
private[this] lazy val controllers_Application_gallery6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("gallery"))))
private[this] lazy val controllers_Application_gallery6_invoker = createInvoker(
controllers.Application.gallery,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "gallery", Nil,"GET", """""", Routes.prefix + """gallery"""))
        

// @LINE:13
private[this] lazy val controllers_Registrations_saveUser7_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("saveuser"))))
private[this] lazy val controllers_Registrations_saveUser7_invoker = createInvoker(
controllers.Registrations.saveUser,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Registrations", "saveUser", Nil,"POST", """""", Routes.prefix + """saveuser"""))
        

// @LINE:14
private[this] lazy val controllers_Application_signIn8_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("loginuser"))))
private[this] lazy val controllers_Application_signIn8_invoker = createInvoker(
controllers.Application.signIn,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "signIn", Nil,"GET", """""", Routes.prefix + """loginuser"""))
        

// @LINE:15
private[this] lazy val controllers_Application_signOut9_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
private[this] lazy val controllers_Application_signOut9_invoker = createInvoker(
controllers.Application.signOut,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "signOut", Nil,"GET", """""", Routes.prefix + """logout"""))
        

// @LINE:16
private[this] lazy val controllers_Registrations_loginUser10_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("loginuser"))))
private[this] lazy val controllers_Registrations_loginUser10_invoker = createInvoker(
controllers.Registrations.loginUser,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Registrations", "loginUser", Nil,"POST", """""", Routes.prefix + """loginuser"""))
        

// @LINE:18
private[this] lazy val controllers_Registrations_saveNote11_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("savenote"))))
private[this] lazy val controllers_Registrations_saveNote11_invoker = createInvoker(
controllers.Registrations.saveNote,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Registrations", "saveNote", Nil,"POST", """GET    /savenote                           controllers.Application.submitNote""", Routes.prefix + """savenote"""))
        

// @LINE:19
private[this] lazy val controllers_Application_showNoteOption12_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("show"))))
private[this] lazy val controllers_Application_showNoteOption12_invoker = createInvoker(
controllers.Application.showNoteOption,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "showNoteOption", Nil,"GET", """""", Routes.prefix + """show"""))
        

// @LINE:20
private[this] lazy val controllers_Registrations_getNote13_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("notetitle"))))
private[this] lazy val controllers_Registrations_getNote13_invoker = createInvoker(
controllers.Registrations.getNote,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Registrations", "getNote", Nil,"POST", """""", Routes.prefix + """notetitle"""))
        

// @LINE:22
private[this] lazy val controllers_Assets_at14_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at14_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """es""","""controllers.Application.changeToSpanish"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """en""","""controllers.Application.changeToEnglish"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""controllers.Application.signUp"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signin""","""controllers.Application.signIn"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """aboutus""","""controllers.Application.aboutUs"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """gallery""","""controllers.Application.gallery"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """saveuser""","""controllers.Registrations.saveUser"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """loginuser""","""controllers.Application.signIn"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Application.signOut"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """loginuser""","""controllers.Registrations.loginUser"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """savenote""","""controllers.Registrations.saveNote"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """show""","""controllers.Application.showNoteOption"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """notetitle""","""controllers.Registrations.getNote"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0_route(params) => {
   call { 
        controllers_Application_index0_invoker.call(controllers.Application.index)
   }
}
        

// @LINE:7
case controllers_Application_changeToSpanish1_route(params) => {
   call { 
        controllers_Application_changeToSpanish1_invoker.call(controllers.Application.changeToSpanish)
   }
}
        

// @LINE:8
case controllers_Application_changeToEnglish2_route(params) => {
   call { 
        controllers_Application_changeToEnglish2_invoker.call(controllers.Application.changeToEnglish)
   }
}
        

// @LINE:9
case controllers_Application_signUp3_route(params) => {
   call { 
        controllers_Application_signUp3_invoker.call(controllers.Application.signUp)
   }
}
        

// @LINE:10
case controllers_Application_signIn4_route(params) => {
   call { 
        controllers_Application_signIn4_invoker.call(controllers.Application.signIn)
   }
}
        

// @LINE:11
case controllers_Application_aboutUs5_route(params) => {
   call { 
        controllers_Application_aboutUs5_invoker.call(controllers.Application.aboutUs)
   }
}
        

// @LINE:12
case controllers_Application_gallery6_route(params) => {
   call { 
        controllers_Application_gallery6_invoker.call(controllers.Application.gallery)
   }
}
        

// @LINE:13
case controllers_Registrations_saveUser7_route(params) => {
   call { 
        controllers_Registrations_saveUser7_invoker.call(controllers.Registrations.saveUser)
   }
}
        

// @LINE:14
case controllers_Application_signIn8_route(params) => {
   call { 
        controllers_Application_signIn8_invoker.call(controllers.Application.signIn)
   }
}
        

// @LINE:15
case controllers_Application_signOut9_route(params) => {
   call { 
        controllers_Application_signOut9_invoker.call(controllers.Application.signOut)
   }
}
        

// @LINE:16
case controllers_Registrations_loginUser10_route(params) => {
   call { 
        controllers_Registrations_loginUser10_invoker.call(controllers.Registrations.loginUser)
   }
}
        

// @LINE:18
case controllers_Registrations_saveNote11_route(params) => {
   call { 
        controllers_Registrations_saveNote11_invoker.call(controllers.Registrations.saveNote)
   }
}
        

// @LINE:19
case controllers_Application_showNoteOption12_route(params) => {
   call { 
        controllers_Application_showNoteOption12_invoker.call(controllers.Application.showNoteOption)
   }
}
        

// @LINE:20
case controllers_Registrations_getNote13_route(params) => {
   call { 
        controllers_Registrations_getNote13_invoker.call(controllers.Registrations.getNote)
   }
}
        

// @LINE:22
case controllers_Assets_at14_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at14_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     