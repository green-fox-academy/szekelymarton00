import java.util.ArrayList;
import java.util.List;

public class SplitString {

  public String[] split(String str, int num) {
    str = "lovebarbara";
    ArrayList<String> myStr = new ArrayList<>();
    myStr.add(str);
    myStr.get(0).substring(num,str.length() - 1);
    String[] parts = str.split(str, num);
    return parts;
  }

  public static void main(String[] args) {
    System.out.println();
  }

}
