package com.example.myoel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class fare_comparision extends AppCompatActivity {

    private Spinner vehicleTypeSpinner;
    private TextView resultTextView;

    private String[] vehicleTypes = {"Car","Bike", "Bus", "Train"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fare_comparision);

        vehicleTypeSpinner = findViewById(R.id.vehicleTypeSpinner);
        resultTextView = findViewById(R.id.resultTextView);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, vehicleTypes);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        vehicleTypeSpinner.setAdapter(adapter);
    }

    public void onCompareButtonClick(View view) {
        String selectedVehicleType = vehicleTypeSpinner.getSelectedItem().toString();

        double fare = performFareComparison(selectedVehicleType);

        resultTextView.setText("Fare for " + selectedVehicleType+": "  + fare+ " PKR");
    }

    private double performFareComparison(String vehicleType) {

        switch (vehicleType) {
            case "Car":
                return 400;
            case "Bike":
                return 150;
            case "Bus":
                return 100;
            case "Train":
                return 1000;
            default:
                return 0;
        }
    }
}