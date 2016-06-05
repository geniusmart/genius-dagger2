package com.geniusmart.qualifiers1;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by geniusmart on 2016/6/5.
 */
@Module
public class GirlFriendModule {

    @Provides
    @Named("exGF")
    public GirlFriend provideExGF(){
        return new GirlFriend("青春靓丽");
    }

    @Provides
    @Named("currentGF")
    public GirlFriend provideCurrentGF(){
        return new GirlFriend("气质温婉",20);
    }
}
