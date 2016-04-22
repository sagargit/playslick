
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
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[String,Html,Html,Html,Lang,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String,moreScripts: Html = Html(""),moreStyles:Html = Html(""))(content: Html)(implicit lang: Lang):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.109*/("""
"""),_display_(/*2.2*/common/*2.8*/.header(title,moreStyles)),format.raw/*2.33*/("""
	"""),format.raw/*3.2*/("""<div>
		"""),_display_(/*4.4*/content),format.raw/*4.11*/("""
	"""),format.raw/*5.2*/("""</div>
"""),_display_(/*6.2*/common/*6.8*/.footer(moreScripts)),format.raw/*6.28*/("""
"""))}
  }

  def render(title:String,moreScripts:Html,moreStyles:Html,content:Html,lang:Lang): play.twirl.api.HtmlFormat.Appendable = apply(title,moreScripts,moreStyles)(content)(lang)

  def f:((String,Html,Html) => (Html) => (Lang) => play.twirl.api.HtmlFormat.Appendable) = (title,moreScripts,moreStyles) => (content) => (lang) => apply(title,moreScripts,moreStyles)(content)(lang)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Apr 19 16:56:57 NPT 2016
                  SOURCE: /home/srijesh/dev/projects/notes/app/views/main.scala.html
                  HASH: 1b58bd3cfa2dce6080c4f9b78f273bed4bf1ebda
                  MATRIX: 524->1|720->108|747->110|760->116|805->141|833->143|867->152|894->159|922->161|955->169|968->175|1008->195
                  LINES: 19->1|22->1|23->2|23->2|23->2|24->3|25->4|25->4|26->5|27->6|27->6|27->6
                  -- GENERATED --
              */
          