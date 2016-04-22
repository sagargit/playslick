package forms

import play.api.data._
import play.api.data.Forms._

object AppForms{
	  val signUpForm= Form(
	   tuple(
	  "firstName"-> nonEmptyText,
	  "lastName" -> nonEmptyText,
	  "email" ->  email,
	  "password" -> nonEmptyText
	  )
	)

	val loginForm = Form(
	  tuple(
       "email" -> email,
       "password" -> nonEmptyText
	  	)
	) 

	val noteForm = Form(
	     tuple(
		   "Title" -> nonEmptyText,
		   "Note" -> nonEmptyText
			 )
	) 

	val askNote = Form(
		"askNote" -> text 
		)

	val showNoteForm = Form(
	    "Title" -> nonEmptyText
	)


}