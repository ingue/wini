package com.example.dtj03.myapplication2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView textView1=(TextView)findViewById(R.id.textView1);
        textView1.setText("Hello World!");





        

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
}
