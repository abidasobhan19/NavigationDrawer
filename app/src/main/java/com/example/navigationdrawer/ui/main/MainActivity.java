package com.example.navigationdrawer.ui.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.Gravity;

import com.example.navigationdrawer.R;
import com.example.navigationdrawer.ui.main.about.AboutFragment;
import com.example.navigationdrawer.ui.main.contact.ContactFragment;
import com.example.navigationdrawer.ui.main.home.HomeFragment;
import com.example.navigationdrawer.ui.main.nav.NavigationFragment;
import com.example.navigationdrawer.utils.BaseActivity;

public class MainActivity extends BaseActivity {

    FragmentManager fragmentManager;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupNavigationDrawer(R.id.toolbar);

        fragmentManager = getSupportFragmentManager();

        loadHomeFragment();

    }

    public void loadHomeFragment(){
        fragmentManager.beginTransaction().replace(R.id.main_container,HomeFragment.getInstance()).commit();
    }


    public void loadAboutFragment(){
        fragmentManager.beginTransaction().replace(R.id.main_container,new AboutFragment()).commit();
    }
    public void loadContactFragment(){
        fragmentManager.beginTransaction().replace(R.id.main_container,new ContactFragment()).commit();
    }

}
