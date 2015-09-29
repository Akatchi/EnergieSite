package models

import java.sql.{Time, Date}

import slick.driver.MySQLDriver.api._

case class Meting(app_hh: Int, datum: Date, tijd: Time, waarde: Int)

class MetingenTable(tag: Tag) extends Table[Meting](tag, "meting") {
  private val ApparaatHuishouden = TableQuery[ApparaatHuishoudensTable]

  def id = column[Int]("id", O.PrimaryKey)
  def app_hh = column[Int]("app_hh")
  def datum = column[Date]("datum")
  def tijd = column[Time]("tijd")
  def waarde = column[Int]("waarde")
  def apparaat_huishouden = foreignKey("app_hh", app_hh, ApparaatHuishouden)(_.id)

  def * = (app_hh, datum, tijd, waarde) <> (Meting.tupled, Meting.unapply)
}