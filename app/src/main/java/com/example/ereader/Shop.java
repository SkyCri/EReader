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
        bundle.putSerializable("sys", Library.plynck);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void openDescParis(View view) {
        Intent intent = new Intent(this, Desc.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("sys", Library.paris);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void openDescSpell(View view) {
        Intent intent = new Intent(this, Desc.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("sys", Library.spell);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void openDescWitness(View view) {
        Intent intent = new Intent(this, Desc.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("sys", Library.witness);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void openDesc(View view) {
        Intent intent = new Intent(this, Desc.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("sys", Library.paris);
        intent.putExtras(bundle);
        startActivity(intent);
    }

}
