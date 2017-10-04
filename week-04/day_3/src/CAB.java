import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CAB {
//  Create a class what is capable of playing exactly one game of Cows and Bulls (CAB). The player
//  have to guess a 4 digit number. For every digit that the player guessed correctly in the correct
//  place, they have a “cow”. For every digit the player guessed correctly in the wrong place is a “bull.”
//
//  The CAB object should have a random 4 digit number, which is the goal to guess.
//  The CAB object should have a state where the game state is stored (playing, finished).
//  The CAB object should have a counter where it counts the guesses.
//  The CAB object should have a guess method, which returns a string of the guess result
//  All methods, including constructor should be tested


  public CAB() {

  }

  public static void main(String[] args) {
    int a = (int) Math.random() * 10;
    int b = (int) Math.random() * 10;
    int c = (int) Math.random() * 10;
    int d = (int) Math.random() * 10;
    ArrayList<Integer> number = new ArrayList(Arrays.asList(a, b, c, d));
    boolean userGuess = false;

    while (userGuess == false) {
      System.out.println("Please enter a number: ");
      Scanner input = new Scanner(System.in);
      int guess = input.nextInt();

      if (number.contains(guess) && number.get(guess) == number.indexOf(guess)) {
        System.out.println("Cow at " + number.indexOf(guess));
      } else if (number.contains(guess) && number.get(guess) != number.indexOf(guess)) {
        System.out.println("Bull at " + number.indexOf(guess));
      } else {
        System.out.println("You found the number");
        userGuess = true;
      }
    }
  }

}
