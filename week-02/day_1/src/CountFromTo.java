// Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5


import java.util.Scanner;

public class CountFromTo {

  public static void main(String[] args) {
    Scanner UserNumber1 = new Scanner(System.in);
    System.out.println("Please enter the first number: ");
    int FirstNumber = UserNumber1.nextInt();
    Scanner UserNumber2 = new Scanner(System.in);
    System.out.println("Please enter the second number: ");
    int SecondNumber = UserNumber2.nextInt();
    if (SecondNumber < FirstNumber){
      System.out.println("The second number should be bigger");
    } else {
      for (int i = FirstNumber; i < SecondNumber; i++) {
        System.out.println(i);
      } {

      }
    }
  }

}
