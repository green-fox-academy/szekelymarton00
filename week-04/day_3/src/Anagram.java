import java.util.Arrays;

public class Anagram {

  //  Write a function, that takes two strings and returns a boolean value based on if the two strings are Anagramms or not.
//  Create a test for that.

  public boolean isAnagram(String word1, String word2) {

    char[] wordone = word1.replaceAll("[\\s]", "").toCharArray();
    char[] wordtwo = word2.replaceAll("[\\s]", "").toCharArray();
    Arrays.sort(wordone);
    Arrays.sort(wordtwo);
    return Arrays.equals(wordone, wordtwo);

  }
}
