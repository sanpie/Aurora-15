package com.example.aurora15;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.os.Bundle;
import android.support.v4.view.ViewPager;

public class Art_Mela  extends FragmentActivity {
    ViewPager viewPager=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_art__mela);
        viewPager = (ViewPager)findViewById(R.id.pager);
        android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
        viewPager.setAdapter(new MyAdapter1(fragmentManager));
    }
}

class MyAdapter1 extends FragmentPagerAdapter {

    public MyAdapter1(android.support.v4.app.FragmentManager fm)
    {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {

        Fragment fragment = null;
        if (i == 0) {
            fragment = new Art_MelaA();

        }
        if (i == 1) {
            fragment = new Art_MelaB();

        }
        if (i == 2) {
            fragment = new Art_MelaC();

        }

        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "DESCRIPTION";

        }
        if (position == 1) {
            return "RULES";

        }
        if (position == 2) {
            return "CONTACT";

        }
      return "A";
    }
}