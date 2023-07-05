object Q2 {
  def main(args: Array[String]): Unit = {
    println("Enter a number : ")
    val input = scala.io.StdIn.readLine().toInt

    input match {
      case n if n < 0 => println("input is Negative")
      case n if n == 0 => println("input is zero")
      case n if n % 2 == 0 => println("Even number ")
      case n if n % 2 == 1 => println("Odd number ")
    }
  }
}
