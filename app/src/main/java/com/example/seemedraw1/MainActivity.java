package com.example.seemedraw1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    long animationduration = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent kissbabypresents = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(kissbabypresents);
                overridePendingTransition(R.anim.fade_in,R.anim.fade_out);

                finish();
            }
        }, animationduration);
    }
}
