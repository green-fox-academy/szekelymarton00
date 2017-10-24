import java.util.Objects;
import java.util.Scanner;

public class Game {

  public static void main(String[] args) {

    Scanner myScanner = new Scanner(System.in);
    Deck mydeck = new Deck();
    int opponentScore = generateOpponentsScore();
    boolean gameState = true;

    while (gameState) {
      System.out.println("Your sum is: " + mydeck.getCardSum() + ". Draw another? (yes/no)");
      System.out.println(opponentScore);
      String userInput = myScanner.next();
      if (userInput.equals("yes")) {
        mydeck.pullRandom();
        int in = mydeck.pullRandom().getCardRank().getRank();
        mydeck.setCardSum(in + mydeck.getCardSum());
      } else if (userInput.equals("no")) {
        gameState = false;
      } else if (!Objects.equals(userInput, "no") || !Objects.equals(userInput, "yes")) {
        System.out.println("Excuse me Sir, are you drunk?");
        break;
      }
      {
        if (mydeck.getCardSum() > 21) {
          gameState = false;

        }
      }
    }

    if (opponentScore > mydeck.getCardSum() || mydeck.getCardSum() > 21) {
      System.out.println("You lost!");
    } else {
      System.out.println("You won!");
    }

  }

  public static int generateOpponentsScore() {
    return (int) (15 + Math.random() * 21 - 15);
  }
}