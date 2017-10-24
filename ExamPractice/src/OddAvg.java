import java.util.ArrayList;

public class OddAvg {

  public static void main(String[] args) {
    // Create a function called `oddAverage` that takes a list of numbers as parameter
    // and returns the average value of the odd numbers in the list
    // Create basic unit tests for it with at least 3 different test cases
  }

  public int oddAverage(ArrayList<Integer> Number) {
    int average = 0;
    int sumOfOdds = 0;
    int numberOfOdds = 0;
    for (int i = 0; i < Number.size(); i++) {
      if (Number.get(i) % 2 != 0 && Number.get(i) > 0) {
        numberOfOdds++;
        sumOfOdds += Number.get(i);
      }
    }
    average = sumOfOdds / numberOfOdds;
    return average;
  }


}
