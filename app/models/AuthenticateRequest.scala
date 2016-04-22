package models

import play.api.mvc.{Request, WrappedRequest}
import models.User
/**
 * Created by srijesh on 4/21/16.
 */
case class AuthenticateRequest[A](val user:User,val request:Request[A]) extends WrappedRequest[A](request)
