import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class OddAvgTest {

  @Test
  void oddAverage() {
    OddAvg test = new OddAvg();
    ArrayList<Integer> test2 = new ArrayList<Integer>(Arrays.asList(1));
    assertEquals(1, test.oddAverage(test2));
  }

  @Test
  void oddAverageMultiple() {
    OddAvg test = new OddAvg();
    ArrayList<Integer> test2 = new ArrayList<Integer>(Arrays.asList(1, 3, 5, 7));
    assertEquals(4, test.oddAverage(test2));
  }

  @Test
  void oddAverageRandom() {
    OddAvg test = new OddAvg();
    ArrayList<Integer> test2 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 6, 9));
    assertEquals(4, test.oddAverage(test2));
  }

  @Test
  void oddAverageNegative() {
    OddAvg test = new OddAvg();
    ArrayList<Integer> test2 = new ArrayList<Integer>(Arrays.asList(-1, 2, 3, 6, 9));
    assertEquals(6, test.oddAverage(test2));
  }
  @Test
  void oddAverageNull() {
    OddAvg test = new OddAvg();
    ArrayList<Integer> test2 = new ArrayList<Integer>(Arrays.asList());
    assertEquals(null, test.oddAverage(test2));
  }

}