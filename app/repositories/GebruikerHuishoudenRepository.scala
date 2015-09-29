package repositories

import javax.inject.Inject
import scala.concurrent.Future
import models.{GebruikerHuishoudensTable, GebruikerHuishouden}
import play.api.libs.concurrent.Execution.Implicits.defaultContext
import play.api.db.slick.{HasDatabaseConfigProvider, DatabaseConfigProvider}
import slick.driver.JdbcProfile

class GebruikerHuishoudenRepository @Inject()(protected val dbConfigProvider: DatabaseConfigProvider) extends HasDatabaseConfigProvider[JdbcProfile] {

  import driver.api._

  private val GebruikerHuishoudens = TableQuery[GebruikerHuishoudensTable]

  def all(): Future[Seq[GebruikerHuishouden]] = db.run(GebruikerHuishoudens.result)

  def insert(gebruiker_huishouden: GebruikerHuishouden): Future[Unit] = db.run(GebruikerHuishoudens += gebruiker_huishouden).map { _ => () }
}