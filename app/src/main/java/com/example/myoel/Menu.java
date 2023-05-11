package com.example.myoel;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        button1 = (Button) findViewById(R.id.carPoolButton);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity1();
            }
        });
        button2 = (Button) findViewById(R.id.earnWhileTravelButton);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View x) {
                openNewActivity2();
            }
        });
        button3 = (Button) findViewById(R.id.transportButton);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View z) {
                openNewActivity3();
            }
        });
        button4 = (Button) findViewById(R.id.costSavingButton);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View w) {
                openNewActivity4();
            }
        });
        button5 = (Button) findViewById(R.id.IntegrationButton);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View w) {
                openNewActivity5();
            }
        });
    }
    public void openNewActivity1(){
        Intent intent = new Intent(this, Carpool.class);
        startActivity(intent);
    }
    public void openNewActivity2(){
        Intent intent = new Intent(this, earn_travel.class);
        startActivity(intent);
    }
    public void openNewActivity3(){
        Intent intent = new Intent(this, transport_track.class);
        startActivity(intent);
    }
    public void openNewActivity4(){
        Intent intent = new Intent(this, cost_saving.class);
        startActivity(intent);
    }
    public void openNewActivity5(){
        Intent intent = new Intent(this, Integration.class);
        startActivity(intent);
    }
}
