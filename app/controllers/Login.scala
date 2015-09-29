package controllers

import javax.inject.Inject
import models.Gebruiker
import play.api.Logger
import play.api.data._
import play.api.data.Forms._
import play.api.mvc.{Flash, Action, Controller}
import repositories.{HuishoudenRepository, GebruikerRepository}
import forms.LoginData
import scala.concurrent._
import scala.util.parsing.json
import scala.concurrent.ExecutionContext.Implicits.global
class Login @Inject() (gebruiker: GebruikerRepository)   extends Controller {


  // Handle the validation
    val loginForm = Form(
      tuple(
        "email" -> text(),
        "password" -> text()
      ) verifying ("invalid email or password", result => result match {
        case (email, password) => gebruiker.findByEmail(email).isCompleted
      })
    )

//  val loginForm = Form(
//    mapping(
//      "email" -> nonEmptyText(),
//      "password" -> nonEmptyText()
//    )(LoginData.apply)(LoginData.unapply)
//  )

  def index = Action { implicit request =>
    Ok(views.html.login.index(loginForm))
  }

  def test = Action.async { implicit request =>
    gebruiker.findByEmail("jantje@achter.nl").map {
      case (gebruiker) => Ok(views.html.profile.index(gebruiker))

    }
  }

  def login = Action { implicit request =>
    loginForm.bindFromRequest.fold(
      formWithErrors => BadRequest(views.html.login.index(formWithErrors)),
      loginData => Redirect(routes.Register.index()).withSession("email" -> loginData._1)
    )
  }

}
