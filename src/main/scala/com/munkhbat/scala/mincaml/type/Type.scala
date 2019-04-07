package com.munkhbat.scala.mincaml.`type`


object Type {
  trait T
  case class Var(var a: Option[T]) extends T
  def gentyp(): T = {
    Var(None)
  }
}
