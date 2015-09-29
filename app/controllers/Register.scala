package controllers

import javax.inject.Inject
import models.Gebruiker
import play.api.data.Form
import play.api.data.Forms.mapping
import play.api.data.Forms.{optional,text,number}
import play.api.mvc.{Action, Controller}
import repositories.{HuishoudenRepository, GebruikerRepository}
import play.api.libs.concurrent.Execution.Implicits.defaultContext

class Register @Inject() (gebruikerDao: GebruikerRepository, huishoudenDao: HuishoudenRepository) extends Controller {

  val gebruikersFormulier = Form(
    mapping(
      "voornaam" -> text(),
      "achternaam" -> text(),
      "email" -> text(),
      "telefoonnummer" -> number(),
      "password" -> optional(text())
    )(Gebruiker.apply)(Gebruiker.unapply)
  )

  def index = Action.async {
    gebruikerDao.all().zip(huishoudenDao.all()).map {case (gebruikers, huishoudens) => Ok(views.html.index(gebruikers, huishoudens)) }
  }

}
