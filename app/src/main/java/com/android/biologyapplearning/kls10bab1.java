package com.android.biologyapplearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class kls10bab1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kls10bab1);
        PDFView pdfView = findViewById(R.id.kls10bab1);

        pdfView.fromAsset("materi10bab1.pdf").load();
    }
}