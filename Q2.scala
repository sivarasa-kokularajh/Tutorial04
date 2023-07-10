package tutorial
import scala.io.StdIn
object Q2 {
  def main(args: Array[String]): Unit = {
    println(" prime numbers less than  input :")
    print("\t Input:")
    val num = StdIn.readInt
    val Sequence = primeSeq(num)

  }

  def primeSeq(a: Int):Unit={
    if ( a < 2){
      return 0;
    }
    primeSeq(a - 1);
    if( prime(a)){
      print(a + " ");
    }
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
