import java.util.ArrayList;
import java.util.Scanner;

public class ArmstrongNumber {

  public static void main(String[] args) {
    Scanner TheNumber = new Scanner(System.in);
      System.out.println("I humbly ask you to input a number of your choice: ");
    ArrayList<String> Neil = new ArrayList<>();

    Neil.add(TheNumber.next());

    StringBuilder sb = new StringBuilder();
    for (String s : Neil)
    {
      sb.append(s);
      sb.append("\t");
    }
    double value = Double.parseDouble(TheNumber.next());
    double result = Math.pow(value, sb.length());
        System.out.println(result);
  }
}
