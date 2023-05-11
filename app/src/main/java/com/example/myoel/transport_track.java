package com.example.myoel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class transport_track extends AppCompatActivity {
    Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transport_track);
        button1 = (Button) findViewById(R.id.trackButton);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Spinner transportSpinner = findViewById(R.id.transportSpinner);
                TextView routeTextView = findViewById(R.id.routeTextView);
                TextView statusTextView = findViewById(R.id.statusTextView);

                String selectedTransport = transportSpinner.getSelectedItem().toString();
                String route = routeTextView.getText().toString();

                fetchRealTimeUpdates(selectedTransport, route, new OnUpdateReceivedListener() {
                    @Override
                    public void onUpdateReceived(String status) {
                        statusTextView.setText(status);
                    }

                });
            }

            private void fetchRealTimeUpdates(String transport, String route, OnUpdateReceivedListener listener) {

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        String status = "Status update for " + transport + ": On the way"+" \n " + route;
                        listener.onUpdateReceived(status);
                    }
                }, 2000); //
            }
            abstract class OnUpdateReceivedListener {
                public abstract void onUpdateReceived(String status);
            }
        });
    }
}