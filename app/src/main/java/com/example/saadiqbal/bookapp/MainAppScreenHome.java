package com.example.saadiqbal.bookapp;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class MainAppScreenHome extends AppCompatActivity implements View.OnClickListener {

    ImageView book,back,next,info;
    TextView bookCounter;
    int temp = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_app_screen_home);
        book = (ImageView)findViewById(R.id.bookshelf);
        back = (ImageView)findViewById(R.id.back_book_select);
        next = (ImageView)findViewById(R.id.next_book_select);
        bookCounter = (TextView) findViewById(R.id.book_counter);
        info = (ImageView)findViewById(R.id.infoscreen);
        back.setOnClickListener(this);
        next.setOnClickListener(this);
        info.setOnClickListener(this);
        book.setOnClickListener(this);
        book.setImageResource(R.drawable.title3);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.bookshelf:
                if(temp == 1)
                {
                    Intent i = new Intent(MainAppScreenHome.this,detail_page.class);
                    startActivity(i);
                }
                if(temp == 2)
                {
                    Intent i = new Intent(MainAppScreenHome.this,detail2.class);
                    startActivity(i);
                }
                if(temp == 3)
                {
                    Intent i = new Intent(MainAppScreenHome.this,detail3.class);
                    startActivity(i);
                }
                if(temp == 4)
                {
                    Intent i = new Intent(MainAppScreenHome.this,detailbook4.class);
                    startActivity(i);
                }
                break;
            case R.id.back_book_select:
                if(temp < 2)
                {
                    temp = 1;
                }
                else {
                    temp--;
                    bookCounter.setText("Book "+temp+"/4");
                    if(temp == 1)
                    {
                        book.setImageResource(R.drawable.title3);
                    }
                    if(temp == 2)
                    {
                        book.setImageResource(R.drawable.title2);
                    }
                    if(temp == 3)
                    {

                        book.setImageResource(R.drawable.title1);
                    }
                    if(temp == 4)
                    {

                        book.setImageResource(R.drawable.cover4);
                    }
                }
                break;
            case R.id.next_book_select:
                if(temp >= 4)
                {
                    temp = 4;
                }
                else
                {
                    temp++;
                    bookCounter.setText("Book "+temp+"/4");
                    if(temp == 1)
                    {
                        book.setImageResource(R.drawable.title3);
                    }
                    if(temp == 2)
                    {
                        book.setImageResource(R.drawable.title2);
                    }
                    if(temp == 3)
                    {

                        book.setImageResource(R.drawable.title1);
                    }
                    if(temp == 4)
                    {

                        book.setImageResource(R.drawable.cover4);
                    }
                }
                break;
            case R.id.infoscreen:
                Intent i = new Intent(MainAppScreenHome.this,infocscreen.class);
                startActivity(i);
                break;
        }
    }
}
