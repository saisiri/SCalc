package com.saedara.scalc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void sendMessage(View view) {
        EditText editText = (EditText)findViewById(R.id.edit_message);

        TextView resultView = (TextView)findViewById(R.id.resultMessageTextView);
        resultView.setTextSize(40);
        resultView.setText(editText.getText());
    }

}
