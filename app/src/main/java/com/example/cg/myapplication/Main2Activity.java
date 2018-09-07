package com.example.cg.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main2Activity extends AppCompatActivity {
    private WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        webview = (WebView) findViewById(R.id.webview);
        webview.loadUrl("http://www.google.com");
        webview.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if (webview.canGoBack())
            webview.goBack();
        else {
            super.onBackPressed();
        }
    }
}