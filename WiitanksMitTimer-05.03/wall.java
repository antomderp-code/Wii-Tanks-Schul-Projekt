import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class wall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class wall extends Actor
{
    /**
     * Act - do whatever the wall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
        // Add your action code here.
        private int steigung;

    public wall()
    {
        steigung = Greenfoot.getRandomNumber(30)+31;
        

    }

    public void act() 
    {
    } 

    public int getSteigung()
    {
        return steigung;
    }
        
    }

