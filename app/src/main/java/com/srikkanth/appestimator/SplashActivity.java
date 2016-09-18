package com.srikkanth.appestimator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }

    public void gotoSelectType(View view)
    {
        startActivity(new Intent(SplashActivity.this, SelectTypeActivity.class));
    }
}
