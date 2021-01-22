package bbs.port.primary.webService.restAdapter.dto.post

import bbs.domain.internal.post.model.Post

case class PostJson(
    postId: Option[Int],
    title: String,
    content: String,
    thumbnail: String,
    create_by: Int,
    createdAt: Option[String],
    updatedAt: Option[String])

object PostResponse {

  def apply(posts: Seq[Post]): Seq[PostJson] = posts.map(PostResponse(_))

  def apply(post: Post): PostJson = PostJson(
    postId = Some(post.identifier.value),
    title = post.title,
    content = post.content,
    thumbnail = post.thumbnail,
    create_by = post.createBy,
    createdAt = post.created_at.map(_.toString("dd-MM-yyyy")),
    updatedAt = post.updated_at.map(_.toString("dd-MM-yyyy")))
}
