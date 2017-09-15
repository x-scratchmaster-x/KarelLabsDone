package lab_4.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Problem1
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    public boolean clearOnLeft(){
        turnLeft();
        boolean wall = frontIsClear();
        turnRight();
        return wall;
    }
    public void plantBeepers() {
        boolean fullPath = false;
        while (!fullPath){
            if(clearOnLeft()) {turnLeft();}
            if(!frontIsClear()) {turnRight();}
            move();
            if(nextToABeeper()) fullPath = true;
            putBeeper();
        }
    }
   
}

