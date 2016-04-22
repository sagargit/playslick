
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
object footer extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Html,Lang,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.3*/(moreScripts: Html = Html(""))(implicit lang: Lang):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.54*/("""
 """),format.raw/*2.2*/("""<footer class="footer">
 	<div class="row">
          <div class="col-lg-12">
            <ul class="list-unstyled">
              <li class="pull-right"><a href="#top">"""),_display_(/*6.54*/Messages("back.to.top.label")),format.raw/*6.83*/("""</a></li>
              <li><a href="#">RSSS</a></li>
              <li><a href="#">Twitter</a></li>
              <li><a href="#">Facebook</a></li>
            </ul>
          </div>
        </div>
 	<script src=""""),_display_(/*13.17*/routes/*13.23*/.Assets.at("javascripts/jquery-1.10.2.min.js")),format.raw/*13.69*/("""" /></script>
 	<script src=""""),_display_(/*14.17*/routes/*14.23*/.Assets.at("javascripts/bootstrap.min.js")),format.raw/*14.65*/("""" type="text/javascript"></script>
 	<script src=""""),_display_(/*15.17*/routes/*15.23*/.Assets.at("javascripts/owl.carousel.min.js")),format.raw/*15.68*/("""" /></script>
 	<script type="text/javascript">
 	$(document).ready(function() """),format.raw/*17.32*/("""{"""),format.raw/*17.33*/("""
  		"""),format.raw/*18.5*/("""$("#owl-example").owlCarousel();
	"""),format.raw/*19.2*/("""}"""),format.raw/*19.3*/(""");
 	</script>
 </footer>
 </div>
 </body>
"""))}
  }

  def render(moreScripts:Html,lang:Lang): play.twirl.api.HtmlFormat.Appendable = apply(moreScripts)(lang)

  def f:((Html) => (Lang) => play.twirl.api.HtmlFormat.Appendable) = (moreScripts) => (lang) => apply(moreScripts)(lang)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Apr 19 16:56:57 NPT 2016
                  SOURCE: /home/srijesh/dev/projects/notes/app/views/common/footer.scala.html
                  HASH: 3b26a1c69a5aa809cd0c5673025bf030d3c21e64
                  MATRIX: 516->2|655->53|683->55|879->225|928->254|1170->469|1185->475|1252->521|1309->551|1324->557|1387->599|1465->650|1480->656|1546->701|1653->780|1682->781|1714->786|1775->820|1803->821
                  LINES: 19->1|22->1|23->2|27->6|27->6|34->13|34->13|34->13|35->14|35->14|35->14|36->15|36->15|36->15|38->17|38->17|39->18|40->19|40->19
                  -- GENERATED --
              */
          