package com.csuf.cpsc411.createtable;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        GridLayout mainGrid = new GridLayout(this);

        ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );

        mainGrid.setLayoutParams(params);
        mainGrid.setOrientation(GridLayout.HORIZONTAL);
        mainGrid.setRowCount(3);
        mainGrid.setColumnCount(3);

        // CELL 1
        TextView tv = new TextView(this);
        tv.setText("properties");
        tv.setTextSize(12);

        GridLayout.Spec row_spec = GridLayout.spec(1, GridLayout.CENTER);
        GridLayout.Spec col_spec = GridLayout.spec(1, GridLayout.CENTER);
        GridLayout.LayoutParams gParams = new GridLayout.LayoutParams(
                row_spec,
                col_spec
        );
        tv.setLayoutParams(gParams);
        mainGrid.addView(tv);
        // CELL 1 END

        // CELL 2
        LinearLayout lv = new LinearLayout(this);
        lv.setBackgroundColor(Color.BLUE);
        ViewGroup.LayoutParams lparams = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );




        setContentView(mainGrid);
    }
}
