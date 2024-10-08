import scala.io.StdIn
object Fibonacci {

  def main(args: Array[String]): Unit = {
    printf("Provide a value:  ")
    val n = StdIn.readInt()
    print(n)
  }

  def print(n: Int): Unit = {
    for (i <- 0 until n) {
      val value = fibonacci(i)
      print(value)
    }
  }

  def fibonacci(n: Int): Int = {
    if (n <= 1)
      n
    else
      fibonacci(n - 1) + fibonacci(n - 2)
  }

}