package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText firstNumber;
    EditText secondNumber;
    TextView addResult;
    Button btnAdd;
    Button btnSub;
    Button btnMul;
    Button btnDiv;



    double num1, num2, sum, sub, mul, div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        firstNumber = (EditText) findViewById(R.id.txtNumber1);
        secondNumber = (EditText) findViewById(R.id.txtNumber2);
        addResult = (TextView) findViewById(R.id.txtResult);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnMul = (Button) findViewById(R.id.btnMul);
        btnDiv = (Button) findViewById(R.id.btnDiv);

        btnAdd.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                num1 = Double.parseDouble(firstNumber.getText().toString());
                num2 = Double.parseDouble(secondNumber.getText().toString());
                sum = num1 + num2;
                addResult.setText(Double.toString(sum));
            }

        });
        btnSub.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                num1 = Double.parseDouble(firstNumber.getText().toString());
                num2 = Double.parseDouble(secondNumber.getText().toString());
                sub = num1 - num2;
                addResult.setText(Double.toString(sub));
            }

        });
        btnMul.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                num1 = Double.parseDouble(firstNumber.getText().toString());
                num2 = Double.parseDouble(secondNumber.getText().toString());
                mul = num1 * num2;
                addResult.setText(Double.toString(mul));
            }

        });
        btnDiv.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                num1 = Double.parseDouble(firstNumber.getText().toString());
                num2 = Double.parseDouble(secondNumber.getText().toString());
                div = num1 / num2;
                addResult.setText(Double.toString(div));
            }

        });
    }
}