import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        int number = 8;
        boolean userGuess = false;

        while(userGuess == false) {
            System.out.println("Please enter a number: ");
            Scanner input = new Scanner(System.in);
            int guess = input.nextInt();

            if (guess < number) {
                System.out.println("The stored number is higher. Guess again!");
            } else if(guess > number) {
                System.out.println("The stored number is lower. Guess again!");
            } else {
                System.out.println("You found the number: 8");
                userGuess = true;
            }
        }
    }
}