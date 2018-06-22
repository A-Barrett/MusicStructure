package com.example.android.musicstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Artist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        // create an array of artists
        ArrayList<String> artist = new ArrayList<>();

        artist.add( "Blackeyed Peas, Where Is The Love" );
        artist.add( "Keith Urban, The Fighter" );
        artist.add( "Kayne Brown, Heaven, What Ifs" );
        artist.add( "Chris Stapleton, Tennessee Whiskey" );
        artist.add( "Tim Mcgraw, Highway Don't Care, Don't Take The Girl" );
        artist.add( "Brad Paisley, When I Get Where I'm Going" );
        artist.add( "Justin Moore, If Heaven Wasn't So Far Away" );
        artist.add( "Alan Jackson, Where Were You When The World Stopped Turning" );
        artist.add( "Luke Bryan, Huntin' Fishin' and Lovin' Everyday" );
        artist.add( "Florida Georgia Line, Shine On" );

        ArrayAdapter itemsAdapter = new ArrayAdapter<>( this, android.R.layout.simple_list_item_1, artist );

        ListView listView = (ListView) findViewById( R.id.list_view );

        listView.setAdapter( itemsAdapter );


    }
}

