package com.example.matsfjeld.valutta;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class preOverview extends AppCompatActivity {



    public void buyCurrentPrice(View view){
        Button btnBuy = (Button) findViewById(R.id.btnBuy);

        int price = 54;
        Intent intent = getIntent();
        String currencyStr = intent.getStringExtra("date");
        String priceStr = String.valueOf(price) ;
        TextView statusUpdate = (TextView) findViewById(R.id.statusView);
        statusUpdate.setText("You bought " + priceStr + " " + currencyStr);
        btnBuy.setVisibility(View.GONE);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        Bundle pac = getIntent().getExtras();
        if (pac != null){
            NotificationManager notificationManager = (NotificationManager)
                    getSystemService(Context.NOTIFICATION_SERVICE);
            notificationManager.cancel(1);
        }
        setContentView(R.layout.activity_preoverview);
    }



}
