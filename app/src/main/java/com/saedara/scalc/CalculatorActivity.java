package com.saedara.scalc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        GridView operations = (GridView)findViewById(R.id.operationsGridView);
        operations.setAdapter(new OperatorsAdapter(this));
        operations.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                double operand1 = Double.parseDouble(((EditText)findViewById(R.id.op1EditText)).getText().toString());
                double operand2 = Double.parseDouble(((EditText)findViewById(R.id.op2EditText)).getText().toString());
                String operator = ((TextView)view).getText().toString();
                ((TextView)findViewById(R.id.resultTextView)).setText(operand1 + " " + operator + " " + operand2);
            }
        });
    }
}
