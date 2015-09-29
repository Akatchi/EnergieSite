package models

import slick.driver.MySQLDriver.api._

case class Gebruiker(voornaam: String, achternaam: String, email: String, telefoonnummer: Int, password: Option[String])

class GebruikersTable(tag: Tag) extends Table[Gebruiker](tag, "gebruikers") {
  def id = column[Int]("id", O.PrimaryKey)
  def voornaam = column[String]("voornaam")
  def achternaam = column[String]("achternaam")
  def email = column[String]("email")
  def telefoonnummer = column[Int]("telefoonnummer")
  def password = column[Option[String]]("password")

  def * = (voornaam, achternaam, email, telefoonnummer, password) <> (Gebruiker.tupled, Gebruiker.unapply)
}