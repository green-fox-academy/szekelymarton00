import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class AddToFile {

  public AddToFile(){

  }

  public void appendToFile(String filename,String InputText){
    try {
      Files.write(Paths.get(filename), InputText.getBytes(), StandardOpenOption.APPEND);
    }catch (IOException e) {
      //exception handling left as an exercise for the reader
    }

  }

}
