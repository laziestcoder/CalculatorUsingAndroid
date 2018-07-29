package com.example.laziestcoder.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText etInput1 , etInput2;
    Button btnPlus , btnMinus ,btnMul , btnDiv;
    TextView tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etInput1 = (EditText) findViewById(R.id.et_input1);
        etInput2= (EditText) findViewById(R.id.et_input2);

        btnPlus = (Button) findViewById(R.id.btn_plus);

        tvResult = (TextView) findViewById(R.id.tv_result);


        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double value1 = Double.valueOf (etInput1.getText().toString().trim());
                double value2 = Double.valueOf (etInput2.getText().toString().trim());

                double result = value1 + value2;

                tvResult.setText(String.valueOf(result));
            }
        });

        btnMinus = (Button) findViewById(R.id.btn_minus);

        tvResult = (TextView) findViewById(R.id.tv_result);


        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double value1 = Double.valueOf (etInput1.getText().toString().trim());
                double value2 = Double.valueOf (etInput2.getText().toString().trim());

                double result = value1 - value2;

                tvResult.setText(String.valueOf(result));
            }
        });

        btnMul = (Button) findViewById(R.id.btn_mul);

        tvResult = (TextView) findViewById(R.id.tv_result);


        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double value1 = Double.valueOf (etInput1.getText().toString().trim());
                double value2 = Double.valueOf (etInput2.getText().toString().trim());

                double result = value1 * value2;

                tvResult.setText(String.valueOf(result));
            }
        });

        btnDiv = (Button) findViewById(R.id.btn_div);

        tvResult = (TextView) findViewById(R.id.tv_result);


        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double value1 = Double.valueOf (etInput1.getText().toString().trim());
                double value2 = Double.valueOf (etInput2.getText().toString().trim());

                double result = value1 / value2;

                tvResult.setText(String.valueOf(result));
            }
        });


    }
}
