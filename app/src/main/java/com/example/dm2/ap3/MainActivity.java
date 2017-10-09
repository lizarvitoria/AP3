package com.example.dm2.ap3;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private LinearLayout layout;
    private Button encender;
    private Button apagar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout = (LinearLayout)findViewById(R.id.layout);
        encender = (Button)findViewById(R.id.encender);
        apagar = (Button)findViewById(R.id.apagar);
        encender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                layout.setBackgroundColor(Color.YELLOW);
            }
        });
        apagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                layout.setBackgroundColor(Color.GRAY);
            }
        });

    }
}
