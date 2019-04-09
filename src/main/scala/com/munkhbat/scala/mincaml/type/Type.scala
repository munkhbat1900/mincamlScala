package com.munkhbat.scala.mincaml.`type`


object Type {
  trait T
  case class Unit() extends T
  case class Bool() extends T
  case class Int() extends T
  case class Float() extends T
  case class Fun(args: List[T], ret: T) extends T
  case class Tuple(elems: List[T]) extends T
  case class Array(el: T) extends T
  case class Var(var a: Option[T]) extends T

  def gentyp(): T = {
    Var(None)
  }
}
