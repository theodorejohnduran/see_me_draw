package com.example.seemedraw1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class EasyOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*setContentView(R.layout.activity_easy_one);*/
        PaintView paintView = new PaintView(this);
        setContentView(paintView);

        /*final Button btnPreview = (Button) findViewById(R.id.btnPreview);

        btnPreview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Button btnImagePreviewEasyOne = (Button) findViewById(R.id.btnImagePreviewEasyOne);
                btnImagePreviewEasyOne.setVisibility(View.VISIBLE);
                btnImagePreviewEasyOne.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        btnImagePreviewEasyOne.setVisibility(View.GONE);
                    }
                });

            }
        });*/

        /*ConstraintLayout constraintLayout = findViewById(R.id.layout);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();*/
    }
}
