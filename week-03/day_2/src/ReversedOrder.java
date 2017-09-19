import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReversedOrder {

  public static void main(String[] args) {
    try {
      Path filePath = Paths.get("src/reversed-order.txt");
      List<String> lines =  Files.readAllLines(filePath);
      //   System.out.println(lines.get(0)); // Prints the first line of the file


      for (int i = 0; i < lines.size() - 1; i++){
        System.out.println(lines);

      }
    } catch (Exception e) {
      System.out.println("Uh-oh, could not read the file!");
    }

  }

}

