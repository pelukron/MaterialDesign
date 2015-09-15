package com.diego.materialdesing.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.diego.materialdesing.fragments.Fragment1;
import com.diego.materialdesing.fragments.Fragment2;
import com.diego.materialdesing.fragments.Fragment3;
import com.diego.materialdesing.fragments.Fragment4;

/**
 * Created by diego on 9/15/15 for Material Desing.
 */
public class MyPageAdapter extends FragmentPagerAdapter {

    private static int NUMBER_PAGES = 4;

    public MyPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new Fragment1().newInstance();
            case 1:
                return new Fragment2().newInstance();
            case 2:
                return new Fragment3().newInstance();
            default:
                return new Fragment4().newInstance();
        }
    }

    @Override
    public int getCount() {
        return NUMBER_PAGES;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        super.getPageTitle(position);
        return "Tab #"+ (position+1);
    }

}
