import java.util.ArrayList;
import java.util.List;

public class Dominoes {

  public static void main(String[] args) {
    List<Domino> dominoes = initializeDominoes();
    // You have the list of Dominoes
    // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
    // eg: [2, 4], [4, 3], [3, 5] ...
    List<Domino> dominoes2 = new ArrayList<>();
    dominoes2.add(dominoes.get(0));

    while (dominoes.size() > 0) {
      for (int i = 0; i < dominoes.size(); i++) {
        if (dominoes2.get(dominoes2.size() - 1).getValues()[1] == dominoes.get(i).getValues()[0])
        {
          dominoes2.add(dominoes.get(i));
          dominoes.remove(i);
        }

      }


    }
    System.out.println(dominoes2);

    //if(dominoes.get(i).getValues()[0] != dominoes.get(i).getValues()[1])

    //System.out.println(dominoes);
    //System.out.println(dominoes.get(i).getValues()[0] + " " + dominoes.get(i).getValues()[1]);
  }

  static List<Domino> initializeDominoes() {
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));
    return dominoes;
  }
}