package com.shivam.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void addcount(View view){
        TextView prev= (TextView) findViewById(R.id.textview);
        int count= Integer.parseInt(prev.getText().toString());
        count=count+1;
        String s=String.valueOf(count);
        prev.setText(s);
    }
}
