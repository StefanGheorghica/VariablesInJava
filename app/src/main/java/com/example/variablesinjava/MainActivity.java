package com.example.variablesinjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private EditText myInput1;
    private EditText myInput2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        int age = 20;
//        float price = 1.5f;
//        double userscore = 4.5789321;
//        byte computerRam = 12;
//        long largeNumber = 123456789l;
//        boolean isDead = false;
//
//        String name = "Stefan";
//        char letter = 'A';

//        Log.i("MyTag", largeNumber + "");

        TextView text = findViewById(R.id.text);

        Button myButton = (Button)findViewById(R.id.button);
        Button myButton2 = (Button)findViewById(R.id.button2);
        Button myButton3 = (Button)findViewById(R.id.button3);
        Button myButton4 = (Button)findViewById(R.id.button4);

        myButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                myInput1 = (EditText)findViewById(R.id.editTextNumber);
                myInput2 = (EditText)findViewById(R.id.editTextNumber2);
                if(TextUtils.isEmpty(myInput1.getText().toString()) && TextUtils.isEmpty(myInput2.getText().toString()))
                {
                    text.setText("Please enter a value first");
                }
                else
                {
                    int total = Integer.parseInt(myInput1.getText().toString()) + Integer.parseInt(myInput2.getText().toString());
                    text.setText(total + "");
                }
            }
        });
        myButton2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                myInput1 = (EditText)findViewById(R.id.editTextNumber);
                myInput2 = (EditText)findViewById(R.id.editTextNumber2);
                if(TextUtils.isEmpty(myInput1.getText().toString()) && TextUtils.isEmpty(myInput2.getText().toString()))
                {
                    text.setText("Please enter a value first");
                }
                else
                {
                    int total = Integer.parseInt(myInput1.getText().toString()) * Integer.parseInt(myInput2.getText().toString());
                    text.setText(total + "");
                }
            }
        });
        myButton3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                myInput1 = (EditText)findViewById(R.id.editTextNumber);
                myInput2 = (EditText)findViewById(R.id.editTextNumber2);
                if(TextUtils.isEmpty(myInput1.getText().toString()) && TextUtils.isEmpty(myInput2.getText().toString()))
                {
                    text.setText("Please enter a value first");
                }
                else
                {
                    float total = Float.parseFloat(myInput1.getText().toString()) / Float.parseFloat(myInput2.getText().toString());
                    text.setText(total + "");
                }
            }
        });
        myButton4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                myInput1 = (EditText)findViewById(R.id.editTextNumber);
                myInput2 = (EditText)findViewById(R.id.editTextNumber2);
                if(TextUtils.isEmpty(myInput1.getText().toString()) && TextUtils.isEmpty(myInput2.getText().toString()))
                {
                    text.setText("Please enter a value first");
                }
                else
                {
                    int total = Integer.parseInt(myInput1.getText().toString()) % Integer.parseInt(myInput2.getText().toString());
                    text.setText(total + "");
                }
            }
        });
    }
}