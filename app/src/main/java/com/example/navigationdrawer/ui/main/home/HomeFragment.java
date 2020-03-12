package com.example.navigationdrawer.ui.main.home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navigationdrawer.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private static HomeFragment homeFragment;

    private HomeFragment() {
        // Required empty public constructor
        Log.d("YYYYYY","HomeFragment Called");
    }

    public static HomeFragment getInstance(){
        if(homeFragment==null){
            homeFragment = new HomeFragment();
        }
        return homeFragment;
    }





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }
}
