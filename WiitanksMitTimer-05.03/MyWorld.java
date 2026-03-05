import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

    public class MyWorld extends World
{
    private GameTimer timer;
    
    public MyWorld()
    {    
        // Create a new world with 1200x800 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        prepare();    
        timer = new GameTimer();
    this.addObject(timer, 90, 30);
    }


    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    
    /** äußere Begrenzung */  
    for (int x = 0; x < 13; x++)
        {
            addObject(new wallVertikal(), x * 95 + 33, 33);
        }    
    for (int c = 0; c < 13; c++)
        {
            addObject(new wallVertikal(), c * 95 + 33, 766);
        }    
    for (int v = 13; v > 0; v--)
        {
            addObject(new wallHorizontal(), 33,v * 95);
        }   
    for (int b = 13; b > 0; b--)
        {
            addObject(new wallHorizontal(), 1166,b * 95);
        }   
    /** Hindernise Links */  
        for (int n = 3; n > 0; n--)
            {
                addObject(new wall(), 210,n * 66 +265);
            }  
        for (int m = 2; m > 0; m--)
            {
                addObject(new wall(), 276,m * 66 +140);
            }        
        for (int m = 2; m > 0; m--)
        {
            addObject(new wall(), 276,m * 66 +460);
        }  
    /** Hindernise Rechts */      
        for (int n = 3; n > 0; n--)
            {
                addObject(new wall(), 990,n * 66 +270);
            }  
        for (int m = 2; m > 0; m--)
            {
                addObject(new wall(), 924,m * 66 +145);
            }        
        for (int m = 2; m > 0; m--)
        {
            addObject(new wall(), 924,m * 66 +465);
        } 

    /** Hindernise Oben */      
        for (int a = 3; a > 0; a--)
            {
                addObject(new wall(),a*66 + 470,250);
            }  

    /** Hindernise Unten */    
        for (int a = 3; a > 0; a--)
            {
                addObject(new wall(),a*66 + 470,550);
            }  
    }
}
