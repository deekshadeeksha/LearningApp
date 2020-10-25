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

public class ShapesFrag extends Fragment {
    Button trainglebtn,squarebtn,ovalbtn,diamondbtn,circlebtn,reactanglebtn,starbtn,heartbtn;
    MediaPlayer song;
    int[]audio=new int[]{R.raw.triangle,R.raw.square,R.raw.oval,R.raw.diamond,R.raw.circle,R.raw.rectangle,R.raw.startouch,R.raw.heart};
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_shapes_frag, container, false);
        trainglebtn=(Button)view.findViewById(R.id.triangle);
        squarebtn=(Button)view.findViewById(R.id.square);
        ovalbtn=(Button)view.findViewById(R.id.oval);
        diamondbtn=(Button)view.findViewById(R.id.diamond);
        circlebtn=(Button)view.findViewById(R.id.circle);
        reactanglebtn=(Button)view.findViewById(R.id.rectangle);
        starbtn=(Button)view.findViewById(R.id.star);
        heartbtn=(Button)view.findViewById(R.id.heart);

        trainglebtn.setOnClickListener(new View.OnClickListener() {
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
        squarebtn.setOnClickListener(new View.OnClickListener() {
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
        ovalbtn.setOnClickListener(new View.OnClickListener() {
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
        diamondbtn.setOnClickListener(new View.OnClickListener() {
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
        circlebtn.setOnClickListener(new View.OnClickListener() {
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
        reactanglebtn.setOnClickListener(new View.OnClickListener() {
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
        starbtn.setOnClickListener(new View.OnClickListener() {
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
        heartbtn.setOnClickListener(new View.OnClickListener() {
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
