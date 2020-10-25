package com.example.learningapp;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;

public class Alphabets extends AppCompatActivity {
    ImageView img;
    Button next,prev;
    RotateAnimation anim;
    int i;
    int[] picture= new int[]{R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.g,R.drawable.h
            ,R.drawable.i,R.drawable.j,R.drawable.k,R.drawable.l,R.drawable.m,R.drawable.n,R.drawable.o,R.drawable.p,R.drawable.q,R.drawable.r,R.drawable.s,R.drawable.t,
            R.drawable.u,R.drawable.v,R.drawable.w,R.drawable.x,R.drawable.y,R.drawable.z};
    int[]audio=new int[]{R.raw.a,R.raw.b,R.raw.c,R.raw.d,R.raw.e,R.raw.f,R.raw.g,R.raw.h,R.raw.i,R.raw.j,
            R.raw.k, R.raw.l, R.raw.m, R.raw.n, R.raw.o, R.raw.p,R.raw.q, R.raw.r, R.raw.s, R.raw.t, R.raw.u,
            R.raw.v, R.raw.w, R.raw.x, R.raw.y, R.raw.z};
    int currentimage=0;
    int currentaudio=0;
    MediaPlayer song;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabets);
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        img=(ImageView)findViewById(R.id.imageView);
        prev=(Button)findViewById(R.id.prevbtn);
        next=(Button)findViewById(R.id.nextbtn);

        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        img.startAnimation(myAnim);

        song = MediaPlayer.create(Alphabets.this,audio[currentaudio]);
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
                song = MediaPlayer.create(Alphabets.this,audio[currentaudio]);
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
                song = MediaPlayer.create(Alphabets.this,audio[currentaudio]);
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
                song = MediaPlayer.create(Alphabets.this,audio[currentaudio]);
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
    public void goBackal(View v)
    {
        if (song!= null) {
            if(song.isPlaying()) {
                song.stop();
            }
            song.release();
            song= null;
        }
        this.finish();
    }
}
