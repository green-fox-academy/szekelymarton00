import java.util.Scanner;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PositionSquare {

  public static void mainDraw(Graphics graphics){
    // create a square drawing function that takes 2 parameters:
    // the x and y coordinates of the square's top left corner
    // and draws a 50x50 square from that point.
    // draw 3 squares with that function.
    int NumSQ = 0;
      while(NumSQ < 3) {
        NumSQ++;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter the X value: ");
        int x = myScanner.nextInt();
        Scanner myScanner2 = new Scanner(System.in);
        System.out.println("Please enter the Y value: ");
        int y = myScanner2.nextInt();
        drawerSQ(graphics, x, y);
      }


  }

  public static void drawerSQ(Graphics graphics, int x, int y) {
    graphics.setColor(Color.BLUE);
    graphics.drawRect(x, y, 50, 50);

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