package com.android.biologyapplearning;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class kelas11 extends AppCompatActivity {
    private CardView tmblmateri11, tmblkuis11, tmblvidio11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelas11);
        tmblmateri11 = findViewById(R.id.tmblmateri11);
        tmblkuis11 = findViewById(R.id.tmblkuis11);
        tmblvidio11 = findViewById(R.id.tmblvidio11);

        tmblmateri11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Materi11.class);
                startActivity(intent);
            }
        });

        tmblkuis11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), kuis11.class);
                startActivity(intent);
            }
        });

        tmblvidio11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), vidio11.class);
                startActivity(intent);
            }
        });
    }
}