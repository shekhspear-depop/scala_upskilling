package example

object Main extends App {
  val ages = Seq(42,75,29,64)
  println(s"The oldesht pesrson is ${ages.max}")

  def cube(x: Int) = {
    x*x*x
  }

}
