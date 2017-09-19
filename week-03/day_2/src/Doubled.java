import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Doubled {

  public static void main(String[] args) {
    // Create a method that decrypts the duplicated-chars.txt
    try {
      List<String> lines = Files.readAllLines(Paths.get("src/duplicated-chars.txt"));
      String joined = String.join("", lines);
      String s2 = "";
      for (int i = 0; i < joined.length(); i++) {
        Boolean found = false;
        for (int j = 0; j < s2.length(); j++) {
          if (joined.charAt(i) == s2.charAt(j)) {
            found = true;
            break; //don't need to iterate further
          }
        }
        if (found == false) {
          s2 = s2.concat(String.valueOf(joined.charAt(i)));
        }
      }
      System.out.println(s2);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

