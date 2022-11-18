package com.example.latarka;
 
import androidx.appcompat.app.AppCompatActivity;
 
import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
 
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button white;
    Button black;
    Button green;
    Button blue;
    LinearLayout bg;
 
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 
        white = findViewById(R.id.white);
        black = findViewById(R.id.black);
        green = findViewById(R.id.green);
        blue = findViewById(R.id.blue);
        bg = findViewById(R.id.bg);
 
        white.setOnClickListener(this);
        black.setOnClickListener(this);
        green.setOnClickListener(this);
        blue.setOnClickListener(this);
    }
 
    @Override
    public void onClick(View view) {
        if (view.getId() == white.getId()) {
            bg.setBackgroundColor(Color.WHITE);
        }
        if (view.getId() == black.getId()) {
            bg.setBackgroundColor(Color.BLACK);
        }
        if (view.getId() == green.getId()) {
            bg.setBackgroundColor(Color.GREEN);
        }
        if (view.getId() == blue.getId()) {
            bg.setBackgroundColor(Color.BLUE);
        }
    }
}