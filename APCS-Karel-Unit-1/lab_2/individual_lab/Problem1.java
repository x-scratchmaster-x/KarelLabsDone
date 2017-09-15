package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem1 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem1(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }
    public void moveThree(){
        move();
        move();
        move();
    }
    public void firstL(){
        turnLeft();
        moveThree();
        move();
        turnRight();
        moveThree();
        move();
        turnRight();
    }
    public void setPins(){
        firstL();
       topRow();
        rightLMove();
        movePut();
        movePut();
        leftLMove();
        movePut();
        rightLMove();
    }
    public void topRow(){
        movePut();
        movePut();
        movePut();
        movePut();
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void movePut(){
        move();
        putBeeper();
        move();
       
    }
    public void rightLMove(){
        turnRight();
        move();
        turnRight();
        move();
        movePut();
    }
    public void leftLMove(){
        turnLeft();
        move();
        turnLeft();
        move();
        movePut();
    }
}
