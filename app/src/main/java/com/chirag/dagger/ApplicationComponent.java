package com.chirag.dagger;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Chirag on 2/10/2018.
 */


@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(MainActivity target);

}
