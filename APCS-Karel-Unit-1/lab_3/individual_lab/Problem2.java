package lab_3.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem2 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem2(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void carpetRooms(int t){
        while(t>0){
            carpetRoom();
        t--;
            
        }
    }
 public void carpetRoom(){
        move();
        turnLeft();
        move();
        if (isInCorner()) putBeeper();
        turnLeft();
        turnLeft();
        move();
        turnLeft();
        
    }
    public boolean betweenWalls(){
        turnLeft();
        if (!frontIsClear()) {
            turnLeft();
            turnLeft();
            boolean between = !frontIsClear();
            turnLeft();
            return between;
        }
        turnRight();
        return false;
    }
    public boolean isInCorner(){
        return (betweenWalls() && !frontIsClear());
    }
    public void turnRight(){
           turnLeft();
           turnLeft();
           turnLeft();
    }   
}

