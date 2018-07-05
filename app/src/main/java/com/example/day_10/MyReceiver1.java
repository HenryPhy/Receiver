package com.example.day_10;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyReceiver1 extends BroadcastReceiver {
    public MyReceiver1() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {

       intent.getStringExtra("msg");
        Toast.makeText(context, "1", Toast.LENGTH_SHORT).show();

    }

}
