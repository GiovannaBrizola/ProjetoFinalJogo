import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class dio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dio extends Actor
{
    GifImage myGif = new GifImage("d1.gif");
    GifImage myGgif = new GifImage("d2.gif");
    GifImage mygif = new GifImage("d3.gif");
    GifImage myGGif = new GifImage("d4.gif");
    GifImage mygf = new GifImage("d5.gif");
    GifImage myGf = new GifImage("d6.gif");

    int direction = 1;
    
    public int speed = 4;
    GreenfootSound combo = new GreenfootSound("combo.mp3");
    private int sTimer = 0;
    public int temp = 0;
    /**
     * Act - do whatever the miranha wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */public void act()
    {
        setImage(myGif.getCurrentImage());  
        movimento();
        pulo();

    }
    public void movimento(){

          if (Greenfoot.isKeyDown("a")){
            this.setLocation(this.getX()  - speed, this.getY());
            setRotation(360);
            setImage(mygf.getCurrentImage());
            direction = 2;
        }
          else if (Greenfoot.isKeyDown("d")){
            this.setLocation(this.getX()  + speed, this.getY());
             setRotation(360);
             setImage(myGgif.getCurrentImage()); 
             direction = 1;
        }
         else if(direction == 2){
                 setImage(myGGif.getCurrentImage());
                }
    }
    public void pulo(){
        if (Greenfoot.isKeyDown("w") && direction == 1){
             this.setLocation(this.getX(), this.getY() - speed);
             setImage(mygif.getCurrentImage());
        }
          else if (Greenfoot.isKeyDown("w") && direction == 2){
            this.setLocation(this.getX(), this.getY() + speed);
            setImage(myGf.getCurrentImage());
        }
    }
}
