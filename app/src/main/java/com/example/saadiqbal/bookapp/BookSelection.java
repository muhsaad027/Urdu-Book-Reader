package com.example.saadiqbal.bookapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;


public class BookSelection extends AppCompatActivity {

    TextView t1,ch1,ch2,ch3;
    LinearLayout L1,L2,L3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_selection);
        setTitle(null);
        Toolbar topToolBar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(topToolBar);
       t1  = (TextView) findViewById(R.id.textHeader);
        ch1  = (TextView) findViewById(R.id.cahpterno1);
        ch2  = (TextView) findViewById(R.id.cahpterno2);
        ch3  = (TextView) findViewById(R.id.cahpterno3);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/mnw.ttf");
        t1.setTypeface(typeface);
        ch1.setTypeface(typeface);ch2.setTypeface(typeface);ch3.setTypeface(typeface);
        L1 = (LinearLayout)findViewById(R.id.book1_selection);
        L2 = (LinearLayout)findViewById(R.id.book2_selection);
        L3 = (LinearLayout)findViewById(R.id.book3_selection);
       L1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent n = new Intent(BookSelection.this,ThirdBookIndex.class);
               startActivity(n);
           }
       });
        L2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n = new Intent(BookSelection.this,SecondBookIndex.class);
                startActivity(n);
            }
        });
        L3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n = new Intent(BookSelection.this,FirstBookIndex.class);
                startActivity(n);
            }
        });

    }
}