package com.alperenozil.fragmentexercise;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private BlankFragment blankFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void add(View view){
        BlankFragment blankFragment=new BlankFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .addToBackStack(null)//when user clicks back button it removes fragment that loaded lastly.
                .add(R.id.fragment_container, blankFragment)
                .commit();

    }
    public void remove(View view){
        Fragment blankFragment=getSupportFragmentManager().findFragmentById(R.id.fragment_container);
        if(blankFragment!=null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .remove(blankFragment)
                    .commit();
        }
    }
}