package tutorial
import scala.io.StdIn

object Q1 {
  def main(args: Array[String]): Unit = {
    print("Enter  number:");
    var value = StdIn.readInt();
    println("input prime?" + prime(value));

  }

  def GCD(no1: Int, no2: Int): Int = no2 match {
    case no2 if no2 == 0 => no1
    case no2 if (no2 > no1) => GCD(no2, no1)
    case _ => GCD(no2, no1 % no2)
  }

  def prime(n: Int, a: Int = 2): Boolean = n match {
    case n if (n == a) => true;
    case n if (GCD(n, a) > 1) => false;
    case _ => prime(n, a + 1);

  }
}
