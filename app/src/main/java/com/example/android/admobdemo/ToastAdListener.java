package com.example.android.admobdemo;

import android.content.Context;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;

/**
 * Created by toddskinner on 4/7/17.
 */

public class ToastAdListener extends AdListener {

    private Context mContext;
    private String mErrorReason;

    public ToastAdListener(Context context){
        this.mContext = context;
    }

    public void onAdLoaded(){
        Toast.makeText(mContext, "onAdLoaded()", Toast.LENGTH_SHORT).show();
    }

    public void onAdFailedToLoad(int code){
        mErrorReason = "";
        switch(code){
            case AdRequest.ERROR_CODE_INTERNAL_ERROR:
                mErrorReason = "Internal error";
                break;
            case AdRequest.ERROR_CODE_INVALID_REQUEST:
                mErrorReason = "Invalid request";
                break;
            case AdRequest.ERROR_CODE_NETWORK_ERROR:
                mErrorReason = "Network error";
                break;
            case AdRequest.ERROR_CODE_NO_FILL:
                mErrorReason = "No fill";
                break;
        }
        Toast.makeText(mContext,
                String.format("onAdFailedToLoad(%s)", mErrorReason),
                Toast.LENGTH_SHORT).show();
    }

    public void onAdOpened(){
        Toast.makeText(mContext, "onAdOpened()", Toast.LENGTH_SHORT).show();
    }

    public void onAdLeftApplication(){
        Toast.makeText(mContext, "onAdLeftApplication()", Toast.LENGTH_SHORT).show();
    }

    public void onAdClosed(){
        Toast.makeText(mContext, "onAdClosed()", Toast.LENGTH_SHORT).show();
    }

    public String getErrorReason(int code){
        return mErrorReason == null ? "" : mErrorReason;
    }
}
