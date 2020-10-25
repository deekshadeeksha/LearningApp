package com.example.learningapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class VegetablesFrag2 extends Fragment {
    Button peasbtn,onionbtn,garlicbtn,turnipbtn,potatobtn,chilibtn,cauliflowerbtn,carrotbtn,capsicumbtn;
    MediaPlayer song;
    int[]audio=new int[]{R.raw.peastouch,R.raw.oniontouch,R.raw.garlictouch,R.raw.turniptouch,R.raw.potatotouch,R.raw.chilitouch,R.raw.carrottouch,R.raw.cauliflowertouch,R.raw.capsicumtouch};
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_vegetables_frag2, container, false);
        onionbtn=(Button)view.findViewById(R.id.onion2);
        carrotbtn=(Button)view.findViewById(R.id.carrot2);
        cauliflowerbtn=(Button)view.findViewById(R.id.cauliflower2);
        chilibtn=(Button)view.findViewById(R.id.chili2);
        turnipbtn=(Button)view.findViewById(R.id.turnip2);
        potatobtn=(Button)view.findViewById(R.id.potato);
        garlicbtn=(Button)view.findViewById(R.id.garlic2);
        capsicumbtn=(Button)view.findViewById(R.id.capsicum);
        peasbtn=(Button)view.findViewById(R.id.peas2);


        peasbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                song = MediaPlayer.create(getContext(),audio[0]);
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
        onionbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                song = MediaPlayer.create(getContext(),audio[1]);
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
        garlicbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                song = MediaPlayer.create(getContext(),audio[2]);
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
        turnipbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                song = MediaPlayer.create(getContext(),audio[3]);
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
        potatobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                song = MediaPlayer.create(getContext(),audio[4]);
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
        chilibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                song = MediaPlayer.create(getContext(),audio[5]);
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
        carrotbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                song = MediaPlayer.create(getContext(),audio[6]);
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
        cauliflowerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                song = MediaPlayer.create(getContext(),audio[7]);
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
        capsicumbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                song = MediaPlayer.create(getContext(),audio[8]);
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
        return view;
    }
}
