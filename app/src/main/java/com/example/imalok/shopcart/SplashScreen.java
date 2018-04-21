package com.example.imalok.shopcart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity
{

    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash_screen);

//        getSupportActionBar().hide();

        logo = (ImageView)findViewById(R.id.logo);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
        logo.startAnimation(animation);

        Thread timer = new Thread()
        {

            @Override
            public void run()
            {

                try
                {
                    sleep(3000);
                    Intent intent = new Intent(getApplicationContext(),GetStarted.class);
                    startActivity(intent);
                    finish();
                    super.run();
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }


            }
        };

        timer.start();
    }
}
