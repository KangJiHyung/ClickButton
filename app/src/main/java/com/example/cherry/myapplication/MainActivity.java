package com.example.cherry.myapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { // OnCreate : Ư���� ������ ��
        super.onCreate(savedInstanceState);             // super : onCreate�� �� �� �� ����ߵ�!
        setContentView(R.layout.activity_main); // R�� res�� ����
    }

    public void onbtnclick(View v) {
        Toast.makeText(getApplicationContext(), "Bloody Hell!!", Toast.LENGTH_LONG).show();
    }

}
