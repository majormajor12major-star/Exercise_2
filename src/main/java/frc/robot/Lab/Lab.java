package frc.robot.Lab;

import frc.robot.Scratchbot.Scratchbot;



public class Lab 
{
    public static void randbot()
    {
        int x = (int)(Math.random() * 3);
        System.out.println(x);
    }





    public static void runLab() 
    {
        Lab derive = new Lab();

        Lab.randbot();


    }

}