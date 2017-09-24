import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Practice {

  public static void main(String[] args) {
    try {
      for (String line : Files.readAllLines(Paths.get("day_1.iml"))){
        System.out.println(line);
      }
    } catch (IOException e) {
      Files.write(, StandardOpenOption.APPEND);
      System.out.println("There is a problem with your file!!!");


    }
  }

}
