package com.example.myoel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class Integration extends AppCompatActivity {

    private Spinner transportSpinner;
    private TextView resultTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_integration);

        transportSpinner = findViewById(R.id.transportSpinner);
        resultTextView = findViewById(R.id.statusTextView);
        // Customize the list of transportation options based on your requirements
        String[] transportationOptions = {"Careem", "Bykea", "Local Transportation"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, transportationOptions);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        transportSpinner.setAdapter(adapter);
    }

    public void syncData(View view) {
        String selectedTransport = transportSpinner.getSelectedItem().toString();
        resultTextView.setText("Data has been successfully synced to " + selectedTransport);
    }
}
