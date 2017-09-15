package lab_5.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class DemocracyBot extends Robot
{
    public DemocracyBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void fixBallots() {
        checkRoom();
        checkRoom();
        checkRoom();
        checkRoom();
        checkRoom();
    }
    public void checkBooth(boolean shouldHave){
        move();
        while (nextToABeeper() != shouldHave) {
            if (shouldHave) { putBeeper(); }
            else { pickBeeper(); }
        }
        turnLeft();
        turnLeft();
        move();
    }
    public void checkRoom(){
        move();
        boolean roomShouldHaveBeepers = nextToABeeper();
        turnLeft();
        checkBooth(roomShouldHaveBeepers);
        checkBooth(roomShouldHaveBeepers);
        turnRight();
        move();
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
   
}


