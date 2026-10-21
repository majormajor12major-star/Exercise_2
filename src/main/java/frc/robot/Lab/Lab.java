package frc.robot.Lab;

import frc.robot.Scratchbot.Scratchbot;

public class Lab {

    public static void movebot()
    {
        //movement

        Scratchbot.sb_moveForward(1);
        
        //method announcement

        System.out.println("complete");
    }


    public static void turnbot()
        {
            //steering
            Scratchbot.sb_turnClockwise(0.2);
            
            //Method announcement
            System.out.println("steering complete");

        }


    public static void runLab() 
    {
        //code being executed

        movebot();

        turnbot();
        
        movebot(); 
        
        turnbot();
        
        movebot();
        //final code

        System.out.println("methods are complete");
    }

}