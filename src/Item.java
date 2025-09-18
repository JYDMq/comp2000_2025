import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.List;

public abstract class Item{
    Color colour;
    Cell loc;
    List<Polygon> display;

    public void paint(Graphics g) {
     for(Polygon p: display) {
       g.setColor(colour);
       g.fillPolygon(p);
       g.setColor(Color.GRAY);
       g.drawPolygon(p);
      }
     }


}