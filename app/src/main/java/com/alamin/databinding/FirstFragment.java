package com.alamin.databinding;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.MarginPageTransformer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alamin.databinding.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FragmentFirstBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_first,container, false);
        binding.testText.setText("Hello Joy");
        return binding.getRoot();
    }
}