package com.example.seemedraw1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DifficultyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_difficulty);

        ConstraintLayout constraintLayout = findViewById(R.id.layout);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();

        Button btnEasy = (Button) findViewById(R.id.btnEasy);
        Button btnMedium = (Button) findViewById(R.id.btnMedium);
        Button btnHard = (Button) findViewById(R.id.btnHard);

        btnEasy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent difficultyMenu = new Intent(getApplicationContext(), EasyMenu.class);
                startActivity(difficultyMenu);
            }
        });

        btnMedium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent settingsMenu = new Intent(getApplicationContext(), MediumMenu.class);
                startActivity(settingsMenu);
            }
        });

        btnHard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aboutMenu = new Intent(getApplicationContext(), HardMenu.class);
                startActivity(aboutMenu);
            }
        });
    }
}
