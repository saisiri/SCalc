package com.saedara.scalc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }


    public void calculate(View view) {
        double amt = Double.parseDouble(((EditText) findViewById(R.id.op1EditText)).getText().toString());
        double percentage = Double.parseDouble(((EditText) findViewById(R.id.op2EditText)).getText().toString());

        TextView resultView = (TextView)findViewById(R.id.resultTextView);
        resultView.setText(Double.toString(amt * percentage / 100));
    }
}
