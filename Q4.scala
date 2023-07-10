package tutorial
import scala.io.StdIn

object Q4 { def main(args: Array[String]): Unit = {
  print("Enter a number:")
  val M = StdIn.readInt
  println("Check  number is even:" + isEven(M))
}

  def isEven(i: Int): Boolean = i match {
    case 0 => true;
    case _ => isOdd(i - 1);
  }

  def isOdd(i: Int): Boolean = {
    !isEven(i);
  }
}
