import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class WriteSingleLine {

  public static void main(String[] args) {
    // Open a file called "my-file.txt"
    // Write your name in it as a single line
    // If the program is unable to write the file,
    // then it should print an error message like: "Unable to write file: my-file.txt"

    Path p = Paths.get("src/my_txt1.txt");
    String s = System.lineSeparator() + "New Line!";
    try {
      Files.write(p, s.getBytes(), StandardOpenOption.APPEND);

      for (String line : Files.readAllLines(Paths.get("src/my_txt1.txt"))){

        System.out.println(Paths.get(line));
      }


    } catch (IOException e) {
      System.out.println("There is a problem with your file!!!");


      // Files.write("src/my_txt1.txt", "HOLA AMIGOS!!!!");
    }
  }
}