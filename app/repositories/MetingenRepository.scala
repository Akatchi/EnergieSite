package repositories

import java.sql.{Time, Date}
import javax.inject.Inject
import models.{MetingenTable, Meting}
import play.api.db.slick.{HasDatabaseConfigProvider, DatabaseConfigProvider}
import slick.driver.JdbcProfile
import scala.concurrent.Future
import play.api.libs.concurrent.Execution.Implicits.defaultContext

class MetingenRepository @Inject()(protected val dbConfigProvider: DatabaseConfigProvider) extends HasDatabaseConfigProvider[JdbcProfile] {
  import driver.api._

  private val Metingen = TableQuery[MetingenTable]

  def all(): Future[Seq[Meting]] = db.run(Metingen.result)

  def insert(meting: Meting): Future[Unit] = db.run(Metingen += meting).map { _ => () }
}
