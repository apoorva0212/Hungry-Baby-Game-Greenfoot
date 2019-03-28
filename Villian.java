import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Villian here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Villian extends Animal
{
    /**
     * Act - do whatever the Villian wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(2);
        if(atWorldEdge())
        {
            turn(90);
        }  
        if(isTouching(Baby.class))
        {
        eat(Baby.class);
         getWorld().getBackground().drawImage(new GreenfootImage("OH MY GOD!! YOU LOST.....",40,Color.WHITE, Color.BLUE),100,200);
         Greenfoot.stop();
       
        }
        if(canSee(Food.class))
        eat(Food.class);
}
}
