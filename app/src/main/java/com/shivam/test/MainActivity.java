package com.shivam.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextSwitcher;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int count=0;
    public void addcount(View view){
        setContentView(R.layout.activity_main);
        TextView prev= (TextView) findViewById(R.id.textview);
        count=count+1;
        String s=String.valueOf(count);
        prev.setText(s);
    }
    public void resets(View view){
        setContentView(R.layout.activity_main);
        TextView prev= (TextView) findViewById(R.id.textview);
        count=0;
        String s=String.valueOf(count);
        prev.setText(s);
    }
}
