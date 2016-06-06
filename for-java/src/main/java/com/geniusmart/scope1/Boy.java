package com.geniusmart.scope1;

import javax.inject.Inject;

/**
 * Created by geniusmart on 2016/5/31.
 */
public class Boy {

    @Inject
    public Boy(){

    }

    @Inject
    GirlFriend mGirlFriend;

    public void myGirlFriend(){
        mGirlFriend.who();
    }
}
