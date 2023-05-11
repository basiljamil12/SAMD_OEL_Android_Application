package com.example.myoel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class trasit_past_purchases extends AppCompatActivity {

    private ListView purchasesListView;

    private String[] transitPasses = {"Car: Alto\nRoute: Gulshan\nFare: 200 PKR", "Car: Civic\nRoute: Malir\nFare: 400 PKR", "Car: Cultus\nRoute:Clifton\nFare: 600 PKR"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trasit_past_purchases);

        purchasesListView = findViewById(R.id.purchasesListView);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, transitPasses);
        purchasesListView.setAdapter(adapter);

        purchasesListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedPass = transitPasses[position];
                showPassDetails(selectedPass);
            }
        });
    }

    private void showPassDetails(String pass) {
        Toast.makeText(this, "Selected purchase: " + pass, Toast.LENGTH_SHORT).show();
    }
}
