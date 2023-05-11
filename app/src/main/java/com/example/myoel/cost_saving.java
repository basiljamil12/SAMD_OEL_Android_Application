package com.example.myoel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cost_saving extends AppCompatActivity {
    Button button1;
    Button button2;
    Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cost_saving);
        button1 = (Button) findViewById(R.id.fareComparisonButton);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity1();
            }
        });
        button2 = (Button) findViewById(R.id.carpoolMatchingButton);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View x) {
                openNewActivity2();
            }
        });
        button3 = (Button) findViewById(R.id.transitPassButton);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View z) {
                openNewActivity3();
            }
        });
    }
    public void openNewActivity1(){
        Intent intent = new Intent(this, fare_comparision.class);
        startActivity(intent);
    }
    public void openNewActivity2(){
        Intent intent = new Intent(this, matching_carpool.class);
        startActivity(intent);
    }
    public void openNewActivity3(){
        Intent intent = new Intent(this, trasit_past_purchases.class);
        startActivity(intent);
    }
}