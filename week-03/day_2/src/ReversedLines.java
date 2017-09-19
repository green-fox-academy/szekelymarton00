import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReversedLines {

  public static void main(String[] args) {

    try {
      for(String reversed : Files.readAllLines(Paths.get("src/reversed-lines.txt"))){

        String correct = "";
        int length = reversed.length();
        for ( int i = length - 1 ; i >= 0 ; i-- )
          correct = correct + reversed.charAt(i);
        System.out.println(correct);
      }


    } catch (IOException e) {
      e.printStackTrace();
    }

  }

}
