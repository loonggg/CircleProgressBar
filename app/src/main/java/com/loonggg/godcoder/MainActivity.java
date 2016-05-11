package com.loonggg.godcoder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.loonggg.circleprogressbarlibrary.view.CircleProgressBar;


public class MainActivity extends AppCompatActivity {
    private CircleProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar = (CircleProgressBar) findViewById(R.id.pb);
        progressBar.setProgress(1f, 5000);

    }
}
