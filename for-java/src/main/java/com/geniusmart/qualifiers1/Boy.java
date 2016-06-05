package com.geniusmart.qualifiers1;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by geniusmart on 2016/5/30.
 */
public class Boy {

    @Inject
    @Named("currentGF")
    GirlFriend currentGirlFriend;

    @Inject
    @Named("exGF")
    GirlFriend exGirlFriend;

    @Inject
    public Boy(){

    }

    public void myGirlFriends() {
        System.out.println("我的现任女友：" + currentGirlFriend);
        System.out.println("我的前女友：" + exGirlFriend);
    }

}
