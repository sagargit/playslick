package controllers

import play.api._
import play.api.mvc._
import play.api.i18n.Messages
import play.api.i18n.Lang
import play.api.Play.current
import models.User
import models.daos.UserDao
import forms.AppForms._

object Application extends Controller {

  def index = Action { implicit request =>
    //val user = User(0,"Ram","Dahal","ram@gmail.com","123")
    //UserDao.store(user)
    Ok(views.html.index(Messages("home.title")))
  }

  def changeToSpanish = Action { implicit request => 
  	val referrer = request.headers.get(REFERER).getOrElse("/")
    Redirect(referrer).withLang(Lang("es"))
  }

  def changeToEnglish = Action { implicit request => 
  	val referrer = request.headers.get(REFERER).getOrElse("/")
    Redirect(referrer).withLang(Lang("en"))
  }

  def signUp = Action { implicit request =>
    Ok(views.html.signup(signUpForm))
  }

  def signIn = Action { implicit request =>
    Ok(views.html.login(loginForm))
  }

  def signOut = Action { implicit request =>
  Redirect(routes.Application.signIn).discardingCookies(DiscardingCookie("loginCookie"))
  }

  def submitNote = Action { implicit request=>
    Ok(views.html.note(noteForm))
  }
   
  def showNoteOption = Action { implicit request =>
   Ok(views.html.note(noteForm))
  }

  def getNote = Action { implicit request =>
    Ok(views.html.note(noteForm))
  }
  def aboutUs = Action { implicit request =>
    Ok(views.html.aboutus(""))
  }

  def gallery = Action { implicit request =>
    Ok(views.html.gallery(""))
  }


}
