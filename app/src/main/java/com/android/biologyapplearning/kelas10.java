package com.android.biologyapplearning;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class kelas10 extends AppCompatActivity {
    private CardView tmblmateri10, tmblkuis10, tmblvidio10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelas10);
        tmblmateri10 = findViewById(R.id.tmblmateri10);
        tmblkuis10 = findViewById(R.id.tmblkuis10);
        tmblvidio10 = findViewById(R.id.tmblvidio10);

        tmblmateri10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Materi10.class);
                startActivity(intent);
            }
        });

        tmblkuis10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), kuis10.class);
                startActivity(intent);
            }
        });

        tmblvidio10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), vidio10.class);
                startActivity(intent);
            }
        });
    }
}