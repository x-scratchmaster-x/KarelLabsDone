package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  justin
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void rearrangeBeepers() {
        lShapeMove();
        pickNMoveFive();
        turnLeft();
        lShapeMove();
        turnRight();
        dropNMoveFive();
        
    }
    public void lShapeMove(){
        turnLeft();
        moveTwo();
        turnRight();
        moveTwo();
        turnRight();
    }
    public void pickNMove() {
        pickBeeper();
        move();
        }
    public void dropNMove() {
        putBeeper();
        move();
    }
    public void dropNMoveFive() {
        dropNMove();
        dropNMove();
        dropNMove();
        dropNMove();
        dropNMove();
    }
    public void pickNMoveFive() {
        pickNMove();
        pickNMove();
        pickNMove();
        pickNMove();
        pickNMove();
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void moveTwo(){
        move();
        move();
    }   
   
}