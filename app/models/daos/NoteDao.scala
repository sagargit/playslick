package models.daos


import models.{Note}
import models.projections.{Projection}
import models.projections.Projection.NoteProjection
import org.joda.time.DateTime
import play.api.Play.current
import play.api.db.slick.Config.driver.simple._
import play.api.db.slick.DB


object NoteDao {

	def store(o: Note): Long = {
    DB.withSession { implicit session =>
      Projection.slickNote returning Projection.slickNote.map(_.id) += (o.id, o.userId, o.noteTitle, o.note)
    }
  }


/*  def getId() :Option[Note] ={
    DB.withSession{
      implicit session =>
      val result = Projection.slickNote.list
      val listOfNotes:List[Note] = result.map{
        tuple =>
          Note(id=tuple._1, userId = tuple._2, noteTitle = tuple._3, note = tuple._4 )
      }
        Some(listOfNotes.head)
    }
  }*/


}