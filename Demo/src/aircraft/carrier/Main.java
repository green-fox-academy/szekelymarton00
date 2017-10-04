
package aircraft.carrier;

import java.util.Scanner;

public class Main extends Aircraft {


  public static void main(String[] args) {
    System.out.println("Welcome to the Game! \n LET'S PLAY!!!");
    Aircraft player1 = new Aircraft();
    Aircraft player2 = new Aircraft();



    Carrier DeveloperCarrier = new Carrier(500, 5000);
    Carrier Player2Carrier = new Carrier(500, 5000);

    DeveloperCarrier.addAircraft(player1.type);
    Player2Carrier.addAircraft(player2.type);



    DeveloperCarrier.getStatus();
    Player2Carrier.getStatus();



    System.out.println("Player one attacks first! (Guess the Number)");

//    Scanner UserChoice = new Scanner(System.in);
//    System.out.println("Please enter the Maximum range : ");
    int range = 50;
    int number = 1 + (int) (Math.random() * ((range - 1) + 1));
    boolean userGuess = false;

    while (!userGuess) {
      System.out.println("Please enter a number, Lives left: " + DeveloperCarrier.carrierHealth);
      Scanner input = new Scanner(System.in);
      int guess = input.nextInt();
      DeveloperCarrier.fight(Player2Carrier);
//      DeveloperCarrier.carrierHealth -= Player2Carrier.carrierAmmo;
      if (DeveloperCarrier.carrierHealth == 0) {
        System.out.println("Out of lives :( YOU LOSER! \n $$$Insert Coin to Play$$$");
        break;
      }

      if (guess < number) {
        System.out.println("The enemy carrier is further away!");
      } else if (guess > number) {
        System.out.println("The enemy carrier is closer!");
      } else {
        System.out.println("You destroyed the enemy ship!");
        userGuess = true;
      }
    }


  }
}
