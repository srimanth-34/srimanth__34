package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 EditText etNum1,etNum2;
 TextView tvAns;
 Button Add,Sub,Mul,Div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNum1=findViewById(R.id.etNum1);
        etNum2=findViewById(R.id.etNum2);
        tvAns=findViewById(R.id.tvAns);
        Add=findViewById(R.id.btnAdd);
        Sub=findViewById(R.id.btnSub);
        Mul=findViewById(R.id.btnMul);
        Div=findViewById(R.id.btnDiv);

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstNum ,secondNum ,answer;
                firstNum = Integer.parseInt(etNum1.getText().toString());
                secondNum = Integer.parseInt(etNum2.getText().toString());
                answer=firstNum + secondNum;
                tvAns.setText("Ans is = " + answer);
                Toast.makeText(MainActivity.this, "ADD", Toast.LENGTH_SHORT).show();
            }
        });

        Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstNum ,secondNum ,answer;
                firstNum = Integer.parseInt(etNum1.getText().toString());
                secondNum = Integer.parseInt(etNum2.getText().toString());
                answer=firstNum - secondNum;
                tvAns.setText("Ans is = " + answer);
                Toast.makeText(MainActivity.this, "SUB", Toast.LENGTH_SHORT).show();
            }
        });

        Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstNum ,secondNum ,answer;
                firstNum = Integer.parseInt(etNum1.getText().toString());
                secondNum = Integer.parseInt(etNum2.getText().toString());
                answer=firstNum * secondNum;
                tvAns.setText("Ans is = " + answer);
                Toast.makeText(MainActivity.this, "MUL", Toast.LENGTH_SHORT).show();
            }
        });

        Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstNum ,secondNum ,answer;
                firstNum = Integer.parseInt(etNum1.getText().toString());
                secondNum = Integer.parseInt(etNum2.getText().toString());
                answer=firstNum / secondNum;
                tvAns.setText("Ans is = " + answer);
                Toast.makeText(MainActivity.this, "DIV", Toast.LENGTH_SHORT).show();
            }
        });
    }
}