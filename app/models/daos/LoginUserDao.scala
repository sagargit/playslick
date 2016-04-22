package models.daos

import models.LoginUser
import models.projections.Projection
import play.api.Play.current
import play.api.db.slick.Config.driver.simple._
import play.api.db.slick.DB
/**
 * Created by srijesh on 4/21/16.
 */
object LoginUserDao {

  def store(login:LoginUser): Long ={
    DB.withSession{ implicit session =>
    Projection.slickLoginUser += login
    }
  }

}
