package com.example.real_home_work;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView niceDay,helloWorld;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        niceDay = findViewById(R.id.text_nice_day);
        helloWorld = findViewById(R.id.hello_world);
        Intent intent = getIntent();
        final String text = intent.getStringExtra("text");
        niceDay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        helloWorld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helloWorld.setText(text);
            }
        });

    }
}
