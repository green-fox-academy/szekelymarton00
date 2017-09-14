
// Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was


import java.util.Scanner;

public class DrawPyramid {

  public static void main(String[] args) {
    Scanner Pyr = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int stars = Pyr.nextInt();
    for (int i = 0; i < stars; i++) {
      for (int j = 0; j < stars - i; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k <= i; k++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

}



