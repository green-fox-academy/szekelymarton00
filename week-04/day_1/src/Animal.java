public class Animal {

  //  Create Animal class
//  Every animal has a hunger value, which is a whole number
//          Every animal has a thirst value, which is a whole number
//          when creating a new animal object these values are created with the default 50 value
//  Every animal can eat() which decreases their hunger by one
//  Every animal can drink() which decreases their thirst by one
//  Every animal can play() which increases both by one
  int hungerValue;
  int thirstValue;


  public Animal() {


  }



  public void eat() {
    hungerValue --;
  }

  public void drink() {
    thirstValue --;
  }

  public void play() {

      thirstValue++;
      hungerValue++;
    }
    public static void main(String[] args) {

    Animal Lion = new Animal();
    Lion.hungerValue = 50;
    Lion.thirstValue = 50;

      for (int i = 0; i < 47 ; i++) {
        Lion.eat();
      }

    Lion.drink();
    System.out.println(Lion.hungerValue);
      System.out.println(Lion.thirstValue);




    }
  }


