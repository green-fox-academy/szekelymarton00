import java.util.ArrayList;
import java.util.Scanner;

public class SearchPalindrome {

  public static void main(String[] args) {

    Scanner FirstWord = new Scanner(System.in);
      System.out.println("Please enter a word: ");
    String str[] = FirstWord.next().split("");

    String temp = String.join("", str);
    String finalStr = "";
    for (int i = str.length - 1; i >= 0; i--) {
      finalStr += str[i] + "";

      String check = temp + finalStr;
      ArrayList<String> checked = new ArrayList();
      checked.add(temp + finalStr);

      if (true) {
        check.contains(temp + finalStr);
        System.out.println(checked);
      }
    }
  }
}