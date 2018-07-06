package com.example.android.musicstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static final String KEY_SONG = "KEY_SONG";
    public static final String KEY_ARTIST = "KEY_ARTIST";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Where Is The Love", "Black Eyed Peas"));
        songs.add(new Song("What Ifs", "Kane Brown"));
        songs.add(new Song("The Fighter", "Keith Urban"));
        songs.add(new Song("Heaven", "Kane Brown"));
        songs.add(new Song("Tennessee Whiskey", "Chris Stapleton"));
        songs.add(new Song("Highway Don't Care", "Time Mcgraw"));
        songs.add(new Song("When I Get Where I'm Going", "Brad Paisley"));
        songs.add(new Song("If Heaven Wasn't so Far Away", "Justin Moore"));
        songs.add(new Song("Shine On", "Florida Georgia Line"));
        songs.add(new Song("Don't Take The Girl", "Tim Mcgraw"));
        songs.add(new Song("Huntin' Fishin' And Lovin' Everyday", "Luke Bryan"));

        final SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);

        // When listView item is clicked, item data is sent to new activity
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Song item = adapter.getItem(position);
                Intent nowPlaying = new Intent(getApplicationContext(), NowPlaying.class);
                nowPlaying.putExtra(KEY_SONG, item.getSong());
                nowPlaying.putExtra(KEY_ARTIST, item.getArtist());
                startActivity(nowPlaying);
            }
        });
    }
}


