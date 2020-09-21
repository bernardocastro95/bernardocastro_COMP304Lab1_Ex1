package com.example.bernardocastro_comp304lab1_ex1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;


public class ActivitiesTypes extends Fragment {

    String[] types = new String[]{"AIActivity", "VRActivity"};
    public ActivitiesTypes() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_activities_types, container, false);
        ListView lv = view.findViewById(R.id.types);
        ArrayAdapter adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, types);
        lv.setAdapter(adapter);
        return view;
    }
}