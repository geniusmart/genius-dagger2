package com.geniusmart.module1;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2016/6/5.
 */
@Module
public class GirlFriendModule {

    /**
     * 方法名任意，通过返回值决定实例化的对象
     * @return
     */
    @Provides
    public GirlFriend provideGF(){
        return new GirlFriend("青春靓丽风格");
    }
}
