package models

import java.sql.Date
import slick.driver.MySQLDriver.api._

case class Postcode(postcode: String, postcode_id: Int, pnum: Int, pchar: String, minnumber: Int, maxnumber: Int, numbertype: String, street: String, city: String, city_id: Int, municipality: String, municipality_id: Int, province: String, province_code: String, lat: Double, lon: Double, rd_x: Double, rd_y: Double, location_detail: String, changed_dat: Date);

class PostcodeTable(tag: Tag) extends Table[Postcode](tag, "postcode") {
  def id = column[Int]("id", O.PrimaryKey)
  def postcode = column[String]("postcode")
  def postcode_id = column[Int]("postcode_id")
  def pnum = column[Int]("pnum")
  def pchar = column[String]("pchar")
  def minnumber = column[Int]("minnumber")
  def maxnumber = column[Int]("maxnumber")
  def numbertype = column[String]("numbertype")
  def street = column[String]("street")
  def city = column[String]("city")
  def city_id = column[Int]("city_id")
  def municipality = column[String]("municipality")
  def municipality_id = column[Int]("municipality_id")
  def province = column[String]("province")
  def province_code = column[String]("province_code")
  def lat = column[Double]("lat")
  def long = column[Double]("lon")
  def rd_x = column[Double]("rd_x")
  def rd_y = column[Double]("rd_y")
  def location_detail = column[String]("location_detail")
  def changed_date = column[Date]("changed_date")

  def * = (postcode, postcode_id, pnum, pchar, minnumber, maxnumber, numbertype, street, city, city_id, municipality, municipality_id, province, province_code, lat, long, rd_x, rd_y, location_detail, changed_date) <> (Postcode.tupled, Postcode.unapply)
}