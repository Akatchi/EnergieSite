package models

import slick.driver.MySQLDriver.api._

case class Huishouden(postcode: String, huisnummer: Int, grootte: Int);

class HuishoudenTable(tag: Tag) extends Table[Huishouden](tag, "huishouden") {
  def id = column[Int]("id", O.PrimaryKey)
  def postcode = column[String]("postcode")
  def huisnummer = column[Int]("huisnummer")
  def grootte = column[Int]("grootte")

  def * = (postcode, huisnummer, grootte) <> (Huishouden.tupled, Huishouden.unapply)
}