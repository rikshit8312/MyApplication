package com.example.rikshit.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button badd,bsubtract;
    TextView tv;
    int total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        badd = (Button) findViewById(R.id.btnAdd);
        bsubtract = (Button) findViewById(R.id.btnSubtract);
        tv = (TextView) findViewById(R.id.tvTotal);
        total = 0;
        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                total++;
                tv.setText("Your Total is " + total);
            }
        });

        bsubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                total--;
                tv.setText("Your Total is " + total);

            }
        });
    }


}
