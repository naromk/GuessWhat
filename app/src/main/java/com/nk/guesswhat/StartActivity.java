package com.nk.guesswhat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * Initial activity that will be launched when the application
 * gets loaded.  This should be a place where the user can select
 * clues.
 */
public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }
}
