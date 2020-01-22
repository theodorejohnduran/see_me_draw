package com.example.seemedraw1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EasyMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_menu);

        ConstraintLayout constraintLayout = findViewById(R.id.layout);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();

        Button btnEasy1 = (Button) findViewById(R.id.btnEasy1);
        Button btnEasy2 = (Button) findViewById(R.id.btnEasy2);
        Button btnEasy3 = (Button) findViewById(R.id.btnEasy3);
        Button btnEasy4 = (Button) findViewById(R.id.btnEasy4);
        Button btnEasy5 = (Button) findViewById(R.id.btnEasy5);
        Button btnEasy6 = (Button) findViewById(R.id.btnEasy6);
        Button btnEasy7 = (Button) findViewById(R.id.btnEasy7);
        Button btnEasy8 = (Button) findViewById(R.id.btnEasy8);
        Button btnEasy9 = (Button) findViewById(R.id.btnEasy9);
        Button btnEasy10 = (Button) findViewById(R.id.btnEasy10);
        Button btnEasy11 = (Button) findViewById(R.id.btnEasy11);
        Button btnEasy12 = (Button) findViewById(R.id.btnEasy12);

        btnEasy1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent easyOne = new Intent(getApplicationContext(), EasyOne.class);
                startActivity(easyOne);
            }
        });

        btnEasy2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent easyTwo = new Intent(getApplicationContext(), EasyTwo.class);
                startActivity(easyTwo);
            }
        });

        btnEasy3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent easyThree = new Intent(getApplicationContext(), EasyThree.class);
                startActivity(easyThree);
            }
        });

        btnEasy4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent easyFour = new Intent(getApplicationContext(), EasyFour.class);
                startActivity(easyFour);
            }
        });

        btnEasy5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent easyFive = new Intent(getApplicationContext(), EasyFive.class);
                startActivity(easyFive);
            }
        });

        btnEasy6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent easySix = new Intent(getApplicationContext(), EasySix.class);
                startActivity(easySix);
            }
        });

        btnEasy7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent easySeven = new Intent(getApplicationContext(), EasySeven.class);
                startActivity(easySeven);
            }
        });

        btnEasy8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent easyEight = new Intent(getApplicationContext(), EasyEight.class);
                startActivity(easyEight);
            }
        });

        btnEasy9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent easyNine = new Intent(getApplicationContext(), EasyNine.class);
                startActivity(easyNine);
            }
        });

        btnEasy10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent easyTen = new Intent(getApplicationContext(), EasyTen.class);
                startActivity(easyTen);
            }
        });

        btnEasy11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent easyEleven = new Intent(getApplicationContext(), EasyEleven.class);
                startActivity(easyEleven);
            }
        });

        btnEasy12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent easyTwelve = new Intent(getApplicationContext(), EasyTwelve.class);
                startActivity(easyTwelve);
            }
        });
    }
}
