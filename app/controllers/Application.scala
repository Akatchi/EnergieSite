package controllers

import javax.inject.Inject

import dao.UserDAO
import models.User
import play.api._
import play.api.mvc._

class Application @Inject() (userDao: UserDAO) extends Controller {

  def index = Action {

    val user = new User("pietje", "red")

    userDao.insert(user)

    Logger.debug(user.name)

    val users = userDao.all()

    Ok(views.html.index("Your new application is ready."))
  }

}
