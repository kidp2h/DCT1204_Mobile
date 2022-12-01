package com.example.btandroid5_4;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    MediaPlayer mPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPlayer = MediaPlayer.create(this, R.raw.gangnam);
        setContentView(new GraphicsView(this, mPlayer));

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        mPlayer.release();
        finish();
    }
}