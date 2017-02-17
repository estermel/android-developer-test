package com.ester.androiddevelopertest.outerfragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ester.androiddevelopertest.R;

public class Tab3Fragment extends Fragment {

    TextView textView;

    public Tab3Fragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_inner_a, container, false);
        textView = (TextView) view.findViewById(R.id.A);
        textView.setText("F");
        return view;
    }
}