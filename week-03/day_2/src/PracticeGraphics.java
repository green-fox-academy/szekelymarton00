
import javax.swing.JFrame;


public class PracticeGraphics {

  public static void main(String[] args) {

      JFrame f = new JFrame("Ze title");
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Gra p = new Gra();
      f.add(p);
      f.setSize(800,600);
      f.setVisible(true);
  }
}

