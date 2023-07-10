package tutorial
import scala.io.StdIn

object Q5 { def main(args: Array[String]): Unit = {
  print("Enter a number:")
  val P = StdIn.readInt
  println("all even numbers less than given input:" + sum(P))

}

  def sum(n: Int): Int = n match {
    case n if n <= 0 => return 0;
    case n if n % 2 == 0 => n + sum(n - 2);
    case _ => sum(n - 1);
  }
}
