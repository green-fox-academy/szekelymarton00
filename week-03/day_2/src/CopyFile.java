import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.StandardOpenOption;

public class CopyFile {

  public static void main(String[] args) {

// Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

    FileInputStream instream = null;
    FileOutputStream outstream = null;

    try{
      File infile =new File("src/new.txt");
      File outfile =new File("src/my_txt1.txt");

      instream = new FileInputStream(infile);
      outstream = new FileOutputStream(outfile);

      byte[] buffer = new byte[1024];

      int length;
      while ((length = instream.read(buffer)) > 0){
        outstream.write(buffer, 0, length);
      }

      instream.close();
      outstream.close();

      System.out.println("File copied successfully!!");

    }catch(IOException ioe) {
      ioe.printStackTrace();
    }
  }
}
