import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SierpinskyCarpet {

  private static float h = 1;

  public static void mainDraw(Graphics graphics) {

    graphics.setColor(Color.BLACK);
    graphics.fillRect(0,0,WIDTH,HEIGHT);

    graphics.setColor(Color.getHSBColor(h,1,1));
    draw(graphics, 0, 0, WIDTH);

//    graphics.setColor(Color.getHSBColor(h,1,1));
//    drawFill(graphics, 0, 0, WIDTH / 2);

  }
  public static void drawFill(Graphics g, int x, int y, int size) {

    if (size < 20) {
      return;
    }

    g.fillOval(x, y, size, size);
    draw(g, x + size / 2 - size / 60, y + size / 3, size / 2); // right
    draw(g, x + size / 60 , y + size / 3, size / 2);           //left
    draw(g, x + size / 4, y, size / 2);                           //middle

  }

  public static void draw(Graphics g, int x, int y, int size) {

    if (size < 20) {
      return;
    }

    g.drawOval(x, y, size, size);
    draw(g, x + size / 2 - size / 60, y + size / 3, size / 2); // right
    draw(g, x + size / 60 , y + size / 3, size / 2);           //left
    draw(g, x + size / 4, y, size / 2);                           //middle


  }

  //    Don't touch the code below
  static int WIDTH = 600;
  static int HEIGHT = 600;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    //jFrame.add(new ImagePanel());
    ImagePanel im = new ImagePanel();
    jFrame.add(im);
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);


    // ANIMATION COLOR
    boolean changeColor = true;
    while (true) {
      if (changeColor) {
        h -= 0.2f;
        if (h > 1) {
          changeColor = !changeColor;
        }
      } else {
        h += 0.2f;
        if (h < 1) {
          changeColor = !changeColor;
        }
      }
      im.repaint();
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

    // ANIMATION SIZE


  }

  static class ImagePanel extends JPanel {

    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }
}


