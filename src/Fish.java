import java.awt.Color;
import java.awt.Polygon;
import java.util.ArrayList;

public class Fish extends Item {
  public Fish (Cell inLoc) {
    loc = inLoc;
    colour = Color.BLUE;
    display = new ArrayList<Polygon>();
    // this part of the program deal with drawing the body opf the fish
    Polygon body = new Polygon();
    body.addPoint(loc.x + 15, loc.y + 10);
    body.addPoint(loc.x + 25, loc.y + 15);
    body.addPoint(loc.x + 15, loc.y + 25);
    body.addPoint(loc.x + 5, loc.y + 15);
    // this part of program deal with drawing the fishes tail
    Polygon tail = new Polygon();
    tail.addPoint(loc.x + 25, loc.y + 15);
    tail.addPoint(loc.x + 30, loc.y + 10);
    tail.addPoint(loc.x + 30, loc.y + 20);

    display.add(body);
    display.add(tail);
  }
}
