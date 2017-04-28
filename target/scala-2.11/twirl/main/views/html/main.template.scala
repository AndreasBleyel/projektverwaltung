
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
* This template is called from the `index` template. This template
* handles the rendering of the page header and body tags. It takes
* two arguments, a `String` for the title of the page and an `Html`
* object to insert into the body of the page.
*/
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*12.62*/("""
        """),format.raw/*13.9*/("""<title>"""),_display_(/*13.17*/title),format.raw/*13.22*/("""</title>
        <link rel="stylesheet" href=""""),_display_(/*14.39*/routes/*14.45*/.Assets.versioned("bootstrap/css/bootstrap.css")),format.raw/*14.93*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*15.54*/routes/*15.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*15.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*16.59*/routes/*16.65*/.Assets.versioned("images/favicon.png")),format.raw/*16.104*/("""">
    </head>
    <body>
        """),format.raw/*20.31*/("""

        """),_display_(/*22.10*/includes/*22.18*/.navbar()),format.raw/*22.27*/("""

        """),_display_(/*24.10*/content),format.raw/*24.17*/("""

        """),_display_(/*26.10*/includes/*26.18*/.footer()),format.raw/*26.27*/("""

        """),format.raw/*28.9*/("""<script src=""""),_display_(/*28.23*/routes/*28.29*/.Assets.versioned("javascripts/jquery-3.2.1.min.js")),format.raw/*28.81*/("""" type="text/javascript"></script>

        <script src=""""),_display_(/*30.23*/routes/*30.29*/.Assets.versioned("bootstrap/bootstrap.js")),format.raw/*30.72*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*31.23*/routes/*31.29*/.Assets.versioned("javascripts/main.js")),format.raw/*31.69*/("""" type="text/javascript"></script>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/*
* This template is called from the `index` template. This template
* handles the rendering of the page header and body tags. It takes
* two arguments, a `String` for the title of the page and an `Html`
* object to insert into the body of the page.
*/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Fri Apr 28 20:05:56 CEST 2017
                  SOURCE: /home/andi/Documents/FH/4Sem/SSW Entwicklung/Projekt/Projektverwaltung/app/views/main.scala.html
                  HASH: 9b5aaff4ccc35f4b9eecdfc6f8dd9f7e865a0f75
                  MATRIX: 997->255|1122->285|1150->287|1230->392|1266->401|1301->409|1327->414|1401->461|1416->467|1485->515|1568->571|1583->577|1646->618|1734->679|1749->685|1810->724|1872->847|1910->858|1927->866|1957->875|1995->886|2023->893|2061->904|2078->912|2108->921|2145->931|2186->945|2201->951|2274->1003|2359->1061|2374->1067|2438->1110|2522->1167|2537->1173|2598->1213
                  LINES: 32->7|37->7|39->9|42->12|43->13|43->13|43->13|44->14|44->14|44->14|45->15|45->15|45->15|46->16|46->16|46->16|49->20|51->22|51->22|51->22|53->24|53->24|55->26|55->26|55->26|57->28|57->28|57->28|57->28|59->30|59->30|59->30|60->31|60->31|60->31
                  -- GENERATED --
              */
          