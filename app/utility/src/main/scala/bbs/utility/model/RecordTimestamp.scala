
package bbs.utility.model

import org.joda.time.DateTime

trait RecordTimestamp {
  val created_at: Option[DateTime] = None
  val updated_at: Option[DateTime] = None
}
