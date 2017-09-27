import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Test;

public class SumTest {

  @Test
  public void sumTest() throws Exception {
    Sum SumAll = new Sum();

    ArrayList<Integer> MyNumbers = new ArrayList<>(Arrays.asList(1,1,1,1));

    assertEquals(4, SumAll.sum(MyNumbers));
  }
  @Test
  public void sumTest2() throws Exception {
    Sum SumAll = new Sum();

    ArrayList<Integer> MyNumbers = new ArrayList<>(Arrays.asList());

    assertEquals(0 , SumAll.sum(MyNumbers));
  }
  @Test
  public void sumTest3() throws Exception {
    Sum SumAll = new Sum();

    ArrayList<Integer> MyNumbers = new ArrayList<>(Arrays.asList(1));

    assertEquals(1, SumAll.sum(MyNumbers));
  }
  @Test
  public void sumTest4() throws Exception {
    Sum SumAll = new Sum();

    ArrayList<Integer> MyNumbers = new ArrayList<>(Arrays.asList(null));

    assertEquals(0, SumAll.sum(MyNumbers));
  }

}