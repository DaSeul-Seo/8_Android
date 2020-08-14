package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edit1, edit2;
    Button btnAdd, btnSub, btnMul, btnDiv, btnDiv2;
    TextView textResult;
    String n1, n2;
    Double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_launcher);


        edit1 = (EditText)findViewById(R.id.Edit1);
        edit2 = (EditText)findViewById(R.id.Edit2);

        btnAdd = (Button)findViewById(R.id.BtnAdd);
        btnSub = (Button)findViewById(R.id.BtnSub);
        btnMul = (Button)findViewById(R.id.BtnMul);
        btnDiv = (Button)findViewById(R.id.BtnDiv);
        btnDiv2 = (Button)findViewById(R.id.BtnDiv2);

        textResult = (TextView)findViewById(R.id.TextResult);

//        btnAdd.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View view, MotionEvent motionEvent) {
//                n1 = edit1.getText().toString();
//                n2 = edit2.getText().toString();
//                result = Integer.parseInt(n1) + Integer.parseInt(n2);
//                textResult.setText("계산 결과 : " + result.toString());
//                return false;
//            }
//        });
//        btnSub.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View view, MotionEvent motionEvent) {
//                n1 = edit1.getText().toString();
//                n2 = edit2.getText().toString();
//                result = Integer.parseInt(n1) - Integer.parseInt(n2);
//                textResult.setText("계산 결과 : " + result.toString());
//                return false;
//            }
//        });
//        btnMul.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View view, MotionEvent motionEvent) {
//                n1 = edit1.getText().toString();
//                n2 = edit2.getText().toString();
//                result = Integer.parseInt(n1) * Integer.parseInt(n2);
//                textResult.setText("계산 결과 : " + result.toString());
//                return false;
//            }
//        });
//        btnDiv.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View view, MotionEvent motionEvent) {
//                n1 = edit1.getText().toString();
//                n2 = edit2.getText().toString();
//                result = Integer.parseInt(n1) / Integer.parseInt(n2);
//                textResult.setText("계산 결과 : " + result.toString());
//                return false;
//            }
//        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1 = edit1.getText().toString();
                n2 = edit2.getText().toString();
                if(n1.trim().equals("") || n2.trim().equals("")){
                    Toast.makeText(getApplicationContext(), "입력 값이 비었습니다.", Toast.LENGTH_SHORT).show();
                } else {
                    result = Double.parseDouble(n1) + Double.parseDouble(n2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1 = edit1.getText().toString();
                n2 = edit2.getText().toString();
                if(n1.trim().equals("") || n2.trim().equals("")){
                    Toast.makeText(getApplicationContext(), "입력 값이 비었습니다.", Toast.LENGTH_SHORT).show();
                } else {
                    result = Double.parseDouble(n1) - Double.parseDouble(n2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1 = edit1.getText().toString();
                n2 = edit2.getText().toString();
                if(n1.trim().equals("") || n2.trim().equals("")){
                    Toast.makeText(getApplicationContext(), "입력 값이 비었습니다.", Toast.LENGTH_SHORT).show();
                } else {
                    result = Double.parseDouble(n1) * Double.parseDouble(n2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1 = edit1.getText().toString();
                n2 = edit2.getText().toString();
                if(n1.trim().equals("") || n2.trim().equals("")){
                    Toast.makeText(getApplicationContext(), "입력 값이 비었습니다.", Toast.LENGTH_SHORT).show();
                    if(n2.equals(0)){
                        Toast.makeText(getApplicationContext(), "0은 제외", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    result = Double.parseDouble(n1) / Double.parseDouble(n2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });
        btnDiv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1 = edit1.getText().toString();
                n2 = edit2.getText().toString();
                if(n1.trim().equals("") || n2.trim().equals("")){
                    Toast.makeText(getApplicationContext(), "입력 값이 비었습니다.", Toast.LENGTH_SHORT).show();
                    if(n2.equals(0)){
                        Toast.makeText(getApplicationContext(), "0은 제외", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    result = Double.parseDouble(n1) % Double.parseDouble(n2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });
    }
}
