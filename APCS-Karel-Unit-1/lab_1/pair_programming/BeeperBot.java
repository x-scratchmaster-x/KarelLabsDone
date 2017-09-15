package lab_1.pair_programming;
import kareltherobot.*; 


/**
 * @author :  its ya boi justin lee
 */
public class BeeperBot extends Robot
{
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void findAllBeepers() {
        turnLeft();
        turnLeft();
        move();
        move();
        moveAndDoStuff();
        moveAndDoStuff();
        moveAndDoStuff();
        moveAndDoStuff();
        
        
        
      
        
       
        
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void moveThree(){
        move();
        move();
        move();
    }
    
    public void moveAndDoStuff() {
        pickBeeper();
        moveThree();
        turnRight();
    }
}

