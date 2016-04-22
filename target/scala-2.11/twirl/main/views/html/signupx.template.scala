
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
object signupx extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Lang,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String)(implicit lang: Lang):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.40*/("""

"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
"""),format.raw/*4.1*/("""<div class="page-header">
<div class="row">
          <div class="col-lg-8 col-md-7 col-sm-6">
            <h1>"""),_display_(/*7.18*/Messages("signup.label")),format.raw/*7.42*/("""</h1>
          </div>
          <div class="col-lg-4 col-md-5 col-sm-6">
            <div class="sponsor">
            </div>
          </div>
        </div>
        </div>
        <div class="row">
        <div class="col-lg-6">
	<form class="form-horizontal">
  <fieldset>
    <div class="form-group">
      <label for="inputEmail" class="col-lg-2 control-label">"""),_display_(/*20.63*/Messages("email.label")),format.raw/*20.86*/("""</label>
      <div class="col-lg-10">
        <input type="text" class="form-control" id="inputEmail" placeholder=""""),_display_(/*22.79*/Messages("email.placeholder")),format.raw/*22.108*/("""" >
      </div>
    </div>
    <div class="form-group">
      <label for="inputPassword" class="col-lg-2 control-label">"""),_display_(/*26.66*/Messages("password.placeholder")),format.raw/*26.98*/("""</label>
      <div class="col-lg-10">
        <input type="password" class="form-control" id="inputPassword" placeholder=""""),_display_(/*28.86*/Messages("password.placeholder")),format.raw/*28.118*/("""" >
      </div>
    </div>
    <div class="form-group">
      <label for="textArea" class="col-lg-2 control-label">"""),_display_(/*32.61*/Messages("feedback.label")),format.raw/*32.87*/("""</label>
      <div class="col-lg-10">
        <textarea class="form-control" rows="3" id="textArea"></textarea>
        <span class="help-block">"""),_display_(/*35.35*/Messages("feedback.help")),format.raw/*35.60*/("""</span>
      </div>
    </div>
    <div class="form-group">
      <label class="col-lg-2 control-label">"""),_display_(/*39.46*/Messages("gender.label")),format.raw/*39.70*/("""</label>
      <div class="col-lg-10">
        <div class="radio">
          <label>
            <input type="radio" name="optionsRadios" id="optionsRadios1" value="option1" checked="">
            """),_display_(/*44.14*/Messages("gender.label.male")),format.raw/*44.43*/("""
          """),format.raw/*45.11*/("""</label>
        </div>
        <div class="radio">
          <label>
            <input type="radio" name="optionsRadios" id="optionsRadios2" value="option2">
            """),_display_(/*50.14*/Messages("gender.label.female")),format.raw/*50.45*/("""
          """),format.raw/*51.11*/("""</label>
        </div>
        <div class="checkbox">
          <label>
            <input type="checkbox"> """),_display_(/*55.38*/Messages("news.subscription.text")),format.raw/*55.72*/("""
          """),format.raw/*56.11*/("""</label>
        </div>
      </div>
    </div>
    <div class="form-group">
      <div class="col-lg-10 col-lg-offset-2">
        <button type="reset" class="btn btn-default">"""),_display_(/*62.55*/Messages("form.cancel.label")),format.raw/*62.84*/("""</button>
        <button type="submit" class="btn btn-primary">"""),_display_(/*63.56*/Messages("form.submit.label")),format.raw/*63.85*/("""</button>
      </div>
    </div>
  </fieldset>
</form>
</div>
</div>
""")))}),format.raw/*70.2*/("""
"""))}
  }

  def render(message:String,lang:Lang): play.twirl.api.HtmlFormat.Appendable = apply(message)(lang)

  def f:((String) => (Lang) => play.twirl.api.HtmlFormat.Appendable) = (message) => (lang) => apply(message)(lang)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Apr 19 16:56:57 NPT 2016
                  SOURCE: /home/srijesh/dev/projects/notes/app/views/signupx.scala.html
                  HASH: 3d3eeb901a80afa964f195bac759f11b508a3353
                  MATRIX: 512->1|638->39|666->42|697->65|736->67|763->68|901->180|945->204|1339->571|1383->594|1527->711|1578->740|1727->862|1780->894|1931->1018|1985->1050|2129->1167|2176->1193|2350->1340|2396->1365|2529->1471|2574->1495|2800->1694|2850->1723|2889->1734|3089->1907|3141->1938|3180->1949|3317->2059|3372->2093|3411->2104|3615->2281|3665->2310|3757->2375|3807->2404|3908->2475
                  LINES: 19->1|22->1|24->3|24->3|24->3|25->4|28->7|28->7|41->20|41->20|43->22|43->22|47->26|47->26|49->28|49->28|53->32|53->32|56->35|56->35|60->39|60->39|65->44|65->44|66->45|71->50|71->50|72->51|76->55|76->55|77->56|83->62|83->62|84->63|84->63|91->70
                  -- GENERATED --
              */
          