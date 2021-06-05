package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText firstValue, secondValue;
    TextView view;
    Button addition, subtraction, multiplication, division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstValue = findViewById(R.id.editText1);
        secondValue = findViewById(R.id.editText2);
        view = findViewById(R.id.textView);
        firstValue = findViewById(R.id.editText1);
        addition = findViewById(R.id.button1);
        subtraction = findViewById(R.id.button2);
        multiplication = findViewById(R.id.button3);
        division = findViewById(R.id.button4);

        //Adding Functions
        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value1, value2;
                int sum;
                value1 = Integer.parseInt(firstValue.getText().toString());
                value2 = Integer.parseInt(secondValue.getText().toString());
                sum = value1 + value2;
             view.setText("Ans is : " + sum);
             }
        });

        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value1, value2;
                int sum;
                value1 = Integer.parseInt(firstValue.getText().toString());
                value2 = Integer.parseInt(secondValue.getText().toString());
                sum = value1 - value2;
                view.setText("Ans is : " + sum);
            }
        });

        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value1, value2;
                int sum;
                value1 = Integer.parseInt(firstValue.getText().toString());
                value2 = Integer.parseInt(secondValue.getText().toString());
                sum = value1 * value2;
                view.setText("Ans is : " + sum);
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double value1, value2;
                double sum;
                value1 = Double.parseDouble(firstValue.getText().toString());
                value2 = Double.parseDouble(secondValue.getText().toString());
                sum = value1 / value2;
                view.setText("Ans is : " + sum);
            }
        });

    }
}