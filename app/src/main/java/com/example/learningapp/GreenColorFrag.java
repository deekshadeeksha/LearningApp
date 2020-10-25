package com.example.learningapp;

import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class GreenColorFrag extends Fragment {
    ImageView b, l, u, e;
    MediaPlayer song,song1,song2,song3,song4,song5;
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_green_color_frag, container, false);

        int[] imageButtonIds = {R.id.gg, R.id.gr, R.id.ge2, R.id.ge1, R.id.gn};
        int[]audio=new int[]{R.raw.g,R.raw.r,R.raw.e,R.raw.n,R.raw.green};
        // Array of textViews

        int i = 1;

        for (int viewId : imageButtonIds) {

            ImageView imageButton = (ImageView) view.findViewById(viewId);
            final Animation myAnim = AnimationUtils.loadAnimation(getContext(), R.anim.bounce);
            MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
            myAnim.setStartOffset(i * 800);
            myAnim.setInterpolator(interpolator);
            imageButton.startAnimation(myAnim);

            i++;

        }

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
        song1 = MediaPlayer.create(getContext(),audio[1]);
        song.setNextMediaPlayer(song1);
        song2 = MediaPlayer.create(getContext(),audio[2]);
        song1.setNextMediaPlayer(song2);
        song3 = MediaPlayer.create(getContext(),audio[2]);
        song2.setNextMediaPlayer(song3);
        song4 = MediaPlayer.create(getContext(),audio[3]);
        song3.setNextMediaPlayer(song4);
        song5 = MediaPlayer.create(getContext(),audio[4]);
        song4.setNextMediaPlayer(song5);
        return view;
    }
}
