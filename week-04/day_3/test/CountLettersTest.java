import static org.junit.Assert.*;

import java.util.HashMap;
import org.junit.Test;

public class CountLettersTest {

  @Test
  public void count() throws Exception {
    CountLetters test = new CountLetters();
    HashMap<Character, Integer> maptest = new HashMap<Character, Integer>();
    maptest.put('s',2);
    maptest.put('c',2);
    maptest.put('f',2);
    maptest.put('r',2);

    assertEquals(maptest, test.count("ssccffrr"));
  }

}