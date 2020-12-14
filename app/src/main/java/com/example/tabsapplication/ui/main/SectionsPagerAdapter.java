package com.example.tabsapplication.ui.main;

import android.content.Context;
import android.widget.Switch;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.tabsapplication.Daily;
import com.example.tabsapplication.R;
import com.example.tabsapplication.Today;
import com.example.tabsapplication.Weekly;


public class SectionsPagerAdapter extends FragmentPagerAdapter {

    int numberOfTabs;
    private static final String[] TAB_TITLES = new String[]{"Today","Daily","Weekly"};


    public SectionsPagerAdapter(FragmentManager fm, int numberOfTabs) {
        super(fm);
        this.numberOfTabs = numberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){
            case 0:
                fragment = new Today();
                break;
            case 1:
                fragment = new Daily();
                break;
            case 2:
                fragment = new Weekly();
                break;
        }
        return fragment;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return TAB_TITLES[position];
    }

    @Override
    public int getCount() {

        return numberOfTabs;
    }
}