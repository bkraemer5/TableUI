
// BRITTANY KRAEMER - CPSC 411
// This program displays a table to the screen utilizing LinearLayout and GridLayout concepts

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

        // DEFINING LAYOUTS
        GridLayout mainGrid = new GridLayout(this);
        LinearLayout mainLinear = new LinearLayout(this);
        TextView tv;
        LinearLayout lv;

        // GRID ROWS
        GridLayout.Spec row1 = GridLayout.spec(0, 1f);
        GridLayout.Spec row2 = GridLayout.spec(1, 1f);
        GridLayout.Spec row3 = GridLayout.spec(2, 1f);
        GridLayout.Spec row4 = GridLayout.spec(3, 1f);
        GridLayout.Spec row5 = GridLayout.spec(4, 1f);
        GridLayout.Spec row6 = GridLayout.spec(5, 1f);

        // GRID COLUMNS
        GridLayout.Spec col1 = GridLayout.spec(0, 1f);
        GridLayout.Spec col2 = GridLayout.spec(1, 1f);
        GridLayout.Spec col3 = GridLayout.spec(2, 1f);

        // LINEARLAYOUT Params (for all lv)
        LinearLayout.LayoutParams lparams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );

        // GRIDLAYOUT Params (for all grids)
        GridLayout.LayoutParams fillParams;

        // Params for the main LINEARLAYOUT
        ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        );

        // Creating the main LINEARLAYOUT
        mainLinear.setLayoutParams(params);
        mainLinear.setOrientation(LinearLayout.VERTICAL);
        mainLinear.setBackgroundColor(Color.BLACK);

    // Title =========================================================================

        // TEXT: Rules void hello1 (int hour)
            tv =  new TextView(this);
            tv.setText("Rules void hello1 (int hour)");
            tv.setTextColor(Color.WHITE);
            tv.setTextSize(12);
            tv.setGravity(Gravity.CENTER);

            mainLinear.addView(tv); // add TEXT to the main LINEARLAYOUT

        // Creating the main GRIDLAYOUT
            mainGrid.setOrientation(GridLayout.HORIZONTAL);
            mainGrid.setRowCount(3);
            mainGrid.setColumnCount(3);
            mainGrid.setAlignmentMode(GridLayout.ALIGN_MARGINS);

            mainLinear.addView(mainGrid); // add GRID to the main LINEARLAYOUT
        // Title end

    // CELL 1 =======================================================================

        // PLACED IN GRID[0][0]
            fillParams = new GridLayout.LayoutParams(
                    row1, col1);
            fillParams.setMargins(2, 2, 2, 2);

        // TEXT: properties
            tv = new TextView(this);
            tv.setText("  properties  ");
            tv.setTextColor(Color.BLACK);
            tv.setTextSize(7);
            tv.setBackgroundColor(Color.WHITE);
            tv.setGravity(Gravity.CENTER);
            tv.setLayoutParams(fillParams);

            mainGrid.addView(tv); // Add TEXTVIEW to MainGrid
        // CELL 1 END

    // CELL 2 =====================================================================

        // PLACED IN GRID[0][1]
            fillParams = new GridLayout.LayoutParams(
                    row1, col2);

        // ALL elements are placed in LINEARLAYOUT
            lv = new LinearLayout(this);
            lv.setOrientation(LinearLayout.VERTICAL);
            lv.setLayoutParams(fillParams);
            lparams.setMargins(2, 2, 2, 2);

        // TEXT: name
            tv = new TextView(this);
            tv.setText("name");
            tv.setTextColor(Color.BLACK);
            tv.setTextSize(7);
            tv.setBackgroundColor(Color.WHITE);
            tv.setGravity(Gravity.CENTER);
            lv.addView(tv, lparams);

        // TEXT: category
            tv = new TextView(this);
            tv.setText("category");
            tv.setTextColor(Color.BLACK);
            tv.setTextSize(7);
            tv.setBackgroundColor(Color.WHITE);
            tv.setGravity(Gravity.CENTER);
            lv.addView(tv, lparams);

            mainGrid.addView(lv); // add LINEARLAYOUT to MainGrid
        // CELL2 END

    // CELL3 ===============================================================================

        // PLACED IN GRID[0][2]
            fillParams = new GridLayout.LayoutParams(
                    row1, col3);

        // ALL elements are placed in LINEARLAYOUT
            lv = new LinearLayout(this);
            lv.setOrientation(LinearLayout.VERTICAL);
            lv.setLayoutParams(fillParams);
            lparams.setMargins(2, 2, 2, 2);

        // TEXT: Day Hour Classification
            tv = new TextView(this);
            tv.setText("Day Hour Classification");
            tv.setTextColor(Color.BLACK);
            tv.setTextSize(7);
            tv.setBackgroundColor(Color.WHITE);
            tv.setGravity(Gravity.CENTER);
            lv.addView(tv, lparams);

        // TEXT: Day and Time
            tv = new TextView(this);
            tv.setText("Day and Time");
            tv.setTextColor(Color.BLACK);
            tv.setTextSize(7);
            tv.setBackgroundColor(Color.WHITE);
            tv.setGravity(Gravity.CENTER);
            lv.addView(tv, lparams);

            mainGrid.addView(lv); // Add LINEARLAYOUT to MainGrid
        // CELL 3 END

    // CELL 4 =======================================================================

        // PLACED IN GRID[1][0]
            fillParams = new GridLayout.LayoutParams(
                    row2, col1);

        // ALL elements are placed in LINEARLAYOUT
            lv = new LinearLayout(this);
            lv.setOrientation(LinearLayout.VERTICAL);
            lv.setLayoutParams(fillParams);
            lparams.setMargins(2, 2, 2, 2);

        // TEXT: Rule
            tv = new TextView(this);
            tv.setText("Rule");
            tv.setTypeface(Typeface.DEFAULT_BOLD);
            tv.setTextColor(Color.BLACK);
            tv.setTextSize(7);
            tv.setBackgroundColor(Color.rgb(179, 255, 255));
            tv.setGravity(Gravity.CENTER);
            lv.addView(tv, lparams);

        // TEXT: (empty cell)
            tv = new TextView(this);
            tv.setTextSize(7);
            tv.setBackgroundColor(Color.rgb(179, 255, 255));
            lv.addView(tv, lparams);

        // TEXT: (empty cell)
            tv = new TextView(this);
            tv.setTextSize(7);
            tv.setBackgroundColor(Color.rgb(179, 255, 255));
            lv.addView(tv, lparams);

        // TEXT: Rule
            tv = new TextView(this);
            tv.setText(" Rule");
            tv.setTypeface(Typeface.DEFAULT_BOLD);
            tv.setTextColor(Color.BLACK);
            tv.setTextSize(7);
            tv.setBackgroundColor(Color.WHITE);
            tv.setGravity(Gravity.LEFT);
            lv.addView(tv, lparams);

        // TEXT: R10
            tv = new TextView(this);
            tv.setText(" R10");
            tv.setTextSize(7);
            tv.setGravity(Gravity.LEFT);
            tv.setBackgroundColor(Color.WHITE);
            lv.addView(tv, lparams);

        // TEXT: R20
            tv = new TextView(this);
            tv.setText(" R20");
            tv.setTextSize(7);
            tv.setGravity(Gravity.LEFT);
            tv.setBackgroundColor(Color.WHITE);
            lv.addView(tv, lparams);

        // TEXT: R30
            tv = new TextView(this);
            tv.setText(" R30");
            tv.setTextSize(7);
            tv.setGravity(Gravity.LEFT);
            tv.setBackgroundColor(Color.WHITE);
            lv.addView(tv, lparams);

        // TEXT: R40
            tv = new TextView(this);
            tv.setText(" R40");
            tv.setTextSize(7);
            tv.setGravity(Gravity.LEFT);
            tv.setBackgroundColor(Color.WHITE);
            lv.addView(tv, lparams);

            mainGrid.addView(lv); // Add LINEARLAYOUT to MainGrid
        // END CELL 4

    // CELL 5 ===================================================================

        // PLACED IN GRID[1][1]
            fillParams = new GridLayout.LayoutParams(
                    row2, col2);

        // ALL elements placed in a LINEAR LAYOUT
            lv = new LinearLayout(this);
            lv.setOrientation(LinearLayout.VERTICAL);
            lv.setLayoutParams(fillParams);
            lparams.setMargins(2, 2, 2, 2);

        // TEXT: C1
            tv = new TextView(this);
            tv.setText("C1");
            tv.setTypeface(Typeface.DEFAULT_BOLD, 1);
            tv.setTextColor(Color.BLACK);
            tv.setTextSize(7);
            tv.setBackgroundColor(Color.rgb(179, 255, 255));
            tv.setGravity(Gravity.CENTER);
            lv.addView(tv, lparams); // add to linearlayout

        // TEXT: min <= hour && hour <= max
            tv = new TextView(this);
            tv.setText("min <= hour && hour <= max");
            tv.setTextSize(7);
            tv.setBackgroundColor(Color.rgb(179, 255, 255));
            tv.setGravity(Gravity.CENTER);
            lv.addView(tv, lparams); // add to linearlayout

        // NEW GRIDLAYOUT for the remaining elements: GRID[6][2]
            GridLayout cell5Grid = new GridLayout(this);
            cell5Grid.setRowCount(6);
            cell5Grid.setColumnCount(2);
            cell5Grid.setOrientation(GridLayout.HORIZONTAL);

            // TEXT: int min - GRID[0][0]
                GridLayout.LayoutParams cell5Params = new GridLayout.LayoutParams(
                        row1, col1);
                cell5Params.setMargins(2, 2, 2, 2);

                tv = new TextView(this);
                tv.setText("int min");
                tv.setTextSize(7);
                tv.setBackgroundColor(Color.rgb(179, 255, 255));
                tv.setGravity(Gravity.CENTER);
                tv.setLayoutParams(cell5Params);
                cell5Grid.addView(tv); // add to grid

            // TEXT: int max - GRID[0][1]
                cell5Params = new GridLayout.LayoutParams(
                        row1, col2);
                cell5Params.setMargins(2, 2, 2, 2);

                tv = new TextView(this);
                tv.setText("int max");
                tv.setTextSize(7);
                tv.setBackgroundColor(Color.rgb(179, 255, 255));
                tv.setGravity(Gravity.CENTER);
                tv.setLayoutParams(cell5Params);
                cell5Grid.addView(tv);

            // TEXT: From - GRID[1][0]
                cell5Params = new GridLayout.LayoutParams(
                        row2, col1);
                cell5Params.setMargins(2, 2, 2, 2);

                tv = new TextView(this);
                tv.setText(" From");
                tv.setTextSize(7);
                tv.setTypeface(Typeface.DEFAULT_BOLD, 1);
                tv.setBackgroundColor(Color.rgb(255, 255, 153));
                tv.setGravity(Gravity.LEFT);
                tv.setLayoutParams(cell5Params);
                cell5Grid.addView(tv);

            // TEXT: To - GRID[1][2]
                cell5Params = new GridLayout.LayoutParams(
                        row2, col2);
                cell5Params.setMargins(2, 2, 2, 2);

                tv = new TextView(this);
                tv.setText(" To");
                tv.setTextSize(7);
                tv.setTypeface(Typeface.DEFAULT_BOLD, 1);
                tv.setBackgroundColor(Color.rgb(255, 255, 153));
                tv.setGravity(Gravity.LEFT);
                tv.setLayoutParams(cell5Params);
                cell5Grid.addView(tv);

            // TEXT: 0 - GRID[2][0]
                cell5Params = new GridLayout.LayoutParams(
                        row3, col1);
                cell5Params.setMargins(2, 2, 2, 2);

                tv = new TextView(this);
                tv.setText("0 ");
                tv.setTextSize(7);
                tv.setBackgroundColor(Color.rgb(255, 255, 153));
                tv.setGravity(Gravity.RIGHT);
                tv.setLayoutParams(cell5Params);
                cell5Grid.addView(tv);

            // TEXT: 11 - GRID[2][1]
                cell5Params = new GridLayout.LayoutParams(
                        row3, col2);
                cell5Params.setMargins(2, 2, 2, 2);

                tv = new TextView(this);
                tv.setText("11 ");
                tv.setTextSize(7);
                tv.setBackgroundColor(Color.rgb(255, 255, 153));
                tv.setGravity(Gravity.RIGHT);
                tv.setLayoutParams(cell5Params);
                cell5Grid.addView(tv);

            // TEXT: 12 - GRID[3][0]
                cell5Params = new GridLayout.LayoutParams(
                        row4, col1);
                cell5Params.setMargins(2, 2, 2, 2);

                tv = new TextView(this);
                tv.setText("12 ");
                tv.setTextSize(7);
                tv.setBackgroundColor(Color.rgb(255, 255, 153));
                tv.setGravity(Gravity.RIGHT);
                tv.setLayoutParams(cell5Params);
                cell5Grid.addView(tv);

            // TEXT: 17 - GRID[3][1]
                cell5Params = new GridLayout.LayoutParams(
                        row4, col2);
                cell5Params.setMargins(2, 2, 2, 2);

                tv = new TextView(this);
                tv.setText("17 ");
                tv.setTextSize(7);
                tv.setBackgroundColor(Color.rgb(255, 255, 153));
                tv.setGravity(Gravity.RIGHT);
                tv.setLayoutParams(cell5Params);
                cell5Grid.addView(tv);

            // TEXT: 18 - GRID[4][0]
                cell5Params = new GridLayout.LayoutParams(
                        row5, col1);
                cell5Params.setMargins(2, 2, 2, 2);

                tv = new TextView(this);
                tv.setText("18 ");
                tv.setTextSize(7);
                tv.setBackgroundColor(Color.rgb(255, 255, 153));
                tv.setGravity(Gravity.RIGHT);
                tv.setLayoutParams(cell5Params);
                cell5Grid.addView(tv);

            // TEXT: 21 - GRID[4][1]
                cell5Params = new GridLayout.LayoutParams(
                        row5, col2);
                cell5Params.setMargins(2, 2, 2, 2);

                tv = new TextView(this);
                tv.setText("21 ");
                tv.setTextSize(7);
                tv.setBackgroundColor(Color.rgb(255, 255, 153));
                tv.setGravity(Gravity.RIGHT);
                tv.setLayoutParams(cell5Params);
                cell5Grid.addView(tv);

            // TEXT: 22 - GRID[5][0]
                cell5Params = new GridLayout.LayoutParams(
                        row6, col1);
                cell5Params.setMargins(2, 2, 2, 2);

                tv = new TextView(this);
                tv.setText("22 ");
                tv.setTextSize(7);
                tv.setBackgroundColor(Color.rgb(255, 255, 153));
                tv.setGravity(Gravity.RIGHT);
                tv.setLayoutParams(cell5Params);
                cell5Grid.addView(tv);

            // TEXT: 23 - GRID[5][1]
                cell5Params = new GridLayout.LayoutParams(
                        row6, col2);
                cell5Params.setMargins(2, 2, 2, 2);

                tv = new TextView(this);
                tv.setText("23 ");
                tv.setTextSize(7);
                tv.setBackgroundColor(Color.rgb(255, 255, 153));
                tv.setGravity(Gravity.RIGHT);
                tv.setLayoutParams(cell5Params);
                cell5Grid.addView(tv);

            lv.addView(cell5Grid); // Add Cell5Grid to LinearLayout

            mainGrid.addView(lv); // Add LinearLayout to mainGrid
        // END CELL 5

    // CELL 6 ===========================================================================

        // PLACED IN GRID[1][2]
            fillParams = new GridLayout.LayoutParams(
                    row2, col3);

        // ALL elements placed in a LINEAR LAYOUT
            lv = new LinearLayout(this);
            lv.setOrientation(LinearLayout.VERTICAL);
            lv.setLayoutParams(fillParams);
            lparams.setMargins(2, 2, 2, 2);

        // TEXT: A1
            tv = new TextView(this);
            tv.setText("A1");
            tv.setTypeface(Typeface.DEFAULT_BOLD);
            tv.setTextColor(Color.BLACK);
            tv.setTextSize(7);
            tv.setBackgroundColor(Color.rgb(179, 255, 255));
            tv.setGravity(Gravity.CENTER);
            lv.addView(tv, lparams);

        // TEXT: System.out.println(greeting + " + World!")
            tv = new TextView(this);
            tv.setText("System.out.println(greeting + \" + World!)");
            tv.setTextSize(7);
            tv.setGravity(Gravity.CENTER);
            tv.setBackgroundColor(Color.rgb(179, 255, 255));
            lv.addView(tv, lparams);

        // TEXT: String greeting
            tv = new TextView(this);
            tv.setText("String greeting");
            tv.setTextSize(7);
            tv.setGravity(Gravity.CENTER);
            tv.setBackgroundColor(Color.rgb(179, 255, 255));
            lv.addView(tv, lparams);

        // TEXT: Greeting
            tv = new TextView(this);
            tv.setText(" Greeting");
            tv.setTextSize(7);
            tv.setGravity(Gravity.LEFT);
            tv.setBackgroundColor(Color.rgb(255, 191, 128));
            lv.addView(tv, lparams);

        // TEXT: Good Morning
            tv = new TextView(this);
            tv.setText(" Good Morning");
            tv.setTextSize(7);
            tv.setGravity(Gravity.LEFT);
            tv.setBackgroundColor(Color.rgb(255, 191, 128));
            lv.addView(tv, lparams);

        // TEXT: Good Afternoon
            tv = new TextView(this);
            tv.setText(" Good Afternoon");
            tv.setTextSize(7);
            tv.setGravity(Gravity.LEFT);
            tv.setBackgroundColor(Color.rgb(255, 191, 128));
            lv.addView(tv, lparams);

        // TEXT: Good Evening
            tv = new TextView(this);
            tv.setText(" Good Evening");
            tv.setTextSize(7);
            tv.setGravity(Gravity.LEFT);
            tv.setBackgroundColor(Color.rgb(255, 191, 128));
            lv.addView(tv, lparams);

        // TEXT: Good Night
            tv = new TextView(this);
            tv.setText(" Good Night");
            tv.setTextSize(7);
            tv.setGravity(Gravity.LEFT);
            tv.setBackgroundColor(Color.rgb(255, 191, 128));
            lv.addView(tv, lparams);


            mainGrid.addView(lv); // add LINEARLAYOUT to MainGrid
        // END CELL 6

        setContentView(mainLinear); // Show main LINEARLAYOUT

    }
}
