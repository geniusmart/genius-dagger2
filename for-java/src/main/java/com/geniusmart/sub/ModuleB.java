package com.geniusmart.sub;

import dagger.Module;
import dagger.Provides;

/**
 * Created by geniusmart on 2016/6/6.
 */
@Module
public class ModuleB {
    @Provides
    public SomeClassB1 provideSomeClassB1(SomeClassA1 someClassA1) {
        return new SomeClassB1(someClassA1);
    }
}
