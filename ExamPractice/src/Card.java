public class Card {
  private String color;
  private String value;

  public Card(String value, String color) {
    this.color = color;
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public String getColor() {
    return color;
  }
}
