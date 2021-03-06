package com.alfr3d;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // attempt at animated Splash screen
        ImageView AnimationView = (ImageView) findViewById(R.id.AnimView);
        AnimationView.setBackgroundResource(R.drawable.animation);
        AnimationDrawable SplashAnimation = (AnimationDrawable) AnimationView.getBackground();

        SplashAnimation.start();

        Thread welcomeThread = new Thread(){

            @Override
            public void run(){
                try{
                    super.run();
                    sleep(700);
                } catch (Exception e){
                    //TODO
                } finally {
                    Intent i = new Intent(SplashActivity.this,MainAlfr3d.class);
                    startActivity(i);
                    finish();
                }
            }
        };
        welcomeThread.start();
    }
}
