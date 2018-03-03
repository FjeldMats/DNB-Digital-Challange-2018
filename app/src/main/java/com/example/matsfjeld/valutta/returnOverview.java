package com.example.matsfjeld.valutta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class returnOverview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_return_overview);
    }

    public void backToMenu(View view){
        Intent men = new Intent(this, MainActivity.class);
        startActivity(men);
    }

    public void sell(View view){
        Button a = findViewById(R.id.button7);
        Button b = findViewById(R.id.button8);
        TextView c = findViewById(R.id.textView9);
        TextView d = findViewById(R.id.textView10);
        b.setVisibility(View.GONE);
        a.setVisibility(View.GONE);
        c.setVisibility(View.GONE);
        d.setVisibility(View.GONE);
    }
}
