package com.diego.materialdesing.fragments;


import android.os.Bundle;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.diego.materialdesing.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment4 extends Fragment {


    public Fragment4() {
        // Required empty public constructor
    }

    public Fragment4 newInstance(){
        return new Fragment4();
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,@Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment4, container, false);
    }


}
