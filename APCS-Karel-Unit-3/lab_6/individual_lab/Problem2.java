package lab_6.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    public void getTheBeepers(){
        while(!facingNorth()){
            turnLeft();
        }
        while(!nextToABeeper()){
            move();
        }
        while(nextToABeeper()){
            pickBeeper();
        }
        move();
    }   
    public void goToWall(){
        while(frontIsClear()){
                move();
          }
    }
    public boolean wallOnRight(){
        turnRight();
        boolean wall = !frontIsClear();
        turnLeft();
        return wall;
    }
    public void checkSpot(){
        putBeeper();
        if (!wallOnRight()) turnRight();
        move();
    }
    public void buildFence() {
        getTheBeepers();
        turnRight();
        goToWall();
        turnLeft();
        while(anyBeepersInBeeperBag()) {
            checkSpot();
        }
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
   
}

