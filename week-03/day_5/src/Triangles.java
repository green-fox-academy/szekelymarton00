import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {

  public static void mainDraw(Graphics graphics) {


    graphics.setColor(Color.BLACK);
    draw(graphics, 6, 5,5, WIDTH - 10, (int) (Math.sqrt(3.0) * (WIDTH - 10) / 2));



  }

  static int draw(Graphics g,int n, int x1, int y1, int width, int height) {

    g.setColor(Color.BLACK);
    g.drawLine(x1,y1,x2,y2);
    g.drawLine();
    g.drawLine();


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