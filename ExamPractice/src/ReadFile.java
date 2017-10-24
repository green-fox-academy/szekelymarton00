import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

  public ReadFile() {

  }

  public void ReadFile(String filename) {

    try (BufferedReader br = new BufferedReader(new FileReader(filename))) {

      String sCurrentLine;

      while ((sCurrentLine = br.readLine()) != null) {
        System.out.println(sCurrentLine);
      }

    } catch (IOException e) {
      e.printStackTrace();
    }
  }


}
