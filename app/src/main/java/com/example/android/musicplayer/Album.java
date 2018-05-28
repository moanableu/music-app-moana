package com.example.android.musicplayer;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toolbar;

public class Album extends AppCompatActivity {
    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNav);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                //logic to switch song list goes here
                return true;
            }
        });

        // update action bar capabilities on top nav bar, remove once bottom menu is actionable!!
        getSupportActionBar().setTitle("Playing");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        /*Intent detailIntent = getIntent();
        position = detailIntent.getIntExtra("position", 0);*/
    }

}
