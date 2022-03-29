package com.example.ereader;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openSettings(View view) {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }

    public void openLibrary(View view) {
        Intent intent = new Intent(this, Library.class);
        startActivity(intent);
    }

    public void openCommunity(View view) {
        Intent intent = new Intent(this, Community.class);
        startActivity(intent);
    }

    public void openContinue(View view) {
        Intent intent = new Intent(this, Reader.class);
        startActivity(intent);
    }


}