package com.example.matsfjeld.valutta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class order extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        Intent intent = getIntent();
        String date = intent.getStringExtra("date");

        TextView showDate= (TextView) findViewById(R.id.dateView);


        showDate.setText(date);
    }

    public void goToDatePopup(View view){
        Intent toDate = new Intent(this, datePicker.class);
        startActivity(toDate);


    }
}
