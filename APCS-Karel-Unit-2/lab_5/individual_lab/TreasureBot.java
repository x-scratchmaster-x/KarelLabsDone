package lab_5.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class TreasureBot extends Robot
{
    public TreasureBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    public void faceWest(){
        while (!facingWest()){
            turnLeft();
        }
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void turnByBeeper(){
        int turns = 0;
        faceWest();
        while(nextToABeeper()){
            turnRight();
            pickBeeper();
            turns++;
        if (turns==5) turnOff();
    }
    }
    public void findTreasure() {
        boolean foundTreasure = false;
        while (!foundTreasure){
            
            if(nextToABeeper()){
                turnByBeeper();
            }
            move();
        }
    }
   
}

