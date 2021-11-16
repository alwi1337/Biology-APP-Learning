package com.android.biologyapplearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class kls11bab5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kls11bab5);
        PDFView pdfView = findViewById(R.id.kls11bab5);

        pdfView.fromAsset("materi11bab5.pdf").load();
    }
}