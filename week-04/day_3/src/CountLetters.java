import java.util.HashMap;
import java.util.Map;

public class CountLetters {
//  Write a function, that takes a string as an argument and returns a dictionary with all letters in the string as keys,
// and numbers as values that shows how many occurrences there are.
//  Create a test for that.


  public Map<Character, Integer> count(String dic) {
//    dic = "dictionary";
    char[] charArray = dic.toCharArray();

    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    for (int i = 0; i < dic.length(); i++) {
      char c = dic.charAt(i);
      Integer val = map.get(new Character(c));
      if (val != null) {
        map.put(c, new Integer(val + 1));
      } else {
        map.put(c, 1);
      }
    }
    System.out.println(map);
    return map;
  }

  public static void main(String[] args) {
    CountLetters text = new CountLetters();
        text.count("ajajajajaj");
  }

}
