package com.example.ereader;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import com.pdftron.pdf.controls.DocumentActivity;


public class Reader extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reader);
        DocumentActivity.openDocument(this, R.raw.systemoflogic);
    }

}