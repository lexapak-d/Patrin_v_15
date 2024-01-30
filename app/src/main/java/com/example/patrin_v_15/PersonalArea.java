package com.example.patrin_v_15;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class PersonalArea extends AppCompatActivity implements View.OnClickListener{
    Button btn;
    ImageButton btn1, btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personal_area);
        btn = findViewById(R.id.buttongoogle);
        btn.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
       Intent webintent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.invitro.ru"));

       }
       public void exit(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
       }
    public void notice(View v){
        Intent intent = new Intent(this, Notice.class);
        startActivity(intent);
    }
    }



