package com.example.ereader;

import android.content.res.Resources;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.pdftron.pdf.controls.DocumentActivity;

import java.io.Serializable;


public class Reader extends AppCompatActivity implements Serializable {

    public String currentBook;

    public ReaderBook activebook = new ReaderBook();

    public static int bookselect = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reader);

        activebook.setReaderbook(bookselect);

        Resources res = getResources();
        int currbook = res.getIdentifier(currentBook, "raw", getPackageName());
        DocumentActivity.openDocument(this, currbook);
    }

    public class ReaderBook
    {

        public void setReaderbook(int bookselect)
        {
            switch(bookselect) {
                case 1:
                    currentBook = "systemoflogic";
                    break;
                case 2:
                    currentBook = "plynck";
                    break;
                case 3:
                    currentBook = "paris";
                    break;
                case 4:
                    currentBook = "spell";
                    break;
                case 5:
                    currentBook = "witness";
                    break;
                default:
                    currentBook = "paris";
            }
        }


    }

}