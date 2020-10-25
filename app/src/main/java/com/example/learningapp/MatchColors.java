package com.example.learningapp;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.view.ViewGroup.LayoutParams;
import android.widget.Toast;

import java.util.ArrayList;

public class MatchColors extends AppCompatActivity {

    RelativeLayout relativeLayout;
    Button img1,img2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        setContentView(R.layout.activity_match_colors);

        img1=(Button) findViewById(R.id.button4);
        img2=(Button) findViewById(R.id.button5);

        View.OnTouchListener handleTouch = new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {

                int x = (int) event.getX();
                int y = (int) event.getY();

                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        Log.i("TAG", "touched down");
                        Toast.makeText(getApplicationContext(),"down",Toast.LENGTH_LONG).show();
                        break;
                    case MotionEvent.ACTION_MOVE:
                        Log.i("TAG", "moving: (" + x + ", " + y + ")");
                        Toast.makeText(getApplicationContext(),"moving",Toast.LENGTH_LONG).show();
                        break;
                    case MotionEvent.ACTION_UP:
                        Log.i("TAG", "touched up");
                        Toast.makeText(getApplicationContext(),"up",Toast.LENGTH_LONG).show();
                        break;
                }
                if(x>700)
                {
                    Toast.makeText(getApplicationContext(),"success",Toast.LENGTH_LONG).show();
                }
                //Toast.makeText(getApplicationContext(),Integer.toString(x),Toast.LENGTH_LONG).show();
                return true;
            }
        };
        img1.setOnTouchListener(handleTouch);
        //button = (Button)findViewById(R.id.button);

    }
}