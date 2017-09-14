
// Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4

import java.util.Scanner;

public class ParametricAverage {

  public static void main(String[] args) {
    Scanner NumScore = new Scanner(System.in);
    Scanner Numero = new Scanner(System.in);
    String Num = Numero.next();
    double value = Double.parseDouble(Numero.next());
    double total = 0.0;
    int count = 0;
    while (true) {
      System.out.println("Please enter your Number:");
      double Score = NumScore.nextDouble();
      if (Score < 0) {

      } else if (Num == "done")
        break;

        total += value;
        count++;

        System.out.println("Average is: " + (total / ((count))));
        System.out.println("Sum is: " + total);

    }
  }

  }















    //    Scanner firstNumber = new Scanner(System.in);
//      System.out.println("Please enter the first Number: ");
//    int UserNumber = firstNumber.nextInt();
//    Scanner secondNumber = new Scanner(System.in);
//      System.out.println("Please enter the second Number: ");
//    int UserNumber2 = secondNumber.nextInt();
//    Scanner thirdNumber = new Scanner(System.in);
//      System.out.println("Please enter the third Number: ");
//    int UserNumber3 = firstNumber.nextInt();
//    Scanner fourthNumber = new Scanner(System.in);
//      System.out.println("Please enter the fourth Number: ");
//    int UserNumber4 = firstNumber.nextInt();
//
//    int sum = UserNumber + UserNumber2 + UserNumber3 + UserNumber4;
//    double average = UserNumber + UserNumber2 + UserNumber3 + UserNumber4 / 4;



