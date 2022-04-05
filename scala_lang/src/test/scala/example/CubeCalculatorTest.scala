package example

import org.scalatest.FunSuite

class CubeCalculatorTest extends FunSuite{

  test("CubeCalculator.cube of 3"){
    assert(Main.cube(3) === 27)
  }

  test("CubeCalculator.cube of 0"){
    assert(Main.cube(0) === 0)
  }

}
