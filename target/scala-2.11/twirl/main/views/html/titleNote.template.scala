
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
object titleNote extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[String],Lang,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(noteTitle:Form[(String)])(implicit lang: Lang):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.49*/("""
"""),_display_(/*3.2*/main("")/*3.10*/ {_display_(Seq[Any](format.raw/*3.12*/("""
    """),format.raw/*4.5*/("""<h2> Please provide your Note Title </h2>
    """),_display_(/*5.6*/form(routes.Registrations.getNote)/*5.40*/ {_display_(Seq[Any](format.raw/*5.42*/("""
        """),_display_(/*6.10*/inputText(noteTitle("Title"))),format.raw/*6.39*/("""
    """)))}),format.raw/*7.6*/("""
""")))}),format.raw/*8.2*/("""
"""))}
  }

  def render(noteTitle:Form[String],lang:Lang): play.twirl.api.HtmlFormat.Appendable = apply(noteTitle)(lang)

  def f:((Form[String]) => (Lang) => play.twirl.api.HtmlFormat.Appendable) = (noteTitle) => (lang) => apply(noteTitle)(lang)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Apr 22 11:41:42 NPT 2016
                  SOURCE: /home/srijesh/dev/projects/notes/app/views/titleNote.scala.html
                  HASH: aa522cb339942851eaaf71fadf07e504b028f4db
                  MATRIX: 520->1|670->48|697->67|713->75|752->77|783->82|855->129|897->163|936->165|972->175|1021->204|1056->210|1087->212
                  LINES: 19->1|22->1|23->3|23->3|23->3|24->4|25->5|25->5|25->5|26->6|26->6|27->7|28->8
                  -- GENERATED --
              */
          