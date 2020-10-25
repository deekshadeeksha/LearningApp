package com.example.learningapp;

import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class ColorClick extends AppCompatActivity {
    RelativeLayout layout;
    MediaPlayer song;
    ImageView iv;
    int[] images = new int[] {R.drawable.bluesplashsmall, R.drawable.greensplashsmall, R.drawable.graysplashsmall,R.drawable.orangesplashsmall,R.drawable.pinksplashsmall,R.drawable.purplesplashsmall,R.drawable.redsplashsmall,R.drawable.yellowsplashsmall};
    int[]audio=new int[]{R.raw.blue,R.raw.green,R.raw.grey,R.raw.orange,R.raw.pink,R.raw.purple,R.raw.red,R.raw.yellow};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_click);
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        layout = (RelativeLayout) findViewById(R.id.rellayout);

        final Animation fadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_out);

        layout.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    int x = (int) event.getX();
                    int y = (int) event.getY();
                    RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(
                            RelativeLayout.LayoutParams.WRAP_CONTENT,
                            RelativeLayout.LayoutParams.WRAP_CONTENT);
                    iv = new ImageView(getApplicationContext());
                    Drawable d = getResources().getDrawable(R.drawable.bluesplashsmall);
                    int h = d.getIntrinsicHeight();
                    int w = d.getIntrinsicWidth();
                    lp.setMargins(x - w/2, y - h/2, 0, 0);
                    iv.setLayoutParams(lp);
                    int imageId = (int)(Math.random() * images.length);
                    iv.setBackgroundResource(images[imageId]);
                    song = MediaPlayer.create(ColorClick.this,audio[imageId]);
                    song.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            mp.reset();
                            mp.release();
                            song = null;
                        }
                    });
                    song.start();
                    iv.startAnimation(fadeInAnimation);
                    ((ViewGroup) v).addView(iv);
                    iv.postDelayed(new Runnable() {
                        public void run() {
                            iv.setVisibility(View.GONE);
                        }
                    }, 6000);
                }
                return false;
            }
        });

    }
    public void goBackcc(View v)
    {
        this.finish();
    }
}
