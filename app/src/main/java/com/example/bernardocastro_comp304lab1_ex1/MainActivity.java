package com.example.bernardocastro_comp304lab1_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivitiesTypes at = new ActivitiesTypes();
        ActivityCycle ac = new ActivityCycle();
        getSupportFragmentManager().beginTransaction().add(R.id.fragment1, at).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.fragment2, ac).commit();

    }
}