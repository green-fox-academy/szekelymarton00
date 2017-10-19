import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;

public class Otos {

  public static void main(String[] args) {

    if (Objects.equals(args[0], "-y")) {

      try {
        CSVReader reader = new CSVReader(new FileReader("/Users/Ezzo/Desktop/otos.csv"), '\t');
        CSVWriter writer = new CSVWriter(new FileWriter("/Users/Ezzo/Desktop/newotos.csv"), '\t');
      } catch (IOException e) {
        e.printStackTrace();
      }
      for (int i = 0; i < ; i++) {

      }


    }
    if (args.length == 0) {
    } else if (args[0].equals("-y")) {

    } else if (args[0].equals("-f") && args.length == 2) {

    } else if (args[0].equals("-o") && args.length == 1) {

    } else if (args[0].equals("-r") && args.length == 2) {

    } else if (args[0].equals("-r") && args.length == 1) {

    } else if (args[0].equals("-c") && (args.length > 1)) {

    } else {

    }
  }

}
