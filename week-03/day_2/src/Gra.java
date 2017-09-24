import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Gra extends JPanel {

  public void paintComponent(Graphics g){
    super.paintComponent(g);
    this.setBackground(Color.WHITE);

    g.setColor(Color.BLUE);
    g.fillRect(25,25,100,30);

    g.setColor(new Color(190,81,215));
    g.fillRect(25,65,100,30);

    g.setColor(Color.RED);
    g.drawString("Ze String",25,120);

    g.setColor(Color.BLUE);
    g.drawLine(105,175,200,45);

    g.setColor(Color.PINK);
    g.drawRect(150,50,200,45);

    g.setColor(Color.BLACK);
    g.drawOval(105,175,200,45);

    g.setColor(Color.YELLOW);
    g.fill3DRect(105,175,50,50, true);

    int [] xPoints = {100, 200, 200};
    int [] yPoints = {100, 200, 200};
    g.setColor(Color.GREEN);
    g.drawPolygon(xPoints, yPoints,3);
  }

}
