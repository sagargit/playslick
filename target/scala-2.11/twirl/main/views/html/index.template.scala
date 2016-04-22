
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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Lang,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String)(implicit lang: Lang):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.40*/("""

"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
"""),format.raw/*4.1*/("""<div class="page-header">
<div class="jumbotron">
  <h1>"""),_display_(/*6.8*/Messages("app.name")),format.raw/*6.28*/("""</h1>
  <p>"""),_display_(/*7.7*/Messages("home.jumbo.desc")),format.raw/*7.34*/("""</p>
  <p data-toggle="modal" data-target="#learnMoreId"><a  class="btn btn-primary btn-lg">"""),_display_(/*8.89*/Messages("home.jumbo.button.label")),format.raw/*8.124*/("""</a></p>
</div>
<div class="row">
          <div class="col-lg-12 col-md-12 col-sm-12">
            <p class="lead">"""),_display_(/*12.30*/Messages("home.heading")),format.raw/*12.54*/("""</p>
            <p class="lead">"""),_display_(/*13.30*/Messages("home.body")),format.raw/*13.51*/("""</p>
          </div>
<!--           <div class="col-lg-4 col-md-5 col-sm-6">
            <div class="sponsor">
            </div>
          </div> -->
        </div>
        </div>

  <div class="modal fade" id="learnMoreId" aria-labelledby="learnMoreId" aria-hidden="true" tabindex="-1">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
        <h4 class="modal-title">"""),_display_(/*27.34*/Messages("home.modal.title")),format.raw/*27.62*/("""</h4>
      </div>
      <div class="modal-body">
        <p>"""),_display_(/*30.13*/Messages("home.modal.desc")),format.raw/*30.40*/("""</p>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">"""),_display_(/*33.77*/Messages("home.modal.close.label")),format.raw/*33.111*/("""</button>
      </div>
    </div>
  </div>
</div>
""")))}),format.raw/*38.2*/("""
"""))}
  }

  def render(message:String,lang:Lang): play.twirl.api.HtmlFormat.Appendable = apply(message)(lang)

  def f:((String) => (Lang) => play.twirl.api.HtmlFormat.Appendable) = (message) => (lang) => apply(message)(lang)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Apr 19 16:56:57 NPT 2016
                  SOURCE: /home/srijesh/dev/projects/notes/app/views/index.scala.html
                  HASH: 634696630976aea7dbb892bced3c554c433785a9
                  MATRIX: 510->1|636->39|664->42|695->65|734->67|761->68|843->125|883->145|920->157|967->184|1086->277|1142->312|1286->429|1331->453|1392->487|1434->508|1973->1020|2022->1048|2111->1110|2159->1137|2313->1264|2369->1298|2450->1349
                  LINES: 19->1|22->1|24->3|24->3|24->3|25->4|27->6|27->6|28->7|28->7|29->8|29->8|33->12|33->12|34->13|34->13|48->27|48->27|51->30|51->30|54->33|54->33|59->38
                  -- GENERATED --
              */
          