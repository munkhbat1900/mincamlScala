package com.munkhbat.scala.mincaml.ast

import com.munkhbat.scala.mincaml.`type`.Type
import com.munkhbat.scala.mincaml.tools.Id

object Ast {
  sealed trait Exp
  case class MUnit() extends Exp
  case class MBool(b: Boolean) extends Exp
  case class MInt(n: Int) extends Exp
  case class MFloat(e: Float) extends Exp
  case class MNot(e: Exp) extends Exp
  case class MNeg(e: Exp) extends Exp
  case class MAdd(e1: Exp, e2: Exp) extends Exp
  case class MSub(e1: Exp, e2: Exp) extends Exp
  case class MFNeg(e: Exp) extends Exp
  case class MFAdd(e1: Exp, e2: Exp) extends Exp
  case class MFSub(e1: Exp, e2: Exp) extends Exp
  case class MFMul(e1: Exp, e2: Exp) extends Exp
  case class MFDiv(e1: Exp, e2: Exp) extends Exp
  case class MEq(e1: Exp, e2: Exp) extends Exp
  case class MLE(e1: Exp, e2: Exp) extends Exp
  case class MIf(e1: Exp, e2: Exp, e3: Exp) extends Exp
  case class MLet(e1: (Id.T, Type.T), e2: Exp, e3: Exp) extends Exp
  case class MVar(e: String) extends Exp
  case class MLetRec(e1: MFunDef, e2: Exp) extends Exp
  case class MApp(e1: Exp, e2: List[Exp]) extends Exp
  case class MTuple(e: List[Exp]) extends Exp
  case class MLetTuple(e1: List[(Id.T, Type.T)], e2:Exp, e3: Exp)
  case class MArray(e1: Exp, e2: Exp) extends Exp
  case class MGet(e1: Exp, e2: Exp) extends Exp
  case class MPut(e1: Exp, e2: Exp, e3: Exp) extends Exp
  case class MFunDef(name: (Id.T, Type.T), args : List[(Id.T, Type.T)], body : Exp)
}
