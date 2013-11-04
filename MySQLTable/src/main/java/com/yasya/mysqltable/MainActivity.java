package com.yasya.mysqltable;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

    }

    public void hideShowSearch(View view) {
        LinearLayout searchFrame = (LinearLayout) findViewById(R.id.lyt_search);
        LinearLayout searchForm = (LinearLayout) findViewById(R.id.lyt_searchchild);
        LinearLayout table = (LinearLayout) findViewById(R.id.lyt_scrolltable);

        LinearLayout.LayoutParams frameParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 0);

        if (searchForm.isShown()) {
            searchForm.setVisibility(View.GONE);
            frameParams.weight = 0.15f;
            layoutParams.weight = 1.65f;
            table.setLayoutParams(layoutParams);
            searchFrame.setLayoutParams(frameParams);
        } else {
            searchForm.setVisibility(View.VISIBLE);
            frameParams.weight = 0.6f;
            layoutParams.weight = 1.2f;
            table.setLayoutParams(layoutParams);
            searchFrame.setLayoutParams(frameParams);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
