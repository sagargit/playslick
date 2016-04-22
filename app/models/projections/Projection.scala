package models.projections

import models._
import org.joda.time.DateTime
import play.api.db.slick.Config.driver.simple._

import scala.slick.lifted.ProvenShape

//import scala.slick.driver.MySQLDriver.simple._
import com.github.tototoshi.slick.MySQLJodaSupport._

object Projection  {
	
	class UserProjection(tag: Tag) extends Table[(Long, String, String, String, String)](tag, "nts_users") {
    	def id = column[Long]("id", O.PrimaryKey, O.AutoInc)
    	def firstName = column[String]("us_first_name")
    	def lastName = column[String]("us_last_name")
			def email = column[String]("us_email")
    	def password = column[String]("us_password")
			def * : ProvenShape[(Long, String, String, String, String)] =
			(id, firstName, lastName, email, password)
  	}

    class NoteProjection(tag: Tag) extends Table[(Long,Long,String,String)](tag, "nts_notes") {
    	def id = column[Long]("id", O.PrimaryKey, O.AutoInc)
    	def userId = column[Long]("nt_user_id")
			def noteTitle = column[String]("nt_title")
    	def note = column[String]("nt_note", O.DBType("TEXT"))
    	def * : ProvenShape[(Long,Long,String,String)]= (id, userId, noteTitle, note)
  	}


	  class LoginUserProjection(tag:Tag) extends Table[LoginUser](tag,"login_user"){
			def email =column[String]("login_email")
			def password = column[String]("login_password")
			def * = (email, password ) <> (LoginUser.tupled, LoginUser.unapply)
		}



val slickUser = TableQuery[UserProjection]

val slickNote = TableQuery[NoteProjection]

val slickLoginUser = TableQuery[LoginUserProjection]


}