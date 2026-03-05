import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class GameTimer extends Actor
{
    private long startTime;
    private boolean running = true;
    private GreenfootImage background;

    public GameTimer()
    {
        startTime = System.currentTimeMillis();
        background = new GreenfootImage("timerPanel.png");
        setImage(background);
    }

    public void act()
    {
        if(running)
        {
            long currentTime = System.currentTimeMillis();
            int seconds = (int)((currentTime - startTime) / 1000);

            updateImage(seconds);
        }
    }

       private void updateImage(int totalSeconds)
        {
        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;

        GreenfootImage image = new GreenfootImage(background);
        image.setColor(Color.WHITE);
        image.setFont(new Font("Comic sans", true, false, 24));

        String timeText = String.format("Zeit: %02d:%02d", minutes, seconds);

        image.drawString(timeText, 20, 40);
        setImage(image);
    }

    public void stopTimer()
    {
        running = false;
    }
}
