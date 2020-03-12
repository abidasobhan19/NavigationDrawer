package com.example.navigationdrawer.ui.main.nav;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.navigationdrawer.R;
import com.example.navigationdrawer.ui.main.MainActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class NavigationFragment extends Fragment implements View.OnClickListener {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mDrawerToggle;

    LinearLayout llHome,llAbout,llContact,llProfile,llLogout;

    private MainActivity mainActivity;

    public NavigationFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(getActivity() instanceof MainActivity){
            mainActivity = (MainActivity) getActivity();
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_navigation, container, false);

        initView(view);
        return view;
    }

    private void initView(View view) {
        llHome = view.findViewById(R.id.home);
        llAbout = view.findViewById(R.id.about);
        llContact = view.findViewById(R.id.contact);
        llProfile = view.findViewById(R.id.profile);
        llLogout = view.findViewById(R.id.logout);

        llHome.setOnClickListener(this);
        llAbout.setOnClickListener(this);
        llContact.setOnClickListener(this);
        llProfile.setOnClickListener(this);
        llLogout.setOnClickListener(this);
    }


    public void setup(DrawerLayout layout, Toolbar toolbar){
        mDrawerLayout = layout;
        mDrawerToggle = new ActionBarDrawerToggle(mainActivity,mDrawerLayout,toolbar,R.string.drawer_open,R.string.drawer_close);
        mDrawerLayout.addDrawerListener(mDrawerToggle);
        mDrawerLayout.post(new Runnable() {
            @Override
            public void run() {
                Log.d("HHHHH","HHHHH");
                mDrawerToggle.syncState();
            }
        });
    }

    @Override
    public void onClick(View v) {
        if(v==llHome){
            mainActivity.loadHomeFragment();
            mDrawerLayout.closeDrawer(GravityCompat.START);
        }else if(v==llAbout){
            mainActivity.loadAboutFragment();
            mDrawerLayout.closeDrawer(GravityCompat.START);
        }else if(v==llContact){
            mainActivity.loadContactFragment();
            mDrawerLayout.closeDrawer(GravityCompat.START);
        }else if(v==llProfile){

        }else if(v==llLogout){

        }
    }
}
