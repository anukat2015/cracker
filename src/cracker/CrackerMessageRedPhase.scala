package cracker

@serializable
class CrackerTreeMessageRedPhase (val first : Option[CrackerTreeMessageIdentification], val second : Option[CrackerTreeMessageTree]) extends CrackerMessageSize
{
	def getMessageSize = first.getOrElse(CrackerTreeMessageIdentification.empty).getMessageSize + second.getOrElse(CrackerTreeMessageTree.empty).getMessageSize 
}

object CrackerTreeMessageRedPhase
{
	def apply(first : CrackerTreeMessageIdentification) = new CrackerTreeMessageRedPhase(Option.apply(first), Option.empty)
	def apply(second : CrackerTreeMessageTree) = new CrackerTreeMessageRedPhase(Option.empty, Option.apply(second))
}