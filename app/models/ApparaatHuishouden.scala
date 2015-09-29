package models

import slick.driver.MySQLDriver.api._

case class ApparaatHuishouden(huishouden_fk: Int, apparaat_fk: Int)


class ApparaatHuishoudensTable(tag: Tag) extends Table[ApparaatHuishouden](tag, "apparaat_huishouden") {
  private val Apparaten = TableQuery[ApparatenTable]
  private val Huishoudens = TableQuery[HuishoudenTable]

  def id = column[Int]("id", O.PrimaryKey)
  def huishouden_fk = column[Int]("huishouden_fk")
  def apparaat_fk = column[Int]("apparaat_fk")
  def huishouden = foreignKey("huishouden_fk", huishouden_fk, Huishoudens)(_.id)
  def apparaat = foreignKey("apparaat_fk", apparaat_fk, Apparaten)(_.id)

  def * = (huishouden_fk, apparaat_fk) <> (ApparaatHuishouden.tupled, ApparaatHuishouden.unapply)
}