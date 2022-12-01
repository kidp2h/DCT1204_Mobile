package com.example.btandroid4_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class ContactInfoActivity extends AppCompatActivity {

    TextView txtName, txtEmail, txtProject;
    Button btnFinish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_info);

        txtName = (TextView) findViewById(R.id.textName);
        txtEmail = (TextView) findViewById(R.id.textEmail);
        txtProject = (TextView) findViewById(R.id.textProject);
        btnFinish = (Button) findViewById(R.id.btnFinish);

        Bundle bundle = getIntent().getExtras();
        txtName.setText(bundle.getString("name"));
        txtEmail.setText(bundle.getString("email"));
        txtProject.setText(bundle.getString("project"));

        btnFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}