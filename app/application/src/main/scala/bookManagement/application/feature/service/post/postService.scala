package application.src.main.scala.bookManagement.application.feature.service.post

import bbs.domain.internal.post.model.Post
import com.google.inject.{Inject, Singleton}
import domain.src.scala.bbs.domain.internal.post.PostRepository

import scala.util.Try

@Singleton
class PostService @Inject() (postRepository: PostRepository) {

  def getAll(): Try[Seq[Post]]  = postRepository.resolveAllActive()

}