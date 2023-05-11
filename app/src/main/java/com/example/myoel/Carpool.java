package com.example.myoel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Carpool extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carpool);
        button = (Button) findViewById(R.id.planTripButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView EstText = (TextView)findViewById(R.id.travelTimeTextView);
                EstText.setText("Estimated Travel Time: 90 KM");
                TextView FareText = (TextView)findViewById(R.id.fareTextView);
                FareText.setText("Fare Price: 10000 RS");
                TextView TransportText = (TextView)findViewById(R.id.transportOptionsTextView);
                TransportText.setText("Transportation Options: Car");
            }
        });
    }
    }
