package com.example.learningapp;


import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private StarAnimationView mAnimationView;
    MediaPlayer songmain;
    int[]audio=new int[]{R.raw.mainbacktrack};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        setContentView(R.layout.activity_main);
        mAnimationView = (StarAnimationView) findViewById(R.id.animated_view);
        songmain = MediaPlayer.create(MainActivity.this,audio[0]);
        songmain.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.reset();
                mp.release();
                songmain = null;
            }
        });
        songmain.start();
        songmain.setLooping(true);


        Button button = (Button)findViewById(R.id.button);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);

        button.startAnimation(myAnim);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (songmain!= null) {
                    if(songmain.isPlaying()) {
                        songmain.stop();
                    }
                    songmain.release();
                    songmain= null;
                }
                Intent intent=new Intent(MainActivity.this,Levels.class);
                startActivity(intent);
            }
        });
    }
    public void didTapButton(View view) {
        Button button = (Button)findViewById(R.id.button);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);

        button.startAnimation(myAnim);

    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Toast.makeText(this,"back key is pressed", Toast.LENGTH_SHORT).show();
        songmain.pause();
    }
    @Override
    protected void onPause() {
        super.onPause();

        if(songmain != null)
            songmain.pause();
    }
    @Override
    protected void onResume() {
        super.onResume();

        if(songmain != null)
            songmain.start();
    }
    public void exitnow(View v)
    {
        ExitDialog exd = new ExitDialog(this);
        exd.show();
    }

}
