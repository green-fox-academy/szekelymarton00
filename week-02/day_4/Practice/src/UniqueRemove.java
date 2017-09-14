import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//Create a function that takes a list of numbers as a parameter
//Returns a list of numbers where every number in the list occurs only once

public class UniqueRemove {
  public static void main(String[] args) {

    List<String> listAll = Arrays.asList("1", "2", "2", "3", "4", "5", "4", "6", "2");

    List<String> listUnique = listAll.stream().distinct().collect(Collectors.toList());

    String collectAll = listAll.stream().collect(Collectors.joining(", "));
      System.out.println(collectAll);
    String collectDistinct = listUnique.stream().collect(Collectors.joining(", "));
      System.out.println(collectDistinct);
  }
}