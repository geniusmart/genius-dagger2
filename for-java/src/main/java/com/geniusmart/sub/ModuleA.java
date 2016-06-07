package com.geniusmart.sub;

import dagger.Module;
import dagger.Provides;

/**
 * Created by geniusmart on 2016/6/6.
 */
@Module
public class ModuleA {
    @Provides
    public SomeClassA1 provideSomeClassA1() {
        return new SomeClassA1();
    }
}
