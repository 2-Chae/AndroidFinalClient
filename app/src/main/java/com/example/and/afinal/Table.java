package com.example.and.afinal;

import android.content.Intent;
import android.icu.text.SimpleDateFormat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Date;
import java.util.Locale;

public class Table extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);
      //  ActionBar actionBar = getSupportActionBar();
      //  actionBar.setDisplayHomeAsUpEnabled(true);
      //  actionBar.setHomeButtonEnabled(true);
        TextView date = (TextView)findViewById(R.id.day);
        long now = System.currentTimeMillis();
        //SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.KOREA);

    }
    public void onPractice(View v){
        Intent i = new Intent(Table.this,Practice.class);
        startActivity(i);
    }
    public void onTableAdd(View v){
        Intent i = new Intent(Table.this,TableAdd.class);
        startActivity(i);
    }
}
