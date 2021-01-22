
package bbs.port.secondary.databaseMySQL.rdmbsAdapter

import scalikejdbc._
import scalikejdbc.interpolation.SQLSyntax
import skinny.orm.{SkinnyMapperBase, SkinnyNoIdCRUDMapper}
trait CRUDMapperNoId[ObjectFields, Entity] extends CRUDMapper[ObjectFields, Entity] with SkinnyNoIdCRUDMapper[Entity] {

}

