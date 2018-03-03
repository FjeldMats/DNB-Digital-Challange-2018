package com.example.matsfjeld.valutta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class bestill extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bestill);
    }

    public void datePopup(View view){
        Intent toDate = new Intent(this, datePicker.class);
        startActivity(toDate);

    }
}
