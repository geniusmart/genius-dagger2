package com.geniusmart.lazy;

import javax.inject.Inject;

import dagger.Lazy;

/**
 * Created by geniusmart on 2016/5/30.
 */
public class Boy {

    @Inject
    GirlFriend exGirlFriend;
    @Inject
    Lazy<GirlFriend> currentGirlFriend;

    @Inject
    public Boy(){
    }

    public void findGF(){
        currentGirlFriend.get().hello();
    }
}
