object Q1 {
    def calInterest(depositAmount: Double): Double = {
    
      if (depositAmount <= 20000)
        depositAmount * 0.02
      else if (depositAmount <= 200000)
        depositAmount * 0.04
      else if (depositAmount <= 2000000)
        depositAmount * 0.035
      else
        depositAmount * 0.065
  }

    def main(args: Array[String]): Unit = {

    println(calInterest(10000))
    println(calInterest(100000))
    println(calInterest(1000000))
    println(calInterest(10000000))
  }

}
