import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {

  public static void mainDraw(Graphics graphics){
    // reproduce this:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/drawing/line-play/r1.png]
    for (int i = 0; i < WIDTH ; i += 25) {
      graphics.setColor(Color.GREEN);
      graphics.drawLine(0,i ,i,HEIGHT);
    }
    for (int i = 0; i < WIDTH ; i += 25) {
      graphics.setColor(Color.MAGENTA);
      graphics.drawLine(WIDTH, i, i, 0);
    }




  }

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