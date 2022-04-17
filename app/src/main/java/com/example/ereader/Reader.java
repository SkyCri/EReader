package com.example.ereader;

import android.content.res.Resources;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.pdftron.pdf.controls.DocumentActivity;

import java.io.Serializable;


public class Reader extends AppCompatActivity implements Serializable {

    //ReaderBook currentBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reader);

        String currentBook = "witness";

        //currentBook.setReaderbook("witness");
        //String readerBook = currentBook.getReaderbook();

        Resources res = getResources();
        int currbook = res.getIdentifier(currentBook, "raw", getPackageName());
        DocumentActivity.openDocument(this, currbook);
    }

    public static class ReaderBook
    {
        String readerbook;

        public void setReaderbook(String string)
        {
            //readerbook = string;
            //readerbook = "witness";
        }

        public String getReaderbook()
        {
            return readerbook;
        }
    }

}