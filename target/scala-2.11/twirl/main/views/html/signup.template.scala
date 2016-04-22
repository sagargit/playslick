
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
object signup extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[scala.Tuple4[String, String, String, String]],Lang,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(signUpForm: Form[(String,String,String,String)])(implicit lang: Lang):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.72*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("")/*5.10*/{_display_(Seq[Any](format.raw/*5.11*/("""
	"""),format.raw/*6.2*/("""<h2> Sign Up </h2>
    """),_display_(/*7.6*/form(routes.Registrations.saveUser())/*7.43*/{_display_(Seq[Any](format.raw/*7.44*/("""
    """),_display_(/*8.6*/inputText(signUpForm("firstName"))),format.raw/*8.40*/("""
    """),_display_(/*9.6*/inputText(signUpForm("lastName"))),format.raw/*9.39*/("""
    """),_display_(/*10.6*/inputText(signUpForm("email"))),format.raw/*10.36*/("""
    """),_display_(/*11.6*/inputText(signUpForm("password"))),format.raw/*11.39*/("""
    """),format.raw/*12.5*/("""<button type="submit" class="btn-primary">Sign Up</button>
 """)))}),format.raw/*13.3*/("""
""")))}))}
  }

  def render(signUpForm:Form[scala.Tuple4[String, String, String, String]],lang:Lang): play.twirl.api.HtmlFormat.Appendable = apply(signUpForm)(lang)

  def f:((Form[scala.Tuple4[String, String, String, String]]) => (Lang) => play.twirl.api.HtmlFormat.Appendable) = (signUpForm) => (lang) => apply(signUpForm)(lang)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Apr 19 16:56:57 NPT 2016
                  SOURCE: /home/srijesh/dev/projects/notes/app/views/signup.scala.html
                  HASH: a413844c35d56cee69c2fe262f9e75f9bce99fe5
                  MATRIX: 555->1|728->71|756->90|783->92|799->100|837->101|865->103|914->127|959->164|997->165|1028->171|1082->205|1113->211|1166->244|1198->250|1249->280|1281->286|1335->319|1367->324|1458->385
                  LINES: 19->1|22->1|24->4|25->5|25->5|25->5|26->6|27->7|27->7|27->7|28->8|28->8|29->9|29->9|30->10|30->10|31->11|31->11|32->12|33->13
                  -- GENERATED --
              */
          