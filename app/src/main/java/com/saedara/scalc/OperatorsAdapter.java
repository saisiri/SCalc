package com.saedara.scalc;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;

/**
 * Created by saedara on 1/7/16.
 */
public class OperatorsAdapter extends BaseAdapter {

    private Context context;
    private static String[] operators = {
       "+", "-", "/", "*", "%", "pow", "sqrt"
    };

    public OperatorsAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return operators.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        TextView view;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            view = new TextView(context);
            view.setText(operators[position]);
            view.setLayoutParams(new GridView.LayoutParams(85, 85));
            view.setPadding(5, 5, 5, 5);
        } else {
            view = (TextView)convertView;
        }

        return view;
    }
}
