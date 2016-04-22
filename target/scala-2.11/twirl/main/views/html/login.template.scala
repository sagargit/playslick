
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
object login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[scala.Tuple2[String, String]],Lang,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[(String,String)])(implicit lang: Lang):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.57*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("")/*5.10*/{_display_(Seq[Any](format.raw/*5.11*/("""
	"""),format.raw/*6.2*/("""<h2> Login </h2>
    """),_display_(/*7.6*/form(routes.Registrations.loginUser())/*7.44*/{_display_(Seq[Any](format.raw/*7.45*/("""
    """),_display_(/*8.6*/inputText(loginForm("email"))),format.raw/*8.35*/("""
    """),_display_(/*9.6*/inputText(loginForm("password"))),format.raw/*9.38*/("""
    """),format.raw/*10.5*/("""<button type="submit" class="btn-primary">Login</button>
 """)))}),format.raw/*11.3*/("""
""")))}))}
  }

  def render(loginForm:Form[scala.Tuple2[String, String]],lang:Lang): play.twirl.api.HtmlFormat.Appendable = apply(loginForm)(lang)

  def f:((Form[scala.Tuple2[String, String]]) => (Lang) => play.twirl.api.HtmlFormat.Appendable) = (loginForm) => (lang) => apply(loginForm)(lang)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Apr 19 16:56:57 NPT 2016
                  SOURCE: /home/srijesh/dev/projects/notes/app/views/login.scala.html
                  HASH: eb0f19b4252f9ff39a355da34d66bc054534d9b2
                  MATRIX: 538->1|696->56|724->75|751->77|767->85|805->86|833->88|880->110|926->148|964->149|995->155|1044->184|1075->190|1127->222|1159->227|1248->286
                  LINES: 19->1|22->1|24->4|25->5|25->5|25->5|26->6|27->7|27->7|27->7|28->8|28->8|29->9|29->9|30->10|31->11
                  -- GENERATED --
              */
          