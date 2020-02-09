package com.wgaham.zh.helloworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class HelloWorldActivity extends AppCompatActivity {
    private static final String TAG = "HelloWorldActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.asd);
        setContentView(R.layout.hello_world_layout);
        Log.d("data","onCreate execute");
        //Log.d(TAG, "onCreate: ");
    }
}
