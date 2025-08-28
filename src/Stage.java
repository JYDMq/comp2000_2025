import java.awt.*;
public class Stage {
    Grid grid;
    Actor cat;
    Actor dog;
    Actor bird;

    public Stage(){
        grid = new Grid();
        cat = new Cat(grid.CellAtRow(0, 0));
        dog = new Dog(grid.CellAtRow(0, 15));
        bird = new Bird(grid.CellAtRow(12, 9));
    }

    Void paint(Graphics g,  Point mouseLoc){
        grid.paint(g, mouseLoc);
        cat.paint(g);
        dog.paint(g);
        bird.paint(g);
    }
    

}
