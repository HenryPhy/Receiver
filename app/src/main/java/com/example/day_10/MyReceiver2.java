package com.example.day_10;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver2 extends BroadcastReceiver {
    public MyReceiver2() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        intent.getStringExtra("msg");
        Toast.makeText(context, "2", Toast.LENGTH_SHORT).show();
    }
}
