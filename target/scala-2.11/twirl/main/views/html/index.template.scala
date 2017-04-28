
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("Willkommen zur Projektverwaltung")/*3.42*/ {_display_(Seq[Any](format.raw/*3.44*/("""
    """),format.raw/*4.5*/("""<div class="row text-center">
        <div class="col-md-4 col-md-offset-4">
            <h1>Willkommen zur Projektverwaltung</h1>
        </div>
    </div>

""")))}),format.raw/*10.2*/("""
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
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Fri Apr 28 20:04:29 CEST 2017
                  SOURCE: /home/andi/Documents/FH/4Sem/SSW Entwicklung/Projekt/Projektverwaltung/app/views/index.scala.html
                  HASH: c75a85d3b91af2ce0a59472da0eadd24d14f3135
                  MATRIX: 738->1|834->3|862->6|910->46|949->48|980->53|1169->212
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|41->10
                  -- GENERATED --
              */
          