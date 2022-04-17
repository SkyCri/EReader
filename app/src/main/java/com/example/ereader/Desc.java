package com.example.ereader;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
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

    int status;


    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desc);

        //imports book
        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();
        currBook = (Library.Book)bundle.getSerializable("sys");

        status = currBook.getDownloadStatus();

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

        //set author
        TextView textView6 = (TextView) findViewById(R.id.textView6);
        author = currBook.getAuthor();
        textView6.setText(author);

        //set pubdate
        TextView textView7 = (TextView) findViewById(R.id.textView7);
        pubdate = currBook.getPubdate();
        textView7.setText(pubdate);
    }

    public void downloadConfirmation(View view) {
        Context context = getApplicationContext();

        CharSequence text = "Default";

        System.out.print("status: " + status);

       if (status == 0) {
           text = "Downloaded!";

       }
        else
       {
           text = "Set as current book!";
        //currBook.downloadstatus = 1;
       }

        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

}