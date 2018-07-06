package com.example.android.musicstructure;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Activity context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }


    static class ViewHolder {
        private TextView songTextView;
        private TextView artistTextView;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Song currentSong = getItem(position);

        ViewHolder holder;


        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_main, parent, false);
            holder = new ViewHolder();

            holder.songTextView = convertView.findViewById(R.id.song_text_view);
            holder.artistTextView = convertView.findViewById(R.id.artist_text_view);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }


        holder.songTextView.setText(currentSong.getSong());
        holder.artistTextView.setText(currentSong.getArtist());

        return convertView;
    }
}
