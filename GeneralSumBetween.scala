
/***********************************************
  *
  * Write a function that sums all integers
  * between two given inputs, after running
  * a kernel operator on each one of them
  * The kernel operator can be either:
  * 1. Identity x => x
  * 2. Power two x => x^2
  * 3. Cubic square x => x^2
  *
  * Author: Ram Sever
  *
  **********************************************/


object GeneralSumBetween {
  def main(args : Array[String]){

    val a = 10 // First integer
    val b = 20 // second Integer

    def id(a:Int):Int = a
    def cubic(a:Int):Int = a*a
    def cube(a:Int):Int = a*a*a

    /**************************************************************
      *
      * function: General Sum between Two
      *           integers
      *
      * a      - First integer
      * b      - Second integer
      * return - the integer sum of all integers between a and b
      *          using the a given operator: func to be activated
      *          on each element in the sum
      *
      **************************************************************/


    def sum_between(a:Int,b:Int,f:Int=>Int):Int = {
      // The sum implementation uses tail recursion
      def loop(a: Int, b: Int, s: Int,p : Int): Int = {
        if (a >= b) s else loop(a + 1, b, s + f(p),p+1)
      }
      loop(a,b,0,0)
    }
    println("id sum of integers between %d and %d is %d".format(a,b,sum_between(a,b,id)))
    println("sqr sum of integers between %d and %d is %d".format(a,b,sum_between(a,b,cubic)))
    println("cubic sum of integers between %d and %d is %d".format(a,b,sum_between(a,b,cube)))

  }
}