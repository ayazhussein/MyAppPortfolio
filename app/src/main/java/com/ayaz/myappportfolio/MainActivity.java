package com.ayaz.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mButton;
    private Button mButton2;
    private Button mButton3;
    private Button mButton4;
    private Button mButton5;
    private Button mButton6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = (Button)findViewById(R.id.spotify_streamer_button);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This will launch my Spotify Streamer App", Toast.LENGTH_LONG).show();
            }
        });
        mButton2 = (Button)findViewById(R.id.scores_button);
        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This will launch my Scores App", Toast.LENGTH_LONG).show();
            }
        });
        mButton3 = (Button)findViewById(R.id.library_button);
        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This will launch my Library App", Toast.LENGTH_LONG).show();
            }
        });
        mButton4 = (Button)findViewById(R.id.build_it_bigger_button);
        mButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This will launch my Build it Bigger App", Toast.LENGTH_LONG).show();
            }
        });
        mButton5 = (Button)findViewById(R.id.xyz_reader_button);
        mButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This will launch my XYZ reader App", Toast.LENGTH_LONG).show();
            }
        });
        mButton6 = (Button)findViewById(R.id.cap_stone_button);
        mButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This will launch my Capstone App", Toast.LENGTH_LONG).show();
            }
        });
    }
}
