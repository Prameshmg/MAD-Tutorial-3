package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView view1;
    TextView view2;
    TextView view3;

    Button add,subtract,multiply,divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        view1 = (TextView)findViewById(R.id.textView19);
        view2 = (TextView)findViewById(R.id.textView20);

        Intent intent = getIntent();
        final String str1 = intent.getStringExtra("key1");
        final String str2 = intent.getStringExtra("key2");

        view1.setText(str1);
        view2.setText(str2);

        view3 = (TextView)findViewById(R.id.textView3);

        final double d1 = Double.parseDouble(view1.getText().toString());
        final double d2 = Double.parseDouble(view2.getText().toString());

        add = (Button)findViewById(R.id.button2);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double result = d1+d2;
                view3.setText(str1+"+"+str2+"="+Double.toString(result));
            }
        });

        subtract = (Button)findViewById(R.id.button3);
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double result = d1 - d2;
                view3.setText(str1+"-"+str2+"="+Double.toString(result));
            }
        });

        multiply = (Button)findViewById(R.id.button4);
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double result = d1 * d2;
                view3.setText(str1+"*"+str2+"="+Double.toString(result));
            }
        });

        divide = (Button)findViewById(R.id.button5);
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double result = d1 / d2;
                view3.setText(str1+"/"+str2+"="+Double.toString(result));
            }
        });


    }



}