package edu.up.raindrop;

import android.os.Bundle;
import android.widget.SeekBar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

/**
 * @author Carter Chan
 */

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;


        });

        CanvasWall div = findViewById(R.id.canvaswall);
        Controller remote = new Controller(div);

        SeekBar upOrDownBar = findViewById(R.id.upOrDown);
        upOrDownBar.setOnSeekBarChangeListener(remote);

        SeekBar leftOrRightBar = findViewById(R.id.leftOrRight);
        leftOrRightBar.setOnSeekBarChangeListener(remote);
    }


}