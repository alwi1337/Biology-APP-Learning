package com.android.biologyapplearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class kls12bab4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kls12bab4);
        PDFView pdfView = findViewById(R.id.kls12bab4);

        pdfView.fromAsset("materi12bab4.pdf").load();
    }
}