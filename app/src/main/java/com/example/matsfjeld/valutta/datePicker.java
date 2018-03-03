package com.example.matsfjeld.valutta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;

public class datePicker extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker);
    }


    public void backToOrder(View view){

        DatePicker dateP = (DatePicker) findViewById(R.id.datePick);

        int day = dateP.getDayOfMonth();
        int month = dateP.getMonth() + 1;
        int year = dateP.getYear();

        String strDate = day + " / " + month + " / " + year;

        Intent toOrder = new Intent(this, order.class);
        toOrder.putExtra("date",strDate);
        startActivity(toOrder);

    }
}
