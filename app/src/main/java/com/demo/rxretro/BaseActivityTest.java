package com.demo.rxretro;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;


/**
 * Created by Admin on 9/18/2019.
 */

public abstract class BaseActivityTest extends AppCompatActivity{

    @Override
    protected void onCreate( @Nullable Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        onInit();
        onCreate();
    }

    public abstract int onInit();
    public abstract void onCreate();
}
