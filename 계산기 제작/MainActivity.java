package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.nio.channels.InterruptedByTimeoutException;

public class MainActivity extends AppCompatActivity {

    EditText edit1, edit2;
    Button add, sub, mul, divi;
    String num1, num2;
    Integer operation_result;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("간단 계산기");

        edit1 = (EditText) findViewById(R.id.num1);
        edit2 = (EditText) findViewById(R.id.num2);
        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);
        mul = (Button) findViewById(R.id.mul);
        divi = (Button) findViewById(R.id.divi);
        result = (TextView) findViewById(R.id.reuslt);

        add.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                operation_result = Integer.parseInt(num1) + Integer.parseInt(num2);
                result.setText("계산결과:" + operation_result.toString());
                return true;
            }
        });

        sub.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                operation_result = Integer.parseInt(num1) - Integer.parseInt(num2);
                result.setText("계산결과:" + operation_result.toString());
                return true;
            }
        });

        mul.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                operation_result = Integer.parseInt(num1) * Integer.parseInt(num2);
                result.setText("계산결과:" + operation_result.toString());
                return true;
            }
        });

        divi.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                operation_result = Integer.parseInt(num1) / Integer.parseInt(num2);
                result.setText("계산결과:" + operation_result.toString());
                return true;
            }
        });
    }
}