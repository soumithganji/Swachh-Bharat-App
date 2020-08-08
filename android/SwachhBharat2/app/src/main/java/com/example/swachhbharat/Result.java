package com.example.swachhbharat;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        Bitmap imageBitmap = (Bitmap) getIntent().getBundleExtra("imagedata").get("data");

//        String pred = getIntent().getStringExtra("pred");

        ImageView imageView = findViewById(R.id.imageview);
        imageView.setImageBitmap(imageBitmap);
//
//        TextView textView = findViewById(R.id.label);
//        textView.setText(pred);

    }

}
