
package views.html.common

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
object header extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,Html,Lang,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title:String,moreStyles: Html = Html(""))(implicit lang: Lang):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.65*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang=""""),_display_(/*4.14*/lang/*4.18*/.language),format.raw/*4.27*/("""">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <meta property="og:description" content="">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*11.50*/routes/*11.56*/.Assets.at("stylesheets/bootstrap.flatly.css")),format.raw/*11.102*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*12.50*/routes/*12.56*/.Assets.at("stylesheets/bootswatch.flatly.min.css")),format.raw/*12.107*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*13.50*/routes/*13.56*/.Assets.at("stylesheets/owl.carousel.css")),format.raw/*13.98*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*14.50*/routes/*14.56*/.Assets.at("stylesheets/owl.theme.css")),format.raw/*14.95*/("""">
    """),_display_(/*15.6*/moreStyles),format.raw/*15.16*/("""
    """),format.raw/*16.5*/("""<title></title>
</head>
<header>
<div class="navbar navbar-default navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <a href=""""),_display_(/*22.21*/routes/*22.27*/.Application.index),format.raw/*22.45*/("""" class="navbar-brand">"""),_display_(/*22.69*/Messages("app.name")),format.raw/*22.89*/("""</a>
          <button class="navbar-toggle" type="button" data-toggle="collapse" data-target="#navbar-main">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
        </div>
        <div class="navbar-collapse collapse" id="navbar-main">
          <ul class="nav navbar-nav">
            <li>
              <a href=""""),_display_(/*32.25*/routes/*32.31*/.Application.signUp),format.raw/*32.50*/("""">"""),_display_(/*32.53*/Messages("signup.label")),format.raw/*32.77*/("""</a>
            </li>
              <li>
              <a href=""""),_display_(/*35.25*/routes/*35.31*/.Application.signIn),format.raw/*35.50*/("""">"""),_display_(/*35.53*/Messages("login.label")),format.raw/*35.76*/("""</a>
            </li>
            <li>
              <a href=""""),_display_(/*38.25*/routes/*38.31*/.Application.gallery),format.raw/*38.51*/("""">"""),_display_(/*38.54*/Messages("gallery.label")),format.raw/*38.79*/("""</a>
            </li>
            <li>
              <a href=""""),_display_(/*41.25*/routes/*41.31*/.Application.aboutUs),format.raw/*41.51*/("""">"""),_display_(/*41.54*/Messages("about.us.label")),format.raw/*41.80*/("""</a>
            </li>
          </ul>
          <ul class="nav navbar-nav navbar-right">
            <li class="dropdown">
              <a class="dropdown-toggle" data-toggle="dropdown" href="#" id="themes">"""),_display_(/*46.87*/Messages("change.language.label")),format.raw/*46.120*/("""<span class="caret"></span></a>
              <ul class="dropdown-menu" aria-labelledby="themes">
                <li><a href=""""),_display_(/*48.31*/routes/*48.37*/.Application.changeToEnglish),format.raw/*48.65*/("""">English</a></li>
                <li class="divider"></li>
                <li><a href=""""),_display_(/*50.31*/routes/*50.37*/.Application.changeToSpanish),format.raw/*50.65*/("""">Spanish</a></li>
              </ul>
            </li>
          </ul>

        </div>
      </div>
    </div>
</header>
<body>
<div class="container">"""))}
  }

  def render(title:String,moreStyles:Html,lang:Lang): play.twirl.api.HtmlFormat.Appendable = apply(title,moreStyles)(lang)

  def f:((String,Html) => (Lang) => play.twirl.api.HtmlFormat.Appendable) = (title,moreStyles) => (lang) => apply(title,moreStyles)(lang)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Apr 19 16:56:57 NPT 2016
                  SOURCE: /home/srijesh/dev/projects/notes/app/views/common/header.scala.html
                  HASH: a7dd75e49c99c4c01850f8c35513e2010a0ccbf3
                  MATRIX: 523->1|674->64|702->66|757->95|769->99|798->108|1126->409|1141->415|1209->461|1288->513|1303->519|1376->570|1455->622|1470->628|1533->670|1612->722|1627->728|1687->767|1721->775|1752->785|1784->790|1983->962|1998->968|2037->986|2088->1010|2129->1030|2573->1447|2588->1453|2628->1472|2658->1475|2703->1499|2796->1565|2811->1571|2851->1590|2881->1593|2925->1616|3016->1680|3031->1686|3072->1706|3102->1709|3148->1734|3239->1798|3254->1804|3295->1824|3325->1827|3372->1853|3609->2063|3664->2096|3819->2224|3834->2230|3883->2258|4001->2349|4016->2355|4065->2383
                  LINES: 19->1|22->1|24->3|25->4|25->4|25->4|32->11|32->11|32->11|33->12|33->12|33->12|34->13|34->13|34->13|35->14|35->14|35->14|36->15|36->15|37->16|43->22|43->22|43->22|43->22|43->22|53->32|53->32|53->32|53->32|53->32|56->35|56->35|56->35|56->35|56->35|59->38|59->38|59->38|59->38|59->38|62->41|62->41|62->41|62->41|62->41|67->46|67->46|69->48|69->48|69->48|71->50|71->50|71->50
                  -- GENERATED --
              */
          