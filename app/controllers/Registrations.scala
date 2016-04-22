package controllers

import play.api.mvc._
import play.api._
import play.api.i18n.Messages
import play.api.i18n.Lang
import play.api.Play.current
import models.projections.Projection._
import forms.AppForms._
import models.{LoginUser, User, Note}
import models.daos.{LoginUserDao, UserDao, NoteDao}


object Registrations extends Controller{

	def saveUser = Action { implicit request =>
		signUpForm.bindFromRequest.fold(
			error => BadRequest(views.html.signup(error)),
			result=>{
				//Values
				val firstName: String = result._1
				val lastName: String = result._2
				val email: String = result._3
				val password: String = result._4
				val user = User(0,firstName,lastName,email,password)
				UserDao.store(user)
				val uid = user.id
				Redirect(routes.Application.index).flashing("User"->"User successfully inserted")
				})
		
	}


	def loginUser = Action{ implicit request =>
		loginForm.bindFromRequest.fold(
			error => BadRequest(views.html.login(error)),
			result=>{
				val email: String = result._1
				val password: String = result._2
				val login = LoginUser(email, password)
				UserDao.getByEmail(email) match{
					case Some(u) => {
						if(u.password == password){
							 val uId = u.id
							 LoginUserDao.store(login)
								Ok(views.html.ask(askNote)).withCookies(Cookie(name="loginCookie",value=u.id.toString))
								//for setting session .withSession("loginSession" -> u.id.toString)
							}else{
								Ok("Password do not match")
							}
					}
					case None => Ok("Invalid Email or password")
				}
			}

			)
	}

	def saveNote  = Action{ implicit request =>
		noteForm.bindFromRequest.fold(
			error => BadRequest(views.html.note(error)),
			result=> {
				    // requesting session val id = request.session.get("loginSession")
				    val id = request.cookies.get("loginCookie").get.value
				    val uId = id.toLong
						val notes = Note(0, uId, result._1, result._2)
						NoteDao.store(notes)
						Ok("Note Saved").withCookies(Cookie(name="noteTitleCookie", value = result._1), Cookie(name="noteContentCookie", value = result._2))
						//println("Notes Received")
			}
		)
	}


  def getNote = Action{ implicit request =>
		showNoteForm.bindFromRequest.fold(
		 error => BadRequest(views.html.titleNote(error)),
		result => {
			val title = request.cookies.get("noteTitleCookie").get.value
			if(title.isEmpty){
				BadRequest("Insert Title")
			}
			else {
				if(title == result){
				Ok(request.cookies.get("noteContentCookie").get.value)
			}
				else {
				BadRequest("Title not Found")
				}
			}
		}
		)

	}




}