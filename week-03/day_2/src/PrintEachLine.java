import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Files;

public class PrintEachLine {

  public static void main(String[] args) {
    // Write a program that opens a file called "my-file.txt", then prints
    // each of lines form the file.
    // If the program is unable to read the file (for example it does not exists),
    // then it should print an error message like: "Unable to read file: my-file.txt"
    try {
      for (String line : Files.readAllLines(Paths.get("my-file.txt")));
    } catch (IOException e) {
      System.out.println("Unable to read file: my-file.txt");
    }
  }


}
