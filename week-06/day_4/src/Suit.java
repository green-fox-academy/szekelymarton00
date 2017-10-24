import java.util.Arrays;
import java.util.List;
import java.util.Random;

public enum Suit {

  CLUBS,
  DIAMONDS,
  HEARTS,
  SPADES;


  private static final  List<Suit> VALUES = (Arrays.asList(values()));
  private static final int SIZE = VALUES.size();
  private static final Random RANDOM = new Random();

  public static Suit randomSuit() {
    return VALUES.get(RANDOM.nextInt(SIZE));
  }
}