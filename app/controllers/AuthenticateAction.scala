package controllers

import play.api.mvc.Security.AuthenticatedRequest

import scala.concurrent.Future
import play.api.mvc._
import models.daos.UserDao
import models.AuthenticateRequest
import play.api.mvc.ActionBuilder

/**
 * Created by srijesh on 4/21/16.
 */
object AuthenticateAction extends ActionBuilder[AuthenticateRequest] {

  def invokeBlock[A](
                      request: Request[A],
                      block: AuthenticateRequest[A] => Future[Result]): Future[Result] = {
    request.session.get("username")
      .flatMap(UserDao.getByEmail(_))
      .map(user => block(AuthenticateRequest(user, request)))
      .getOrElse(Future.successful(Results.Forbidden))
  }
}
