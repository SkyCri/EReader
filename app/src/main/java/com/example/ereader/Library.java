package com.example.ereader;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import java.io.Serializable;

public class Library extends AppCompatActivity implements Serializable{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);
    }
    public void openShop(View view) {
        Intent intent = new Intent(this, Shop.class);
        startActivity(intent);
    }

    public void openLibDesc(View view) {
        Intent intent = new Intent(this, Desc.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("sys", plynck);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public static class Book implements Serializable
    {

        String title;
        String author;
        int pubdate;
        String desc;
        int downloadstatus;
        String src;


        // Constructor Declaration of Class
        public Book(String title, String author,
                    int pubdate, String desc, int downloadstatus, String src)
        {
            this.title = title;
            this.author = author;
            this.pubdate = pubdate;
            this.desc = desc;
            this.src = src;
        }

        public String getTitle()
        {
            return title;
        }

        public String getAuthor()
        {
            return author;
        }

        public int getPubdate()
        {
            return pubdate;
        }

        public String getDesc()
        {
            return desc;
        }

        public String getSrc()
        {
            return src;
        }

        public int getDownloadStatus()
        {
            return downloadstatus;
        }
    }

    Book sysofL = new Book("A System of Logic","John Stuart Mill", 1843,
            "The first major installment of his comprehensive restatement of an empiricist and " +
                    "utilitarian position. It begins the attack on intuitionism which Mill " +
                    "carried on throughout his life, and makes plain his belief that social planning" +
                    " and political action should rely primarily on scientific knowledge, not on " +
                    "authority, custom, revelation, or prescription.", 1,
                    "systemoflogic");

    Book paris = new Book("Paris Talks","Abdu’l-Baha", 1912,
            "A book transcribed from talks given by ʻAbdu'l-Bahá while in Paris in the first " +
                    "stages of his journeys to the West.", 0,
            "paris");

    Book plynck = new Book("The Garden of the Plynck","Karle Wilson Baker", 1920,
            "Classic fantastical children's story which pays homage to the likes of Lewis " +
                    "Carroll's Alice's Adventures in Wonderland, beautifully illustrated by " +
                    "Florence Minard.", 0,
            "plynck");

    Book spell = new Book("McGuffey's Eclectic Spelling Book","W. H. McGuffey", 1865,
            "A pictorial alphabet plus 248 individual lessons on spelling, grammar, " +
                    "pronunciation, abbreviation, usage and more.", 0,
            "spell");

    Book witness = new Book("The Witness Of The Stars","E.W. Bullinger", 1893,
            "Building upon ancient astronomical sources and modern scientific data, E. W. " +
                    "Bullinger shows how the constellations witness to the accuracy of " +
                    "biblical prophetic truths", 0,
            "stars");

}