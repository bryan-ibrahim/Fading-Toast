package com.project.ibrapptly.fadingtoast;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fadeUp(View view) {
        FadingToast fadingToast = new FadingToast();
        fadingToast.fadeUp(getApplicationContext(), "Hello there");
    }

    public void fadeCentre(View view) {
        FadingToast fadingToast = new FadingToast();
        fadingToast.fadeCentre(getApplicationContext(), "Hello there");
    }

    public void fadeDown(View view) {
        FadingToast fadingToast = new FadingToast();
        fadingToast.fadeDown(getApplicationContext(), "Hello there");
    }
}
