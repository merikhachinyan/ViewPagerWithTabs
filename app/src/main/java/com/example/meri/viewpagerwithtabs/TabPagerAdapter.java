package com.example.meri.viewpagerwithtabs;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.meri.viewpagerwithtabs.fragments.PagerFragment;

import java.util.ArrayList;
import java.util.List;

public class TabPagerAdapter extends FragmentPagerAdapter{

    private List<String> mImages = new ArrayList<>();

    private PagerFragment pagerFragment;

    public TabPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        pagerFragment = new PagerFragment();
        pagerFragment.setFields(mImages, position);
        return pagerFragment;
    }

    @Override
    public int getCount() {
        return mImages.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return "Tab " + (position + 1);
    }

    public void addToList(){
        mImages.add("http://www.technocrazed.com/wp-content/uploads/2015/01/Using-Arabic-Urdu-Persian-And-Other-Languages-Fonts-In-Android-App-Development-1.jpg");
        mImages.add("https://techcrunch.com/wp-content/uploads/2018/05/android-jetpack.jpg?w=730&crop=1");
        mImages.add("http://fans-android.com/wp-content/uploads/2016/05/android.jpg");
    }
}
