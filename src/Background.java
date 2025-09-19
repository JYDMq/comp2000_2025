import java.awt.Color;
import java.awt.Graphics;
public abstract class Background {
  Color color;
  Cell loc;
  public void paint(Graphics g) { 
    g.setColor(color);

  }
}
