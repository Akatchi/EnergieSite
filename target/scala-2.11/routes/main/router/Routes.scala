
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/akatchi/Dropbox/Libraries/Playframework/activator-dist-1.3.6/energie_site/conf/routes
// @DATE:Wed Sep 23 20:34:29 CEST 2015

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_1: controllers.Application,
  // @LINE:14
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_1: controllers.Application,
    // @LINE:14
    Assets_0: controllers.Assets
  ) = this(errorHandler, Application_1, Assets_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """insert/cat""", """controllers.Application.insertCat"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """insert/dog""", """controllers.Application.insertDog"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_1.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Application_insertCat1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("insert/cat")))
  )
  private[this] lazy val controllers_Application_insertCat1_invoker = createInvoker(
    Application_1.insertCat,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "insertCat",
      Nil,
      "POST",
      """ Home page""",
      this.prefix + """insert/cat"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Application_insertDog2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("insert/dog")))
  )
  private[this] lazy val controllers_Application_insertDog2_invoker = createInvoker(
    Application_1.insertDog,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "insertDog",
      Nil,
      "POST",
      """""",
      this.prefix + """insert/dog"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Assets_at3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at3_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_1.index)
      }
  
    // @LINE:9
    case controllers_Application_insertCat1_route(params) =>
      call { 
        controllers_Application_insertCat1_invoker.call(Application_1.insertCat)
      }
  
    // @LINE:10
    case controllers_Application_insertDog2_route(params) =>
      call { 
        controllers_Application_insertDog2_invoker.call(Application_1.insertDog)
      }
  
    // @LINE:14
    case controllers_Assets_at3_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at3_invoker.call(Assets_0.at(path, file))
      }
  }
}