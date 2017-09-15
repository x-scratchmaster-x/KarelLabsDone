package lab_4.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void escapeRoom() {
        hitWall();
        turnLeft();
        boolean escaped = false;
        while (!escaped) {
            turnRight();
            if (frontIsClear()) {
                escaped = true;
                move();
            } else {
            turnLeft();
            }
            if (!frontIsClear()) turnLeft();
            move();
        }
    }
    public void hitWall(){
        while(frontIsClear()) move();
    }
   
}

