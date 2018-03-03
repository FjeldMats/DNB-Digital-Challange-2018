package com.example.matsfjeld.valutta;

import android.app.DownloadManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Spinner;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.HashMap;
import java.util.*;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class order extends AppCompatActivity {


    Spinner currencySpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        Intent intent = getIntent();
        String date = intent.getStringExtra("date");

        TextView showDate=  findViewById(R.id.dateView);

        currencySpinner = findViewById(R.id.currencySpinner);


        showDate.setText(date);

        List<String> currency = new ArrayList<String>();
        currency.add("GBP");
        currency.add("EUR");
        currency.add("USD");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, currency);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        currencySpinner.setAdapter(dataAdapter);

    }

    public void goToDatePopup(View view){
        Intent toDate = new Intent(this, datePicker.class);
        startActivity(toDate);

    }

    public void continueToOrder(View view){

        String currStr = currencySpinner.getSelectedItem().toString();

        Intent toContinueToOrder =  new Intent(this, preOverview.class );
        toContinueToOrder.putExtra("date",currStr);
        startActivity(toContinueToOrder);
    }

    public void automaticSettings(View view){
        Intent toAutomaticSettings  = new Intent(this, smartAmount.class);
        startActivity(toAutomaticSettings);
    }
}
