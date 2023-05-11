package com.example.myoel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class matching_carpool extends AppCompatActivity {

        private ListView carsListView;
        private TextView bookingStatusTextView;

        private String[] availableCars = {"Car: City\nRoute: Gulshan-E-Iqbal", "Car: Alto\nRoute: Malir", "Car: Cultus\nRoute: Clifton"};

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_matching_carpool);

            carsListView = findViewById(R.id.carsListView);
            bookingStatusTextView = findViewById(R.id.bookingStatusTextView);

            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_single_choice, availableCars);
            carsListView.setAdapter(adapter);
            carsListView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        }

        public void onBookButtonClick(View view) {
            int selectedCarIndex = carsListView.getCheckedItemPosition();

            if (selectedCarIndex != ListView.INVALID_POSITION) {
                String selectedCar = availableCars[selectedCarIndex];

                boolean bookingStatus = performCarBooking(selectedCar);

                if (bookingStatus) {
                    bookingStatusTextView.setText("Booking successful for " + selectedCar);
                } else {
                    bookingStatusTextView.setText("Booking failed for " + selectedCar);
                }
            } else {
                bookingStatusTextView.setText("Please select a car to book");
            }
        }

        private boolean performCarBooking(String car) {
            boolean bookingStatus = true;


            return bookingStatus;
        }
    }
