package models

import slick.driver.MySQLDriver.api._


case class Apparaat(naam: String, max: Int);

class ApparatenTable(tag: Tag) extends Table[Apparaat](tag, "apparaat") {
  def id = column[Int]("id", O.PrimaryKey)
  def naam = column[String]("naam")
  def max = column[Int]("max")
  def * = (naam, max) <> (Apparaat.tupled, Apparaat.unapply)
}