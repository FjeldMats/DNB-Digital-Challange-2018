package com.example.matsfjeld.valutta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class autoBuy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_buy);
    }

    public void backToOrder(View view){
        Intent toOrder = new Intent(this, order.class);
        startActivity(toOrder);
    }
}
