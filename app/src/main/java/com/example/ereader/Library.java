package com.example.ereader;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import java.io.Serializable;

public class Library extends AppCompatActivity implements Serializable{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        ImageButton button3,button4;

        button3 = (ImageButton) findViewById(R.id.imageButton3);
        button4 = (ImageButton)findViewById(R.id.imageButton4);

        button3.setVisibility(View.GONE);
        button4.setVisibility(View.GONE);

        if (witness.getDownloadStatus() == 1)
            button3.setVisibility(View.VISIBLE);
        if (spell.getDownloadStatus() == 1)
            button4.setVisibility(View.VISIBLE);

    }
    public void openShop(View view) {
        Intent intent = new Intent(this, Shop.class);
        startActivity(intent);
    }

    public void openLibDescSys(View view) {
        Intent intent = new Intent(this, Desc.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("sys", sysofL);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void openLibDescWitness(View view) {
        Intent intent = new Intent(this, Desc.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("sys", witness);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void openLibDescPlynck(View view) {
        Intent intent = new Intent(this, Desc.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("sys", plynck);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void openLibDescSpell(View view) {
        Intent intent = new Intent(this, Desc.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("sys", spell);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void openLibDescParis(View view) {
        Intent intent = new Intent(this, Desc.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("sys", paris);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public static class Book implements Serializable
    {

        String title;
        String author;
        String pubdate;
        String desc;
        int downloadstatus;
        String imgsrc;
        String src;
        int counter;


        // Constructor Declaration of Class
        public Book(String title, String author,
                    String pubdate, String desc, int downloadstatus, String imgsrc, String src,
                    int counter)
        {
            this.title = title;
            this.author = author;
            this.pubdate = pubdate;
            this.desc = desc;
            this.imgsrc = imgsrc;
            this.src = src;
            this.counter = counter;
            this.downloadstatus = downloadstatus;
        }

        public String getTitle() { return title; }

        public String getAuthor() { return author; }

        public String getPubdate() { return pubdate; }

        public String getDesc() { return desc; }

        public String getImgsrc() { return imgsrc; }

        public int getDownloadStatus() { return downloadstatus; }

        public int setDownloadStatus(int download)
        {
            downloadstatus = download;
            return downloadstatus;
        }

        public int getCounter() { return counter; }
    }

    static Book sysofL = new Book("A System of Logic","John Stuart Mill", "1843",
            "The first major installment of his comprehensive restatement of an empiricist and " +
                    "utilitarian position. It begins the attack on intuitionism which Mill " +
                    "carried on throughout his life, and makes plain his belief that social planning" +
                    " and political action should rely primarily on scientific knowledge, not on " +
                    "authority, custom, revelation, or prescription.", 1,
                    "systemoflogic", "systemoflogic", 1);

    static Book paris = new Book("Paris Talks","Abdu’l-Baha", "1912",
            "A book transcribed from talks given by ʻAbdu'l-Bahá while in Paris in the first " +
                    "stages of his journeys to the West.", 0,
            "paris", "paris", 3);

    static Book plynck = new Book("The Garden of the Plynck","Karle Wilson Baker", "1920",
            "Classic fantastical children's story which pays homage to the likes of Lewis " +
                    "Carroll's Alice's Adventures in Wonderland, beautifully illustrated by " +
                    "Florence Minard.", 0,
            "plynck", "plynck", 2);

    static Book spell = new Book("McGuffey's Eclectic Spelling Book","W. H. McGuffey", "1865",
            "A pictorial alphabet plus 248 individual lessons on spelling, grammar, " +
                    "pronunciation, abbreviation, usage and more.", 0,
            "spell", "spell", 4);

    static Book witness = new Book("The Witness Of The Stars","E.W. Bullinger", "1893",
            "Building upon ancient astronomical sources and modern scientific data, E. W. " +
                    "Bullinger shows how the constellations witness to the accuracy of " +
                    "biblical prophetic truths", 0,
            "stars", "witness", 5);

}