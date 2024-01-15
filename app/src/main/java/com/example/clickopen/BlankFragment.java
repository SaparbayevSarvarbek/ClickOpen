package com.example.clickopen;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.clickopen.databinding.FragmentBlankBinding;

import java.io.Serializable;

public class BlankFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";

    // TODO: Rename and change types of parameters
    private Data mParam1;

    public BlankFragment() {
        // Required empty public constructor
    }
    public static BlankFragment newInstance(Data param1) {
        BlankFragment fragment = new BlankFragment();
        Bundle args = new Bundle();
        args.putSerializable(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = (Data) getArguments().getSerializable(ARG_PARAM1);
        }
    }
    FragmentBlankBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentBlankBinding.inflate(inflater, container, false);
        binding.image.setImageResource(mParam1.getImage());
        binding.title.setText(mParam1.getTitle());
        binding.description.setText(mParam1.getDescription());

        return binding.getRoot();
    }
}