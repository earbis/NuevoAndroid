package com.example.nuevo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioGroup rg;
    private RadioButton rb1, rb2, rb3, rb4, rb5, rb6, rb7;
    private Button b;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg = (RadioGroup)findViewById(R.id.RadioGroup);
        rb1= (RadioButton)findViewById(R.id.radioButton);
        rb2= (RadioButton)findViewById(R.id.radioButton2);
        rb3= (RadioButton)findViewById(R.id.radioButton3);
        rb4= (RadioButton)findViewById(R.id.radioButton4);
        rb5= (RadioButton)findViewById(R.id.radioButton5);
        rb6= (RadioButton)findViewById(R.id.radioButton6);
        rb7= (RadioButton)findViewById(R.id.radioButton7);
        tv = (TextView) findViewById(R.id.text1);
    }
    public void siguiente(View view){
        Intent i = new Intent(this, Pantalla2.class);
        startActivity(i);
    }

    if

}