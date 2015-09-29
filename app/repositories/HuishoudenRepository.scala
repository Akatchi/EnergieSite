package repositories

import javax.inject.Inject
import scala.concurrent.Future
import models.{HuishoudenTable, Huishouden}
import play.api.db.slick.{HasDatabaseConfigProvider, DatabaseConfigProvider}
import slick.driver.JdbcProfile
import play.api.libs.concurrent.Execution.Implicits.defaultContext

class HuishoudenRepository @Inject()(protected val dbConfigProvider: DatabaseConfigProvider) extends HasDatabaseConfigProvider[JdbcProfile] {
  import driver.api._

  private val Huishoudens = TableQuery[HuishoudenTable]

  def all(): Future[Seq[Huishouden]] = db.run(Huishoudens.result)

  def insert(huishouden: Huishouden): Future[Unit] = db.run(Huishoudens += huishouden).map { _ => () }


}