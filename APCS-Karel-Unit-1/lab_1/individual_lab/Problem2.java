package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void shuttleRace() {
        move();
        turnRight();
        rightL();
        turnLeft();
        leftL();
        turnLeft();
        leftL();
        turnRight();
        rightL();
    }
    
    public void rightL() {
        move();
        move();
        turnRight();
        move();
        move();
        }
    public void leftL(){
        move();
        move();
        turnLeft();
        move();
        move();
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
   
}