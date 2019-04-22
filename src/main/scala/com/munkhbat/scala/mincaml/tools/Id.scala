package com.munkhbat.scala.mincaml.tools

import com.munkhbat.scala.mincaml.`type`.Type

object Id {
  type T = String
  private var counter = 0;

  def id_of_typ(typ: Type.T): String = {
    typ match {
      case Type.Unit() => "u"
      case Type.Bool() => "b"
      case Type.Int() => "i"
      case Type.Float() => "d"
      case Type.Fun(_, _) => "f"
      case Type.Tuple(_) => "t"
      case Type.Array(_) => "a"
      case Type.Var(_) => throw new IllegalArgumentException
    }
  }

  def gentmp(typ: Type.T): T = {
    counter += 1
    val t = "T" + id_of_typ(typ) + counter.toString
    println(t)
    return t
  }
}
