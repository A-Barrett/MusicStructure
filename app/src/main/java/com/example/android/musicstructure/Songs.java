package com.example.android.musicstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Songs extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.song_list );

        // create an array of songs
        ArrayList<String> songs = new ArrayList<>();

        songs.add( "Where Is The Love, Blackeyed Peas" );
        songs.add( "The Fighter, Keith Urban" );
        songs.add( "Heaven, What Ifs, Kane Brown" );
        songs.add( "Tennessee Whiskey, Chris Stapleton" );
        songs.add( "Highway Don't Care, Don't Take The Girl, Tim Mcgraw" );
        songs.add( "When I Get Where I'm Going, Brad Paisley" );
        songs.add( "If Heaven Wasn't So Far Away, Justin Moore" );
        songs.add( "Where Were You When The World Stopped Turning, Alan Jackson" );
        songs.add( "Huntin' Fishin' And Lovin' Everyday, Luke Bryan" );
        songs.add( "Shine On, Florida Georgia Line" );

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<>( this, android.R.layout.simple_list_item_1, songs );

        ListView listView = findViewById( R.id.list );

        listView.setAdapter( itemsAdapter );

    }
}







