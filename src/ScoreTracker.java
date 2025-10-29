
public  class  ScoreTracker {
    int score =0;
    Cell playerloc;
    Cell itemloc;

    Add add = (a, b) -> a+b;

    protected ScoreTracker (Cell Ploc, Cell Iloc){
        playerloc =  Ploc;
        itemloc =    Iloc;
    }

    public int scoreboard(){

    if(playerloc == itemloc){
            score = add.Addition(score, 10);

        }

    return score;
    }

}
