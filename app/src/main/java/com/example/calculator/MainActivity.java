package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView text;
    String a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=findViewById(R.id.text);
        getSupportActionBar().hide();
    }
    public int operation,num1,num2,result;
    public void b0(View view) {
       a=text.getText().toString();
       text.setText(a+"0");
    }

    public void b1(View view) {
        a=text.getText().toString();
        text.setText(a+"1");
    }

    public void b2(View view) {
        a=text.getText().toString();
        text.setText(a+"2");
    }

    public void b3(View view) {
        a=text.getText().toString();
        text.setText(a+"3");
    }

    public void b4(View view) {
        a=text.getText().toString();
        text.setText(a+"4");
    }

    public void b5(View view) {
        a=text.getText().toString();
        text.setText(a+"5");
    }

    public void b6(View view) {
        a=text.getText().toString();
        text.setText(a+"6");
    }

    public void b7(View view) {
        a=text.getText().toString();
        text.setText(a+"7");
    }

    public void b8(View view) {
        a=text.getText().toString();
        text.setText(a+"8");
    }

    public void b9(View view) {
        a=text.getText().toString();
        text.setText(a+"9");
    }

    public void add(View view) {
        num1=Integer.parseInt(text.getText().toString());
        text.setText("");
        operation=1;
    }

    public void sud(View view) {
        num1=Integer.parseInt(text.getText().toString());
        text.setText("");
        operation=2;
    }

    public void mul(View view) {
        num1=Integer.parseInt(text.getText().toString());
        text.setText("");
        operation=3;
    }

    public void div(View view) {
        num1=Integer.parseInt(text.getText().toString());
        text.setText("");
        operation=4;
    }

    public void reminder(View view) {
        num1=Integer.parseInt(text.getText().toString());
        text.setText("");
        operation=5;
    }

    public void equal(View view) {
        num2=Integer.parseInt(text.getText().toString());
        text.setText("");
            if (operation==1){
                result=num1+num2;
                String res=Integer.toString(result);
                text.setText(res);
            }
            else if(operation==2){
            result=num1-num2;
            String res=Integer.toString(result);
            text.setText(res);
            }
            else if(operation==3){
                result=num1*num2;
                String res=Integer.toString(result);
                text.setText(res);
            }
            else if(operation==4){
                result=num1/num2;
                String res=Integer.toString(result);
                text.setText(res);
            }
            else if(operation==5){
                result=num1%num2;
                String res=Integer.toString(result);
                text.setText(res);
            }
            else{
                Toast.makeText(this, "Operation is not selected", Toast.LENGTH_SHORT).show();
            }
    }

    public void clear(View view) {
        text.setText("");
    }
}