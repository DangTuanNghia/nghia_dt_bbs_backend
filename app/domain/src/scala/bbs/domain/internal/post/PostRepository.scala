
package domain.src.scala.bbs.domain.internal.post

import bbs.domain.internal.post.model.{Post, PostFields, PostId}
import bbs.utility.repository.FeatureWithIdFieldRepository

import scala.util.Try

trait PostRepository extends FeatureWithIdFieldRepository[PostId, PostFields, Post]{
  def resolveAllActive(): Try[Seq[Post]]
}
