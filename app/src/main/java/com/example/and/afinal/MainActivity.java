package com.example.and.afinal;

import android.app.TabActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Window;
import android.widget.TabHost;

public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);
        //setTheme(android.R.style.Theme_NoTitleBar);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        TabHost mTab = getTabHost();
        TabHost.TabSpec spec;
        Intent intent;
        LayoutInflater.from(this).inflate(R.layout.activity_main
                ,mTab.getTabContentView(),true);

        // spec = mTab.newTabSpec("tab1").setIndicator("First Tab")
        intent = new Intent(this,Table.class);
        spec = mTab.newTabSpec("tab1").setIndicator("시간표").setContent(intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
        mTab.addTab(spec);

        Intent intent1 = new Intent(this,Test.class);
        spec = mTab.newTabSpec("tab2").setIndicator("시험").setContent(intent1.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
        mTab.addTab(spec);

        Intent intent2 = new Intent(this,Evaluate.class);
        spec = mTab.newTabSpec("tab3").setIndicator("평가").setContent(intent2.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
        mTab.addTab(spec);

        Intent intent3 = new Intent(this,Setting.class);
        spec = mTab.newTabSpec("tab4").setIndicator("설정").setContent(intent3.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
        mTab.addTab(spec);
    }
}
