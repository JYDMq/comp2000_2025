import java.awt.Color;


public class Seasons extends Cell {

    Color colour;

    State summer;
    State autumn;
    State winter;
    State spring;

    State state;
    int timer = 0;

    public Seasons (Color colour){
        summer = new Summer(this);
        this.colour = colour;
    }

    

}
