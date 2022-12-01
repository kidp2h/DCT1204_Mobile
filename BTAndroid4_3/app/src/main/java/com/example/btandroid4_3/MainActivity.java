package com.example.btandroid4_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import android.content.Intent;
import android.net.Uri;

import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnDialCall = (Button) findViewById(R.id.btnDialCall);
        Button btnViewContact = (Button) findViewById(R.id.btnViewContact);
        Button btnSendTo = (Button) findViewById(R.id.btnSendTo);

        btnDialCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:(+84)123456789"));
                startActivity(intent);
            }
        });

        btnViewContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("content://contacts/people/"));
                startActivity(intent);
            }
        });

        btnSendTo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( Intent.ACTION_SENDTO, Uri.parse("sms:9999999"));
                intent.putExtra("sms_body", "Thu bay nay di choi khong?");
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}