package com.example.imalok.shopcart;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import java.util.Timer;
import java.util.TimerTask;

public class GetStarted extends AppCompatActivity
{
    ViewPager viewPager;
    SliderAdapter adapter;
    Button get_started;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        //Requesting full screen view Programmatically
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        getSupportActionBar().hide();

        setContentView(R.layout.activity_get_started);

        //mapping
        get_started = (Button)findViewById(R.id.get_started_btn);
        //Setting OnClick
        get_started.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(GetStarted.this,SignIn.class);
                startActivity(i);
            }
        });

        //mapping for applying slider effect from other java file
        viewPager = (ViewPager)findViewById(R.id.get_started_slider);
        adapter = new SliderAdapter(this);
       // viewPager.setPageTransformer(true,new DepthPageTransformer());
        viewPager.setAdapter(adapter);

        //setting auto-slide time
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new timertask(),4000,4000);
    }

    //auto slide image function
    public class timertask extends TimerTask{

        @Override
        public void run() {
            GetStarted.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if (viewPager.getCurrentItem() == 0){
                        viewPager.setCurrentItem(1);
                    } else if (viewPager.getCurrentItem() == 1){
                        viewPager.setCurrentItem(2);
                    }else {
                        viewPager.setCurrentItem(0);
                    }
                }
            });
        }
    }
}
