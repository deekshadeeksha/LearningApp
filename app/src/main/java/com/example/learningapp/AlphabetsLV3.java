package com.example.learningapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class AlphabetsLV3 extends AppCompatActivity {
    int picture[][]=new int[][]{{R.drawable.ant, R.drawable.alligator, R.drawable.aeroplane},
            {R.drawable.bat, R.drawable.bell, R.drawable.bus},
            {R.drawable.cat, R.drawable.crab, R.drawable.cow},
            {R.drawable.duck1, R.drawable.doctor1, R.drawable.donkey},
            {R.drawable.eye, R.drawable.egg, R.drawable.eagle},
            {R.drawable.frog, R.drawable.fox, R.drawable.flower},
            {R.drawable.girl, R.drawable.grape, R.drawable.goat},
            {R.drawable.house, R.drawable.hat, R.drawable.honey},
            {R.drawable.igloo, R.drawable.ink, R.drawable.iron},
            {R.drawable.jet, R.drawable.jam, R.drawable.juice},
            {R.drawable.kangroo, R.drawable.key, R.drawable.kiwi},
            {R.drawable.lamp, R.drawable.leave, R.drawable.lollipop},
            {R.drawable.milk, R.drawable.moon, R.drawable.monkey},
            {R.drawable.noodles, R.drawable.net, R.drawable.nut},
            {R.drawable.octopus, R.drawable.onion, R.drawable.owl},
            {R.drawable.pie, R.drawable.pencil, R.drawable.pillow},
            {R.drawable.quill, R.drawable.quilt, R.drawable.quail},
            {R.drawable.rice, R.drawable.robot, R.drawable.ring},
            {R.drawable.sun, R.drawable.star1, R.drawable.sky},
            {R.drawable.teddy, R.drawable.tree, R.drawable.train},
            {R.drawable.unicorn, R.drawable.urn, R.drawable.unifrom},
            {R.drawable.vase, R.drawable.van, R.drawable.vegetables},
            {R.drawable.watch, R.drawable.window, R.drawable.whistle},
            {R.drawable.xrayfish, R.drawable.xray, R.drawable.xmas},
            {R.drawable.yak, R.drawable.yarn, R.drawable.yogurt},
            {R.drawable.zoo1, R.drawable.zip, R.drawable.zero}

    };
    String text[][]={{"Ant","Alligator","Aeroplane"},
            {"Bat","Bell","Bus"},
            {"Cat","Crab","Cow"},
            {"Duck","Doctor","Donkey"},
            {"Eye","Egg","Eagle"},
            {"Frog","Fox","Flower"},
            {"Girl","Grape","Goat"},
            {"Hut","Hat","Honey"},
            {"Igloo","Ink","Iron"},
            {"Jet","Jam","Juice"},
            {"Kangaroo","Key","Kiwi"},
            {"Lamp","Leaf","Lollipop"},
            {"Milk","Moon","Monkey"},
            {"Noodles","Net","Nut"},
            {"Ostrich","Onion","Owl"},
            {"Pie","Pencil","Pillow"},
            {"Quill","Quilt","Quail"},
            {"Rice","Robot","Ring"},
            {"Sun","Star","Sky"},
            {"Toy","Tree","Train"},
            {"Unicorn","Urn","Uniform"},
            {"Vase","Van","Vegetables"},
            {"Watch","Window","Whistle"},
            {"X-ray fish","X-ray","Xmas Tree"},
            {"Yak","Yarn","Yogurt"},
            {"Zoo","Zip","Zero"},
    };
    int audio[][]={{R.raw.ant, R.raw.alligator, R.raw.aeroplane},
            {R.raw.bat, R.raw.bell, R.raw.bus},
            {R.raw.cat, R.raw.crab, R.raw.cow},
            {R.raw.duck, R.raw.doctor, R.raw.donkey},
            {R.raw.eye, R.raw.egg, R.raw.eagle},
            {R.raw.frog, R.raw.fox, R.raw.flower},
            {R.raw.girl, R.raw.grapes, R.raw.goat},
            {R.raw.hut, R.raw.hat, R.raw.honey},
            {R.raw.igloo, R.raw.ink, R.raw.iron},
            {R.raw.jet, R.raw.jam, R.raw.juice},
            {R.raw.kangroo, R.raw.key, R.raw.kiwi},
            {R.raw.lamp, R.raw.leaf, R.raw.lollipop},
            {R.raw.milk, R.raw.moon, R.raw.monkey},
            {R.raw.noodles, R.raw.net, R.raw.nut},
            {R.raw.ostrich, R.raw.onion, R.raw.owl},
            {R.raw.pie, R.raw.pencil, R.raw.pillow},
            {R.raw.quill, R.raw.quilt, R.raw.quail},
            {R.raw.rice, R.raw.robot, R.raw.ring},
            {R.raw.sun, R.raw.star, R.raw.sky},
            {R.raw.toy, R.raw.train, R.raw.tree},
            {R.raw.unicorn, R.raw.urn, R.raw.uniform},
            {R.raw.vase, R.raw.van, R.raw.vegetables},
            {R.raw.watch, R.raw.window, R.raw.whistle},
            {R.raw.xfish, R.raw.xray, R.raw.xtree},
            {R.raw.yak, R.raw.yarn, R.raw.yogurt},
            {R.raw.zoo, R.raw.zip, R.raw.zero},

    };
    ImageView img,img2,img3;
    Button next,prev;
    int currentimage=0;
    int text1=0;
    TextView txt,txt2,txt3;
    int currentaudio=0;
    MediaPlayer song,song1,song2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabets_lv3);
         getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        img=(ImageView)findViewById(R.id.imageView);
        img2=(ImageView)findViewById(R.id.imageView3);
        img3=(ImageView)findViewById(R.id.imageView5);

        txt=(TextView)findViewById(R.id.textView);
        txt2=(TextView)findViewById(R.id.textView2);
        txt3=(TextView)findViewById(R.id.textView3);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        img.startAnimation(myAnim);
        img2.startAnimation(myAnim);
        img3.startAnimation(myAnim);
        song = MediaPlayer.create(AlphabetsLV3.this,audio[currentaudio][0]);
        song.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.reset();
                mp.release();
                song = null;
            }
        });
        song.start();

        song1 = MediaPlayer.create(AlphabetsLV3.this,audio[currentaudio][1]);
        song.setNextMediaPlayer(song1);

        song2 = MediaPlayer.create(AlphabetsLV3.this,audio[currentaudio][2]);
        song1.setNextMediaPlayer(song2);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                song = MediaPlayer.create(AlphabetsLV3.this,audio[currentaudio][0]);
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
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                song = MediaPlayer.create(AlphabetsLV3.this,audio[currentaudio][1]);
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
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                song = MediaPlayer.create(AlphabetsLV3.this,audio[currentaudio][2]);
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



        next=(Button)findViewById(R.id.button7);
        prev=(Button)findViewById(R.id.button6);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // int[] picture = new int[]{R.drawable.a, R.drawable.b1, R.drawable.c, R.drawable.d1, R.drawable.e1};
                // Random r = new Random();
                //int n=r.nextInt(4);4
                currentimage++;
                text1++;
                currentimage = currentimage % picture.length;
                text1= text1 % picture.length;
                img.setImageResource(picture[currentimage][0]);
                img2.setImageResource(picture[currentimage][1]);
                img3.setImageResource(picture[currentimage][2]);
                txt.setText(text[text1][0]);
                txt2.setText(text[text1][1]);
                txt3.setText(text[text1][2]);
                img.startAnimation(myAnim);
                img2.startAnimation(myAnim);
                img3.startAnimation(myAnim);
                if (song!= null) {
                    if(song.isPlaying()) {
                        song.stop();
                    }
                    song.release();
                    song= null;
                }
                if (song1!= null) {
                    if(song1.isPlaying()) {
                        song1.stop();
                    }
                    song1.release();
                    song1= null;
                }
                if (song2!= null) {
                    if(song2.isPlaying()) {
                        song2.stop();
                    }
                    song2.release();
                    song2= null;
                }

                currentaudio++;
                currentaudio = currentaudio % audio.length;
                song = MediaPlayer.create(AlphabetsLV3.this,audio[currentaudio][0]);
                song.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.reset();
                        mp.release();
                        song = null;
                    }
                });
                song.start();
                song1 = MediaPlayer.create(AlphabetsLV3.this,audio[currentaudio][1]);
                song.setNextMediaPlayer(song1);

                song2 = MediaPlayer.create(AlphabetsLV3.this,audio[currentaudio][2]);
                song1.setNextMediaPlayer(song2);


            }

        });

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentimage--;
                text1--;
                currentimage = (currentimage + picture.length) % picture.length;
                text1 = (currentimage + text.length) % text.length;

                img.setImageResource(picture[currentimage][0]);
                img2.setImageResource(picture[currentimage][1]);
                img3.setImageResource(picture[currentimage][2]);
                txt.setText(text[text1][0]);
                txt2.setText(text[text1][1]);
                txt3.setText(text[text1][2]);
                img.startAnimation(myAnim);
                img2.startAnimation(myAnim);
                img3.startAnimation(myAnim);
                if (song!= null) {
                    if(song.isPlaying()) {
                        song.stop();
                    }
                    song.release();
                    song= null;
                }
                if (song1!= null) {
                    if(song1.isPlaying()) {
                        song1.stop();
                    }
                    song1.release();
                    song1= null;
                }
                if (song2!= null) {
                    if(song2.isPlaying()) {
                        song2.stop();
                    }
                    song2.release();
                    song2= null;
                }

                currentaudio--;
                currentaudio = (currentaudio + audio.length) % audio.length;
                song = MediaPlayer.create(AlphabetsLV3.this,audio[currentaudio][0]);
                song.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.reset();
                        mp.release();
                        song = null;
                    }
                });
                song.start();
                song1 = MediaPlayer.create(AlphabetsLV3.this,audio[currentaudio][1]);
                song.setNextMediaPlayer(song1);

                song2 = MediaPlayer.create(AlphabetsLV3.this,audio[currentaudio][2]);
                song1.setNextMediaPlayer(song2);

            }
        });


    }
    public void goBackall3(View v)
    {

        if (song!= null) {
            if(song.isPlaying()) {
                song.stop();
            }
            song.release();
            song= null;
        }
        if (song1!= null) {
            if(song1.isPlaying()) {
                song1.stop();
            }
            song1.release();
            song1= null;
        }
        if (song2!= null) {
            if(song2.isPlaying()) {
                song2.stop();
            }
            song2.release();
            song2= null;
        }
        this.finish();
    }
}
