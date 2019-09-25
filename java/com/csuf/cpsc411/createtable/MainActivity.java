package com.csuf.cpsc411.createtable;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.Gravity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        GridLayout mainGrid = new GridLayout(this);
        LinearLayout mainLinear = new LinearLayout(this);
        TextView tv = new TextView(this);

        ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        );

        mainLinear.setLayoutParams(params);
        mainLinear.setOrientation(LinearLayout.VERTICAL);
        mainLinear.setBackgroundColor(Color.BLACK);

        LinearLayout.LayoutParams vParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );

        // Title
        tv = new TextView(this);
        tv.setText("Rules void hello1 (int hour)");
        tv.setTextColor(Color.WHITE);
        tv.setTextSize(12);
        tv.setGravity(Gravity.CENTER);

        mainLinear.addView(tv);

        mainGrid.setOrientation(GridLayout.HORIZONTAL);
        mainGrid.setRowCount(3);
        mainGrid.setColumnCount(3);
        //mainGrid.setUseDefaultMargins(true);
        mainGrid.setAlignmentMode(GridLayout.ALIGN_MARGINS);

        mainLinear.addView(mainGrid);

        // Title end

        // CELL 1
        LinearLayout lv = new LinearLayout(this);
        lv.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams lparams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        );

        lparams.setMargins(2, 2, 2, 2);

        tv = new TextView(this);
        tv.setText("  properties  ");
        tv.setTextColor(Color.BLACK);
        tv.setTextSize(12);
        tv.setBackgroundColor(Color.WHITE);

        GridLayout.Spec row_spec = GridLayout.spec(1, GridLayout.FILL);
        GridLayout.Spec col_spec = GridLayout.spec(1, GridLayout.FILL);
        GridLayout.LayoutParams fillParams = new GridLayout.LayoutParams(
                row_spec, col_spec);
        fillParams.setMargins(4, 4, 4, 4);
        tv.setLayoutParams(fillParams);
        tv.setGravity(Gravity.CENTER);
        //lv.addView(tv);
        //lv.setLayoutParams(fillParams);
        mainGrid.addView(tv);
        // CELL 1 END

        // CELL 2
        lv = new LinearLayout(this);
        lv.setOrientation(LinearLayout.VERTICAL);
        lparams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        );

        lparams.setMargins(2, 2, 2, 2);
        lv.setLayoutParams(lparams);

        tv = new TextView(this);
        tv.setText("name");
        tv.setTextColor(Color.BLACK);
        tv.setTextSize(12);
        tv.setBackgroundColor(Color.WHITE);
        tv.setGravity(Gravity.CENTER);
        lv.addView(tv, lparams);


        tv = new TextView(this);
        tv.setText("category");
        tv.setTextColor(Color.BLACK);
        tv.setTextSize(12);
        tv.setBackgroundColor(Color.WHITE);
        tv.setGravity(Gravity.CENTER);

        lv.addView(tv, lparams);

        mainGrid.addView(lv);
        // CELL2 END

        // CELL3

        setContentView(mainLinear);
    }
}
