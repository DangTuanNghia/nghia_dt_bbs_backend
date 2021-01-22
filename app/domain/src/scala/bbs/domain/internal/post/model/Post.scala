
package bbs.domain.internal.post.model

import bbs.utility.model.Entity
import org.joda.time.DateTime

trait Post extends Entity[PostId] with PostFields

object Post {
  def apply(
    identifier: PostId,
    title: String,
    content: String,
    thumbnail: String,
    createBy: Int,
    createdAt: Option[DateTime],
    updatedAt: Option[DateTime]): Post = PostImpl(
    identifier,
    title,
    content,
    thumbnail,
    createBy,
    createdAt,
    updatedAt
  )
  def unapply(agr: Post): Option[Nothing] = None
}
