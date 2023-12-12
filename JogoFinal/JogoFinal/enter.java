import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enter extends Actor
{   int time = 10;
    int speed = 20;
    int speedTime = 3;
    GreenfootImage image = getImage();
    public enter()
    {
        image.scale(1, 2);
    }
    
    public void act()
    {
        time += speed;
        if(speed > 1)
        {
            speedTime--;
            if(speedTime == 0)
            {
                speed--;
                speedTime = 3;
            }
        }
        if(time < 600)
        {
            image.scale(time, time);
            GreenfootImage image1 = new GreenfootImage("enter.png");
            image1.scale(image.getHeight() + speed, image.getWidth() + speed);
            setImage(image1);
        }
    }
}
