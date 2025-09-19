import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Stage {
  Grid grid;
  List<Actor> actors;
  List<Item> items;
  
  int i =0;
  
 
  public Stage() {

    grid = new Grid();
    actors = new ArrayList<Actor>();
    items = new ArrayList<Item>();

      int num1 = (int)(Math.random()*21);
      int num2 = (int)(Math.random()*21);
      if (num1 == num2){
        num1 = (int)(Math.random()*21);
      }

      
     int num3 = (int)(Math.random()*21);
     int num4 = (int)(Math.random()*21);

      if (num3 == num1 || num3 == num2 || num3 == num1 || num3 == num2){
        num3 = (int)(Math.random()*21);
        num4 = (int)(Math.random()*21);
      }
      
   
      actors.add(new Cat(grid.cellAtColRow(num1, num2).get()));
      actors.add(new Dog(grid.cellAtColRow(num2, num3).get()));
      actors.add(new Bird(grid.cellAtColRow(num3, num1).get()));
      items.add(new Bone (grid.cellAtColRow(num3,num4).get()));
      items.add(new Seed(grid.cellAtColRow(num1, num3).get()));

      actors.get(0).loc.x = 9;
   
  }

  public void paint(Graphics g, Point mouseLoc) {
    grid.paint(g, mouseLoc);
    for(Actor a: actors) {
      a.paint(g);
    }
    for(Item i : items){
      i.paint(g);

    }
    Optional<Cell> underMouse = grid.cellAtPoint(mouseLoc);
    if(underMouse.isPresent()) {
      Cell hoverCell = underMouse.get();
      g.setColor(Color.DARK_GRAY);
      g.drawString(String.valueOf(hoverCell.col) + String.valueOf(hoverCell.row), 740, 30);
    }
  }
}
