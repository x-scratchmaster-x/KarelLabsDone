package lab_5.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class DangerousBot extends Robot
{
    public DangerousBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void choosePile(){
        if (whichPile()) {
            turnRight();
        } else {
            turnLeft();
        }
        move();
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public boolean whichPile(){
        int beeperCounter = 0;
        while(nextToABeeper()){
            pickBeeper();
            beeperCounter++;
        }
        return (beeperCounter%2 == 0);
    }
}