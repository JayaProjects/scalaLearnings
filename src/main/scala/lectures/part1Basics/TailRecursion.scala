package lectures.part1Basics

import scala.annotation.tailrec

object TailRecursion extends App {

  def factorial (n:Int): BigInt = {
    @tailrec
    def anotherFact(x: BigInt,  accum: BigInt): BigInt ={
      if (x<=1) accum
      else anotherFact(x-1, x*accum)
    }
    anotherFact(n,1)
  }
  println(factorial(5000))

  def prime(n:Int) : Boolean ={
    @tailrec
    def primeUntil(t: Int, isStillPrime:Boolean): Boolean ={
      if(!isStillPrime) false
      else if(t <=1) true
      else primeUntil(t-1, n%t !=0 && isStillPrime)
    }
    primeUntil(n/2,true)
  }
  println(prime(13))
  println(prime(26))

  def fib(n:Int):Int ={
    def fibTail (i: Int,last:Int,nextToLast:Int ):Int ={
      if(i>=n) last
      else fibTail(i+1,last+nextToLast, last)
    }
    if (n<=2) 1
    else fibTail(2,1,1)
  }
  println(fib(8))

}

