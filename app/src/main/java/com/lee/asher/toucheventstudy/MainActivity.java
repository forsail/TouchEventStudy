package com.lee.asher.toucheventstudy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    MyLinearLayout llContainer;
    MyTextView tvHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        llContainer = (MyLinearLayout) findViewById(R.id.ll_container);
        tvHello = (MyTextView) findViewById(R.id.tv_hello);

        llContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "hello linearlayout", Toast.LENGTH_LONG).show();
            }
        });

        tvHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "hello textview", Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d(TAG, "dispatchTouchEvent: " + super.dispatchTouchEvent(ev));
        return super.dispatchTouchEvent(ev);
    }


}
