package com.example.learningapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class AlphabetsLV2 extends AppCompatActivity {
    ImageView img;
    Button next,prev;
    int i;
    int[] picture= new int[]{R.drawable.a1, R.drawable.b2, R.drawable.c1, R.drawable.d1, R.drawable.e2, R.drawable.f1, R.drawable.g1, R.drawable.h1,
            R.drawable.i2, R.drawable.j1, R.drawable.k1, R.drawable.l1, R.drawable.m13, R.drawable.n1, R.drawable.o1, R.drawable.p12, R.drawable.q1,
            R.drawable.r1, R.drawable.s1, R.drawable.t1, R.drawable.u1, R.drawable.v1, R.drawable.w12, R.drawable.x1, R.drawable.y1, R.drawable.z1};
    int[]audio=new int[]{R.raw.apple, R.raw.ball, R.raw.car, R.raw.dog, R.raw.eisforelephant, R.raw.fish, R.raw.giraffe, R.raw.horse, R.raw.icecream, R.raw.jug,
            R.raw.kite, R.raw.lion, R.raw.man, R.raw.nest, R.raw.oisfororange, R.raw.popcorn, R.raw.queen, R.raw.rabbit, R.raw.ship, R.raw.tiger, R.raw.umbrella,
            R.raw.violin, R.raw.water, R.raw.xylo, R.raw.yoyo, R.raw.zebra};

    int currentimage=0;
    int currentaudio=0;
    MediaPlayer song;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabets_lv2);
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        img=(ImageView)findViewById(R.id.imageView);
        next=(Button)findViewById(R.id.nextbtn);
        prev=(Button)findViewById(R.id.prevbtn);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        img.startAnimation(myAnim);
        song = MediaPlayer.create(AlphabetsLV2.this,audio[currentaudio]);
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
                song = MediaPlayer.create(AlphabetsLV2.this,audio[currentaudio]);
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
                song = MediaPlayer.create(AlphabetsLV2.this,audio[currentaudio]);

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
                song = MediaPlayer.create(AlphabetsLV2.this,audio[currentaudio]);
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
    public void goBackall2(View v)
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
