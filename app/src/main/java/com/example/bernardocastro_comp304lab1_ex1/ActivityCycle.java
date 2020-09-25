package com.example.bernardocastro_comp304lab1_ex1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class ActivityCycle extends Fragment {

    public ActivityCycle() {

    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_activity_cycle, container, false);
        TextView start = view.findViewById(R.id.onStart);
        TextView create = view.findViewById(R.id.onCreate);
        String StartTest = getResources().getString(R.string.start);
        start.setText(StartTest);
        String CreateText = getResources().getString(R.string.create);
        create.setText(CreateText);
        return view;
    }
}