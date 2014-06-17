package com.salesforce.samples.vfconnector;

import android.os.Bundle;
import android.util.Log;

import com.salesforce.androidsdk.ui.sfhybrid.SalesforceDroidGapActivity;

public class SplashScreenActivity extends SalesforceDroidGapActivity {
	@Override
    public void onCreate(Bundle savedInstanceState) {
		Log.i("SalesforceDroidGapActivity.onCreate", "onCreate called");
        super.onCreate(savedInstanceState);
        super.setIntegerProperty("splashscreen", R.drawable.splash);
	}

	@Override
	public void loadUrl(final String url) {
		super.loadUrl(url, 10000 /* time for which splash screen should be displayed */ );
	}
}
