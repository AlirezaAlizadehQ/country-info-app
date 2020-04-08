package edu.monash.fit2081.countryinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WikiWebViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wiki_web_view);

        Intent intent = getIntent();
        String countryName = intent.getStringExtra(CountryDetails.EXTRA_MESSAGE);

        String wikiUrlCountryName = "https://en.wikipedia.org/wiki/" + countryName;

        WebView webView = (WebView)findViewById(R.id.web_view_wiki);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(wikiUrlCountryName);
    }
}
