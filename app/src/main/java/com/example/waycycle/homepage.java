package com.example.waycycle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class homepage extends AppCompatActivity {

    private Button btn_widget_waypoints;
    private Button btn_widget_starcycle;
    private Button btn_artikel1;
    private Button btn_artikel2;
    private Button btn_artikel3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_homepage);

        btn_widget_waypoints = findViewById(R.id.btn_widget_waypoints);

        btn_widget_waypoints.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(homepage.this, waypoints.class);
                startActivity(intent);
            }
        });

        btn_widget_starcycle = findViewById(R.id.btn_widget_starcycle);

        btn_widget_starcycle.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(homepage.this, starcycle_1.class);
                startActivity(intent);
            }
        });

        btn_artikel1 = findViewById(R.id.btn_artikel1);

        btn_artikel1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(homepage.this, artikel.class);
                startActivity(intent);
            }
        });

        btn_artikel2 = findViewById(R.id.btn_artikel2);

        btn_artikel2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(homepage.this, artikel_2.class);
                startActivity(intent);
            }
        });

        btn_artikel3 = findViewById(R.id.btn_artikel3);

        btn_artikel3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(homepage.this, artikel_3.class);
                startActivity(intent);
            }
        });
    }
}