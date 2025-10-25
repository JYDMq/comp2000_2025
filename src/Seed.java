import java.awt.Color;
import java.awt.Polygon;
import java.util.ArrayList;

public class Seed extends Item {
  public Seed(Cell inLoc) {
    loc = inLoc;
    colour = Color.CYAN;
    display = new ArrayList<Polygon>();
    Polygon circle = new Polygon();
    circle.addPoint(loc.x + 15, loc.y + 10);
    circle.addPoint(loc.x + 20, loc.y + 15);
    circle.addPoint(loc.x + 15, loc.y + 25);
    circle.addPoint(loc.x + 10, loc.y + 15);
    display.add(circle);
  }
}
