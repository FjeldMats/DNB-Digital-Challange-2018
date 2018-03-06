package com.example.matsfjeld.valutta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class travelOverview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel_overview);
        if (getIntent().getExtras() != null) {
            Bundle pac = getIntent().getExtras();
             TextView am = findViewById(R.id.balance);
            am.setText("You account balance:\n\n\n\n" + pac.getDouble("amount"));
        }
    }
}
