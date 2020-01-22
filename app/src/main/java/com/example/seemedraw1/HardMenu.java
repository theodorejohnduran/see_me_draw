package com.example.seemedraw1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HardMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hard_menu);

        ConstraintLayout constraintLayout = findViewById(R.id.layout);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();

        Button btnHard1 = (Button) findViewById(R.id.btnHard1);
        Button btnHard2 = (Button) findViewById(R.id.btnHard2);
        Button btnHard3 = (Button) findViewById(R.id.btnHard3);
        Button btnHard4 = (Button) findViewById(R.id.btnHard4);
        Button btnHard5 = (Button) findViewById(R.id.btnHard5);
        Button btnHard6 = (Button) findViewById(R.id.btnHard6);
        Button btnHard7 = (Button) findViewById(R.id.btnHard7);
        Button btnHard8 = (Button) findViewById(R.id.btnHard8);
        Button btnHard9 = (Button) findViewById(R.id.btnHard9);
        Button btnHard10 = (Button) findViewById(R.id.btnHard10);
        Button btnHard11 = (Button) findViewById(R.id.btnHard11);
        Button btnHard12 = (Button) findViewById(R.id.btnHard12);

        btnHard1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hardOne = new Intent(getApplicationContext(), HardOne.class);
                startActivity(hardOne);
            }
        });

        btnHard2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hardTwo = new Intent(getApplicationContext(), HardTwo.class);
                startActivity(hardTwo);
            }
        });

        btnHard3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hardThree = new Intent(getApplicationContext(), HardThree.class);
                startActivity(hardThree);
            }
        });

        btnHard4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hardFour = new Intent(getApplicationContext(), HardFour.class);
                startActivity(hardFour);
            }
        });

        btnHard5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hardFive = new Intent(getApplicationContext(), HardFive.class);
                startActivity(hardFive);
            }
        });

        btnHard6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hardSix = new Intent(getApplicationContext(), HardSix.class);
                startActivity(hardSix);
            }
        });

        btnHard7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hardSeven = new Intent(getApplicationContext(), HardSeven.class);
                startActivity(hardSeven);
            }
        });

        btnHard8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hardEight = new Intent(getApplicationContext(), HardEight.class);
                startActivity(hardEight);
            }
        });

        btnHard9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hardNine = new Intent(getApplicationContext(), HardNine.class);
                startActivity(hardNine);
            }
        });

        btnHard10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hardTen = new Intent(getApplicationContext(), HardTen.class);
                startActivity(hardTen);
            }
        });

        btnHard11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hardEleven = new Intent(getApplicationContext(), HardEleven.class);
                startActivity(hardEleven);
            }
        });

        btnHard12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hardTwelve = new Intent(getApplicationContext(), HardTwelve.class);
                startActivity(hardTwelve);
            }
        });
    }
}
