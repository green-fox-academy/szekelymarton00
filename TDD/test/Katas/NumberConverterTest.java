package Katas;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberConverterTest {

  @Test
  public void numberConverterTestone() throws  Exception {
    NumberConverter tester = new NumberConverter();
    int testNum = 1;
    assertEquals("one", tester.numberConverter(testNum));
  }

  @Test
  public void numberConverterTesttwo() throws  Exception {
    NumberConverter tester = new NumberConverter();
    int testNum = 2;
    assertEquals("two", tester.numberConverter(testNum));
  }
  @Test
  public void numberConverterTestEighteen() throws  Exception {
    NumberConverter tester = new NumberConverter();
    int testNum = 18;
    assertEquals("eighteen", tester.numberConverter(testNum));
  }
  @Test
  public void numberConverterTestTwentyOne() throws  Exception {
    NumberConverter tester = new NumberConverter();
    int testNum = 21;
    assertEquals("twentyone", tester.numberConverter(testNum));
  }

}