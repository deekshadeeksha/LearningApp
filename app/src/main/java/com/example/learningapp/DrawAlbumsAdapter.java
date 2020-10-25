package com.example.learningapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
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
public class DrawAlbumsAdapter extends RecyclerView.Adapter<DrawAlbumsAdapter.MyViewHolder> {
    String levelget;
    private Context mContext;
    private List<Album> albumList;
    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, count;
        public ImageView thumbnail;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
          //  count = (TextView) view.findViewById(R.id.count);
            thumbnail = (ImageView) view.findViewById(R.id.thumbnail);
            thumbnail.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String s=title.getText().toString();
                    if(s.equals("Apple")) {
                        Intent intent = new Intent(v.getContext(), DrawingLV2.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("image", R.drawable.apple);
                        intent.putExtras(bundle);

                        v.getContext().startActivity(intent);
                    }

                    else if(s.equals("Frock")) {
                        Intent intent = new Intent(v.getContext(), DrawingLV2.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("image", R.drawable.frock);
                        intent.putExtras(bundle);

                        v.getContext().startActivity(intent); }
                    else if(s.equals("Strawberry")) {
                        Intent intent = new Intent(v.getContext(), DrawingLV2.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("image", R.drawable.strawberry);
                        intent.putExtras(bundle);
                        v.getContext().startActivity(intent);

                    }
                    else if(s.equals("Flower")) {
                        Intent intent = new Intent(v.getContext(), DrawingLV2.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("image", R.drawable.flow);
                        intent.putExtras(bundle);
                        v.getContext().startActivity(intent);

                    }
                    else if(s.equals("Dog")) {
                        Intent intent = new Intent(v.getContext(), DrawingLV2.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("image", R.drawable.dog1);
                        intent.putExtras(bundle);
                        v.getContext().startActivity(intent);

                    }
                    else if(s.equals("Butterfly")) {
                        Intent intent = new Intent(v.getContext(), DrawingLV2.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("image", R.drawable.butterfly1);
                        intent.putExtras(bundle);
                        v.getContext().startActivity(intent);

                    }

                }
            });
        }
    }


    public DrawAlbumsAdapter(Context mContext, List<Album> albumList) {
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
