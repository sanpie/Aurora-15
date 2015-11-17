package com.example.aurora15;



import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.view.MenuItem;

/**
 * Created by Geek on 02-11-2014.
 */
public class Schedule extends FragmentActivity {
    ViewPager viewPager=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       
        setContentView(R.layout.schedule);
     //   ActionBar actionBar=getSupportActionBar();
   //     actionBar.setHomeButtonEnabled(true);
   //     actionBar.setDisplayHomeAsUpEnabled(true);
        viewPager = (ViewPager)findViewById(R.id.pager);
        android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
        viewPager.setAdapter(new MyAdapter(fragmentManager));
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem)
    {       
        onBackPressed();
        return true;
    }
}

class MyAdapter extends FragmentPagerAdapter {

    public MyAdapter(android.support.v4.app.FragmentManager fm)
    {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {

        Fragment fragment = null;
        if (i == 0) {
            fragment = new FragmentA();

        }
        if (i == 1) {
            fragment = new FragmentB();

        }
        if (i == 2) {
            fragment = new FragmentC();

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
            return "20th Feb";

        }
        if (position == 1) {
            return "21st Feb";

        }
        if (position == 2) {
            return "22nd Feb";

        }
      return "A";
    }
}