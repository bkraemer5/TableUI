package com.csuf.cpsc411.createtable;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        GridLayout mainGrid = new GridLayout(this);

        ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT;
                ViewGroup.LayoutParams.WRAP_CONTENT;
        );

        mainGrid.setLayoutParams(params);
        mainGrid.setOrientation(GridLayout.HORIZONTAL);
        mainGrid.setRowCount(3);
        mainGrid.setColumnCount(3);

        // CELL 1
        TextView tv = new TextView(this);
        tv.setText();







    }
}
