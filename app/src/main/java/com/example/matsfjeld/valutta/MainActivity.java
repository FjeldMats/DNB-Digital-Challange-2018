package com.example.matsfjeld.valutta;

import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
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


    public void flyNotification(View view) {
        Intent intent = new Intent(this, autoBuy.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, 0);
        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.dnb)
                .setContentTitle("New DNB service!")
                .setContentText("Try DNB's new service to save money on you vacation.")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .setAutoCancel(true)
                .setVibrate(new long[] { 200, 200, 200, 200, 200 })
                .setLights(Color.rgb(0,124,132), 10,10)
                .setContentIntent(pendingIntent);
        /*long cd = System.currentTimeMillis();
        while(cd + 5000 >= System.currentTimeMillis()){
            String lol = "lol";
        }*/
        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(this);
        notificationManager.notify(0, mBuilder.build());
    }


    public void manNot(View view) {
        Intent buy = new Intent(this, preOverview.class);
        buy.setAction("buyC");
//        this.buyC();
        buy.putExtra("hot",0);
        Bundle pac = new Bundle();
        pac.putInt("buy", 1);
        buy.putExtras(pac);
        PendingIntent buyShort = PendingIntent.getActivity(this, 0, buy, 0);
        Intent intent = new Intent(this, preOverview.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, 0);
        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.dnb)
                .setContentTitle("Low exchange rates now!")
                .setContentText("Do you want to buy your currency now?")
                .setPriority(NotificationCompat.PRIORITY_MAX)
                .setAutoCancel(true)
                .setVibrate(new long[] { 200, 200, 200, 200, 200 })
                .setLights(Color.rgb(0,124,132), 10,10)
                .setContentIntent(pendingIntent)
                .addAction(R.drawable.ic_stat_new_message,"Buy", buyShort);
        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(this);
        notificationManager.notify(1, mBuilder.build());
    }

    public void returnNot(View view) {
        Intent intent = new Intent(this, returnOverview.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, 0);
        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.dnb)
                .setContentTitle("Welcome back!")
                .setContentText("Click here to see how much you saved.")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .setAutoCancel(true)
                .setVibrate(new long[] { 200, 200, 200, 200, 200 })
                .setLights(Color.rgb(0,124,132), 10,10)
                .setContentIntent(pendingIntent);
        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(this);
        notificationManager.notify(2, mBuilder.build());
    }

}
