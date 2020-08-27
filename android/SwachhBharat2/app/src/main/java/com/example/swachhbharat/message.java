package com.example.swachhbharat;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class message extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.message);

//        Bitmap imageBitmap = (Bitmap) getIntent().getBundleExtra("imagedata").get("data");
        Bitmap imageBitmap  = (Bitmap)getIntent().getParcelableExtra("imagedata");
        ImageView imageView = findViewById(R.id.imageView3);
        imageView.setImageBitmap(imageBitmap);

        Button messagesend=findViewById(R.id.messagesend);
        messagesend.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                sendmessage();
            }
        });

        //transparent status bar
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window w = getWindow();
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }
    }
    private void sendmessage() {
        String text;
        EditText message=findViewById(R.id.message);
        text= message.getText().toString();
        Intent intent=new Intent();
        intent.putExtra("message",text);
        setResult(RESULT_OK,intent);
        finish();
    }
}
