import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class escolher here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class escolher extends World
{
    int valor = 1;
    public int temp = 20;
    /**
     * Constructor for objects of class escolher.
     * 
     */
    public escolher()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1); 
    }
    
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    public void act(){
    if (Greenfoot.isKeyDown("1")){
    valor = 1;
    }
    else if (Greenfoot.isKeyDown("space") && valor == 1){
        Greenfoot.setWorld(new Mundo1());
    }
    if (Greenfoot.isKeyDown("2")){
    valor = 2;
    }
    else if (Greenfoot.isKeyDown("space")&& valor == 2){
        Greenfoot.setWorld(new Mundo2());
    }
     if (Greenfoot.isKeyDown("3")){
    valor = 3;
    }
    else if (Greenfoot.isKeyDown("space")&& valor == 3){
        Greenfoot.setWorld(new Mundo3());
    }
     if (Greenfoot.isKeyDown("4")){
    valor = 4;
    }
    else if (Greenfoot.isKeyDown("space")&& valor == 4){
        Greenfoot.setWorld(new Mundo4());
    }
    }
}
