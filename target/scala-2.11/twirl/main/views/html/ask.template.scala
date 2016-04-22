
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
object ask extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Form[String],String,Lang,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(askForm:Form[(String)],userId:String="")(implicit lang:Lang):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.63*/("""
"""),_display_(/*3.2*/main("")/*3.10*/{_display_(Seq[Any](format.raw/*3.11*/("""
	"""),format.raw/*4.2*/("""<h2>Please Select your Option </h2>
	<div class ="btn-group">
	"""),_display_(/*6.3*/form(routes.Registrations.getNote)/*6.37*/{_display_(Seq[Any](format.raw/*6.38*/("""
	"""),format.raw/*7.2*/("""<button type="submit" class="btn btn-primary btn-lg">Get Note</button>
	""")))}),format.raw/*8.3*/("""
	"""),format.raw/*9.2*/("""</div>

	<div class ="btn-group">
    """),_display_(/*12.6*/form(routes.Application.showNoteOption)/*12.45*/{_display_(Seq[Any](format.raw/*12.46*/("""
	"""),format.raw/*13.2*/("""<button type="submit" class="btn btn-primary btn-lg">Save Note</button>
	""")))}),format.raw/*14.3*/("""
	"""),format.raw/*15.2*/("""</div>

	<div class ="btn-group">
	"""),_display_(/*18.3*/form(routes.Application.signOut)/*18.35*/{_display_(Seq[Any](format.raw/*18.36*/("""
	"""),format.raw/*19.2*/("""<button type="submit" class="btn btn-primary btn-lg">Logout</button>
	""")))}),format.raw/*20.3*/("""
	"""),format.raw/*21.2*/("""</div>

""")))}))}
  }

  def render(askForm:Form[String],userId:String,lang:Lang): play.twirl.api.HtmlFormat.Appendable = apply(askForm,userId)(lang)

  def f:((Form[String],String) => (Lang) => play.twirl.api.HtmlFormat.Appendable) = (askForm,userId) => (lang) => apply(askForm,userId)(lang)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Apr 22 12:23:27 NPT 2016
                  SOURCE: /home/srijesh/dev/projects/notes/app/views/ask.scala.html
                  HASH: c017065202777ce1c546ec3d795a4fb05bf525c7
                  MATRIX: 521->1|685->62|712->81|728->89|766->90|794->92|883->156|925->190|963->191|991->193|1093->266|1121->268|1186->307|1234->346|1273->347|1302->349|1406->423|1435->425|1497->461|1538->493|1577->494|1606->496|1707->567|1736->569
                  LINES: 19->1|22->1|23->3|23->3|23->3|24->4|26->6|26->6|26->6|27->7|28->8|29->9|32->12|32->12|32->12|33->13|34->14|35->15|38->18|38->18|38->18|39->19|40->20|41->21
                  -- GENERATED --
              */
          