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
    Boolean bought = false;
    double amount;
    String cur;


    public void buyCurrentPrice(View view){
        Button btnBuy = findViewById(R.id.btnBuy);
        bought = true;

        Intent intent = getIntent();
        TextView statusUpdate = findViewById(R.id.statusView);
        statusUpdate.setText("You bought " + amount + " " + cur);
        btnBuy.setVisibility(View.GONE);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        Bundle pac = getIntent().getExtras();
        setContentView(R.layout.activity_preoverview);
        if (pac != null) {
            if (pac.getInt("buy") == 1) {
                NotificationManager notificationManager = (NotificationManager)
                        getSystemService(Context.NOTIFICATION_SERVICE);
                notificationManager.cancel(1);
//            Intent b = new Intent(this,preOverview.class);
            }
            TextView price = findViewById(R.id.textView13);
            if (pac.getDouble("pri") != 0) {
                String tek = Double.toString(pac.getDouble("pri"));
                price.setText(tek);
                if (pac.getDouble("pri") == 10.75){
                    cur = "GBP";
                }
                else if (pac.getDouble("pri") == 9.59){
                    cur = "EUR";
                }
                else if (pac.getDouble("pri") == 7.79){
                    cur = "USD";
                }
                amount = pac.getDouble("amm");
            }
        }
        if (bought){
            TextView preT = findViewById(R.id.textView12);
            preT.setText("You bought at this price:");
            TextView statusUpdate = findViewById(R.id.statusView);
            statusUpdate.setText("You bought " + amount + " " + cur);
            Button btnBuy = findViewById(R.id.btnBuy);
            btnBuy.setVisibility(View.GONE);
        }
    }



}
