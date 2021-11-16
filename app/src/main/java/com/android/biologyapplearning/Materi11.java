package com.android.biologyapplearning;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Materi11 extends AppCompatActivity {
    private CardView bab1, bab2, bab3, bab4, bab5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi11);
        bab1 = findViewById(R.id.materi11bab1);
        bab2 = findViewById(R.id.materi11bab2);
        bab3 = findViewById(R.id.materi11bab3);
        bab4 = findViewById(R.id.materi11bab4);
        bab5 = findViewById(R.id.materi11bab5);

        bab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), kls11bab1.class);
                startActivity(intent);
            }
        });

        bab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), kls11bab2.class);
                startActivity(intent);
            }
        });

        bab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), kls11bab3.class);
                startActivity(intent);
            }
        });

        bab4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), kls11bab4.class);
                startActivity(intent);
            }
        });

        bab5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), kls11bab5.class);
                startActivity(intent);
            }
        });
    }
}