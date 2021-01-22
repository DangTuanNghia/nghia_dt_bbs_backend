
package bbs.port.secondary.databaseMySQL.rdmbsAdapter.post

import bbs.utility.model.Record
import org.joda.time.DateTime

case class PostRecord(
                       postId: Int,
                       title: String,
                       content: String,
                       thumbnail: String,
                       create_by: Int,
                       override val created_at: Option[DateTime],
                       override val updated_at: Option[DateTime],
                     ) extends Record
