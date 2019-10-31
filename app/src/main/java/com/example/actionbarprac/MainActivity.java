package com.example.actionbarprac;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showActionBar(View v){
        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null) actionBar.show();
    }

    public void hideActionBar(View v){
        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null) actionBar.hide();
    }

    public void setTitle(View v){
        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null)actionBar.setTitle("My Title");
    }

    public void setSubtitle(View v){
        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null)actionBar.setSubtitle("My Subtitle");
    }
}
