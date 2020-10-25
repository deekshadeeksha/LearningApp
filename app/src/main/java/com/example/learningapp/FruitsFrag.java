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

public class FruitsFrag extends Fragment {
    Button applebtn,wtermelonbtn,strawberrybtn,papayabtn,pineapplebtn,berrybtn,orangebtn,pearbtn;
    MediaPlayer song;
    int[]audio=new int[]{R.raw.apple,R.raw.watermelon,R.raw.strawberry,R.raw.papaya,R.raw.pineapple,R.raw.berry,R.raw.orangetouch,R.raw.pear};
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fruits_frag, container, false);
       applebtn=(Button)view.findViewById(R.id.appleclick);
       wtermelonbtn=(Button)view.findViewById(R.id.watermelon);
       strawberrybtn=(Button)view.findViewById(R.id.strawberry);
       papayabtn=(Button)view.findViewById(R.id.papaya);
       pineapplebtn=(Button)view.findViewById(R.id.pineapple);
       berrybtn=(Button)view.findViewById(R.id.berry);
       orangebtn=(Button)view.findViewById(R.id.orangeclick);
       pearbtn=(Button)view.findViewById(R.id.pear);

        applebtn.setOnClickListener(new View.OnClickListener() {
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
        wtermelonbtn.setOnClickListener(new View.OnClickListener() {
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
        strawberrybtn.setOnClickListener(new View.OnClickListener() {
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
        papayabtn.setOnClickListener(new View.OnClickListener() {
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
        pineapplebtn.setOnClickListener(new View.OnClickListener() {
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
        berrybtn.setOnClickListener(new View.OnClickListener() {
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
        orangebtn.setOnClickListener(new View.OnClickListener() {
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
        pearbtn.setOnClickListener(new View.OnClickListener() {
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
        return view;
    }
}
