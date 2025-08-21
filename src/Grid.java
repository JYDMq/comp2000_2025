import java.awt.*;

public class Grid {

    Cell[][]cells = new Cell [20][20]; 

    public Grid(){ 

        int offset = 10+35;

        for (int i =0; i < cells.length; i++){
         for (int j= 0; j < cells[i].length; j++){
          cells [i][j]= new Cell(offset*i, offset*j);
        }
    }
      
    }

    public void paint(Graphics g, Point mousePos){
         for (int i =0; i < cells.length; i++){
          for (int j= 0; j < cells[i].length; j++){
            cells [i][j].paint(g, mousePos);
        }
    }

}
    
}
