package com.example.chatwithfriends.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.chatwithfriends.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link calls_Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class calls_Fragment extends Fragment {

    public calls_Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_calls_, container, false);
    }
}