import java.awt.Color;
import java.awt.Polygon;
import java.util.ArrayList;

public class Bone extends Item {
  public Bone (Cell inLoc) {
    super(inLoc, Color.black,0 );
  }

    protected void setPoly(){
    display = new ArrayList<Polygon>();
    Polygon body = new Polygon();
    body.addPoint(loc.x + 15, loc.y + 10);
    body.addPoint(loc.x + 20, loc.y + 10);
    body.addPoint(loc.x + 20, loc.y + 25);
    body.addPoint(loc.x + 15, loc.y + 25);
    display.add(body);
  }
}
