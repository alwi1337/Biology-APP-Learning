package com.android.biologyapplearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class kls12bab1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kls12bab1);
        PDFView pdfView = findViewById(R.id.kls12bab1);

        pdfView.fromAsset("materi12bab1.pdf").load();
    }
}