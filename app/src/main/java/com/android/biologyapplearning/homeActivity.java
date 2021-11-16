package com.android.biologyapplearning;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class homeActivity extends AppCompatActivity {
    private CardView kelas10, kelas11, kelas12, aboutus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        kelas10 = findViewById(R.id.tombolkls10);
        kelas11 = findViewById(R.id.tombolkls11);
        kelas12 = findViewById(R.id.tombolkls12);
        aboutus = findViewById(R.id.tombolinfo);

        kelas10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), kelas10.class);
                startActivity(intent);
            }
        });
        kelas11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), kelas11.class);
                startActivity(intent);
            }
        });
        kelas12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), kelas12.class);
                startActivity(intent);
            }
        });
        aboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(homeActivity.this, aboutus.class);
                startActivity(intent);
            }
        });
    }
}