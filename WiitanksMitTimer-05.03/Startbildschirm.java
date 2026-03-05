import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Startbildschirm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Startbildschirm extends World
{

    /**
     * Constructor for objects of class Startbildschirm.
     * 
     */
    public Startbildschirm()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        startbildschirmAufbau();
        prepare();
    }

    private void startbildschirmAufbau()
    {
        this.addObject( new Startknopf(),600,400);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
