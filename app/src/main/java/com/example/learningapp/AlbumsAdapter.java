package com.example.learningapp;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by Ravi Tamada on 18/05/16.
 */
public class AlbumsAdapter extends RecyclerView.Adapter<AlbumsAdapter.MyViewHolder> {
    String levelget;
    private Context mContext;
    private List<Album> albumList;
    MediaPlayer song;
    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, count;
        public ImageView thumbnail;
        int[]audio=new int[]{R.raw.twinkle};
        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
          //  count = (TextView) view.findViewById(R.id.count);
            thumbnail = (ImageView) view.findViewById(R.id.thumbnail);
            Levels lv=new Levels();
            levelget=lv.levelnumber;
            thumbnail.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    song = MediaPlayer.create(v.getContext(),audio[0]);
                    song.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            mp.reset();
                            mp.release();
                            song = null;
                        }
                    });
                    song.start();
                    String s=title.getText().toString();
                    if(s.equals("Alphabets")) {
                        if(levelget.equals("level1")) {
                            Intent intent = new Intent(v.getContext(), Alphabets.class);
                            v.getContext().startActivity(intent);
                        }
                        if(levelget.equals("level2")) {
                            Intent intent = new Intent(v.getContext(), AlphabetsLV2.class);
                            v.getContext().startActivity(intent);
                        }
                        if(levelget.equals("level3")) {
                            Intent intent = new Intent(v.getContext(), AlphabetsLV3.class);
                            v.getContext().startActivity(intent);
                        }

                    }
                    else if(s.equals("Numbers")) {
                        if(levelget.equals("level1")) {
                            Intent intent = new Intent(v.getContext(), Numbers.class);
                            v.getContext().startActivity(intent);
                        }
                        if(levelget.equals("level2")) {
                            Intent intent = new Intent(v.getContext(), NumbersLV2.class);
                            v.getContext().startActivity(intent);
                        }
                        if(levelget.equals("level3")) {
                            Intent intent = new Intent(v.getContext(), NumbersLV3.class);
                            v.getContext().startActivity(intent);
                        }


                    }
                    else if(s.equals("Matching")) {
                        if(levelget.equals("level1")) {
                            Intent intent = new Intent(v.getContext(),TouchSpeak.class);
                            v.getContext().startActivity(intent);
                        }
                        if(levelget.equals("level2")) {
                            Intent intent = new Intent(v.getContext(),TouchSpeakLV2.class);
                            v.getContext().startActivity(intent);
                        }
                        if(levelget.equals("level3")) {
                            Intent intent = new Intent(v.getContext(),TouchSpeakLV3.class);
                            v.getContext().startActivity(intent);
                        }

                        // Toast.makeText(v.getContext(), "os version is: " + title, Toast.LENGTH_SHORT).show();
                    }
                    else if(s.equals("Colors")) {
                        if(levelget.equals("level1")) {
                            Intent intent = new Intent(v.getContext(),ColorClick.class);
                            v.getContext().startActivity(intent);
                        }
                        if(levelget.equals("level2")) {
                            Intent intent = new Intent(v.getContext(),ColorClickLV2.class);
                            v.getContext().startActivity(intent);
                        }
                        if(levelget.equals("level3")) {
                            Intent intent = new Intent(v.getContext(),ColorClickLV3.class);
                            v.getContext().startActivity(intent);
                        }

                    }
                    else if(s.equals("Drawing")) {
                        if(levelget.equals("level1")) {
                            Intent intent = new Intent(v.getContext(),Drawing.class);
                            v.getContext().startActivity(intent);
                        }

                        if(levelget.equals("level2")) {
                            Intent intent = new Intent(v.getContext(),ColorImageLV2.class);
                            v.getContext().startActivity(intent);
                        }

                        if(levelget.equals("level3")) {
                            Intent intent = new Intent(v.getContext(),ColorImageLV3.class);
                            v.getContext().startActivity(intent);
                        }
                        // Toast.makeText(v.getContext(), "os version is: " + title, Toast.LENGTH_SHORT).show();
                    }
                    else if(s.equals("Puzzles")) {
                        if(levelget.equals("level1")) {

                            int imageId = (int)(Math.random() * 3);
                            if(imageId==0) {
                                Intent intent = new Intent(v.getContext(), Puzzle.class);
                                v.getContext().startActivity(intent);
                            }
                            if(imageId==1) {
                                Intent intent = new Intent(v.getContext(), PuzzleLV1Part2.class);
                                v.getContext().startActivity(intent);
                            }
                            if(imageId==2) {
                                Intent intent = new Intent(v.getContext(), PuzzleLV1Part3.class);
                                v.getContext().startActivity(intent);
                            }

                            // Toast.makeText(v.getContext(), "os version is: " + title, Toast.LENGTH_SHORT).show();
                        }
                        if(levelget.equals("level2")) {
                            Intent intent = new Intent(v.getContext(), PuzzleLV2.class);
                            v.getContext().startActivity(intent);
                            // Toast.makeText(v.getContext(), "os version is: " + title, Toast.LENGTH_SHORT).show();
                        }
                        if(levelget.equals("level3")) {
                            Intent intent = new Intent(v.getContext(), PuzzleLV3.class);
                            v.getContext().startActivity(intent);
                            // Toast.makeText(v.getContext(), "os version is: " + title, Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            });
        }
    }


    public AlbumsAdapter(Context mContext, List<Album> albumList) {
        this.mContext = mContext;
        this.albumList = albumList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_album_card, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        Album album = albumList.get(position);
        holder.title.setText(album.getName());
        //  holder.count.setText(album.getNumOfSongs());

        // loading album cover using Glide library
        Glide.with(mContext).load(album.getThumbnail()).into(holder.thumbnail);

    }

    /**
     * Showing popup menu when tapping on 3 dots
     */
    private void showPopupMenu(View view) {
        // inflate menu
        PopupMenu popup = new PopupMenu(mContext, view);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.menu_album, popup.getMenu());
        popup.setOnMenuItemClickListener(new MyMenuItemClickListener());
        popup.show();
    }

    /**
     * Click listener for popup menu items
     */
    class MyMenuItemClickListener implements PopupMenu.OnMenuItemClickListener {

        public MyMenuItemClickListener() {
        }

        @Override
        public boolean onMenuItemClick(MenuItem menuItem) {
            switch (menuItem.getItemId()) {
                case R.id.action_add_favourite:
                    Toast.makeText(mContext, "More Details", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.action_play_next:
                    Toast.makeText(mContext, "Ratings", Toast.LENGTH_SHORT).show();
                    return true;
                default:
            }
            return false;
        }
    }

    @Override
    public int getItemCount() {
        return albumList.size();
    }
}
