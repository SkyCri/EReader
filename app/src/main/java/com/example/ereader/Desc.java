package com.example.ereader;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.Serializable;

public class Desc extends AppCompatActivity implements Serializable {

    Library.Book currBook;

    String booktitle;
    String author;
    String pubdate;
    String desc;

    static int counter = 0;

    static int status = -1;


    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desc);

        //imports book
        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();
        currBook = (Library.Book)bundle.getSerializable("sys");

        //getting Download Status and Book Number
        status = currBook.getDownloadStatus();
        counter = currBook.getCounter();

        //set download button. If downloaded, have setas icon, otherwise download
        if (currBook.getDownloadStatus() == 1) {
            ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton8);

            Resources resources = getResources();
            int resourceId = resources.getIdentifier("book", "drawable", getPackageName());

            imageButton.setImageResource(resourceId);
        }

        //Set Book Cover
        ImageView imageView = (ImageView) findViewById(R.id.imageView);

        String bookcover = currBook.getImgsrc();
        Resources resources = getResources();
        int resourceId = resources.getIdentifier(bookcover , "drawable", getPackageName());

        imageView.setImageResource(resourceId);

        //Set Description
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        desc = currBook.getDesc();
        textView3.setText(desc);

        //Set Title
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        booktitle = currBook.getTitle();
        textView2.setText(booktitle);

        //set Author
        TextView textView6 = (TextView) findViewById(R.id.textView6);
        author = currBook.getAuthor();
        textView6.setText(author);

        //set PubDate
        TextView textView7 = (TextView) findViewById(R.id.textView7);
        pubdate = currBook.getPubdate();
        textView7.setText(pubdate);
    }

    public void downloadConfirmation(View view) {
        Context context = getApplicationContext();

        CharSequence text = "Default";

        switch(counter) {
            case 1:
                currBook = Library.sysofL;
                break;
            case 2:
                currBook = Library.plynck;
                break;
            case 3:
                currBook = Library.paris;
                break;
            case 4:
                currBook = Library.spell;
                break;
            case 5:
                currBook = Library.witness;
                break;
            default:
                currBook = Library.paris;
        }

       //if not in library, download, else set as active book in reader
       if (status == 0) {
           text = "Downloaded!";
           status = currBook.setDownloadStatus(1);
           ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton8);

           Resources resources = getResources();
           int resourceId = resources.getIdentifier("book", "drawable", getPackageName());

           imageButton.setImageResource(resourceId);

       }
        else
       {
           text = "Set as current book!";
           Reader.bookselect = counter;
       }

        //displays toast to signify result of if statement
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

}