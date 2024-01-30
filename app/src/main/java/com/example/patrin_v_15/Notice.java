package com.example.patrin_v_15;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Notice extends AppCompatActivity implements View.OnClickListener{
    @Override
    public void onClick(View v) {
    }
    public void back(View v){
        Intent intent = new Intent(this, PersonalArea.class);
        startActivity(intent);
    }
}
