package com.example.ereader;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Library extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);
    }
    public void openShop(View view) {
        Intent intent = new Intent(this, Shop.class);
        startActivity(intent);
    }

}