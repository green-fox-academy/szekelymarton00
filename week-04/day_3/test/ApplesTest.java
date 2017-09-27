import static org.junit.Assert.*;

import org.junit.Test;

public class ApplesTest {

  @Test
  public void getAppleTest() throws Exception {
    Apples apple = new Apples();
    assertEquals("apple", apple.getApple());
  }


}