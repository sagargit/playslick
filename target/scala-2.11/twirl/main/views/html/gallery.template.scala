
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
object gallery extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Lang,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String)(implicit lang: Lang):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.40*/("""

"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
"""),format.raw/*4.1*/("""<div class="page-header">
<div class="row">
          <div class="col-lg-8 col-md-7 col-sm-6">
            <h1>"""),_display_(/*7.18*/Messages("gallery.label")),format.raw/*7.43*/("""</h1>
          </div>
          <div class="col-lg-4 col-md-5 col-sm-6">
            </div>
          </div>
        </div>
        </div>
        <div class="row">
          <div class="col-lg-12">
            <div id="owl-example" class="owl-carousel">
              <div>
                <img src=""""),_display_(/*18.28*/routes/*18.34*/.Assets.at(Messages("gallery.image.one"))),format.raw/*18.75*/("""" alt=""""),_display_(/*18.83*/lang/*18.87*/.language),format.raw/*18.96*/(""""/>
              </div>
            </div>
          </div>
        </div>
""")))}),format.raw/*23.2*/("""
"""))}
  }

  def render(message:String,lang:Lang): play.twirl.api.HtmlFormat.Appendable = apply(message)(lang)

  def f:((String) => (Lang) => play.twirl.api.HtmlFormat.Appendable) = (message) => (lang) => apply(message)(lang)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Apr 19 16:56:57 NPT 2016
                  SOURCE: /home/srijesh/dev/projects/notes/app/views/gallery.scala.html
                  HASH: 167623558def67c2a0e6189e4c3099977a95b71e
                  MATRIX: 512->1|638->39|666->42|697->65|736->67|763->68|901->180|946->205|1276->508|1291->514|1353->555|1388->563|1401->567|1431->576|1538->653
                  LINES: 19->1|22->1|24->3|24->3|24->3|25->4|28->7|28->7|39->18|39->18|39->18|39->18|39->18|39->18|44->23
                  -- GENERATED --
              */
          