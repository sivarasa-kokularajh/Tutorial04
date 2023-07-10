package tutorial
import scala.io.StdIn

object Q3 {
  def main(args: Array[String]): Unit = {
    print("Enter a number:")
    val N = StdIn.readInt
    println("Addition numbers from 1 to N:" + sum(1, N))
  }

  def sum(n: Int, a: Int): Int = {
    if (a >= n) {
      n + sum(n + 1, a);
    }
    else {
      return 0;
    }
  }
}
