package com.e.wearablepractice;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import app.BroadcastReceiver;

public class BroadcastActivity extends AppCompatActivity {


    BroadcastReceiver broadcastReceiver=new BroadcastReceiver();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broadcast);
    }

    @Override
    protected void onStart(){
        super.onStart();
        IntentFilter intentFilter=new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
        registerReceiver(broadcastReceiver,intentFilter);

    }
    protected void onStop(){
        super.onStop();

        unregisterReceiver(broadcastReceiver );
    }
}
