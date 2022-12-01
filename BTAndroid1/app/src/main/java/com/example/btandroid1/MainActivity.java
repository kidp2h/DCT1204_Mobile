package com.example.btandroid1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        Cach 1: Su dung code Java lop ImageView (not XML)
        ImageView myCat = new ImageView(this);
        myCat.setImageResource(R.drawable.cat);
        setContentView(myCat)
        ;*/
    }
}