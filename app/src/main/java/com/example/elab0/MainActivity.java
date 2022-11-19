package com.example.elab0;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button addition,subtraction,multiply,division,clear;
    EditText num1,num2;
    TextView res;
    float a,b,sum=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addition=findViewById(R.id.add);
        subtraction=findViewById(R.id.sub);
        multiply=findViewById(R.id.mul);
        division=findViewById(R.id.div);
        clear=findViewById(R.id.clr);
        num1=findViewById(R.id.n1);
        num2=findViewById(R.id.n2);
        res=findViewById(R.id.Result);

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1.getText().clear();
                num2.getText().clear();
                res.setText("");
            }
        });

        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=Integer.parseInt(num1.getText().toString());
                b=Integer.parseInt(num2.getText().toString());
                sum=a+b;
                res.setText("Result: "+sum);
            }
        });

        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=Integer.parseInt(num1.getText().toString());
                b=Integer.parseInt(num2.getText().toString());
                sum=a-b;
                res.setText("Result: "+sum);
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=Integer.parseInt(num1.getText().toString());
                b=Integer.parseInt(num2.getText().toString());
                sum=a*b;
                res.setText("Result: "+sum);
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=Integer.parseInt(num1.getText().toString());
                b=Integer.parseInt(num2.getText().toString());
                sum=a/b;
                res.setText("Result: "+sum);
            }
        });




    }
}