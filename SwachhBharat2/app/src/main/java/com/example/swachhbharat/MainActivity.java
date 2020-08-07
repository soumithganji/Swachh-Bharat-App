package com.example.swachhbharat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//import com.example.swachhbharat.data.Main2Activity;
import com.example.swachhbharat.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button) findViewById(R.id.rectangle_3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
        button=(Button) findViewById(R.id.rectangle_2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });
    }

    private void openActivity2() {
        Intent intent=new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
    private void openActivity3() {
        Intent intent=new Intent(this,  LoginActivity.class);
        startActivity(intent);
    }
}

