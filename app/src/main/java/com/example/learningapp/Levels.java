package com.example.learningapp;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class Levels extends AppCompatActivity {
    ImageView level1,level2,level3;
    Animation animSlide,animSlide2,animSlide3;
    public static String levelnumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levels);
        level1 = (ImageView) findViewById(R.id.img);
        level2 = (ImageView) findViewById(R.id.img2);
        level3 = (ImageView) findViewById(R.id.img3);
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        level1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                levelnumber="level1";
                Intent i=new Intent(getApplicationContext(),MainMenu.class);
                startActivity(i);
            }
        });
        level2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                levelnumber="level2";
                Intent i=new Intent(getApplicationContext(),MainMenu.class);
                startActivity(i);
            }
        });
        level3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                levelnumber="level3";
                Intent i=new Intent(getApplicationContext(),MainMenu.class);
                startActivity(i);
            }
        });


// Load the animation like this
        animSlide = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.slide);
        animSlide2 = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.slide2);
        animSlide3 = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.slide3);

// Start the animation like this
        level1.startAnimation(animSlide);
        level2.startAnimation(animSlide2);
        level3.startAnimation(animSlide3);

    }
    public void goBacklevel(View v)
    {
        this.finish();
    }
}
