package com.example.cherry.myapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { // OnCreate : 특정한 상태일 때
        super.onCreate(savedInstanceState);             // super : onCreate를 할 때 꼭 해줘야돼!
        setContentView(R.layout.activity_main); // R은 res의 약자
    }

    public void onbtnclick(View v) {
        Toast.makeText(getApplicationContext(), "Bloody Hell!!", Toast.LENGTH_LONG).show();
    }

}
