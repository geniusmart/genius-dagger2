package com.geniusmart.scope2;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by geniusmart on 2016/5/30.
 */
@Singleton
public class GirlFriend {

    @Inject
    public GirlFriend() {
    }

    public void who() {
        System.out.println("GirlFriend:" + this.hashCode());
    }
}
