package com.example.addition;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class activity2 extends AppCompatActivity {

    private TextView result1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);
        result1=(TextView) findViewById(R.id.tv1);
        Intent intent= getIntent();

        int answer=intent.getIntExtra("a",0);
        result1.setText("SUM="+answer);

    }
}
