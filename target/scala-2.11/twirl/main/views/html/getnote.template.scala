
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._

/**/
object getnote extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[scala.Tuple2[String, String]],Lang,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(getNoteForm:Form[(String,String)])(implicit lang: Lang):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.58*/("""
"""),_display_(/*3.2*/main("")/*3.10*/{_display_(Seq[Any](format.raw/*3.11*/("""
    """),_display_(/*4.6*/form(routes.Application.showNoteOption)/*4.45*/{_display_(Seq[Any](format.raw/*4.46*/("""
        """),_display_(/*5.10*/inputText(getNoteForm("Title"))),format.raw/*5.41*/("""
        """),_display_(/*6.10*/textarea(field = getNoteForm("Note"),
            'placeholder -> "Any notes you want to add",
            'rows->5,
            'cols->50)),format.raw/*9.23*/("""
        """),format.raw/*10.9*/("""<button type="submit" class="btn-primary">Back</button>
        """)))}),format.raw/*11.10*/("""
    """)))}))}
  }

  def render(getNoteForm:Form[scala.Tuple2[String, String]],lang:Lang): play.twirl.api.HtmlFormat.Appendable = apply(getNoteForm)(lang)

  def f:((Form[scala.Tuple2[String, String]]) => (Lang) => play.twirl.api.HtmlFormat.Appendable) = (getNoteForm) => (lang) => apply(getNoteForm)(lang)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Apr 22 11:57:09 NPT 2016
                  SOURCE: /home/srijesh/dev/projects/notes/app/views/getnote.scala.html
                  HASH: 480721e7d3b83910da305587bbf1a427f66164f5
                  MATRIX: 540->1|699->57|726->76|742->84|780->85|811->91|858->130|896->131|932->141|983->172|1019->182|1178->321|1214->330|1310->395
                  LINES: 19->1|22->1|23->3|23->3|23->3|24->4|24->4|24->4|25->5|25->5|26->6|29->9|30->10|31->11
                  -- GENERATED --
              */
          