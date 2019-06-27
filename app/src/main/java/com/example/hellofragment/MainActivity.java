package com.example.hellofragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements HelloFragment.OnHelloFragmentListener {

    FragmentManager FM;
    FragmentTransaction FT;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FM  = getSupportFragmentManager();
        FT = FM.beginTransaction();
        Fragment miFragment = new HelloFragment();
        FT.add(R.id.frameLayout_container, miFragment);
        FT.commit();

        // LinearLayout main_linear_layout = findViewById(R.id.main_linear_layout);


    }

    @Override
    public void clickOnLayer(int value) {

        Fragment miFragment;
        if (value == 0 ) {
            miFragment = new HelloFragment();

        } else {
            miFragment = new HomeFragment();

        }

        FM  = getSupportFragmentManager();
        FT = FM.beginTransaction();
        FT.add(R.id.frameLayout_container, miFragment);
        FT.commit();

    }
}
