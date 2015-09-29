package repositories

import javax.inject.Inject
import scala.concurrent.Future
import models.{ApparatenTable, Apparaat}
import play.api.libs.concurrent.Execution.Implicits.defaultContext
import play.api.db.slick.{HasDatabaseConfigProvider, DatabaseConfigProvider}
import slick.driver.JdbcProfile

class ApparaatRepository @Inject()(protected val dbConfigProvider: DatabaseConfigProvider) extends HasDatabaseConfigProvider[JdbcProfile] {
  import driver.api._

  private val Apparaten = TableQuery[ApparatenTable]

  def all(): Future[Seq[Apparaat]] = db.run(Apparaten.result)

  def insert(apparaat: Apparaat): Future[Unit] = db.run(Apparaten += apparaat).map { _ => () }
}