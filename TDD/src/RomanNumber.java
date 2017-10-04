import java.util.TreeMap;

public class RomanNumber {

  private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

  static {


    map.put(100, "hundred");
    map.put(90, "ninety");
    map.put(80, "eighty");
    map.put(70, "seventy");
    map.put(60, "sixty");
    map.put(50, "fifty");
    map.put(40, "forty");
    map.put(30, "thirty");
    map.put(20, "twenty");
    map.put(19, "nineteen");
    map.put(18, "eighteen");
    map.put(17, "seventeen");
    map.put(16, "sixteen");
    map.put(15, "fifteen");
    map.put(14, "fourteen");
    map.put(13, "thirteen");
    map.put(12, "twelve");
    map.put(11, "eleven");
    map.put(10, "ten");
    map.put(9, "nine");
    map.put(8, "eight");
    map.put(7, "seven");
    map.put(6, "six");
    map.put(5, "five");
    map.put(4, "four");
    map.put(3, "three");
    map.put(2, "two");
    map.put(1, "one");

  }

  public final static String toRoman(int number) {
    int l = map.floorKey(number);
    if (number == l) {
      return map.get(number);
    }
    return map.get(l) + toRoman(number - l);
  }

  public static void main(String[] args) {

    for (int i = 1; i <= 100; i++) {
      System.out.println(i + "\t =\t " + RomanNumber.toRoman(i));
    }
    System.out.println(RomanNumber.toRoman(1995));


  }

}