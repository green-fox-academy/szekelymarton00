package Katas;

import java.util.HashMap;
import java.util.Map;

public class NumberConverter {

  public String numberConverter(int number) {

    Map map = new HashMap<Integer, String>();
    StringBuilder sb = new StringBuilder();
    int remaining = number;

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

    for (int i = 1; i < map.size(); i++) {
      if (remaining >= i) {
        sb.append(map.get(i).toString());
        number -= i;
      }
    }
    return sb.toString();
  }
}
