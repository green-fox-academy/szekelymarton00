import java.util.Scanner;

public class GuessMyNumber {

  public static void main(String[] args) {
    Scanner UserChoice = new Scanner(System.in);
    System.out.println("Please enter the Maximum range : ");
    int range = UserChoice.nextInt();
    int number = 1 + (int) (Math.random() * ((range - 1) + 1));
    boolean userGuess = false;
    int lives = 5;

    while (userGuess == false) {
      System.out.println("Please enter a number, Lives left: " + lives);
      Scanner input = new Scanner(System.in);
      int guess = input.nextInt();
      --lives;
      if (lives == 0) {
        System.out.println("Out of lives :( YOU LOSER! \n $$$Insert Coin to Play$$$");
        break;
      }

      if (guess < number) {
        System.out.println("The stored number is higher. Guess again!");
      } else if (guess > number) {
        System.out.println("The stored number is lower. Guess again!");
      } else {
        System.out.println("You found the number!");
        userGuess = true;
      }
    }
  }
}
