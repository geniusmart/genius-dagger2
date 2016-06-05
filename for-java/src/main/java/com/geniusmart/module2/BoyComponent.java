package com.geniusmart.module2;

import dagger.Component;

/**
 * Created by geniusmart on 2016/5/30.
 */
@Component(modules = {GirlFriendModule.class, ThirdModule.class})
public interface BoyComponent {
    Boy inject();
}
