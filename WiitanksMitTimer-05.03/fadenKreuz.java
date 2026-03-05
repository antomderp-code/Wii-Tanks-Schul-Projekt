import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fadenKreuz here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fadenKreuz extends Actor
{
    /**
     * Act - do whatever the fadenKreuz wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
 
        // Add your action code here.
  public void act()
    {
        if(Greenfoot.isKeyDown("i"))
        {
            setLocation(getX(), getY() -5);
        }
        if(Greenfoot.isKeyDown("k"))
        {
            setLocation(getX(), getY() +5);
        }
        if(Greenfoot.isKeyDown("j"))
        {
            setLocation(getX() -5, getY());
        }
        if(Greenfoot.isKeyDown("l"))
        {
            setLocation(getX() +5, getY());
        }
    }  
}

