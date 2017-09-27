package Garden;

public class Flower extends Garden {

  public Flower(String color, int WaterAmountFlower) {

  }

  public void needWaterFlower() {
    if (WaterAmountFlower < 5) {
      System.out.println("The Flowers need water");
    }else{
      System.out.println("The Flowers do not need water");
    }
  }
}



