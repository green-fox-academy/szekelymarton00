import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by aze on 2017.04.04..
 */
class ExtensionTest {

  Extension extension = new Extension();

  @Test
  void testAdd_2and3is5() {
    assertEquals(5, extension.add(2, 3));
  }

  @Test
  void testAdd_1and4is5() {
    assertEquals(5, extension.add(1, 4));
  }

  @Test
  void testMaxOfThree_first() {
    assertEquals(4, extension.maxOfThree(4, 4, 4));
  }

  @Test
  void testMaxOfThree_third() {
    assertEquals(4, extension.maxOfThree(3, 4, 2));
  }

  @Test
  void testMedian_four() {
    assertEquals(5, extension.median(Arrays.asList(6,2,4,9)));
  }

  @Test
  void testMedian_five() {
    assertEquals(7, extension.median(Arrays.asList(7,6,9,8,5)));
  }

  @Test
  void testIsVowel_a() {
    assertTrue(extension.isVowel('a'));
  }

  @Test
  void testIsVowel_u() {
    assertTrue(extension.isVowel('u'));
  }

  @Test
  void testTranslate_bemutatkozik() {
    assertEquals("avalmava", extension.translate("alma"));
  }

  @Test
  void testTranslate_kolbice() {
    assertEquals("lavagovopuvus", extension.translate("lagopus"));
  }
}


