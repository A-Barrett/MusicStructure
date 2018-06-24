package com.example.android.musicstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView( R.layout.activity_main );

        // Find the View that shows the songs category
        TextView song_title = (TextView) findViewById( R.id.song_title );

        // Set a click listener on that View
        song_title.setOnClickListener( new View.OnClickListener() {
            // The code in this method will be executed when the songs category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the SongsActivity}
                Intent songsIntent = new Intent( MainActivity.this, Songs.class );

                // Start the new activity
                startActivity( songsIntent );
            }
        } );

        // Find the View that shows the artist category
        TextView song_artist = (TextView) findViewById( R.id.song_artist );

        // Set a click listener on that View
        song_artist.setOnClickListener( new View.OnClickListener() {
            // The code in this method will be executed when the artist category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the ArtistActivity}
                Intent artistIntent = new Intent( MainActivity.this, Artist.class );

                // Start the new activity
                startActivity( artistIntent );
            }
        } );
    }
}




