import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Bomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomb extends Animal
{
    /**
     * Act - do whatever the Bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX(), getY()+2);
        if(canSee(Baby.class))
        {
            eat(Baby.class);
         getWorld().getBackground().drawImage(new GreenfootImage("OH MY GOD!! YOU LOST.....",40,Color.WHITE, Color.BLUE),100,200);
         Greenfoot.stop();
        }    
         if(canSee(Food.class))
        {
            eat(Food.class);
        }  
        
         if(getY()>getWorld().getHeight()-10)
         {
         getWorld().removeObject(this);
         }
}
}

