
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/akatchi/Dropbox/Libraries/Playframework/activator-dist-1.3.6/energie_site/conf/routes
// @DATE:Wed Sep 23 20:34:29 CEST 2015


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
