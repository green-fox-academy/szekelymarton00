package Katas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetIndex {

  public int getIndex(List a, int b) {

    for (int i = 0; i < a.size(); i++) {
      if (a.get(i).equals(b)) {
        return i;
      }

    }
    return -1;


  }
}
