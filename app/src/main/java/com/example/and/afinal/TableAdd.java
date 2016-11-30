package com.example.and.afinal;

import android.opengl.Visibility;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class TableAdd extends AppCompatActivity {
    Visibility setVisible;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_add);
        setTitle("추가");
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeButtonEnabled(true);

       final Spinner spin = (Spinner)findViewById(R.id.spinner1);
       final Spinner spin1 = (Spinner)findViewById(R.id.spinner2);
       // final Spinner spin2 = (Spinner)findViewById(R.id.spinner3);
        ArrayAdapter<CharSequence> adapName =
                ArrayAdapter.createFromResource(
                        this,
                        R.array.class1,
                        android.R.layout.simple_spinner_item);
        adapName.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(adapName);
        ArrayAdapter<CharSequence> adapName1 =
                ArrayAdapter.createFromResource(
                        this,
                        R.array.culture,
                        android.R.layout.simple_spinner_item);
        adapName.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item);
        spin1.setAdapter(adapName1);

        spin.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        Log.i("pos = "+position,"id ="+id);
                    if(position==0){
                        ArrayAdapter<CharSequence> adapName2 =
                                ArrayAdapter.createFromResource(
                                        getApplicationContext(),
                                        R.array.culture,
                                        android.R.layout.simple_spinner_item);
                        adapName2.setDropDownViewResource(
                                android.R.layout.simple_spinner_dropdown_item);
                        spin1.setAdapter(adapName2);
                    }
                        if(position==1){
                            ArrayAdapter<CharSequence> adapName2 =
                                    ArrayAdapter.createFromResource(
                                            getApplicationContext(),
                                            R.array.univ,
                                            android.R.layout.simple_spinner_item);
                            adapName2.setDropDownViewResource(
                                    android.R.layout.simple_spinner_dropdown_item);
                            spin1.setAdapter(adapName2);

                            Spinner spin2 = (Spinner)findViewById(R.id.spinner3);
                                ArrayAdapter<CharSequence> adapName3 =
                                        ArrayAdapter.createFromResource(
                                                getApplicationContext(),
                                                R.array.inmon,
                                                android.R.layout.simple_spinner_item);
                                adapName3.setDropDownViewResource(
                                        android.R.layout.simple_spinner_dropdown_item);
                                spin2.setAdapter(adapName3);
                            spin2.setVisibility(View.VISIBLE);
                                //spin2.performClick();

                            }
                        }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                        Log.i("클릭","안함");
                    }
                }
        );

    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
