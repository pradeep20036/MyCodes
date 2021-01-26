package com.example.learningfragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void firstFragment(View view) {

        FirstFragment firstFragment=new FirstFragment();
        FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.linearLayout,firstFragment);
        transaction.commit();

    }

    public void secondFragment(View view) {

        SecondFragment secondFragment=new SecondFragment();
        FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.linearLayout2,secondFragment);
        transaction.commit();

    }
}