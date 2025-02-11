package edu.up.raindrop;

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

    @Override
    public void onDraw(Canvas wall)
    {
        for(Drop drop : drops)
        {
            drop.draw(wall);
        }
    }
}
