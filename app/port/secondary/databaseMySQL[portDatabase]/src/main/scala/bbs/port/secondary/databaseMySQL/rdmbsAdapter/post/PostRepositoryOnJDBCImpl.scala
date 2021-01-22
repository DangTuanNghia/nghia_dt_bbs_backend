
package bbs.port.secondary.databaseMySQL.rdmbsAdapter.post



import bbs.domain.internal.post.model.{Post, PostFields, PostId}
import bbs.port.secondary.databaseMySQL.rdmbsAdapter.BasicWithIdFeatureRepositoryOnJDBC
import domain.src.scala.bbs.domain.internal.post.PostRepository
import scalikejdbc.{SQL, sqls}
import scala.util.Try

class PostRepositoryOnJDBCImpl(override protected[this] val dao: PostDao = new PostDao)
  extends PostRepository with BasicWithIdFeatureRepositoryOnJDBC[PostId, PostFields, Post, Int, PostRecord] {

  override type DAO = PostDao

  override protected def convertToEntity(record: PostRecord): Post = {
    Post(
      identifier = PostId(record.postId),
      title = record.title,
      content = record.content,
      thumbnail = record.thumbnail,
      createBy = record.create_by,
      createdAt = record.created_at,
      updatedAt = record.updated_at
    )
  }

  override protected def convertToRecordId(identifier: PostId): Int = identifier.value

  override def convertToIdentifier(id: Int): PostId = PostId(id)

  override def resolveAllActive(): Try[Seq[Post]] = withDBSession { implicit session =>
    dao.where(sqls.eq(dao.column.isActive, 1)).apply().map(convertToEntity)
  }
}