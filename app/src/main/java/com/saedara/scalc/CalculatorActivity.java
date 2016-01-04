package com.saedara.scalc;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }


    public void calculatePercentage(View view) {
        double amt = Double.parseDouble(((EditText) findViewById(R.id.amountEditText)).getText().toString());
        double percentage = Double.parseDouble(((EditText) findViewById(R.id.percentEditText)).getText().toString());

        TextView resultView = (TextView)findViewById(R.id.resultTextView);
        resultView.setText(Double.toString(amt * percentage / 100));
    }
}
