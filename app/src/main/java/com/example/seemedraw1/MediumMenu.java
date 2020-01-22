package com.example.seemedraw1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MediumMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medium_menu);

        ConstraintLayout constraintLayout = findViewById(R.id.layout);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();

        Button btnMedium1 = (Button) findViewById(R.id.btnMedium1);
        Button btnMedium2 = (Button) findViewById(R.id.btnMedium2);
        Button btnMedium3 = (Button) findViewById(R.id.btnMedium3);
        Button btnMedium4 = (Button) findViewById(R.id.btnMedium4);
        Button btnMedium5 = (Button) findViewById(R.id.btnMedium5);
        Button btnMedium6 = (Button) findViewById(R.id.btnMedium6);
        Button btnMedium7 = (Button) findViewById(R.id.btnMedium7);
        Button btnMedium8 = (Button) findViewById(R.id.btnMedium8);
        Button btnMedium9 = (Button) findViewById(R.id.btnMedium9);
        Button btnMedium10 = (Button) findViewById(R.id.btnMedium10);
        Button btnMedium11 = (Button) findViewById(R.id.btnMedium11);
        Button btnMedium12 = (Button) findViewById(R.id.btnMedium12);

        btnMedium1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mediumOne = new Intent(getApplicationContext(), MediumOne.class);
                startActivity(mediumOne);
            }
        });

        btnMedium2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mediumTwo = new Intent(getApplicationContext(), MediumTwo.class);
                startActivity(mediumTwo);
            }
        });

        btnMedium3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mediumThree = new Intent(getApplicationContext(), MediumThree.class);
                startActivity(mediumThree);
            }
        });

        btnMedium4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mediumFour = new Intent(getApplicationContext(), MediumFour.class);
                startActivity(mediumFour);
            }
        });

        btnMedium5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mediumFive = new Intent(getApplicationContext(), MediumFive.class);
                startActivity(mediumFive);
            }
        });

        btnMedium6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mediumSix = new Intent(getApplicationContext(), MediumSix.class);
                startActivity(mediumSix);
            }
        });

        btnMedium7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mediumSeven = new Intent(getApplicationContext(), MediumSeven.class);
                startActivity(mediumSeven);
            }
        });

        btnMedium8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mediumEight = new Intent(getApplicationContext(), MediumEight.class);
                startActivity(mediumEight);
            }
        });

        btnMedium9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mediumNine = new Intent(getApplicationContext(), MediumNine.class);
                startActivity(mediumNine);
            }
        });

        btnMedium10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mediumTen = new Intent(getApplicationContext(), MediumTen.class);
                startActivity(mediumTen);
            }
        });

        btnMedium11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mediumEleven = new Intent(getApplicationContext(), MediumEleven.class);
                startActivity(mediumEleven);
            }
        });

        btnMedium12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mediumTwelve = new Intent(getApplicationContext(), MediumTwelve.class);
                startActivity(mediumTwelve);
            }
        });
    }
}
