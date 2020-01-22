package com.example.seemedraw1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ConstraintLayout constraintLayout = findViewById(R.id.layout);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();

        Button btnPlay = (Button) findViewById(R.id.btnPlay);
        Button btnSettings = (Button) findViewById(R.id.btnSettings);
        Button btnAbout = (Button) findViewById(R.id.btnAbout);

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent difficultyMenu = new Intent(getApplicationContext(), DifficultyActivity.class);
                startActivity(difficultyMenu);
            }
        });

        btnSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent settingsMenu = new Intent(getApplicationContext(), SettingsMenu.class);
                startActivity(settingsMenu);
            }
        });

        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aboutMenu = new Intent(getApplicationContext(), AboutMenu.class);
                startActivity(aboutMenu);
            }
        });

    }
}
