import java.util.Scanner;
public class Anagram {

  public static void main(String[] args) {
    Scanner FirstWord = new Scanner(System.in);
    System.out.println("Please enter the first word");
    String ana = FirstWord.next();
    Scanner SecondWord = new Scanner(System.in);
    System.out.println("Please enter the second word");
    String gram = SecondWord.next();

    if (ana.length() == gram.length() && gram.contentEquals(ana)){
      System.out.println("Good");
    }
    else {
      System.out.println("Wrong");
    }

    }

}

