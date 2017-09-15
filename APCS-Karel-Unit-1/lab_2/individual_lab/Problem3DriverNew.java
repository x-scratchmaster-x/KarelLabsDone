package lab_2.individual_lab;

/**
   @Author:
      Date:
   Teacher: Appel
       Lab: Problem Set 3
      Misc: Karel plants a garden in a cross-shape
  */
import kareltherobot.*;
import java.awt.Color;

public class Problem3DriverNew implements Directions
{
    public static void main(String args[])  {
        Problem3 karel = new Problem3(1, 5, North, -1);
        karel.sayHello();
        karel.turnOff();
    } 

    static {
        World.reset(); 
        World.readWorld("worlds/bigworld.kwld"); 
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(0);  
        World.setVisible(true);
    }
}