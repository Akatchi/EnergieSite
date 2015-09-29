
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/wahidnory/Development/School/EnergieSite/EnergieSite/conf/routes
// @DATE:Tue Sep 29 08:26:45 CEST 2015


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
