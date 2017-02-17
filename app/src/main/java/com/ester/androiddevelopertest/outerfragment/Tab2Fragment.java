package com.ester.androiddevelopertest.outerfragment;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ester.androiddevelopertest.R;
import com.ester.androiddevelopertest.innerfragment.InnerDFragment;
import com.ester.androiddevelopertest.innerfragment.InnerEFragment;
import com.ester.androiddevelopertest.pageradapter.FragmentsPagerAdapter;
import com.ester.androiddevelopertest.innerfragment.InnerAFragment;
import com.ester.androiddevelopertest.innerfragment.InnerBFragment;
import com.ester.androiddevelopertest.innerfragment.InnerCFragment;


public class Tab2Fragment extends Fragment {

    private ViewPager viewPager;
    private TabLayout tabLayout;

    public Tab2Fragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tab1, container, false);

        viewPager = (ViewPager) view.findViewById(R.id.pager_tab1);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) view.findViewById(R.id.tab_inner1_layout);
        tabLayout.setupWithViewPager(viewPager);

        return view;
    }


    private void setupViewPager(ViewPager viewPager) {
        FragmentsPagerAdapter adapter = new FragmentsPagerAdapter(getChildFragmentManager());
        adapter.addInnerFragment(new InnerDFragment());
        adapter.addInnerFragment(new InnerEFragment());
        viewPager.setAdapter(adapter);
    }
}
