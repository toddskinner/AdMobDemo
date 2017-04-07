package com.example.android.admobdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchBannerAd(View unusedView) {
        startActivity(new Intent(this, BannerActivity.class));
    }

    public void launchInterstitialAd(View unusedView) {
        startActivity(new Intent(this, InterstitialActivity.class));
    }
}
