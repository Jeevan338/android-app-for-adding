package com.example.addapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText num1,num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=(EditText)findViewById(R.id.num1);
        num2=(EditText)findViewById(R.id.num2);
    }
    public void enter (View view)
    {
        String getnum1=num1.getText().toString();
        String getnum2=num2.getText().toString();
        Toast.makeText(this,getnum1+getnum2,Toast.LENGTH_LONG).show();
    }
}