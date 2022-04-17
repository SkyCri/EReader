package com.example.ereader;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class Community extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_community);

        WebView myWebView = new WebView(this);
        setContentView(myWebView);

        myWebView.getSettings().setDomStorageEnabled(true);

        myWebView.loadUrl("https://www.worldliteratureforum.com/");
    }


}