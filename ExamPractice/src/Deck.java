import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
  private List<Card> cardList;
  private List<Card> drawnCardList;
  private static final String[] COLORS = {"Diamonds", "Hearts", "Spades", "Clubs"};
  private static final String[] VALUES = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

  public Deck(int number) {
    this.cardList = new ArrayList<>();
    this.drawnCardList = new ArrayList<>();
    if (number > 4)
      for (String color : COLORS) {
        for (String values : VALUES) {
          cardList.add(new Card(values, color));
        }
      }
    Collections.shuffle(cardList);
  }

//  public int sumOfDiamonds() {
//    int sumOfDiamonds = 0;
//    for (int i = 0; i < cardList.size(); i++) {
//      if (cardList.get(i).getColor().equals(COLORS[0])) {
//        sumOfDiamonds++;
//      }
//    }
//    return sumOfDiamonds;
//  }

  public Card draw() {
    Card drawnCard = cardList.remove(0);
    drawnCardList.add(drawnCard);
    return drawnCard;
  }

  public List<Card> getCardList() {
    return cardList;
  }

  public static String[] getCOLORS() {
    return COLORS;
  }

  public static String[] getVALUES() {
    return VALUES;
  }
  @Override
  public void toString
}




