package lab_2.individual_lab;

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

    public void setField(){
        setRect();
        turnLeft();
        setRect();
    }
    public void setRect(){
        moveSetLShape();
        turnRight();
        lShapeMove();
        turnRight();
        moveSetLShape();
    }
    public void moveSetLShape(){
        moveSet();
        moveSet();
        turnLeft();
        moveSet();
        moveSet();
    }
    public void moveTwo(){
          move();
          move();
    }
    public void lShapeMove(){
        moveTwo();
        turnRight();
        moveTwo();
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void moveSet(){
        move();
        putBeeper();
        move();
    }
}
