package com.geniusmart.lazy;

import javax.inject.Inject;

/**
 * Created by geniusmart on 2016/5/30.
 */
public class GirlFriend {

    @Inject
    public GirlFriend(){
        System.out.println("GirlFriend has be instantiated");
    }

    public void hello(){}
}
