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


  public void pulsate(char phase, int percentage) {
    // Adjust color saturation according to the beat
    float[] hsbValues = new float[3];
    Color.RGBtoHSB(baseColor.getRed(), baseColor.getGreen(), baseColor.getBlue(), hsbValues);
    hsbValues[1] = ((float) percentage) / 100.0f;
    color = Color.getHSBColor(hsbValues[0], hsbValues[1], hsbValues[2]);
  }


}