package com.example.swachhbharat;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.swachhbharat.ui.login.LoginActivity;

//import com.example.swachhbharat.data.Main2Activity;

public class MainActivity extends AppCompatActivity {
    private Button button1,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=(Button) findViewById(R.id.rectangle_3);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
        button2 = (Button) findViewById(R.id.rectangle_2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
//                button2.setTextColor(Color.GRAY);
            }
        });

        //transparent status bar
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window w = getWindow();
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }
    }

    private void openActivity2() {
        Intent intent=new Intent(this, Main2Activity.class);
//        button1.setTextColor(Color.WHITE);
        startActivity(intent);

    }
    private void openActivity3() {
        Intent intent=new Intent(this,  LoginActivity.class);
//        button2.setTextColor(Color.WHITE);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
//        button1.setTextColor(Color.WHITE);
//        button2.setTextColor(Color.WHITE);

    }
}

