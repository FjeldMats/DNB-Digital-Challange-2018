package com.example.matsfjeld.valutta;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void goToOrder(View view){
        Intent toBestill = new Intent(this, order.class);
        startActivity(toBestill);
    }

    public void goToOverview(View view){
        Intent toOverview = new Intent(this, preOverview.class);
        startActivity(toOverview);
    }

    public void goToTravelOverview(View view){
        Intent toTravelOverview = new Intent(this, travelOverview.class);
        startActivity(toTravelOverview);
    }

    public void goToReturnOverview(View view){
        Intent toReturnOverview = new Intent(this, returnOverview.class);
        startActivity(toReturnOverview);
    }





}
