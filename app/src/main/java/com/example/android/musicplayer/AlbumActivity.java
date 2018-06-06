package com.example.android.musicplayer;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AlbumActivity extends AppCompatActivity {
    int position;

    ArrayList<Artist> artists1 = new ArrayList <>();

    ImageView cover;
    TextView artist;
    TextView album;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNav);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                // logic to switch song list goes here
                // playing songs is out of scope for this project
                // no logic being implemented this time
                return true;
            }
        });

        // add action bar capabilities on top nav bar
        getSupportActionBar().setTitle("Playing now:");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // bring intent data from MainActivity
        Intent iPlay = getIntent();
        Artist song = iPlay.getParcelableExtra("testIem");
        String artist = song.getArtist();
        String album = song.getAlbum();
        int cover = song.getImageId();


        //create widgets
        ImageView imageView = findViewById(R.id.coverDetail);
        imageView.setImageResource(cover);

        TextView textView1 = findViewById(R.id.songDetail);
        textView1.setText(artist);

        TextView textView2 = findViewById(R.id.artistDetail);
        textView2.setText(album);

        // this section kept mostly to show the process, pertains to an earlier iteration
        // call parcelable - log used to verify data
     /*   ArrayList<Song> songParcelables = getIntent().getParcelableArrayListExtra("dataKey");
        for (Song songfromArray: songParcelables){
            Log.d(this.getClass().getSimpleName(), songfromArray.getArtist());
            Log.d(this.getClass().getSimpleName(), songfromArray.getSong());
            Log.d(this.getClass().getSimpleName(), String.valueOf(songfromArray.getCover()));
        }*/

    }

}
