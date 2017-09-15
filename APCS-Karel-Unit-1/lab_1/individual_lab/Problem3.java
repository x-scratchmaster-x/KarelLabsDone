package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem3 extends Robot
{
    public Problem3(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void giveCarlBeeper() {
        turnRight();
        moveThree();
        putBeeper();
        turnRight();
        turnRight();
        moveThree();
        turnRight();
        
        
        //This method should allow karel, who is at (1, 1) to give a beeper to carl (at 1, 4)
        
    }
    public void moveThree(){
        move();
        move();
        move();
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void pickAndMoveBeeper() {
        pickBeeper();
        turnLeft();
        move();
        move();
        putBeeper();
        turnLeft();
        turnLeft();
        move();
        move();
        turnLeft();
        
        //This method is for carl to pick up the beeper from karel and move it two blocks north
    }
   
}