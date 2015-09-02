package controllers

import play.api._
import play.api.mvc._
import play.api.i18n.Messages
import play.api.i18n.Lang
import play.api.Play.current

object Application extends Controller {

  def index = Action { implicit request =>
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
    Ok(views.html.signup(""))
  }

  def aboutUs = Action { implicit request =>
    Ok(views.html.aboutus(""))
  }

}
