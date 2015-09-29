package repositories

import javax.inject.Inject

import models.{GebruikersTable, Gebruiker}
import play.api.db.slick.{HasDatabaseConfigProvider, DatabaseConfigProvider}
import slick.driver.JdbcProfile
import play.api.libs.concurrent.Execution.Implicits.defaultContext
import scala.concurrent.Future

class GebruikerRepository @Inject()(protected val dbConfigProvider: DatabaseConfigProvider) extends HasDatabaseConfigProvider[JdbcProfile] {

  import driver.api._

  private val Gebruikers = TableQuery[GebruikersTable]

  def all(): Future[Seq[Gebruiker]] = db.run(Gebruikers.result)

  def insert(gebruiker: Gebruiker): Future[Unit] = db.run(Gebruikers += gebruiker).map { _ => () }

  def findByEmail(email: String): Future[Gebruiker] = db.run(Gebruikers.filter(_.email === email).result.head)


}