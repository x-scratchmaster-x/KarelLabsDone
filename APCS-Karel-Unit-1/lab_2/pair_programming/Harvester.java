package lab_2.pair_programming;


import kareltherobot.*; 
/**
 * @author :
 * teacher :
 * due date:
 */
public class Harvester extends Robot
{
    //Constructor method that utilizes the constructor method of the super class (UrRobot)
    public Harvester(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);

    }
    
    public void harvest() {
        twoRows();
        twoRows();
        twoRows();
        turnRight();
        move();
        turnLeft();
        setTwoRows();
        setTwoRows();
        setTwoRows();
        //Complete this method, using the methods you create below so that all rows are harvested
    }
    /**
     * precon: facing east, (1,1)
     * postcon: facing east, (1,3)
     */
    //your methods go below
    public void moveFive() {
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
    }
    public void putFive() {
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void setTwoRows(){
        putFive();
        move();
        turnRight();
        move();
        turnRight();
        putFive();
        move();
        turnLeft();
        move();
        turnLeft();
    }
    public void twoRows() {
        moveFive();
        move();
        turnLeft();
        move();
        turnLeft();
        moveFive();
        move();
        turnRight();
        move();
        turnRight();
    }
    
}

