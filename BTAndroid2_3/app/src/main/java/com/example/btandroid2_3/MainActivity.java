package com.example.btandroid2_3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AlertDialog dialogTime = new AlertDialog.Builder(this).create();
        setContentView(R.layout.activity_main);
        Button btnTime = (Button)findViewById(R.id.bTime);
        btnTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Date now = new Date();
                String message = "Now: "+now.toLocaleString();
                dialogTime.setTitle("Now");
                dialogTime.setMessage(message);
                dialogTime.show();
            }
        });

    }
}