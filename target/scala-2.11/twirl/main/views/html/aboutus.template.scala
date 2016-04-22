
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
object aboutus extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Lang,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String)(implicit lang: Lang):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.40*/("""

"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
"""),format.raw/*4.1*/("""<div class="page-header">
<div class="row">
          <div class="col-lg-8 col-md-7 col-sm-6">
            <h1>"""),_display_(/*7.18*/Messages("about.us.label")),format.raw/*7.44*/("""</h1>
            <p class="lead">"""),_display_(/*8.30*/Messages("about.us.heading")),format.raw/*8.58*/("""</p>
            <p class="lead">"""),_display_(/*9.30*/Messages("about.us.body")),format.raw/*9.55*/("""</p>
          </div>
          <div class="col-lg-4 col-md-5 col-sm-6">
            <div class="sponsor">
            </div>
          </div>
        </div>
        </div>
""")))}),format.raw/*17.2*/("""
"""))}
  }

  def render(message:String,lang:Lang): play.twirl.api.HtmlFormat.Appendable = apply(message)(lang)

  def f:((String) => (Lang) => play.twirl.api.HtmlFormat.Appendable) = (message) => (lang) => apply(message)(lang)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Apr 19 16:56:57 NPT 2016
                  SOURCE: /home/srijesh/dev/projects/notes/app/views/aboutus.scala.html
                  HASH: 2c30ff084d2e51a0a2ef8d61afe2f42964fa931b
                  MATRIX: 512->1|638->39|666->42|697->65|736->67|763->68|901->180|947->206|1008->241|1056->269|1116->303|1161->328|1365->502
                  LINES: 19->1|22->1|24->3|24->3|24->3|25->4|28->7|28->7|29->8|29->8|30->9|30->9|38->17
                  -- GENERATED --
              */
          