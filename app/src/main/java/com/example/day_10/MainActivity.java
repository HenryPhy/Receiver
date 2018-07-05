package com.example.day_10;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyReceiver1 receiver1 = new MyReceiver1();

        IntentFilter Filter = new IntentFilter("Receiver1");

        registerReceiver(receiver1,Filter);
    }

    public void sd(View view) {
        switch (view.getId()){
            case R.id.send://发送广播
                Intent intent = new Intent("Receiver1");
                intent.putExtra("mag","aaa");
                sendBroadcast(intent);
                break;
        }
    }
}
