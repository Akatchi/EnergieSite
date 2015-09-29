package repositories

import javax.inject.Inject
import scala.concurrent.Future
import models.{ApparaatHuishoudensTable, ApparaatHuishouden}
import play.api.libs.concurrent.Execution.Implicits.defaultContext
import play.api.db.slick.{HasDatabaseConfigProvider, DatabaseConfigProvider}
import slick.driver.JdbcProfile

class ApparaatHuishoudenRepository @Inject()(protected val dbConfigProvider: DatabaseConfigProvider) extends HasDatabaseConfigProvider[JdbcProfile] {
  import driver.api._

  private val ApparaatHuishoudens = TableQuery[ApparaatHuishoudensTable]

  def all(): Future[Seq[ApparaatHuishouden]] = db.run(ApparaatHuishoudens.result)

  def insert(apparaat_huishouden: ApparaatHuishouden): Future[Unit] = db.run(ApparaatHuishoudens += apparaat_huishouden).map { _ => () }
}