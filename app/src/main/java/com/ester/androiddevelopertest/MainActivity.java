package com.ester.androiddevelopertest;

import android.graphics.drawable.GradientDrawable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.ester.androiddevelopertest.outerfragment.Tab1Fragment;
import com.ester.androiddevelopertest.outerfragment.Tab2Fragment;
import com.ester.androiddevelopertest.outerfragment.Tab3Fragment;
import com.ester.androiddevelopertest.pageradapter.PagerAdapter;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.pager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);

        View root = tabLayout.getChildAt(0);
        if(root instanceof LinearLayout){
            ((LinearLayout) root).setShowDividers(LinearLayout.SHOW_DIVIDER_MIDDLE);
            GradientDrawable drawable = new GradientDrawable();
            drawable.setColor(getResources().getColor(R.color.white));
            drawable.setSize(3,1);
            ((LinearLayout) root).setDividerPadding(20);
            ((LinearLayout) root).setDividerDrawable(drawable);
        }
    }

    private void setupViewPager(ViewPager viewPager) {
        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new Tab1Fragment());
        adapter.addFragment(new Tab2Fragment());
        adapter.addFragment(new Tab3Fragment());
        viewPager.setAdapter(adapter);
    }
}
