public class Card {

  private Suit suit;
  private Color color;
  private Rank cardRank;

  public Card() {
    this.suit = Suit.randomSuit();
    this.cardRank = Rank.randomRank();
    if (this.suit.equals(Suit.DIAMONDS) || this.suit.equals(Suit.HEARTS)) {
      this.color = Color.RED;
    } else {
      this.color = Color.BLACK;
    }
  }

  public Rank getCardRank() {
    return cardRank;
  }
  public Color getCardColor() {
    return color;
  }
  public Suit getCardSuit() {
    return suit;
  }

}
