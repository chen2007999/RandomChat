
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/apple/Desktop/RandChat/conf/routes
// @DATE:Tue Jun 30 19:23:22 CST 2015


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
