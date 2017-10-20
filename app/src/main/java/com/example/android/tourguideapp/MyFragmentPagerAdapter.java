package com.example.android.tourguideapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by nmatveev on 20.10.2017.
 */

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    int NUM_ITEMS = 3;

    public MyFragmentPagerAdapter(FragmentManager fm) {

        super(fm);
    }


    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new MonumentsFragment();
            case 1:
                return new MuseumsFragment();
            case 2:
                return new ParksFragment();
            case 3:
                return new RestaurantsFragment() ;
        }
        return null;
    }

    @Override
    public int getCount() {
        return NUM_ITEMS;
    }
}
