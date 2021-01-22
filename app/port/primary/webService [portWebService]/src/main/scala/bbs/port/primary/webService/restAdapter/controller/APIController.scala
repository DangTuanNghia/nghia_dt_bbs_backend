package bbs.port.primary.webService.restAdapter.controller

import bbs.port.primary.webService.restAdapter.dto.APIResult
import org.json4s.DefaultFormats
import org.json4s.jackson.Serialization.write
import play.api.mvc.{ AbstractController, ControllerComponents, Result }

abstract class APIController(cc: ControllerComponents) extends AbstractController(cc) {

  implicit val formats = DefaultFormats

  protected def success[T](result: T): Result =
    Ok(write(APIResult.toSuccessJson(result)))
}
