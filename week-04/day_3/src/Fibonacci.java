public class Fibonacci {

  //  Write a function that computes a member of the fibonacci sequence by a given index
//  Create tests that covers all types of input (like in the previous workshop exercise)


  public int fibonaccicount(int n) {

    return (n <= 1) ? n : fibonaccicount(n - 1) + fibonaccicount(n - 2);
  }
}
