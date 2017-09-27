import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice2 {

  public static void main(String[] args) {
    // Create a function that takes a list of GitHub handles as input and returns a list of strings that represents
    // GitHub url's under Green Fox Academy organization in the following format: "https://github.com/greenfox-academy/teststudent"

    // example:
    // input: ["ghhandle1", "ghhandle2"]
    // output: ["https://github.com/greenfox-academy/ghhandle1", "https://github.com/greenfox-academy/ghhandle2"]
    System.out.println(urlsFromHandles(Arrays.asList("ghhandle1", "ghhandle2")));
  }

  private static String urlsFromHandles(List<String> urls) {

    int length = urls.size();
    for (int i = 0; i < length; i++) {
      String s = urls.get(i);
      urls.add("https://github.com/greenfox-academy/");


    }
    return urlsFromHandles(urls);
  }


}