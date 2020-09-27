package com.example.bernardocastro_comp304lab1_ex1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class ActivityCycle extends Fragment {

    TextView type, start, create;

    public ActivityCycle() {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_activity_cycle, container, false);
        start = view.findViewById(R.id.onStart);
        create = view.findViewById(R.id.onCreate);
        type = view.findViewById(R.id.activity_type);
        String StartTest = getResources().getString(R.string.start);
        start.setText(StartTest);
        start.setVisibility(View.GONE);
        String CreateText = getResources().getString(R.string.create);
        create.setText(CreateText);
        create.setVisibility(View.GONE);
        return view;
    }

    public void show(String activity){
        type.setText(activity);
        start.setVisibility(View.VISIBLE);
        create.setVisibility(View.VISIBLE);

    }
}