package com.example.aurora15;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.Fragment;

public class MyActivity extends Activity
        implements com.example.aurora15.NavigationDrawerFragment.NavigationDrawerCallbacks {

    /**
     * Fragment managing the behaviors, interactions and presentation of the navigation drawer.
     */
    private NavigationDrawerFragment mNavigationDrawerFragment;

    /**
     * Used to store the last screen title. For use in {@link #restoreActionBar()}.
     */
    private CharSequence mTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_my);

        mNavigationDrawerFragment = (com.example.aurora15.NavigationDrawerFragment)
                getFragmentManager().findFragmentById(R.id.navigation_drawer);
        mTitle = getTitle();

        // Set up the drawer.
        mNavigationDrawerFragment.setUp(
                R.id.navigation_drawer,
                (DrawerLayout) findViewById(R.id.drawer_layout));
    }

    @Override
    public void onNavigationDrawerItemSelected(int position) {
        // update the main content by replacing fragments
        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.container, PlaceholderFragment.newInstance(position + 1))
                .commit();
    }

    public void onSectionAttached(int number) {
        switch (number) {
            case 1:
                mTitle = getString(R.string.title_section1);
               
                break;
            case 2:
                mTitle = getString(R.string.title_section2);
                Aboutus fraga=new Aboutus();
                FragmentManager manager=getFragmentManager();
                FragmentTransaction transaction=manager.beginTransaction();
                transaction.add(R.id.container,fraga, "abc");
                transaction.commit();
                break;
            case 3:
                mTitle = getString(R.string.title_section3);
                Events fra=new Events();
                FragmentManager manager1=getFragmentManager();
                FragmentTransaction transaction1=manager1.beginTransaction();
                transaction1.add(R.id.container,fra, "abc");
                transaction1.commit();
                break;
            case 4:
                mTitle = getString(R.string.title_section4);
               
                break;
            case 5:
                mTitle = getString(R.string.title_section5);

            	 Intent j=new Intent(this, Schedule.class) ;
                 startActivity(j);
                break;
           case 6:
                mTitle = getString(R.string.title_section6);
                MainActivity ma=new MainActivity();
                FragmentManager manager2=getFragmentManager();
                FragmentTransaction transaction2=manager2.beginTransaction();
                transaction2.add(R.id.container,ma, "abc");
                transaction2.commit();
                break;

            case 7:
                mTitle = getString(R.string.title_section7);
       
                break;
            case 8:
                mTitle = getString(R.string.title_section8);
                Intent lol=new Intent(this,Team.class) ;
                startActivity(lol);
                break;
            case 9:
                mTitle = getString(R.string.title_section9);
               
                break;
        }
    }

    public void restoreActionBar() {
        ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.setTitle(mTitle);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if (!mNavigationDrawerFragment.isDrawerOpen()) {
            // Only show items in the action bar relevant to this screen
            // if the drawer is not showing. Otherwise, let the drawer
            // decide what to show in the action bar.
            getMenuInflater().inflate(R.menu.my, menu);
            restoreActionBar();
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // aus on thetomatically handle click Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
         item.getItemId();

        return super.onOptionsItemSelected(item);
        
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_my, container, false);
            return rootView;
        }

        @Override
        public void onAttach(Activity activity) {
            super.onAttach(activity);
            ((MyActivity) activity).onSectionAttached(
                    getArguments().getInt(ARG_SECTION_NUMBER));
        }
    }

}
