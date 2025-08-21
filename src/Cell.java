import java.awt.*;

public class Cell {
    int x;
    int y;
    static int size = 35;


    public Cell(int x, int y){
        this.x = x;
        this.y = y;
    }

    void paint (Graphics g, Point mousePos){
        if(contain(mousePos)){
            g.setColor(Color.red);
        } else{
            g.setColor(Color.BLUE);
        }
        //g.setColor(java.awt.Color.black);

        g.drawRect(x, y, size, size);
    }

    boolean contain(Point p){
        if (p!= null){
            return (x < p.x && x+size > p.x && y < p.y && y+size > p.y);
        } else{
            return false;
        }
    }
    
}
