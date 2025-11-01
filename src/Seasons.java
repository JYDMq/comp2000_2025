import java.awt.Color;
import java.awt.Graphics;

public class Seasons  {

    SeasonState state;

    public Seasons (){     
        this.state = new Summer();
        
    }

    public void setState(SeasonState state){
        this.state = state;
    }

    public void handleRequest(Graphics g){
        state.handleRequest(g);
    }

    

}
