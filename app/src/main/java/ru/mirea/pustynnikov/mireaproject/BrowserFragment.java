package ru.mirea.pustynnikov.mireaproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.fragment.app.Fragment;


public class BrowserFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View mainView = (View) inflater.inflate(R.layout.fragment_browser, container, false);
        WebView webView = (WebView) mainView.findViewById(R.id.webview);
        webView.loadUrl("http://www.google.com");
        webView.setWebViewClient(new WebViewClient());
        return mainView;
    }
}