package com.demo.rxretro;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;


/**
 * Created by Admin on 9/5/2019.
 */

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onCreate( @Nullable Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(initView());
        onCreate();
    }

    public void printMessage(String message){
        System.out.print(message);

    }

    public abstract void onCreate();
    public abstract int initView();
}