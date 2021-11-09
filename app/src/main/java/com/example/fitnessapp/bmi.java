package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class bmi extends AppCompatActivity {
    private EditText weight;
    private EditText height;
    private TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        weight = findViewById(R.id.editweight);
        height = findViewById(R.id.editheight);
        res =    findViewById(R.id.editresult);
        setContentView(R.layout.activity_bmi);
    }
    public void calculate(View view) {
        double w = Double.parseDouble(weight.getText().toString());
        double h = Double.parseDouble(height.getText().toString());
        double bmi = w / Math.pow(h / 100, 2);
        String result = "BMI= " + String.format("%.2f", bmi);
        res.setText(result);


    }
}