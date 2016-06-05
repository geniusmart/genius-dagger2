package com.geniusmart.module2;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2016/6/5.
 */
@Module
public class GirlFriendModule {

    private String mDecorate;

    public GirlFriendModule(String decorate){
        mDecorate = decorate;
    }

    @Provides
    public GirlFriend provideGF(){
        return new GirlFriend(mDecorate);
    }
}
