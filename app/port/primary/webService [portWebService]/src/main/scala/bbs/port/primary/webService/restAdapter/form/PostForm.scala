//
//package bbs.port.primary.webService.restAdapter.form
//import bbs.domain.internal.post.model.{ Post, PostId }
//import org.joda.time.DateTime
//import play.api.data.Form
//import play.api.data.Forms._
//
//object PostForm {
//  val datetimeMapping =
//    nonEmptyText.transform(DateTime.parse, (date: DateTime) => date.toString("yyyy-MM-dd"))
//  val idMapping =
//    optional(number).transform((id: Option[Int]) => PostId(id.getOrElse(0)), (id: PostId) => Some(id.value))
//
//  val form = Form(
//    mapping(
//      "postId" -> idMapping,
//      "title" -> nonEmptyText,
//      "content" -> nonEmptyText,
//      "thumbnail" -> nonEmptyText,
//      "create_by" -> number,
//      "create_at" -> optional(datetimeMapping),
//      "update_at" -> optional(datetimeMapping))(Post.apply)(Post.unapply))
//}
