public class Pirate {

  public static void main(String[] args) {
    Pirate jack = new Pirate();
    jack.name = "Jack";
    jack.drinkSomeRum();
    System.out.println(jack.intoxicationLevel);
    jack.drinkSomeRum();
    System.out.println(jack.intoxicationLevel);
    jack.howsItGoingMate();
    jack.drinkSomeRum();
    jack.drinkSomeRum();
    jack.drinkSomeRum();
    jack.drinkSomeRum();
    jack.drinkSomeRum();
    jack.howsItGoingMate();
  }

  public int intoxicationLevel;
  String name;
//  Create a Pirate class. Where you can add other fields and methods, you must have these methods:-
//
//  drinkSomeRum() - intoxicates the Pirate some
//  howsItGoingMate() - when called, the Pirate replies, if drinkSomeRun was called:-
//      0 to 4 times, "Pour me anudder!"
//      else, "Arghh, I'ma Pirate. How d'ya d'ink its goin?", the pirate passes out and sleeps it off.
//  If you manage to get this far, then you can try to do the following.
//
//  die() - this kills off the pirate, in which case, drinkSomeRum, etc. just result in he's dead.
//  brawl(x) - where pirate fights another pirate (if that other pirate is alive) and there's a 1/3
// chance, 1 dies, the other dies or they both pass out.
//  And... if you get that far...
//
//  Add a parrot.

  public Pirate() {
    this.name = "name";
    this.intoxicationLevel = 0;

  }

  public void drinkSomeRum() {
    intoxicationLevel++;
  }

  public void howsItGoingMate() {
  if (intoxicationLevel < 4){
    System.out.println("Pour me anudder");
  }else{
    System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
  }
  }


}
