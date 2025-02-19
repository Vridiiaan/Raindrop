package edu.up.raindrop;

import static java.lang.Math.sqrt;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import java.util.Random;

/*
    External Citation
    Date: February 2 2025
    Problem: Didn't know where to start

    Resource: Last Week Thursday's lecture Code

    Solution: Copied the Lecture code

 */

/**
 * @author Carter Chan
 */
public class Drop
{
    //The initial integers
    protected int x;
    protected int y;
    protected int size = 30; //sets size of drops
    protected Paint paintBucket;
    protected Random rng = new Random();


    //gives the raindrops a random color
    protected void setDropRandomColor()
    {
        //randomizes the rgb values up to 255
        int color = Color.rgb(rng.nextInt(256),
                              rng.nextInt(256),
                              rng.nextInt(256));
        paintBucket = new Paint();
        paintBucket.setColor(color);
    }

    //Default Constructor that gives a Drop, a random location
    public Drop()
    {
        //places in random location
        x = rng.nextInt(800);
        y = rng.nextInt(800);
        //calls random color method
        setDropRandomColor();
    }

    /*
    //Constructor that draws a Drop at a specified location
    public Drop(int posX, int posY)
    {
        //places Drop at random location
        x = posX;
        y = posY;
        //calls random color method
        setDropRandomColor();
    }
    */

    public void setXPos(int newX)
    {
        x = newX;
    }

    public void setYPos(int newY)
    {
        y = newY;
    }

    public void setInvisible()
    {
        paintBucket.setColor(Color.argb(0,0,0,0));
    }

    public void blendColor(Drop drop)
    {
        int red = (drop.getRed())
        int blue = (drop)
        int green =
    }

    //draws the Drop on the Canvas
    public void draw(Canvas wall)
    {
        wall.drawCircle(x, y, size, paintBucket);
    }





}
