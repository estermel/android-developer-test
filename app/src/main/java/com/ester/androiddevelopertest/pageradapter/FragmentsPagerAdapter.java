package com.ester.androiddevelopertest.pageradapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mel on 2/17/17.
 */

public class FragmentsPagerAdapter extends FragmentPagerAdapter {

    List<Fragment> innerFragmentList = new ArrayList<>();

    public FragmentsPagerAdapter(FragmentManager fragmentManager){
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        return innerFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return innerFragmentList.size();
    }

    public void addInnerFragment(Fragment innerFragment){
        innerFragmentList.add(innerFragment);
    }
}
