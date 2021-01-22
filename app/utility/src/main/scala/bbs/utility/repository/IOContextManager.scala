package utility.src.main.scala.bbs.utility.repository

import bbs.utility.repository.IOContext

trait IOContextManager {
  def context: IOContext
  def transactionalContext[T](execution: (IOContext) => T): T
}

trait ReadOnlyIOContextManager {
  def context: ReadOnlyIOContext
  def transactionalContext[T](execution: (ReadOnlyIOContext) => T): T
}

