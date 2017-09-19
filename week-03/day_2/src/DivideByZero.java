import java.util.Scanner;

public class DivideByZero {

  public static void main(String[] args) {
    // create a function that takes a number
// divides ten with it,
// and prints the result.
// it should print "fail" if the parameter is 0

    Scanner myScanner = new Scanner(System.in);
    int MyNumber = myScanner.nextInt();
    try {
      int result = 10 / MyNumber;
      System.out.println(result);
    } catch (ArithmeticException e) {
      System.out.println("Can't divide by zero!");

    }

  }

}
