package com.csuf.cpsc411.createtable;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
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
        mainGrid.setColumnCount(3);
        mainGrid.setAlignmentMode(GridLayout.ALIGN_MARGINS);
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
        fillParams.setMargins(2, 2, 2, 2);
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
                ViewGroup.LayoutParams.WRAP_CONTENT
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

        // CELL 4 ------------------------------------------
        GridLayout.Spec row2 = GridLayout.spec(1, 1f);
        fillParams = new GridLayout.LayoutParams(
                row2, col1);

        lv = new LinearLayout(this);

        lv.setOrientation(LinearLayout.VERTICAL);

        lparams.setMargins(2, 2, 2, 2);
        lv.setLayoutParams(fillParams);

        tv = new TextView(this);
        tv.setText("Rule");
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        tv.setTextColor(Color.BLACK);
        tv.setTextSize(7);
        tv.setBackgroundColor(Color.BLUE);
        tv.setGravity(Gravity.CENTER);
        lv.addView(tv, lparams);

        tv = new TextView(this);
        tv.setTextSize(7);
        tv.setBackgroundColor(Color.BLUE);
        lv.addView(tv, lparams);

        tv = new TextView(this);
        tv.setTextSize(7);
        tv.setBackgroundColor(Color.BLUE);
        lv.addView(tv, lparams);

        tv = new TextView(this);
        tv.setText(" Rule");
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        tv.setTextColor(Color.BLACK);
        tv.setTextSize(7);
        tv.setBackgroundColor(Color.WHITE);
        tv.setGravity(Gravity.LEFT);
        lv.addView(tv, lparams);

        tv = new TextView(this);
        tv.setText(" R10");
        tv.setTextSize(7);
        tv.setGravity(Gravity.LEFT);
        tv.setBackgroundColor(Color.WHITE);
        lv.addView(tv, lparams);

        tv = new TextView(this);
        tv.setText(" R20");
        tv.setTextSize(7);
        tv.setGravity(Gravity.LEFT);
        tv.setBackgroundColor(Color.WHITE);
        lv.addView(tv, lparams);

        tv = new TextView(this);
        tv.setText(" R30");
        tv.setTextSize(7);
        tv.setGravity(Gravity.LEFT);
        tv.setBackgroundColor(Color.WHITE);
        lv.addView(tv, lparams);

        tv = new TextView(this);
        tv.setText(" R40");
        tv.setTextSize(7);
        tv.setGravity(Gravity.LEFT);
        tv.setBackgroundColor(Color.WHITE);
        lv.addView(tv, lparams);

        mainGrid.addView(lv);
        // END CELL 4

        // CELL 5 --------------------------------------------
        GridLayout cell5Grid = new GridLayout(this);
        fillParams = new GridLayout.LayoutParams(
                row2, col2);
        cell5Grid.setRowCount(2);
        cell5Grid.setColumnCount(2);
        cell5Grid.setOrientation(GridLayout.HORIZONTAL);

        lv = new LinearLayout(this);

        lv.setOrientation(LinearLayout.VERTICAL);

        lparams.setMargins(2, 2, 2, 2);
        lv.setLayoutParams(fillParams);

        tv = new TextView(this);
        tv.setText("C1");
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        tv.setTextColor(Color.BLACK);
        tv.setTextSize(7);
        tv.setBackgroundColor(Color.BLUE);
        tv.setGravity(Gravity.CENTER);
        lv.addView(tv, lparams);

        tv = new TextView(this);
        tv.setText("min <= hour && hour <= max");
        tv.setTextSize(7);
        tv.setBackgroundColor(Color.BLUE);
        tv.setGravity(Gravity.CENTER);
        lv.addView(tv, lparams);


        //LinearLayout cell4layout = new LinearLayout(this);
        //cell4layout.setOrientation(LinearLayout.HORIZONTAL);
        GridLayout.LayoutParams cell5Params = new GridLayout.LayoutParams(
                row1, col1);

        tv = new TextView(this);
        tv.setText("int min");
        tv.setTextSize(7);
        tv.setBackgroundColor(Color.BLUE);
        tv.setGravity(Gravity.CENTER);
        tv.setLayoutParams(cell5Params);
        cell5Grid.addView(tv);

        cell5Params.setMargins(2, 2, 2, 2);

        cell5Params = new GridLayout.LayoutParams(
                row1, col2);

        tv = new TextView(this);
        tv.setText("int max");
        tv.setTextSize(7);
        tv.setBackgroundColor(Color.BLUE);
        tv.setGravity(Gravity.CENTER);
        tv.setLayoutParams(cell5Params);
        cell5Grid.addView(tv);

        cell5Params.setMargins(2, 2, 2, 2);

        lv.addView(cell5Grid);

        mainGrid.addView(lv);
        // END CELL 5

        // CELL 6 ------------------------------------------
        fillParams = new GridLayout.LayoutParams(
                row2, col3);

        lv = new LinearLayout(this);

        lv.setOrientation(LinearLayout.VERTICAL);

        lparams.setMargins(2, 2, 2, 2);
        lv.setLayoutParams(fillParams);

        tv = new TextView(this);
        tv.setText("A1");
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        tv.setTextColor(Color.BLACK);
        tv.setTextSize(7);
        tv.setBackgroundColor(Color.BLUE);
        tv.setGravity(Gravity.CENTER);
        lv.addView(tv, lparams);

        tv = new TextView(this);
        tv.setText("System.out.println(greeting + \" + World!)");
        tv.setTextSize(7);
        tv.setGravity(Gravity.CENTER);
        tv.setBackgroundColor(Color.BLUE);
        lv.addView(tv, lparams);

        tv = new TextView(this);
        tv.setText("String greeting");
        tv.setTextSize(7);
        tv.setGravity(Gravity.CENTER);
        tv.setBackgroundColor(Color.BLUE);
        lv.addView(tv, lparams);

        mainGrid.addView(lv);
        // END CELL 6

        // CELL 7 ------------------------------------------
        /*
        GridLayout.Spec row3 = GridLayout.spec(2, 1f);
        fillParams = new GridLayout.LayoutParams(
                row3, col1);

        lv = new LinearLayout(this);

        lv.setOrientation(LinearLayout.VERTICAL);

        lparams.setMargins(2, 2, 2, 2);
        lv.setLayoutParams(fillParams);

        tv = new TextView(this);
        tv.setText(" Rule");
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        tv.setTextColor(Color.BLACK);
        tv.setTextSize(7);
        tv.setBackgroundColor(Color.WHITE);
        tv.setGravity(Gravity.LEFT);
        lv.addView(tv, lparams);

        tv = new TextView(this);
        tv.setText(" R10");
        tv.setTextSize(7);
        tv.setGravity(Gravity.LEFT);
        tv.setBackgroundColor(Color.WHITE);
        lv.addView(tv, lparams);

        tv = new TextView(this);
        tv.setText(" R20");
        tv.setTextSize(7);
        tv.setGravity(Gravity.LEFT);
        tv.setBackgroundColor(Color.WHITE);
        lv.addView(tv, lparams);

        tv = new TextView(this);
        tv.setText("R20");
        tv.setTextSize(7);
        tv.setGravity(Gravity.LEFT);
        tv.setBackgroundColor(Color.WHITE);
        lv.addView(tv, lparams);

        mainGrid.addView(lv);

         */
        // END CELL 7


        setContentView(mainLinear);
    }
}
