package com.example.hellofragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    FragmentManager FM;
    FragmentTransaction FT;

    int frame = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FM  = getSupportFragmentManager();
        FT = FM.beginTransaction();
        Fragment miFragment = new HelloFragment();
        FT.add(R.id.frameLayout_container, miFragment);
        FT.commit();

        LinearLayout main_linear_layout = findViewById(R.id.main_linear_layout);

        main_linear_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment miFragment;
                if (frame == 1 ) {
                    miFragment = new HelloFragment();
                    frame = 0;

                } else {
                    miFragment = new HomeFragment();
                    frame = 1;
                }

                FM  = getSupportFragmentManager();
                FT = FM.beginTransaction();
                FT.add(R.id.frameLayout_container, miFragment);
                FT.commit();


            }
        });
    }
}
