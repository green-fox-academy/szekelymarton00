import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class WriteMultipleLines {

  // Create a function that takes 3 parameters: a path, a word and a number,
// than it should write to a file.
// The path parameter should be a string, that describes the location of the file.
// The word parameter should be a string, that will be written to the file as lines
// The number parameter should describe how many lines the file should have.
// So if the word is "apple" and the number is 5, than it should write 5 lines
// to the file and each line should be "apple"
// The function should not raise any error if it could not write the file.

  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    String s = System.lineSeparator() + myScanner.next();
    Path p = Paths.get("src/new.txt");
    Scanner myNumScanner = new Scanner(System.in);
    int UserNumber = myNumScanner.nextInt();
    try {
      for (int i = 0; i < UserNumber; i++) {
        Files.write(p, s.getBytes(), StandardOpenOption.APPEND);
      }
      for (String line : Files.readAllLines(Paths.get("src/new.txt"))) {
        System.out.println(line);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}


