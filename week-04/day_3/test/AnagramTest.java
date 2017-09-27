import static org.junit.Assert.*;

import org.junit.Test;

public class AnagramTest {

  @Test
  public void isAnagram() throws Exception {
    Anagram ana = new Anagram();
    String str1 = "dog";
    String str2 = "god";
    assertEquals(true, ana.isAnagram(str1,str2));

  }

}