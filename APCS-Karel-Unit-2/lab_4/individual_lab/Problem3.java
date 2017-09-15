package lab_4.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem3 extends Problem2
{
    public Problem3(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void closeAllWindows() {
        putBeeper();
        boolean complete = false;
        while (!complete) {
            if(clearOnLeft()) {closeWindow();}
            if(!frontIsClear()) {turnRight();}
            move();
            if(nextToABeeper()) {complete = true; pickBeeper();}
        }
            
    }
    public void closeWindow(){
        turnLeft();
        move();
        putBeeper();
        turnLeft();
        turnLeft();
        move();
        turnLeft();
    }
   
}

