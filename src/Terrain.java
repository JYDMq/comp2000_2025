import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.List;

public class Terrain {
  Color baseColor, color;
  Cell loc;
  List<Polygon> display;
  boolean acess;

  public Terrain (Color colour, Cell l, boolean move) {
    color = colour;
    l = loc;
    move = acess;

  }

}
