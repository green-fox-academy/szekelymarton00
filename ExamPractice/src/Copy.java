import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Copy {
  public static void main(String[] args) {
    // This should be the basic replica of the 'cp' command
    // If ran from the command line without arguments
    // It should print out the usage:
    // copy [source] [destination]
    // When just one argument is provided print out
    // No destination provided
    // When both arguments provided and the source is a file
    // Read all contents from it and write it to the destination

    if (args.length == 0) {
      System.out.println("copy [source] [destination]");
    } else if (args.length == 1) {
      System.out.println("No destination provided");
    } else if(args.length == 2) {
      Path fromPath = Paths.get(args[0]);
      Path toPath = Paths.get(args[1]);
      if (Files.exists(fromPath) && !Files.isDirectory(fromPath)) {
        try {
          Files.write(toPath, Files.readAllLines(fromPath));
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }



  }
}