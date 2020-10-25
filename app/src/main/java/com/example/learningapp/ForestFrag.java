package com.example.learningapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class ForestFrag extends Fragment {
    Button lionbtn,elphantbtn,zebrabtn,alligatorbtn,monkeybtn1,monkeybtn2,monkeybtn3,birdbtn,parrotbtn;
    MediaPlayer song;
    int currentaudio=0;
    int[]audio=new int[]{R.raw.lionroar,R.raw.elephantsound,R.raw.zebrasound,R.raw.alligatorsound,R.raw.monkeysound,R.raw.chicksound,R.raw.parrotsound};
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_forest_frag, container, false);

        lionbtn=(Button)view.findViewById(R.id.lion);
        elphantbtn=(Button)view.findViewById(R.id.elephant);
        zebrabtn=(Button)view.findViewById(R.id.zebra);
        alligatorbtn=(Button)view.findViewById(R.id.alligator);
        monkeybtn1=(Button)view.findViewById(R.id.monkey1);
        monkeybtn2=(Button)view.findViewById(R.id.monkey2);
        monkeybtn3=(Button)view.findViewById(R.id.monkey3);
        birdbtn=(Button)view.findViewById(R.id.bird);
        parrotbtn=(Button)view.findViewById(R.id.parrot);

        lionbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentaudio=0;
                song = MediaPlayer.create(getContext(),audio[currentaudio]);
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
        elphantbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentaudio=1;
                song = MediaPlayer.create(getContext(),audio[currentaudio]);
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
        zebrabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentaudio=2;
                song = MediaPlayer.create(getContext(),audio[currentaudio]);
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
        alligatorbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentaudio=3;
                song = MediaPlayer.create(getContext(),audio[currentaudio]);
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
        monkeybtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentaudio=4;
                song = MediaPlayer.create(getContext(),audio[currentaudio]);
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
        monkeybtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentaudio=4;
                song = MediaPlayer.create(getContext(),audio[currentaudio]);
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
        monkeybtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentaudio=4;
                song = MediaPlayer.create(getContext(),audio[currentaudio]);
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
        birdbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentaudio=5;
                song = MediaPlayer.create(getContext(),audio[currentaudio]);
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
        parrotbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentaudio=6;
                song = MediaPlayer.create(getContext(),audio[currentaudio]);
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
