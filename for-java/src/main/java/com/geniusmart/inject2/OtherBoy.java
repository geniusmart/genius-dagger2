package com.geniusmart.inject2;

import javax.inject.Inject;

/**
 * Created by geniusmart on 2016/6/8.
 */
public class OtherBoy {

    @Inject
    GirlFriend mGirlFriend;

    @Inject
    public OtherBoy(){

    }

    public void daydayup(){
        System.out.println("sunshine boy");
        mGirlFriend.laugh();
    }
}
