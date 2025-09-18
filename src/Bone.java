import java.awt.Color;
import java.awt.Polygon;
import java.util.ArrayList;

public class Bone extends Item {
  public Bone(Cell inLoc) {
    loc = inLoc;
    colour = Color.YELLOW;
    display = new ArrayList<Polygon>();
    Polygon main = new Polygon();
  }
}
