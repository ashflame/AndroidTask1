package com.example.anastasiab.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "17 минут уже прошло", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "Вызвался onCreate()");
    }

    protected void onPause()
    {
        super.onPause();
        Log.d(TAG, "Вызвался onPause()");
    }
}
