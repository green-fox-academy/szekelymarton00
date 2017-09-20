import java.util.Scanner;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ToTheCenter {

  public static void mainDraw(Graphics graphics) {
    // create a line drawing function that takes 2 parameters:
    // the x and y coordinates of the line's starting point
    // and draws a line from that point to the center of the canvas.
    // draw 3 lines with that function.
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Please enter the X value: ");
    int x = myScanner.nextInt();
    Scanner myScanner2 = new Scanner(System.in);
    System.out.println("Please enter the Y value: ");
    int y = myScanner2.nextInt();
    drawer(graphics, x, y);


  }

  public static void drawer(Graphics graphics, int x, int y) {
    graphics.setColor(Color.BLUE);
    graphics.drawLine(x, y, 320 / 2, 343 / 2);

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

  static class ImagePanel extends JPanel {

    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }


}