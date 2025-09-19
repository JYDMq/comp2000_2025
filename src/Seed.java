import java.awt.Color;
import java.awt.Polygon;
import java.util.ArrayList;

public class Seed extends Item {
  public Seed(Cell inLoc) {
    loc = inLoc;
    colour = Color.Black;
    display = new ArrayList<Polygon>();
    Polygon main = new Polygon();
  }
}
