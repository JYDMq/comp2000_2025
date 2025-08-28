import java.awt.Color;
import java.awt.Graphics;
public abstract class Actor {
    Color color;
    Cell loc;

      public void paint(Graphics g){
        g.setColor(Color.orange);
        g.fillRect(loc.x +5, loc.y +5, loc.width- 10, loc.width-10);
    }

}
