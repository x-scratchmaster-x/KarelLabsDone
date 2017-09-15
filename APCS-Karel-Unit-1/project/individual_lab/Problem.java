package lab_3.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem extends Problem2
{
    
    /**
     * Constructor for objects of class Problem1
     */
    public Problem(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }
    public void turnAround(){
        turnLeft();
        turnLeft();
    }
    public void carpetRoom(){
        move();
        for( int i = 0;i<8;i++){ //Overarching function, loops "findCorner"
            turnLeft();
            findCorner(0);
            turnLeft();
            move();
        }
        turnOff();
    }
    public void findCorner(int square){ //Origionaly called to be zero. 
        move();
        if (betweenWalls()) {
            if(!frontIsClear()){
                turnAround(); foundEnd(square, true); //foundEnd successfuly
            } else if (square > 4){
                turnAround(); foundEnd(square, false); //foundEnd unsucessfuly
            } else {
                findCorner(square+1); //Recursivley calls findCorner again, with raised "square" value
            } //This allows us to keep track of what square we're on, and move back the right number of squares
        } else { turnAround(); foundEnd(square, false); }
    }
    public void foundEnd(int y, boolean success){
        if (y>=0) { //If not at the end
            if (success) { //If  we determined it was a "room"
                System.out.println(success);
                putBeeper();
            }
            move();
            foundEnd(y-1, success); //Recursivley calls self
        }
        
        System.out.println("Found corner: " + y);
    }
}

