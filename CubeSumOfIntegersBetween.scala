
/***********************************************
  *
  * Write a function that sums all integers
  * between two given inputs
  *
  * Author: Ram Sever
  *
  **********************************************/
object CubeSumOfIntegersBetween {
  def main(args : Array[String]){

    val a = 10 // First integer
    val b = 20 // second Integer

    /** ********************************
      *
      * function: Cubic Sum between two
      *           integers
      *
      * a      - First integer
      * b      - Second integer
      * return - the integer sum of of integers
      *          between a and b
      *
      **********************************/


    def cubic_sum_between(a:Int,b:Int):Int = {
      // Simple cubic metric
      def cube(x:Int):Int = {
        return x*x*x
      }
      // The sum implementation uses tail recursion
      def loop(a: Int, b: Int, s: Int,p : Int): Int = {
        if (a >= b) s else loop(a + 1, b, s + cube(p),p+1)
      }
      loop(a,b,0,0)
    }
    println("sum of integers between %d and %d is %d".format(a,b,cubic_sum_between(a,b)))

  }
}