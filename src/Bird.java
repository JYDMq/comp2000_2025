import java.awt.Color;


public class Bird extends Actor {
    Cell loc;

    public Bird(Cell inLoc) {
        loc = inLoc;
        color = Color.green;
    }

}
