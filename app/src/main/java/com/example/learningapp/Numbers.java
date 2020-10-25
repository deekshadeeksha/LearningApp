package com.example.learningapp;

import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class Numbers extends AppCompatActivity {
    ImageView img;
    Button next,prev;
    int i;
    int[] picture= new int[]{R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.four,R.drawable.five,R.drawable.six,R.drawable.seven,R.drawable.eight
            ,R.drawable.nine1,R.drawable.ten};
    int []audio=new int[]{R.raw.one,R.raw.two,R.raw.three,R.raw.four,R.raw.five,R.raw.six,R.raw.seven,R.raw.eight,R.raw.nine,R.raw.ten};
    int currentimage=0;
    int currentaudio=0;
    MediaPlayer song;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        img=(ImageView)findViewById(R.id.imageView);
        next=(Button)findViewById(R.id.button6);
        prev=(Button)findViewById(R.id.button7);

        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        img.startAnimation(myAnim);

        song = MediaPlayer.create(Numbers.this,audio[currentaudio]);
        song.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.reset();
                mp.release();
                song = null;
            }
        });
        song.start();

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                song = MediaPlayer.create(Numbers.this,audio[currentaudio]);
                song.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.reset();
                        mp.release();
                        song = null;
                    }
                });
                song.start();

            }
        });


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // int[] picture = new int[]{R.drawable.a, R.drawable.b1, R.drawable.c, R.drawable.d1, R.drawable.e1};
                // Random r = new Random();
                //int n=r.nextInt(4);4
                currentimage++;
                currentimage = currentimage % picture.length;
                img.setImageResource(picture[currentimage]);
                img.startAnimation(myAnim);
                if (song!= null) {
                    if(song.isPlaying()) {
                        song.stop();
                    }
                    song.release();
                    song= null;
                }

                currentaudio++;
                currentaudio = currentaudio % audio.length;
                song = MediaPlayer.create(Numbers.this,audio[currentaudio]);
                song.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.reset();
                        mp.release();
                        song = null;
                    }
                });
                song.start();



            }

        });
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentimage--;
                currentimage = (currentimage + picture.length) % picture.length;

                img.setImageResource(picture[currentimage]);
                img.startAnimation(myAnim);
                if (song!= null) {
                    if(song.isPlaying()) {
                        song.stop();
                    }
                    song.release();
                    song= null;
                }

                currentaudio--;
                currentaudio = (currentaudio + audio.length) % audio.length;
                song = MediaPlayer.create(Numbers.this,audio[currentaudio]);
                song.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.reset();
                        mp.release();
                        song = null;
                    }
                });
                song.start();


            }
        });

    }
    public void goBackn(View v)
    {
        this.finish();
        if (song!= null) {
            if(song.isPlaying()) {
                song.stop();
            }
            song.release();
            song= null;
        }
    }
}
