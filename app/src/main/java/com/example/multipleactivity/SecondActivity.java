package com.example.multipleactivity;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ImageView b1 = (ImageView) findViewById(R.id.button);
        ImageView b2 = (ImageView) findViewById(R.id.button2);
        ImageView b3 = (ImageView) findViewById(R.id.button3);
        ImageView b4 = (ImageView) findViewById(R.id.button4);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String v = getIntent().getStringExtra("page");

        if (v.equals("page1")) {
            b1.setImageResource(R.drawable.sacred);
            b2.setImageResource(R.drawable.little);
            b3.setImageResource(R.drawable.delhi);
            b4.setImageResource(R.drawable.mis);
        }

        else if (v.equals("page2")) {
            b1.setImageResource(R.drawable.tandav);
            b2.setImageResource(R.drawable.mirzapur);
            b3.setImageResource(R.drawable.family);
            b4.setImageResource(R.drawable.pataal);
        }
        else if (v.equals("page3")) {
            b1.setImageResource(R.drawable.scam);
            b2.setImageResource(R.drawable.jl);
            b3.setImageResource(R.drawable.avrodh);
            b4.setImageResource(R.drawable.murder);
        }
        else if (v.equals("page4")) {
            b1.setImageResource(R.drawable.special);
            b2.setImageResource(R.drawable.hostages);
            b3.setImageResource(R.drawable.aarya);
            b4.setImageResource(R.drawable.criminal);
        }

    }
}