package models

import slick.driver.MySQLDriver.api._

case class GebruikerHuishouden(gebruiker_id: Int, huishouden_id: Int)

class GebruikerHuishoudensTable(tag: Tag) extends Table[GebruikerHuishouden](tag, "gebruiker_huishouden") {

  private val Gebruiker = TableQuery[GebruikersTable]
  private val Huishouden = TableQuery[HuishoudenTable]

  def id = column[Int]("id", O.PrimaryKey)
  def gebruiker_id = column[Int]("gebruiker_id")
  def huishouden_id = column[Int]("huishouden_id")
  def gebruiker = foreignKey("gebruiker_id", gebruiker_id, Gebruiker)(_.id)
  def huishouden = foreignKey("huishouden_id", huishouden_id, Huishouden)(_.id)
  def * = (gebruiker_id, huishouden_id) <> (GebruikerHuishouden.tupled, GebruikerHuishouden.unapply)
}