/***************************************
  *
  * Implementing Netwon's Method for ROOT
  * SQRT calculation
  *
  ****************************************/

object NewtonsMethodForSquareApproximation {
  def main(args: Array[String]) {

    // Define a function for Absolute value
    def double_abs(x: Double): Double = if (x < 0) (-x) else x
    // Define the SQRT function using Netwon 's method
    def my_sqrt(x: Double, guess: Double): Double = {
      // Error calculation
      val err = double_abs(x - guess * guess)
      // Termination criteria plus recurcise calculation
      if (err < 0.00001) guess
      else my_sqrt(x, 0.5 * (x / guess + guess))
    }

    // Test value
    val x = 2.0
    // Print
    println("The sqrt of %f is equal to %f".format(x, my_sqrt(x, 1.0)))
  }
}

