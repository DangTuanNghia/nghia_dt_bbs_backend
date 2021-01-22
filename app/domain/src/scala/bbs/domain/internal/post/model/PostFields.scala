
package bbs.domain.internal.post.model

import bbs.utility.model.Fields
import org.joda.time.DateTime

trait PostFields extends Fields {
  val title: String
  val content: String
  val thumbnail: String
  val createBy: Int
  val createdAt: Option[DateTime]
  val updatedAt: Option[DateTime]
}
