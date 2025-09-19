import java.awt.Color;
import java.awt.Polygon;
import java.util.ArrayList;

public class Fish extends Item {
  public Fish (Cell inLoc) {
    loc = inLoc;
    colour = Color.BLUE;
    display = new ArrayList<Polygon>();
    Polygon body = new Polygon();
    display.add(body);
  }
}
