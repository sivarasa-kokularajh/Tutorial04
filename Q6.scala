package tutorial
import scala.io.StdIn

object Q6 { def main(args: Array[String]): Unit = {
  println("First n fibbonacci numbers for given n:")
  print("\t Input:")
  val F= StdIn.readInt

}

  def Fibonacci(i: Int): Int = i match {
    case 0 => 0;
    case i if (i == 1) => 1;
    case _ => Fibonacci(i - 1) + Fibonacci(i - 2);
  }

  def FibonaciSeq(a: Int): Unit = {
    if (a > 0) {
      FibonaciSeq(a - 1);
    }
    print(Fibonacci(a) + " ");

  }


}
