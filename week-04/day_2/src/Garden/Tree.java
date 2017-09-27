package Garden;

public class Tree extends Garden {

  public Tree(String color, int WaterAmountTree) {

  }

  public void needWaterTree() {
    if (WaterAmountTree < 10) {
      System.out.println("The Trees need water");
    }else{
      System.out.println("The Trees do not need water");
    }
  }


}
