import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {

  public static void mainDraw(Graphics graphics){
    // reproduce this:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps/r3.png]


    graphics.setColor(Color.RED);
    int xStart = 150;
    int yStart = 150;
    int size = 10;

    for (int i = 0; i < 15; i++) {
      graphics.fillRect(xStart,yStart, size, size);
      xStart -= size;
      yStart -= size;
    }
  }
  /*  int s = 5;

    while(WIDTH > 0 && HEIGHT > 0){
      WIDTH -= 10;
      HEIGHT -= 10;
      graphics.setColor(Color.RED);
      graphics.fillRect((WIDTH / 2) - (s / 2), (HEIGHT / 2) - (s / 2), s, s);

    }

    */


  //    Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 343;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}
