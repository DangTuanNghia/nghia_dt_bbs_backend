package bbs.port.primary.webService.restAdapter.controller.post



import application.src.main.scala.bookManagement.application.feature.service.post.PostService
import bbs.port.primary.webService.restAdapter.controller.APIController
import bbs.port.primary.webService.restAdapter.dto.post.PostResponse
import com.google.inject.Inject
//import javax.inject.Inject
import play.api.mvc.{Action, AnyContent, ControllerComponents}

class Controller @Inject() (cc: ControllerComponents, postService: PostService)
  extends APIController(cc) {

  def list: Action[AnyContent] = Action {
    success(PostResponse(postService.getAll().get))
  }

}
