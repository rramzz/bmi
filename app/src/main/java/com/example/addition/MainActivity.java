package com.example.addition;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private EditText num1;
    private EditText num2;
    private Button button;
    private Button button1;
    private Button button2;
    private Button button3;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1=(EditText)findViewById(R.id.etnum1);
        num2=(EditText)findViewById(R.id.etnum2);
        button=(Button)findViewById(R.id.btnadd);
        button1=(Button)findViewById(R.id.btnsub);
        button2=(Button)findViewById(R.id.btnmul);
        button3=(Button)findViewById(R.id.btndiv);
        result=(TextView)findViewById(R.id.tvans);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int sum = number1 + number2;
                Intent myIntent=(new Intent(getApplicationContext(),activity2.class));
                myIntent.putExtra( "a",sum);

                startActivity(myIntent);
               // startActivity(new Intent(getApplicationContext(),activity2.class));


            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int sum1 = number1 - number2;
                result.setText("Answer:" + String.valueOf(sum1));

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int sum2 = number1 * number2;
                result.setText("Answer:" + String.valueOf(sum2));

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int sum3;
                try
                {
                    sum3= number1 /number2;
                    result.setText("Answer:" + String.valueOf(sum3));
                }
                catch(Exception e)
                {
                    Toast .makeText(getApplicationContext(),e.toString(), Toast.LENGTH_LONG).show();
                    //Snackbar.make(view,e.toString(), Snackbar.LENGTH_SHORT).show();
                    result.setText(e.toString());
                }



            }
        });

    }
}
