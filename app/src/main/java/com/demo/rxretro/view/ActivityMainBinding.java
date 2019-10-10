package com.demo.rxretro.view;


import com.demo.rxretro.viewmodel.LoginViewModel;


/**
 * Created by Admin on 9/19/2019.
 */

interface ActivityMainBinding {

    void setViewModel( LoginViewModel loginViewModel );

    void executePendingBindings();
}
