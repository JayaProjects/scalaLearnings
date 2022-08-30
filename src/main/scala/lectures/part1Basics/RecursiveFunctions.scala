package lectures.part1Basics


object RecursiveFunctions extends App {

  //string concade, factorial,fibonacci, prime functions

  def concate(s:String,n: Int) : String ={
    if (n==1) s
    else (s+concate(s,n-1))
  }
  println(concate("jay",4))

  def prime(n:Int) : Boolean ={
    def primeUntil(t: Int): Boolean ={
      //      println(t)
      if(t <=1) true
      else n%t !=0 && primeUntil(t-1)
    }
    primeUntil(n/2)
  }
  println(prime(13))

  def factorial(n: Int): BigInt ={
    if (n<=0) 1
    else n * factorial(n-1)
  }
  println(factorial(100))

  def fib(n:Int) : Int = {
    if (n<=2)  1
    else fib(n-1) + fib(n-2)
  }
  println("final fib number is " + fib(3))
}



