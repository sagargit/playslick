
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
object note extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[scala.Tuple2[String, String]],Lang,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(note:Form[(String,String)])(implicit lang:Lang):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.50*/("""
"""),_display_(/*3.2*/main("")/*3.10*/{_display_(Seq[Any](format.raw/*3.11*/("""
	"""),format.raw/*4.2*/("""<h2> Please submit your note </h2>
	"""),_display_(/*5.3*/form(routes.Registrations.saveNote)/*5.38*/{_display_(Seq[Any](format.raw/*5.39*/("""
	"""),_display_(/*6.3*/inputText(note("Title"))),format.raw/*6.27*/("""
    """),_display_(/*7.6*/textarea(field = note("Note"),
        'placeholder -> "Any notes you want to add",
        'rows->5,
        'cols->50)),format.raw/*10.19*/("""
  """),format.raw/*11.3*/("""<button type="submit" class="btn-primary">Submit</button>          
 """)))}),format.raw/*12.3*/("""
""")))}))}
  }

  def render(note:Form[scala.Tuple2[String, String]],lang:Lang): play.twirl.api.HtmlFormat.Appendable = apply(note)(lang)

  def f:((Form[scala.Tuple2[String, String]]) => (Lang) => play.twirl.api.HtmlFormat.Appendable) = (note) => (lang) => apply(note)(lang)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Apr 21 15:49:19 NPT 2016
                  SOURCE: /home/srijesh/dev/projects/notes/app/views/note.scala.html
                  HASH: baf3fc401beba572bf507168815f8d66e9fd9890
                  MATRIX: 537->1|688->49|715->68|731->76|769->77|797->79|859->116|902->151|940->152|968->155|1012->179|1043->185|1184->305|1214->308|1314->378
                  LINES: 19->1|22->1|23->3|23->3|23->3|24->4|25->5|25->5|25->5|26->6|26->6|27->7|30->10|31->11|32->12
                  -- GENERATED --
              */
          