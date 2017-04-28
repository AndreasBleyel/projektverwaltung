
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/andi/Documents/FH/4Sem/SSW Entwicklung/Projekt/Projektverwaltung/conf/routes
// @DATE:Fri Apr 28 19:55:20 CEST 2017


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
