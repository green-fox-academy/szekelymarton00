import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciTest {

  @Test
  public void fibonacci() throws Exception {
    Fibonacci test = new Fibonacci();
    assertEquals(8, test.fibonaccicount(6) );
  }

}