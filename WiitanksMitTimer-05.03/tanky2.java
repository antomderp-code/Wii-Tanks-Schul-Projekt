import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tanky2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tanky2 extends tanky
{
    /**
     * Act - do whatever the tanky2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
{ 
    moveWithoutOverlap();
    schiessen();

    if (cooldown > 0)
    {
        cooldown--;
    }
}

  public void moveWithoutOverlap() {
    // 1. Position und Rotation merken, bevor wir uns bewegen
    int oldX = getX();
    int oldY = getY();
    int oldRotation = getRotation();

    // 2. Die Steuerung ausführen
    if (Greenfoot.isKeyDown("up")) {
        move(2);
    }
    if (Greenfoot.isKeyDown("down")) {
        move(-2);
    }
    if (Greenfoot.isKeyDown("left")) {
        turn(-3);
    }
    if (Greenfoot.isKeyDown("right")) {
        turn(3);
    }

    // 3. Prüfen: Stecken wir jetzt in einer Wand?
    if (isTouching(wall.class)) {
        // Falls ja: Alles sofort rückgängig machen!
        setLocation(oldX, oldY);
        setRotation(oldRotation);
    }
     if (isTouching(wallHorizontal.class)) {
        // Falls ja: Alles sofort rückgängig machen!
        setLocation(oldX, oldY);
        setRotation(oldRotation);
    } 
    if (isTouching(wallVertikal.class)) {
        // Falls ja: Alles sofort rückgängig machen!
        setLocation(oldX, oldY);
        setRotation(oldRotation);
    }
}

public void schiessen() 
{
    if (Greenfoot.isKeyDown("space") && cooldown == 0) 
    {
        
        fadenKreuz ziel = (fadenKreuz) getWorld().getObjects(fadenKreuz.class).get(0);

        if (ziel != null) {
         
            projektil p = new projektil(this);
            
            
            int x = getX();
            int y = getY();
            getWorld().addObject(p, x, y);

           
            p.turnTowards(ziel.getX(), ziel.getY());

            
            cooldown = 100;
        }
    }
}
private int cooldown = 0;
}
