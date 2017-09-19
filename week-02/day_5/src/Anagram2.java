import java.util.Arrays;
import java.util.Scanner;

public class Anagram2 {

  public static boolean isAnagram(String str1, String str2) {

    if (str1.length() != str2.length()) {
      return false;
    }

    str1 = sortCharacters(str1);
    str2 = sortCharacters(str2);

    return str1.equals(str2);
  }

  public static String sortCharacters(String str) {

    char[] charArray = str.toLowerCase().toCharArray();
    Arrays.sort(charArray);
    return String.valueOf(charArray);
  }

  public static void main(String[] args) {

    Scanner FirstWord = new Scanner(System.in);
    System.out.println("Please enter the first word: ");
    String ana = FirstWord.next();

    Scanner SecondWord = new Scanner(System.in);
    System.out.println("Please enter the second word: ");
    String gram = SecondWord.next();

    if (isAnagram(ana, gram)) {
      System.out.println(gram + " is anagram of " + ana);
    } else {
      System.out.println("Words are not anagrams.");
    }
  }
}