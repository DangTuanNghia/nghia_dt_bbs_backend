package bookManagement.port.secondary.databaseMySQL.rdmbsAdapter.common

import scalikejdbc._

class IOContextManagerOnJDBC extends IOContextManager {

  private val database = 'default

  def context: IOContext = IOContextOnJDBC(AutoSession)

  def transactionalContext[T](execution: (IOContext) => T): T = {
    NamedDB(database) localTx { session =>
      execution(IOContextOnJDBC(session))
    }
  }
}
