import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WorkExperience here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class WorkExperience extends World
{

    /**
     * Constructor for objects of class WorkExperience.
     * 
     */
    public WorkExperience()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        prepare();
    }
public void act()
{
    if(Greenfoot.getRandomNumber(600)<5)
    {
    addObject(new Bomb(), Greenfoot.getRandomNumber(600),0);
    }
       if(getObjects(Food.class).size()==0)
    {
    addObject(new Food(), Greenfoot.getRandomNumber(600),350);
    }
 
}
    

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {

        Bomb bomb = new Bomb();
        addObject(bomb, 47, 40);
        Bomb bomb2 = new Bomb();
        addObject(bomb2, 251, 44);
        Bomb bomb3 = new Bomb();
        addObject(bomb3, 466, 56);
        Bomb bomb4 = new Bomb();
        addObject(bomb4, 576, 42);
        bomb3.setLocation(463, 38);
        bomb4.setLocation(573, 39);
        bomb2.setLocation(190, 35);
        bomb.setLocation(58, 33);
        bomb2.setLocation(257, 35);
        bomb3.setLocation(463, 35);
        bomb4.setLocation(573, 37);
        Baby baby = new Baby();
        addObject(baby, 236, 385);
        baby.setLocation(226, 381);
        Villian villian = new Villian();
        addObject(villian, 97, 380);
        villian.setLocation(97, 373);
        Food food = new Food();
        addObject(food, 45, 385);
        Food food2 = new Food();
        addObject(food2, 302, 380);
        Food food3 = new Food();
        addObject(food3, 443, 379);
        Food food4 = new Food();
        addObject(food4, 566, 384);
        Food food5 = new Food();
        addObject(food5, 177, 383);
        food4.setLocation(565, 374);
        food3.setLocation(443, 377);
        food3.setLocation(443, 374);
        food2.setLocation(310, 372);
        food5.setLocation(176, 373);
        food.setLocation(38, 374);
        baby.setLocation(237, 378);
    }
}
