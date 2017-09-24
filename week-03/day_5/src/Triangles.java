import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {

  public static void mainDraw(Graphics graphics) {
    int[] x = {0, WIDTH / 2, WIDTH};
    int[] y = {0, HEIGHT, 0};

    graphics.setColor(Color.BLACK);
    graphics.drawPolygon(x, y, 3);

    graphics.setColor(Color.BLACK);


  }

  static int draw(Graphics g, int x, int y, int size, int n) {

    if (n == 0) {
      return 0;
    } else {
    }
    return 0;


         }


  //    Don't touch the code below
  static int WIDTH = 600;
  static int HEIGHT = 600;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {

    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}