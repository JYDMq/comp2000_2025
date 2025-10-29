import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.List;

public abstract class Item{
    Color baseColor,colour;
    Cell loc;
    List<Polygon> display;
    int moves;
    int turns;
    MoveStrategy mover;


    protected Item(Cell inLoc, Color Incolor, int inMoves ){
      loc = inLoc;
      colour= Incolor;
      baseColor = Incolor;
      moves =inMoves;
      turns = 1;
      setPoly();

    }
    protected abstract void setPoly();

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
    colour = Color.getHSBColor(hsbValues[0], hsbValues[1], hsbValues[2]);
  }

  //it would be nice of it to be deleted when the player click on it


}