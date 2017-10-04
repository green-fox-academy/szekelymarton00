import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RomansNumbersTest {

  RomansNumbers romansNumbers;

  @Before
  public void setUp() throws Exception {
    if (romansNumbers == null) {
      romansNumbers = new RomansNumbers();
    }

  }

  @Test
  public void convertToRomanI() throws Exception {
    assertEquals("I", romansNumbers.convertToRoman(1));

  }

  @Test
  public void convertToRomanII() throws Exception {
    assertEquals("II", romansNumbers.convertToRoman(2));

  }

  @Test
  public void convertToRomanIII() throws Exception {
    assertEquals("III", romansNumbers.convertToRoman(3));

  }

  @Test
  public void convertToRomanIV() throws Exception {
    assertEquals("IV", romansNumbers.convertToRoman(4));

  }

  @Test
  public void convertToRomanV() throws Exception {
    assertEquals("V", romansNumbers.convertToRoman(5));

  }

  @Test
  public void convertToRomanVItoVIII() throws Exception {
    assertEquals("VI", romansNumbers.convertToRoman(6));
    assertEquals("VII", romansNumbers.convertToRoman(7));
    assertEquals("VIII", romansNumbers.convertToRoman(8));

  }

  @Test
  public void convertToRomanIX() throws Exception {
    assertEquals("IX", romansNumbers.convertToRoman(9));

  }


}