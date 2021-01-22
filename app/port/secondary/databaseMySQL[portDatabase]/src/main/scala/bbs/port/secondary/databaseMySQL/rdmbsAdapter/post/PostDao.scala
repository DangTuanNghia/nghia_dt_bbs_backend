
package bbs.port.secondary.databaseMySQL.rdmbsAdapter.post

import bbs.domain.internal.post.model.{ PostFields, PostId }
import bbs.port.secondary.databaseMySQL.rdmbsAdapter.CRUDMapperWithId
import scalikejdbc._

private[post] class PostDao extends CRUDMapperWithId[Int, PostFields, PostRecord] {

  override lazy val tableName = "posts"
  override lazy val defaultAlias = createAlias("post")
  override lazy val primaryKeyFieldName = "postId"

  override def columnNames: Seq[String] = Seq(
    "postId",
    "title",
    "content",
    "thumbnail",
    "create_by",
    "created_at",
    "updated_at"
  )

  override def toNamedValues(record: PostRecord): Seq[(Symbol, Any)] = Seq(
    Symbol("postId") -> record.postId,
    Symbol("title") -> record.title,
    Symbol("content") -> record.content,
    Symbol("thumbnail") -> record.thumbnail,
    Symbol("created_by") -> record.create_by,
    Symbol("created_at") -> record.created_at,
    Symbol("updated_at") -> record.updated_at,

  )

  override def extract(rs: WrappedResultSet, n: scalikejdbc.ResultName[PostRecord]): PostRecord = {
    PostRecord(
      postId = rs.get(n.postId),
      title = rs.get(n.title),
      content = rs.get(n.content),
      thumbnail = rs.get(n.thumbnail),
      create_by = rs.get(n.create_by),
      created_at = rs.get(n.created_at),
      updated_at = rs.get(n.updated_at)
    )
  }

  override def idToRawValue(id: Int): Int = id

  override def rawValueToId(value: Any): Int = value.asInstanceOf[Int]

}
