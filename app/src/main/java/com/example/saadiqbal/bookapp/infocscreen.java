package com.example.saadiqbal.bookapp;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class infocscreen extends AppCompatActivity implements View.OnClickListener {

    ImageView i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infocscreen);
        i = (ImageView)findViewById(R.id.home_sc);
        i.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.home_sc:
                Intent o = new Intent(infocscreen.this,MainAppScreenHome.class);
                startActivity(o);
                finish();
                break;
        }
    }
}
