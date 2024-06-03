package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText firstVal , secondVal;
    TextView numresult;
    Button plus, subtract, multiply, divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        firstVal = findViewById(R.id.firstValue);
        secondVal = findViewById(R.id.secondVal);

        numresult = findViewById(R.id.overAllResult);

        plus = findViewById(R.id.btnPlus);
        subtract = findViewById(R.id.btnSubtract);
        multiply = findViewById(R.id.btnMultiply);
        divide = findViewById(R.id.btnDivide);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1 = firstVal.getText().toString();
                String number2 = secondVal.getText().toString();
                int num1 = Integer.parseInt(number1);
                int num2 = Integer.parseInt(number2);

                int ans = num1 + num2;
                numresult.setText("Result = "+ Integer.toString(ans));
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1 = firstVal.getText().toString();
                String number2 = secondVal.getText().toString();
                int num1 = Integer.parseInt(number1);
                int num2 = Integer.parseInt(number2);

                int ans = num1 - num2;
                numresult.setText("Result ="+ Integer.toString(ans));
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1 = firstVal.getText().toString();
                String number2 = secondVal.getText().toString();
                int num1 = Integer.parseInt(number1);
                int num2 = Integer.parseInt(number2);

                int ans = num1 * num2;
                numresult.setText("Result =" + Integer.toString(ans));
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1 = firstVal.getText().toString();
                String number2 = secondVal.getText().toString();
                //String valueresult = numresult.getText().toString();
                int num1 = Integer.parseInt(number1);
                int num2 = Integer.parseInt(number2);

                int ans = num1 / num2;
                numresult.setText("Result =" + Integer.toString(ans));
            }
        });


    }
}