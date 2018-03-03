package com.example.matsfjeld.valutta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class datePicker extends AppCompatActivity {

    final Intent toBestill = new Intent(this, bestill.class);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker);
        startActivity(toBestill);
    }
}
