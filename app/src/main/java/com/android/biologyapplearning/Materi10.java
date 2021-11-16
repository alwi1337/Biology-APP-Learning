package com.android.biologyapplearning;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Materi10 extends AppCompatActivity {
    private CardView bab1, bab2, bab3, bab4, bab5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi10);
        bab1 = findViewById(R.id.materi10bab1);
        bab2 = findViewById(R.id.materi10bab2);
        bab3 = findViewById(R.id.materi10bab3);
        bab4 = findViewById(R.id.materi10bab4);
        bab5 = findViewById(R.id.materi10bab5);

        bab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), kls10bab1.class);
                startActivity(intent);
            }
        });

        bab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), kls10bab2.class);
                startActivity(intent);
            }
        });

        bab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), kls10bab3.class);
                startActivity(intent);
            }
        });

        bab4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), kls10bab4.class);
                startActivity(intent);
            }
        });

        bab5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), kls10bab5.class);
                startActivity(intent);
            }
        });
    }
}