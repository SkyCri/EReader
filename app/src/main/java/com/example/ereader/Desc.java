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
    

    String booktitle;
    String author;
    int pubdate;
    String desc;


    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desc);


        //imports book
        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();
        Library.Book currBook = (Library.Book)bundle.getSerializable("sys");

        //Set Book Cover
        ImageView imageView = (ImageView) findViewById(R.id.imageView);

        String bookcover = currBook.getSrc();
        Resources resources = getResources();
        int resourceId = resources.getIdentifier(bookcover ,
                "drawable", getPackageName());

        imageView.setImageResource(resourceId);

        //Set Description
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        desc = currBook.getDesc();
        textView3.setText(desc);

        //Set Title
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        booktitle = currBook.getTitle();
        textView2.setText(booktitle);
    }

    public void downloadConfirmation(View view) {
        Context context = getApplicationContext();
        CharSequence text = "Downloaded!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

}