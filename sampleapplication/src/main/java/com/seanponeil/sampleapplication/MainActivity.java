package com.seanponeil.sampleapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.seanponeil.kotlinmethodcounttest.MainKt;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(this, "Hello world!", Toast.LENGTH_LONG).show();
        MainKt.toIntOrNull("blahblah");
    }
}