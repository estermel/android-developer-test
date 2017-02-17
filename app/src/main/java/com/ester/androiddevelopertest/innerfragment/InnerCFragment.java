package com.ester.androiddevelopertest.innerfragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ester.androiddevelopertest.R;


public class InnerCFragment extends Fragment {

    TextView textView;

    public InnerCFragment() {
        // Required empty public constructor
    }
    public static InnerCFragment newInstance() {
        return new InnerCFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_inner_a, container, false);
        textView = (TextView) view.findViewById(R.id.A);
        textView.setText("C");
        return view;
    }
}
