package me.breidenbach.submodule

import org.scalatest.FunSuite
import org.hamcrest.MatcherAssert._
import org.hamcrest.Matchers._

/**
  * @author Kevin Breidenbach
  *         Date: 1/20/17
  */
class SubModuleTwo$Test extends FunSuite {
  test("sub module two") {
    val subModuleTwo = SubModuleTwo()

    assertThat(subModuleTwo, is(notNullValue()))
  }
}
