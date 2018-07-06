package com.example.android.musicstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.android.musicstructure.MainActivity.KEY_ARTIST;
import static com.example.android.musicstructure.MainActivity.KEY_SONG;

public class NowPlaying extends AppCompatActivity {


      @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_now_playing);

            String playingSong = "";
            String playingArtist = "";

            Intent intent = getIntent();
            if (null != intent) {
                playingSong = intent.getStringExtra(KEY_SONG);
                playingArtist = intent.getStringExtra(KEY_ARTIST);
            }

            TextView playingSongText = (TextView) findViewById(R.id.current_song);
            playingSongText.setText(playingSong);


            TextView playingArtistText = (TextView) findViewById(R.id.current_artist);
            playingArtistText.setText(playingArtist);

            final ImageView playButton = (ImageView) findViewById(R.id.play_button);

            playButton.setTag(1);
            playButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (playButton.getTag().equals(1)) {
                        playButton.setImageResource(R.drawable.play_arrow);
                        playButton.setTag(2);
                    } else {
                        playButton.setImageResource(R.drawable.pause);
                        playButton.setTag(1);
                    }

                }
            });
        }
    }
