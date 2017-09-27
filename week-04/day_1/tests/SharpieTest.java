import static org.junit.Assert.*;

import org.junit.Test;

public class SharpieTest {

  @Test
  public void use() throws Exception {
    Sharpie test = new Sharpie();
    assertEquals(3,test.inkAmount = 4);
  }

}