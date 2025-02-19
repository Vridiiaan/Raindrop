package edu.up.raindrop;

import android.widget.SeekBar;

/**
 * @author Carter Chan
 */

public class Controller implements SeekBar.OnSeekBarChangeListener
{
    private CanvasWall _wall;

    public Controller(CanvasWall div)
    {
        _wall = div;
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser)
    {
        if(seekBar.getId() == R.id.upOrDown) {
            _wall.mainYCoord(progress);
            _wall.merge();
            _wall.invalidate();
        }
        else if(seekBar.getId() == R.id.leftOrRight) {
            _wall.mainXCoord(progress);
            _wall.merge();
            _wall.invalidate();
    }




    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar)
    {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar)
    {

    }
}
