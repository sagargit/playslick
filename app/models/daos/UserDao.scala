package models.daos


import models.{User}
import models.projections.{Projection}
import models.projections.Projection.UserProjection
import org.joda.time.DateTime
import play.api.Play.current
import play.api.db.slick.Config.driver.simple._
import play.api.db.slick.DB
import models.projections.Projection._


object UserDao {

    def store(o: User): Long = {
      DB.withSession { implicit session =>
      Projection.slickUser returning Projection.slickUser.map(_.id) +=(o.id, o.firstName, o.lastName, o.email, o.password)
    }
  }

  def getByEmail(email: String): Option[User] = {
    DB.withSession {
      implicit session =>
      val result = Projection.slickUser.filter(k => k.email === email).list
      val listOfUsers: List[User] = result.map {
        tuple =>
          User(id = tuple._1, firstName = tuple._2, lastName = tuple._3, email = tuple._4, password = tuple._5)
      }
      Some(listOfUsers.head)

    }
  }

}
