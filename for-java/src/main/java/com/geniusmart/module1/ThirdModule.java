package com.geniusmart.module1;

import java.text.SimpleDateFormat;

import dagger.Module;
import dagger.Provides;

/**
 * Created by geniusmart on 2016/6/5.
 */
@Module
public class ThirdModule {

    @Provides
    public SimpleDateFormat provideSDF(){
        return new SimpleDateFormat("YYYY-MM-dd");
    }
}
