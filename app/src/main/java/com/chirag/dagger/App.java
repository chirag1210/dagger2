package com.chirag.dagger;

import android.app.Application;

import dagger.internal.DaggerCollections;

/**
 * Created by Chirag on 2/10/2018.
 */

public class App extends Application {

    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        /*component= DaggerApplicationComponent.builder()
                   .applicationModule(new ApplicationModule(this)).build();*/

        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();

    }

    public ApplicationComponent getComponent(){
        return component;
    }
}
