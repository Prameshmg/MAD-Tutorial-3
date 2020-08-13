package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextInputEditText txt1;
    private TextInputEditText txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = (TextInputEditText) findViewById(R.id.input1);

        txt2 = (TextInputEditText) findViewById(R.id.input2);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str1 = txt1.getText().toString();

                String str2 = txt2.getText().toString();


                LayoutInflater li = getLayoutInflater();
                View layout = li.inflate(R.layout.customtoast,(ViewGroup)findViewById(R.id.custom_toast_layout));
                Toast toast = new Toast(getApplicationContext());
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
                toast.setView(layout);
                toast.show();


                /*Context context = getApplicationContext();
                CharSequence message = "you just clicked the OK button";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, message, duration);
                toast.show();
                toast.setGravity(Gravity.TOP|Gravity.LEFT,250,0);*/

                Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
                intent.putExtra("key1", str1);
                intent.putExtra("key2", str2);
                startActivity(intent);

            }

        });

    }

}