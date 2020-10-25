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

public class FarmFrag extends Fragment {
    Button cowbtn,pigbtn,dogbtn,henbtn,chickenbtn,duckbtn,sheepbtn,horsebtn,catbtn;
    MediaPlayer song;
    int currentaudio=0;
    int[]audio=new int[]{R.raw.cowsound,R.raw.pigsound,R.raw.dogsound,R.raw.hensound,R.raw.chickensound,R.raw.ducksound,R.raw.sheepsound,R.raw.horsesound,R.raw.catsound};
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_farm_frag, container, false);

            cowbtn=(Button)view.findViewById(R.id.cow);
            pigbtn=(Button)view.findViewById(R.id.pig);
            dogbtn=(Button)view.findViewById(R.id.dog);
            henbtn=(Button)view.findViewById(R.id.hen);
            chickenbtn=(Button)view.findViewById(R.id.chicken);
            duckbtn=(Button)view.findViewById(R.id.duck);
            sheepbtn=(Button)view.findViewById(R.id.sheep);
            horsebtn=(Button)view.findViewById(R.id.horse);
            catbtn=(Button)view.findViewById(R.id.cat);


            cowbtn.setOnClickListener(new View.OnClickListener() {
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
            pigbtn.setOnClickListener(new View.OnClickListener() {
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
            dogbtn.setOnClickListener(new View.OnClickListener() {
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
            henbtn.setOnClickListener(new View.OnClickListener() {
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
            chickenbtn.setOnClickListener(new View.OnClickListener() {
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
            duckbtn.setOnClickListener(new View.OnClickListener() {
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
            sheepbtn.setOnClickListener(new View.OnClickListener() {
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
            horsebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentaudio=7;
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
            catbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentaudio=8;
                song = MediaPlayer.create(getContext(),audio[currentaudio]);
                song.start();
                }
            });

        return view;
    }
}
