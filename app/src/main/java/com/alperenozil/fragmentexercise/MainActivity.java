package com.alperenozil.fragmentexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BlankFragment blankFragment=new BlankFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.fragment_container, blankFragment)
                .commit();
    }
}