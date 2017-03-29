package com.nehvin.s05e66timers;

import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new CountDownTimer(10000, 1000) {

            @Override
            public void onTick(long millisecondsToFinish)
            {
                Log.i("Seconds to finish: ", String.valueOf(millisecondsToFinish/1000));
            }

            @Override
            public void onFinish()
            {
                Log.i("Info", "finally done !!!!!!!!!!!!!!!!!!!!!!!!!!!");
            }
        }.start();

//        final Handler handler = new Handler();
//        Runnable run = new Runnable() {
//            @Override
//            public void run() {
//                // insert code here to run as defined by handler
//
//                Log.i("info", "This is printed every 2 seconds");
//                handler.postDelayed(this, 2000);
//
//            }
//        };
//        handler.post(run);
    }
}