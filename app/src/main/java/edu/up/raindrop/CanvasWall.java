package edu.up.raindrop;

import static java.lang.Math.sqrt;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.SurfaceView;

import java.util.Random;

/*
    External Citation
    Date: February 2 2025
    Problem: Didn't know where to start

    Resource: Last Week Thursday's lecture Code

    Solution: Copied the Lecture code

 */
public class CanvasWall extends SurfaceView
{
    Random rng = new Random();
    int dotDraw = rng.nextInt(6,13);
    private int mainIndex = rng.nextInt(dotDraw);
    private final Drop[] drops = new Drop[dotDraw];

    public CanvasWall(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        setWillNotDraw(false);

        //initialize the array
        for(int i = 0; i < dotDraw; i++)
        {
            drops[i] = new Drop();
        }

    }
    public void mainXCoord(int x)
    {
        drops[mainIndex].setXPos(x);
        invalidate();
    }

    public void mainYCoord(int y)
    {
        drops[mainIndex].setYPos(y);
        invalidate();
    }

    public void merge()
    {
        for(int i = 0; i < drops.length; i++)
        {
            if(i != mainIndex)
            {
                if(Math.abs(drops[mainIndex].x-drops[i].x) < 30 && Math.abs(drops[mainIndex].y-drops[i].y) < 30)
                {
                    drops[i].setInvisible();
                    drops[mainIndex].size += 1;
                }
            }
        }
    }

    @Override
    public void onDraw(Canvas wall)
    {
        for(Drop drop : drops)
        {
            drop.draw(wall);
        }
    }
}
