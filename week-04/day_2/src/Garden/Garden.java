
package Garden;

public class Garden {

  String color;
  int WaterLevelFirst;
  int WaterLevelSecond;
  int WaterAmountFlower;
  int WaterAmountTree;


  public Garden() {

  }

  public void firstWatering() {
    System.out.println("Watering with 40");
    WaterLevelFirst = 40;
    if (WaterAmountFlower < 5 || WaterAmountTree < 10) {
      for (int i = 0; i < WaterLevelFirst; i++) {
        WaterAmountFlower += (0.75 * WaterLevelFirst);
        WaterAmountTree += (0.40 * WaterLevelFirst);
      }


    }
  }

  public void secondWatering() {
    System.out.println("Watering with 70");
    WaterLevelSecond = 70;
    if (WaterAmountFlower < 5 || WaterAmountTree < 10) {
      for (int i = 0; i < WaterLevelSecond; i++) {
        WaterAmountFlower += (0.75 * WaterLevelSecond);
        WaterAmountTree += (0.40 * WaterLevelSecond);
      }

    }

  }


  public static void main(String[] args) {

    Flower yellow = new Flower("yellow", 0);
    Flower blue = new Flower("blue", 0);
    Tree purple = new Tree("purple", 0);
    Tree orange = new Tree("orange", 0);

    //Status
    yellow.needWaterFlower();
    blue.needWaterFlower();
    purple.needWaterTree();
    orange.needWaterTree();
    //First Watering
    yellow.firstWatering();
    blue.firstWatering();
    purple.firstWatering();
    orange.firstWatering();
    //Status
    yellow.needWaterFlower();
    blue.needWaterFlower();
    purple.needWaterTree();
    orange.needWaterTree();
    //Second Watering
    yellow.secondWatering();
    blue.secondWatering();
    purple.secondWatering();
    orange.secondWatering();
    //Status
    yellow.needWaterFlower();
    blue.needWaterFlower();
    purple.needWaterTree();
    orange.needWaterTree();


  }
}


