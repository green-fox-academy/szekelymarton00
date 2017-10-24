import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Car {

  public enum carTypes {BMW, MERCEDES, TOYOTA, HONDA, AUDI}

  public enum colors {BLUE, BLACK, YELLOW, GREEN, WHITE}


  public static void main(String[] args) {
    int x = (int) (Math.random() * 5);
    for (int i = 0; i < 256; i++) {
      List<carTypes> type = new ArrayList<>(Arrays.asList(carTypes.values()));
      type.add(carTypes.values()[x]);
      List<colors> color = new ArrayList<>(Arrays.asList(colors.values()));
      color.add(colors.values()[x]);

      System.out.println(type.toString().concat(color.toString()));
    }


  }


  public static carTypes getRandomCar() {
    return carTypes.values()[(int) (Math.random() * carTypes.values().length)];
  }

  public static colors getRandomColor() {
    return colors.values()[(int) (Math.random() * colors.values().length)];
  }

}



