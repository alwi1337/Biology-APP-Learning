package com.android.biologyapplearning;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Materi12 extends AppCompatActivity {
    private CardView bab1, bab2, bab3, bab4, bab5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi12);
        bab1 = findViewById(R.id.materi12bab1);
        bab2 = findViewById(R.id.materi12bab2);
        bab3 = findViewById(R.id.materi12bab3);
        bab4 = findViewById(R.id.materi12bab4);
        bab5 = findViewById(R.id.materi12bab5);

        bab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), kls12bab1.class);
                startActivity(intent);
            }
        });

        bab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), kls12bab2.class);
                startActivity(intent);
            }
        });

        bab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), kls12bab3.class);
                startActivity(intent);
            }
        });

        bab4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), kls12bab4.class);
                startActivity(intent);
            }
        });

        bab5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), kls12bab5.class);
                startActivity(intent);
            }
        });
    }
}