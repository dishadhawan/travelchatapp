/* Made by Disha Dhawan,Shreya Verma, Sajida Farhana as our 6th sem mini project*/
package com.google.firebase.codelab.friendlychat;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Transport1Activity extends AppCompatActivity {
    private WebView htmlWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        htmlWebView = (WebView)findViewById(R.id.webView);
        htmlWebView.setWebViewClient(new Transport1Activity.CustomWebViewClient());
        WebSettings webSetting = htmlWebView.getSettings();
        webSetting.setJavaScriptEnabled(true);
        webSetting.setDisplayZoomControls(true);
        htmlWebView.loadUrl("https://www.justdial.com/travel/flight-booking");
    }


    private class CustomWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }

    }
}
