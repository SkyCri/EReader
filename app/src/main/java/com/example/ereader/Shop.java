package com.example.ereader;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import java.io.Serializable;

public class Shop extends AppCompatActivity implements Serializable {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

    }

    public void openDescPlynck(View view) {
        Intent intent = new Intent(this, Desc.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("sys", plynck);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void openDescParis(View view) {
        Intent intent = new Intent(this, Desc.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("sys", paris);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void openDescSpell(View view) {
        Intent intent = new Intent(this, Desc.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("sys", spell);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void openDescWitness(View view) {
        Intent intent = new Intent(this, Desc.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("sys", witness);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void openDesc(View view) {
        Intent intent = new Intent(this, Desc.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("sys", paris);
        intent.putExtras(bundle);
        startActivity(intent);
    }


    Library.Book paris = new Library.Book("Paris Talks","Abdu’l-Baha", 1912,
            "A book transcribed from talks given by ʻAbdu'l-Bahá while in Paris in the first " +
                    "stages of his journeys to the West.", 0,
            "paris");

    Library.Book plynck = new Library.Book("The Garden of the Plynck","Karle Wilson Baker", 1920,
            "Classic fantastical children's story which pays homage to the likes of Lewis " +
                    "Carroll's Alice's Adventures in Wonderland, beautifully illustrated by " +
                    "Florence Minard.", 0,
            "plynck");

    Library.Book spell = new Library.Book("McGuffey's Eclectic Spelling Book","W. H. McGuffey", 1865,
            "A pictorial alphabet plus 248 individual lessons on spelling, grammar, " +
                    "pronunciation, abbreviation, usage and more.", 0,
            "spell");

    Library.Book witness = new Library.Book("The Witness Of The Stars","E.W. Bullinger", 1893,
            "Building upon ancient astronomical sources and modern scientific data, E. W. " +
                    "Bullinger shows how the constellations witness to the accuracy of " +
                    "biblical prophetic truths", 0,
            "stars");
}