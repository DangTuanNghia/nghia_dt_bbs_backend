
package bbs.domain.internal.post.model

import org.joda.time.DateTime

case class PostImpl(
    identifier: PostId = PostId(0),
    title: String,
    content: String,
    thumbnail: String,
    createBy: Int,
    override val createdAt: Option[DateTime],
    override val updatedAt: Option[DateTime]) extends Post {

}
