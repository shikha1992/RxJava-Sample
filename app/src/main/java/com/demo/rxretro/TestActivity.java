package com.demo.rxretro;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.util.Log;


/**
 * Created by Admin on 9/5/2019.
 */

public class TestActivity  extends BaseActivity {

    @Override
    public void printMessage( String message ) {
        super.printMessage(message);
    }

    @Override
    public void onCreate() {
        printMessage("");
    }

    @Override
    public int initView() {
        return R.layout.activity_main;
    }


}