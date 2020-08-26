package com.example.swachhbharat;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Intent intent = getIntent();
        Bitmap bitmap = (Bitmap) intent.getParcelableExtra("image");
        Bundle bundle = getIntent().getExtras();
        String message = bundle.getString("message");

        ImageView imageView = findViewById(R.id.imageView2);
        imageView.setImageBitmap(bitmap);
        TextView t =findViewById(R.id.textView);
//        Toast toast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
//        toast.show();
        t.setText(message);




        //transparent status bar
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window w = getWindow();
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }
    }

}
