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
        LinearLayout lv = new LinearLayout(this);

        ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        );

        ViewGroup.LayoutParams gparams = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        );

        mainLinear.setLayoutParams(params);
        mainLinear.setOrientation(LinearLayout.VERTICAL);
        mainLinear.setBackgroundColor(Color.BLACK);

        // Title ------------------------------------------------
        tv.setText("Rules void hello1 (int hour)");
        tv.setTextColor(Color.WHITE);
        tv.setTextSize(12);
        tv.setGravity(Gravity.CENTER);

        mainLinear.addView(tv);

        //mainGrid.setLayoutParams(gparams);
        mainGrid.setOrientation(GridLayout.HORIZONTAL);
        mainGrid.setRowCount(3);
        //mainGrid.setColumnCount(3);
        mainGrid.setAlignmentMode(GridLayout.ALIGN_MARGINS);
        //mainGrid.setRowOrderPreserved(false);
        mainLinear.addView(mainGrid);
        // Title end

        // CELL 1 ------------------------------------------------
        tv = new TextView(this);
        tv.setText("  properties  ");
        tv.setTextColor(Color.BLACK);
        tv.setTextSize(7);
        tv.setBackgroundColor(Color.WHITE);
        tv.setGravity(Gravity.CENTER);

        GridLayout.Spec row1 = GridLayout.spec(0, 1f);
        GridLayout.Spec col1 = GridLayout.spec(0, 1f);
        GridLayout.LayoutParams fillParams = new GridLayout.LayoutParams(
                row1, col1);
        fillParams.setMargins(4, 2, 4, 2);
        tv.setLayoutParams(fillParams);
        mainGrid.addView(tv);

        // CELL 1 END



        // CELL 2 -------------------------------------------------

        GridLayout.Spec col2 = GridLayout.spec(1, 1f);
        fillParams = new GridLayout.LayoutParams(
                row1, col2);


        lv.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams lparams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        );

        lparams.setMargins(2, 2, 2, 2);
        lv.setLayoutParams(fillParams);

        tv = new TextView(this);
        tv.setText("name");
        tv.setTextColor(Color.BLACK);
        tv.setTextSize(7);
        tv.setBackgroundColor(Color.WHITE);
        tv.setGravity(Gravity.CENTER);
        lv.addView(tv, lparams);

        tv = new TextView(this);
        tv.setText("category");
        tv.setTextColor(Color.BLACK);
        tv.setTextSize(7);
        tv.setBackgroundColor(Color.WHITE);
        tv.setGravity(Gravity.CENTER);

        lv.addView(tv, lparams);
        mainGrid.addView(lv);

        // CELL2 END


        // CELL3 -------------------------------------------
        GridLayout.Spec col3 = GridLayout.spec(2, 1f);
        fillParams = new GridLayout.LayoutParams(
                row1, col3);

        lv = new LinearLayout(this);

        lv.setOrientation(LinearLayout.VERTICAL);

        lparams.setMargins(2, 2, 2, 2);
        lv.setLayoutParams(fillParams);

        tv = new TextView(this);
        tv.setText("Day Hour Classification");
        tv.setTextColor(Color.BLACK);
        tv.setTextSize(7);
        tv.setBackgroundColor(Color.WHITE);
        tv.setGravity(Gravity.CENTER);
        lv.addView(tv, lparams);

        tv = new TextView(this);
        tv.setText("Day and Time");
        tv.setTextColor(Color.BLACK);
        tv.setTextSize(7);
        tv.setBackgroundColor(Color.WHITE);
        tv.setGravity(Gravity.CENTER);

        lv.addView(tv, lparams);
        mainGrid.addView(lv);
        // CELL 3 END



        setContentView(mainLinear);
    }
}
