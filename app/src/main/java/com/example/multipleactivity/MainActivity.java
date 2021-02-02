package com.example.multipleactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageView b1;
    ImageView b2;
    ImageView b3;
    ImageView b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (ImageView) findViewById(R.id.button);
        b2 = (ImageView) findViewById(R.id.button2);
        b3 = (ImageView) findViewById(R.id.button3);
        b4 = (ImageView) findViewById(R.id.button4);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changePage(1);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changePage(2);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changePage(3);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changePage(4);
            }
        });

    }
    public void changePage(int v) {
        String page = "";
        if (v==1) {
            page="page1";
        } else if (v==2) {
            page="page2";
        } else if (v==3) {
            page = "page3";
        } else if (v==4) {
            page = "page4";
        }


        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("page", page);
        startActivity(intent);


    }
}