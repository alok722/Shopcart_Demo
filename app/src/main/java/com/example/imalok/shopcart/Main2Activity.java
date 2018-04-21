package com.example.imalok.shopcart;


import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    private BottomNavigationView mMainNav;
    ViewPager viewPager;
    Button love;
    GridLayout mainGrid;

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_nav);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);


        //Bottom Navigator Activity, mapping frame layout
//        mMainFrame = (FrameLayout)findViewById(R.id.main_frame);
        mMainNav = (BottomNavigationView)findViewById(R.id.bottom_nav);

        //setting on Click method for bottom navigation items
        mMainNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                //Making fragment Change for individual functionalitie
//                android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
//                android.support.v4.app.FragmentTransaction transaction = fragmentManager.beginTransaction();

                switch (item.getItemId()){
                    case R.id.bot_home:
                        // mMainNav.setItemBackgroundResource(R.color.white);

                        //this is replace the screen view with fragment content
                        //transaction.replace(R.id.contain,new HomeFragment()).commit();
                        return true;
                    case R.id.bot_offer:
                        //  mMainNav.setItemBackgroundResource(R.color.white);
                        return true;
                    case R.id.bot_cart:
                        //  mMainNav.setItemBackgroundResource(R.color.white);
                        return true;
                    case R.id.bot_search:
                        //mMainNav.setItemBackgroundResource(R.color.white);
                        return true;
                    case R.id.bot_profile:
                        //mMainNav.setItemBackgroundResource(R.color.white);
                        //  transaction.replace(R.id.contain,new Profile()).commit();
                        return true;
                    default:
                        return false;
                }
            }
        });



    }

    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    tab1 tab1=new tab1();
                    return tab1;
                case 1:
                    tab2 tab2=new tab2();
                    return tab2;
                case 2:
                    tab3 tab3=new tab3();
                    return tab3;
            }
            return null;
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "tab 1";
                case 1:
                    return "tab 2";
                case 2:
                    return "tab 3";
            }
            return null;
        }
    }
}

