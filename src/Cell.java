import java.awt.*;

public class Cell {
    int x;
    int y;


    public Cell(int x, int y){
        this.x = x;
        this.y = y;
    }

    void paint (Graphics g){
        g.setColor(java.awt.Color.BLUE);
        g.drawRect(x, y, 35, 35);
    }
    
}
