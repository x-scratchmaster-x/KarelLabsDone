package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem3 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem3(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }
    String[] letterArray = new String[]{
        "#####__######__##__#",
        "###_#__####_#__####_",
        "#####___#___#___####",
        "###_#__##__##__####_",
        "#####___###_#___####",
        "#####___###_#___#___",
        "#####___#__##__#####",
        "#__##__######__##__#",
        "####_#___#___#__####",
        "####___#___##__#####",
        "#__##_#_##__#_#_#__#",
        "#___#___#___#___####",
        "######_###_###_###_#",
        "#####__##__##__##__#",
        "#####__##__##__#####",
        "#####__######___#___",
        "#####__#####___#___#",
        "#####__######_#_#__#",
        "#####___####___#####",
        "####_#___#___#___#__",
        "#__##__##__##__#####",
        "#__##__##__#_##__##_",
        "#__##__#####_##__##_",
        "#__##__#_##_#__##__#",
        "#__##__#####___#####",
        "####___######___####",
        "____________________"           // forgot that space doesn't come after letters in ascii. add exception
       };
    public void sayHello(){
        startPos();
        turnRight();
        setWord("MYNAMEJEFF");
        
    }
    public void setWord(String word){
        setLine(0,word);
        setLine(1,word);
        setLine(2,word);
        setLine(3,word);
        setLine(4,word);
        
    }
    public void returnToStart(){
        
    }   
    public void setLine(int line,String word){
        char fillChar = "#".charAt(0);
        for(int i=0;i<word.length();i++){
            char currentChar = word.charAt(i);
            int letterCodeNow = ((int) currentChar) - 65;
            for(int j=0; j<4; j++){                
                if(letterArray[letterCodeNow].charAt(line * 4 + j) == fillChar) {
                    putBeeper();
                };
                move();
              }
            move();
        }
        goNewLine(word.length());
    }
    public void goNewLine(int l){
        turnLeft();
        turnLeft();
        for(int i=0;i<(l*5);i++){
            move();
        }
        turnLeft();
        move();
        turnLeft();
    }
    public void startPos(){
        turnLeft();
        moveThree();
        turnRight();
        moveThree();
        move();
        move();
    }
    public void moveThree(){
        move();
        move();
        move();
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
        
}
