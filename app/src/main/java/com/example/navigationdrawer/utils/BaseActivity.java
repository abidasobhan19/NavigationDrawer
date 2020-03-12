package com.example.navigationdrawer.utils;

import android.util.Log;
import android.view.Gravity;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;

import com.example.navigationdrawer.R;
import com.example.navigationdrawer.ui.main.nav.NavigationFragment;

public class BaseActivity extends AppCompatActivity {

    Toolbar toolbar;

    FragmentManager manager;
    DrawerLayout mDrawerLayout;

    NavigationFragment drawerFragment;

    public void setupToolbar(int id){
        toolbar = findViewById(id);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
    }

   /* @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if(id==android.R.id.home){
            if(mDrawerLayout.isDrawerOpen(GravityCompat.START)){
                mDrawerLayout.closeDrawer(GravityCompat.START);
            }else {
                mDrawerLayout.openDrawer(GravityCompat.START);
            }
            return  true;
        }
        return super.onOptionsItemSelected(item);
    }*/


    public void setupNavigationDrawer(int id){
        setupToolbar(id);
        manager = getSupportFragmentManager();
        mDrawerLayout = findViewById(R.id.drawer_layout);
        drawerFragment =
                (NavigationFragment) manager.findFragmentById(R.id.navigation_drawer);
        drawerFragment.setup( mDrawerLayout, toolbar);
        //getSupportActionBar().setTitle(Constant.HOME);
        mDrawerLayout.closeDrawer(Gravity.LEFT);
    }



}
