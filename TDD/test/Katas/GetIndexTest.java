package Katas;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class GetIndexTest {
  GetIndex c;
  List test;

  @Before
  public void before() throws Exception{
    c = new GetIndex();
    test = new ArrayList(Arrays.asList(1,2,3,4));


  }
  @Test
  public void getIndexOne()throws Exception{
    assertEquals(-1,c.getIndex(test, 5));
  }
  @Test
  public void getIndexOther()throws Exception{
    assertEquals(2,c.getIndex(test, 3));
  }

}