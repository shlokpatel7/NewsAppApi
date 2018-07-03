package com.example.shlokpatel.postfetch;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MyBroadcast extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent.getAction().equals("HelloActivityNews")){
            Intent intent1=new Intent(context,MainActivity.class);
            context.startActivity(intent1);
        }
    }
}
