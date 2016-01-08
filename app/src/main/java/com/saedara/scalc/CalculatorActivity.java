package com.saedara.scalc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
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
                String op1 = ((EditText)findViewById(R.id.op1EditText)).getText().toString();
                String op2 = ((EditText)findViewById(R.id.op2EditText)).getText().toString();
                if (op1.length() > 0 && op2.length() > 0) {
                    double operand2 = Double.parseDouble(op2);
                    double operand1 = Double.parseDouble(op1);
                    String operator = ((TextView)view).getText().toString();
                    ((TextView)findViewById(R.id.resultTextView)).setText(String.format("%s %s %s", operand1, operator, operand2));
                } else {
                    ((TextView)findViewById(R.id.resultTextView)).setText(R.string.OPERAND_EMPTY);
                }
            }
        });
    }
}
