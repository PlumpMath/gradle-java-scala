package me.breidenbach.main

import me.breidenbach.submodule.{SubModuleOne, SubModuleTwo}

/**
  * @author Kevin Breidenbach
  *         Date: 1/20/17
  */
object MainScala extends App {

  val mainJava = new SubModuleOne()
  val mainScala = SubModuleTwo()

  println("In Scala with...")
  mainJava.print()
  mainScala.print()
}
