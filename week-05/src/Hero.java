import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


public class Hero extends Characters {

  public Hero() {
    super("hero-down.png", 0, 0);

  }



  public void drawHero(String direction) {

    try {
      if (direction.equals("up")) {
        image = ImageIO.read(new File("hero-up.png"));
      } else if (direction.equals("down")) {
        image = ImageIO.read(new File("hero-down.png"));
      } else if (direction.equals("left")) {
        image = ImageIO.read(new File("hero-left.png"));
      } else if (direction.equals("right")) {
        image = ImageIO.read(new File("hero-right.png"));
      }
    } catch (IOException e) {
      e.printStackTrace();

    }


  }

}
