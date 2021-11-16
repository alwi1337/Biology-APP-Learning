package com.android.biologyapplearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class kls11bab3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kls11bab3);
        PDFView pdfView = findViewById(R.id.kls11bab3);

        pdfView.fromAsset("materi11bab3.pdf").load();
    }
}