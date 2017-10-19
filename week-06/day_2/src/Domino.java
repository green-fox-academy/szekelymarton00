import java.util.ArrayList;
import java.util.List;

public class Domino implements Comparable{

  private int[] values;

  public Domino(int valueA, int valueB) {
    this.values = new int[]{valueA, valueB};
  }

  public static void main(String[] args) {
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(2, 5));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));

    System.out.println("Compare to Returns " + dominoes.get(0).compareTo(dominoes.get(1)));
    int result = dominoes.get(0).compareTo(dominoes.get(1));

    if (result < 0) {
      System.out.println("bigger");
    }else if (result > 0) {
      System.out.println("smaller");
    } else {
      System.out.println("equal");
    }


  }

  public int[] getValues() {
    return values;
  }

  @Override
  public String toString() {
    return "[" + values[0] + ", " + values[1] + "]";
  }


  @Override
  public int compareTo(Object temp) {
    Domino other = (Domino) temp;

    if (values[0] > other.values[1]) {
      return 1;
    } else if (values[0] < other.values[1]) {
      return -1;
    } else {
      return 0;
    }

  }
}