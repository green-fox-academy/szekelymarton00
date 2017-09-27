public class Sharpie {

  //  Create Sharpie class
//  We should know about each sharpie their color (which should be a string), width (which will be a floating point number), inkAmount (another floating point number)
//  When creating one, we need to specify the color and the width
//  Every sharpie is created with a default 100 as inkAmount
//  We can use() the sharpie objects
//  which decreases inkAmount
  String color;
  float width;
  float inkAmount;

  public Sharpie() {
    this.color = "blue";
    this.width = 100;
    this.inkAmount = 3;
  }


  public static void main(String[] args) {
    Sharpie first = new Sharpie();
    first.inkAmount = 4;
    first.use();
    System.out.println(first.inkAmount);
  }

  public void use() {
    inkAmount--;

  }
}

