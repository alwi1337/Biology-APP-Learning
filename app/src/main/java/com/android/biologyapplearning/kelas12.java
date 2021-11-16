package com.android.biologyapplearning;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class kelas12 extends AppCompatActivity {
    private CardView tmblmateri12, tmblkuis12, tmblvidio12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelas12);
        tmblmateri12 = findViewById(R.id.tmblmateri12);
        tmblkuis12 = findViewById(R.id.tmblkuis12);
        tmblvidio12 = findViewById(R.id.tmblvidio12);

        tmblmateri12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Materi12.class);
                startActivity(intent);
            }
        });

        tmblkuis12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), kuis12.class);
                startActivity(intent);
            }
        });

        tmblvidio12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), vidio12.class);
                startActivity(intent);
            }
        });
    }
}