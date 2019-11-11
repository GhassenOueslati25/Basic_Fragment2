package com.warda.basic_fragment.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.warda.basic_fragment.R;

public class MyStaticFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflatethe layoutfor thisfragment
        return inflater.inflate(R.layout.fragment_my_static, container, false);
    }
}
