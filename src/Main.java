import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame {
    public static void main(String[] args) throws Exception {
      Main window = new Main();
      window.run();
    }

    class Canvas extends JPanel {
      public Canvas() {
        setPreferredSize(new Dimension(720, 720));
      }

      @Override
      public void paint(Graphics g) {
	g.setColor(java.awt.Color.BLACK);
	g.drawRect(10, 10, 700, 700);
      }
    }

    private Main() {
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Canvas canvas = new Canvas();
      this.setContentPane(canvas);
      this.pack();
      this.setVisible(true);
      int width = getWidth();
      int height = getHeight();

      int start=0;

      for (int i=1; i <=20; i = i++){
        start= i*(width/10);
        this.drawLine(start, 0, start, height);
      }
    }

    public void run() {
      while(true) {
        repaint();
      }
    }
}
