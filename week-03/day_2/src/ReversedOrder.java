import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {

  public static void main(String[] args) {
    try {
      Path reversedtxt = Paths.get("src/reversed-order.txt");
      List<String> order =  Files.readAllLines(reversedtxt);
      //   System.out.println(lines.get(0)); // Prints the first line of the file
      List<String> corrected = new ArrayList<>();

      for (int i = order.size() - 1; i > 0; i--){
        corrected.add(order.get(i));
      }

      System.out.println(corrected);
    } catch (Exception e) {
      System.out.println("Uh-oh, could not read the file!");
    }

  }

}

