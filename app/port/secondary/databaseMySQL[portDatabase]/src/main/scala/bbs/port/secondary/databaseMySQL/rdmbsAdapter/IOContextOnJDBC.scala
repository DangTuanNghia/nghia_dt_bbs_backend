
package bbs.port.secondary.databaseMySQL.rdmbsAdapter

import bbs.utility.repository.IOContext
import scalikejdbc.DBSession

case class IOContextOnJDBC(session: DBSession) extends IOContext
