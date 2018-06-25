package com.example.meri.viewpagerwithtabs;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private TabLayout mPagerTab;

    private TabPagerAdapter mPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewPager = findViewById(R.id.pager);
        mPagerTab = findViewById(R.id.pager_tab);

        mPagerAdapter = new TabPagerAdapter(getSupportFragmentManager());
        mPagerAdapter.addToList();

        mViewPager.setAdapter(mPagerAdapter);

        mPagerTab.setupWithViewPager(mViewPager);
        mPagerTab.setSelectedTabIndicatorColor(Color.RED);

    }
}
