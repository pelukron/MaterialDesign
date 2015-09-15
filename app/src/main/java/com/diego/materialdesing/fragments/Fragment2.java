package com.diego.materialdesing.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.diego.materialdesing.R;

/**
 * Created by diego on 9/15/15 for Material Desing.
 */
public class Fragment2 extends Fragment {

    public Fragment2(){
        // Required empty public constructor
    }

    public Fragment2 newInstance(){
        return new Fragment2();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.fragment_fragment2, container, false);
    }
}
