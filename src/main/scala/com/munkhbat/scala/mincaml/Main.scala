package com.munkhbat.scala.mincaml

import com.munkhbat.scala.mincaml.parser._
import com.munkhbat.scala.mincaml.`type`.Typing

import scala.io.Source

object Main {
  def main(args: Array[String]): Unit = {
    val src = Source.fromFile("testFiles/sample.ml").mkString
    val ast = new VisitorGeneratorWrapper().generateVisitorJavaWrapper(src)

    import sext._
    println(ast.treeString)

    Typing.infer(ast)
    println(ast.treeString)
  }
}
