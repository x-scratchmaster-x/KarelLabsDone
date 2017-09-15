package lab_7.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Quad extends Robot
{
    //This array should track 
    int[][]columns = new int[4][5];
    public Quad(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void fixQuad() {
        fixPillar(0);
        fixPillar(1);
        fixPillar(2);
        fixPillar(3);
    }
    public void fixPillar(int where){
        turnLeft();
        for(int i=0;i<4;i++){
            fixSpot(where, i);
            move();
        }
        fixSpot(where,4);
        goBack();
    }
    public void moveThree(){
        move();
        move();
        move();
    }
    public void goBack(){
        turnLeft();
        turnLeft();
        while(frontIsClear()) move();
        turnLeft();
        moveThree();
        move();
        
    }
    public void fixSpot(int x, int y){
        if(!nextToABeeper()){
            putBeeper();
            columns[x][y] = 1;
        }
    }
    public void printFixes() {
        for(int i=0;i<5;i++){
            for(int j=0;j<4;j++){
                System.out.print(columns[j][i]);
            }
            System.out.println("");
        }
        
    }
   
}

