import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Main extends JFrame {
    public static void main(String[] args) throws Exception {
      Main window = new Main();
      window.run();
    }

        public class Cell {
      int h =20;
      int w= 20;
      int l =35;
      int gridOffset =0;

    }

    public class Grid {
      Cell cell = new Cell();{
      Paint paint= new Paint();
      for(int i = 0; i < cell.h; i++){
         for (int a= 0; a < cell.w; a++){
          int x = (i * cell.l) + cell.gridOffset;
          int y = (a * cell.l) + cell.gridOffset;
          int o =cell.l;
        }
      }
     }
    }



    class Canvas extends JPanel {
      public Canvas() {
        setPreferredSize(new Dimension(720, 720));
      }

      @Override

      public void paint(Graphics g) {
    	g.setColor(java.awt.Color.BLUE);
      g.drawRect(grid.x, grid.y, grid.o, grid.o);
        
  }
      }
    

    private Main() {
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Canvas canvas = new Canvas();
      this.setContentPane(canvas);
      this.pack();
      this.setVisible(true);
   
    }

    public void run() {
      while(true) {
        repaint();
      }
    }
}
