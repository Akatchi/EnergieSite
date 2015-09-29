package repositories

import java.sql.{Time, Date}
import javax.inject.Inject
import models.{PostcodeTable, Postcode}
import play.api.libs.concurrent.Execution.Implicits.defaultContext
import play.api.db.slick.{HasDatabaseConfigProvider, DatabaseConfigProvider}
import slick.driver.JdbcProfile
import scala.concurrent.Future

class PostcodeRepository @Inject()(protected val dbConfigProvider: DatabaseConfigProvider) extends HasDatabaseConfigProvider[JdbcProfile] {
  import driver.api._

  private val Postcodes = TableQuery[PostcodeTable]

  def all(): Future[Seq[Postcode]] = db.run(Postcodes.result)

  def insert(postcode: Postcode): Future[Unit] = db.run(Postcodes += postcode).map { _ => () }
}
