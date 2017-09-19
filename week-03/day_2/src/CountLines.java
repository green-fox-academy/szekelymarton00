import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CountLines {

  public static void main(String[] args) {
    // Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.
    final Path path = Paths.get("src/my_txt1.txt");
    try {
      final long lineCount = Files.lines(path).count();
      System.out.println(lineCount);
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

}
