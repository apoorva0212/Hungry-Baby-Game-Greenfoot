import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class Baby here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Baby extends Animal
{
    /**
     * Act - do whatever the Baby wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int count=0;
    public void act() 
    {
    //move(2);
    checkKeyPress();
    if(canSee(Food.class))
    {
        eat(Food.class);
        count=count+1;
    }
    checkWinFood();
}
public void checkWinFood()
   {
    if(count==15)
    {
        getWorld().getBackground().drawImage(new GreenfootImage("BABY IS FULL !! YOU WIN",40,Color.WHITE, Color.BLUE),100,200);
        Greenfoot.stop();
    }
    }
public void checkKeyPress()
   {
    if(Greenfoot.isKeyDown("left"))
    {
        setLocation(getX()-5,getY());
    }
    if(Greenfoot.isKeyDown("right"))
    {
        setLocation(getX()+5,getY());
    }
    if(Greenfoot.isKeyDown("up"))
    {
        setLocation(getX(),getY()-5);
    }
    if(Greenfoot.isKeyDown("down"))
    {
        setLocation(getX(),getY()+5);
    }
   }

    }

       

