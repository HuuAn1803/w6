package com.example.w6.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.w6.fragment.NowPlayingFragment;
import com.example.w6.fragment.TopRatedFragment;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {


    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new NowPlayingFragment();
            case 1:
                return new TopRatedFragment();
            default:
                return new NowPlayingFragment();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
