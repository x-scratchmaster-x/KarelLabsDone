package lab_7.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Harvester extends Robot
{
    int[][]field = new int[6][5];
    public Harvester(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void harvest() {
        for(int j=0;j<6;j++) {
            for(int i=0;i<5;i++){
                move();
                if(nextToABeeper()) { field[j][i] = 1; pickBeeper(); }
             }
            moveToFront();
        }
        printField();
    }
    public void turnAround(){
        turnLeft();
        turnLeft();
    }
    public void moveFive(){
        move();
        move();
        move();
        move();
        move();
    }
    public void moveToFront(){
        turnLeft();
        move();
        turnLeft();
        moveFive();
        turnAround();
        
        
    }
    
    public void printField() {
        for(int i=5;i>=0;i--){
            for(int j=0;j<5;j++){
                System.out.print(field[i][j]);
            }
            System.out.println("");
        }
       //Write instructions so that the field is printed to the console after harvesting
    }
   
}

