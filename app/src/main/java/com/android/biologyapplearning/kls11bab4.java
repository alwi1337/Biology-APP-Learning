package com.android.biologyapplearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class kls11bab4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kls11bab4);
        PDFView pdfView = findViewById(R.id.kls11bab4);

        pdfView.fromAsset("materi11bab4.pdf").load();
    }
}