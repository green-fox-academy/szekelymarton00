import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Pirates {

  //  Create a Pirate class. While you can add other fields and methods, you must have these methods:-
//
//  drinkSomeRum() - intoxicates the Pirate some
//  howsItGoingMate() - when called, the Pirate replies, if drinkSomeRun was called:-
//      0 to 4 times, "Pour me anudder!"
//      else, "Arghh, I'ma Pirate. How d'ya d'ink its goin?", the pirate passes out and sleeps it off.
//  If you manage to get this far, then you can try to do the following.
//
//  die() - this kills off the pirate, in which case, drinkSomeRum, etc. just result in he's dead.
//  brawl(x) - where pirate fights another pirate (if that other pirate is alive) and there's a 1/3 chance, 1 dies, the other dies or they both pass out.
//  And... if you get that far...
//
//  Add a parrot.
  public static void main(String[] args) {
    List<String> a = new ArrayList<>(Arrays.asList("y", "f", "g", "a", "b"));
    List<String> b = new ArrayList<>(Arrays.asList("t", "g", "h", "c", "w"));
    Collections.sort(a);
    Collections.sort(b);
    for (int i = 0; i < a.size(); i++) {
      System.out.print(a.get(i).concat(" 1 ").toUpperCase());
    }
      for (int j = 0; j < b.size(); j++) {
        System.out.print(b.get(j).concat(" 2 "));
      }
//  Collections.sort(a);
//  System.out.println(a.toString() + b.toString());
    }

  }

