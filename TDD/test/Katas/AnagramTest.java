package Katas;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnagramTest {

  @Test
  public void anagramOneChar() throws Exception {
    Anagram test = new Anagram();
    String ana;
    String gram;
    assertTrue(test.anagram("a","a"));
  }
  @Test
  public void anagramTwoChars() throws Exception {
    Anagram test = new Anagram();
    String ana;
    String gram;
    assertTrue(test.anagram("ab","ab"));
  }
  @Test
  public void anagramTwoCharsDouble() throws Exception {
    Anagram test = new Anagram();
    String ana;
    String gram;
    assertTrue(test.anagram("ab","ba"));
  }
  @Test
  public void anagramThreeCharsReverse() throws Exception {
    Anagram test = new Anagram();
    String ana;
    String gram;
    assertTrue(test.anagram("abc","cba"));
  }

  @Test
  public void anagramThreeCharsRand() throws Exception {
    Anagram test = new Anagram();
    String ana;
    String gram;
    assertTrue(test.anagram("abc","bac"));
  }

  @Test
  public void anagramThreeCharsFullRand() throws Exception {
    Anagram test = new Anagram();
    String ana;
    String gram;
    assertTrue(test.anagram("cba","bac"));
  }


}