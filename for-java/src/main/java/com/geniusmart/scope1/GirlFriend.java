package com.geniusmart.scope1;

import javax.inject.Inject;

/**
 * Created by geniusmart on 2016/5/30.
 */
public class GirlFriend {

    @Inject
    public GirlFriend() {
    }

    public void who() {
        System.out.println("GirlFriend:" + this.hashCode());
    }
}
