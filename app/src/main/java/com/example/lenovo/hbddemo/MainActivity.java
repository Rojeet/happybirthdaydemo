package com.example.lenovo.hbddemo;

import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView HBDTextView = (TextView) findViewById(R.id.hbd);
        HBDTextView.setText(R.string.hbd);

    }
}
