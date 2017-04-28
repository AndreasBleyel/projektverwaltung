
package views.html.includes

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object navbar_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class navbar extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""
"""),format.raw/*2.1*/("""<nav class="nav navbar-fixed-top">
    Die NavBar
</nav>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object navbar extends navbar_Scope0.navbar
              /*
                  -- GENERATED --
                  DATE: Fri Apr 28 20:05:56 CEST 2017
                  SOURCE: /home/andi/Documents/FH/4Sem/SSW Entwicklung/Projekt/Projektverwaltung/app/views/includes/navbar.scala.html
                  HASH: 71bdbbea6261a245a9f04664f42314d591d3e76b
                  MATRIX: 749->1|845->3|872->4
                  LINES: 27->1|32->1|33->2
                  -- GENERATED --
              */
          