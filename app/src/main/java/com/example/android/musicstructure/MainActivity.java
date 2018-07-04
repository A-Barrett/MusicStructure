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
        setContentView(R.layout.activity_main);

        ArrayList<String> song = new ArrayList<>();


        song.add("Where Is The Love, Blackeyed Peas");
        song.add("The Fighter, Keith Urban");
        song.add("Heaven, What Ifs, Kane Brown");
        song.add("Tennessee Whiskey, Chris Stapleton");
        song.add("Highway Don't Care, Don't Take The Girl, Tim Mcgraw");
        song.add("When I Get Where I'm Going, Brad Paisley");
        song.add("If Heaven Wasn't So Far Away, Justin Moore");
        song.add("Where Were You When The World Stopped Turning, Alan Jackson");
        song.add("Huntin' Fishin' And Lovin' Everyday, Luke Bryan");
        song.add("Shine On, Florida Georgia Line");

        final SongAdapter adapter = new SongAdapter(this, song);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);

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




