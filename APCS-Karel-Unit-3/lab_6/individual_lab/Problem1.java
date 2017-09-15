package lab_6.individual_lab;
import kareltherobot.*; 
import java.util.Arrays;


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{   
    int[] beeperCount = new int[8];
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
        
    }
    public void sortBeepers() {
        moveToStart();
        for(int i = 0; i<8;i++){
            checkRow(i);
        }
        Arrays.sort(beeperCount);
        moveToStart();
        for(int i = 0; i<8;i++){
            setRow(i);
        }
    }
    public void setRow(int whichRow) {
     for(int i=0; i<beeperCount[whichRow]; i++) {
         putBeeper();
         move();
        }
        goToStreetZero();
    }
    public void checkRow(int whichRow){
        int rowHeight = 0;
        while(nextToABeeper()){
            rowHeight++;
            pickBeeper();
            move();
        }
        beeperCount[whichRow] = rowHeight; 
        goToStreetZero();
               
    }
    public void goToStreetZero(){
        turnLeft();
        turnLeft();
        while(frontIsClear()){
            move();
        }
        turnLeft();
        move();
        turnLeft();
    }
    public void moveToStart(){
        while(!facingSouth()){
            turnLeft();
        }
        while(frontIsClear()){
            move();
        }
        turnRight();
        while(frontIsClear()){
            move();
        }
        turnRight();
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
  
   
}

