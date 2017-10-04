import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {

  int testBoxX;
  int testBoxY;
  int tileWidth = 72;
  int[][] matrix;
  Hero hero;
  Skeleton skeleton;


  public Board() {
    skeleton = new Skeleton();
    skeleton.posX = 144;
    skeleton.posY = 144;
    hero = new Hero();
    testBoxX = 0;
    testBoxY = 0;

    this.matrix = new int[][]{
        {0, 0, 0, 1, 0, 1, 0, 0, 0, 0},
        {0, 0, 0, 1, 0, 1, 0, 1, 1, 0},
        {0, 1, 1, 1, 0, 1, 0, 1, 1, 0},
        {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
        {1, 1, 1, 1, 0, 1, 1, 1, 1, 0},
        {0, 1, 0, 1, 0, 0, 0, 0, 1, 0},
        {0, 1, 0, 1, 0, 1, 1, 0, 1, 0},
        {0, 0, 0, 0, 0, 1, 1, 0, 1, 0},
        {0, 1, 1, 1, 0, 0, 0, 0, 1, 0},
        {0, 0, 0, 1, 0, 1, 1, 0, 0, 0}
    };

    // set the size of your draw board
    setPreferredSize(new Dimension(720, 720));
    setVisible(true);

  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        if (matrix[i][j] == 1) {
          PositionedImage wall = new PositionedImage("wall.png", j * tileWidth,
              i * tileWidth);
          wall.draw(graphics);
        } else {
          PositionedImage floor = new PositionedImage("floor.png", j * tileWidth,
              i * tileWidth);
          floor.draw(graphics);
        }
      }
    }

    hero.draw(graphics);
    skeleton.draw(graphics);

  }

  // To be a KeyListener the class needs to have these 3 methods in it
  @Override
  public void keyTyped(KeyEvent e) {

  }

  @Override
  public void keyPressed(KeyEvent e) {

  }

  // But actually we can use just this one for our goals here
  @Override
  public void keyReleased(KeyEvent e) {
    // When the up or down keys hit, we change the position of our box

    if (e.getKeyCode() == KeyEvent.VK_UP && hero.posY > 0 && matrix[hero.posY / tileWidth - 1][hero.posX / tileWidth] != 1) {
      hero.posY -= 72;
      skeleton.posX += (int) (Math.random() * 72);
      hero.drawHero("up");
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN && hero.posY < 720 - 72 && matrix[hero.posY / tileWidth + 1][hero.posX / tileWidth] != 1 ) {
      hero.posY += 72;
      skeleton.posX -= (int) (Math.random() * 72);
      hero.drawHero("down");
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT && hero.posX > 0 && matrix[hero.posY / tileWidth][hero.posX / tileWidth - 1] != 1 ) {
      hero.posX -= 72;
      skeleton.posY += (int) (Math.random() * 72);
      hero.drawHero("left");
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT && hero.posX < 720 - 72 && matrix[hero.posY / tileWidth][hero.posX / tileWidth + 1] != 1 ) {
      hero.posX += 72;
      skeleton.posY -= (int) (Math.random() * 72);
      hero.drawHero("right");
    }
    repaint();
  }


}
// and redraw to have a new picture with the new coordinates




