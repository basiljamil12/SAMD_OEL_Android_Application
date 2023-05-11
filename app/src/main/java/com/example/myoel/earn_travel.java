package com.example.myoel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View;
public class earn_travel extends AppCompatActivity {
    Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earn_travel);
        button1 = (Button) findViewById(R.id.shareButton);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText priceEditText = findViewById(R.id.priceEditText);
                EditText detailsEditText = findViewById(R.id.detailsEditText);

                String price = priceEditText.getText().toString();
                String details = detailsEditText.getText().toString();

                String message = "Ride shared with price: " + price + ", Details: " + details;
                Toast.makeText(earn_travel.this, message, Toast.LENGTH_SHORT).show();
            }
        });
    }

}
