package dao


import scala.concurrent.Future

import javax.inject.Inject
import models.User
import play.api.db.slick.DatabaseConfigProvider
import play.api.db.slick.HasDatabaseConfigProvider
import play.api.libs.concurrent.Execution.Implicits.defaultContext
import slick.driver.JdbcProfile

class UserDAO @Inject()(protected val dbConfigProvider: DatabaseConfigProvider) extends HasDatabaseConfigProvider[JdbcProfile] {
  import driver.api._

  private val users = TableQuery[UserTable]

  def all(): Future[Seq[User]] = db.run(users.result)

  def insert(user: User): Future[Unit] = db.run(users += user).map { _ => () }

  private class UserTable(tag: Tag) extends Table[User](tag, "User") {

    def name = column[String]("NAME", O.PrimaryKey)
    def color = column[String]("COLOR")

    def * = (name, color) <> (User.tupled, User.unapply _)
  }
}