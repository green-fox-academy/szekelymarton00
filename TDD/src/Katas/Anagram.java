package Katas;

import java.util.Collections;

public class Anagram {

  public boolean anagram(String s1, String s2) {
    StringBuilder sb1 = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb1.append(s1);
    sb2.append(s2);
    sbToOrder(sb1);
    sbToOrder(sb2);

    if (s1.equals(s2)) {
      return true;
    } else if (sb1.toString().equals(sb2.toString())) {
      return true;
    }
    return false;
  }

  private void sbToOrder(StringBuilder sb) {
    for (int i = 0; i < sb.length() - 1; i++) {
      for (int j = 0; j < sb.length() - i - 1; j++) {
        if (sb.charAt(j) > sb.charAt(j + 1)) {
          char c;
          c = sb.charAt(j);
          sb.setCharAt(j, sb.charAt(j + 1));
          sb.setCharAt(j + 1, c);
        }
      }
    }
  }

}
