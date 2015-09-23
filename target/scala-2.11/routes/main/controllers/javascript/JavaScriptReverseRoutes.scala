
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/akatchi/Dropbox/Libraries/Playframework/activator-dist-1.3.6/energie_site/conf/routes
// @DATE:Wed Sep 23 20:34:29 CEST 2015

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:14
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def insertDog: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.insertDog",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "insert/dog"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:9
    def insertCat: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.insertCat",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "insert/cat"})
        }
      """
    )
  
  }


}