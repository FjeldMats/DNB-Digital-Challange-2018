package com.example.matsfjeld.valutta;

import android.app.NotificationManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class preOverview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle pac = getIntent().getExtras();
        if (pac != null){
            NotificationManager a = new NotificationManager();
            a.cancel(1);
        }
        setContentView(R.layout.activity_preoverview);
    }
}
