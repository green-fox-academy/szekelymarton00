
public class Palindrome {

  public static void main(String[] args) {
    String str[] = "123".split("");
    String temp = String.join("", str);
    String finalStr = "";
    for (int i = str.length - 1; i >= 0; i--) {
      finalStr += str[i] + "";
    }
      System.out.println(temp + finalStr);
  }

}
