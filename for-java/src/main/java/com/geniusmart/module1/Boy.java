package com.geniusmart.module1;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.inject.Inject;

/**
 * Created by geniusmart on 2016/5/30.
 */
public class Boy {

    @Inject
    SimpleDateFormat mSimpleDateFormat;

    private GirlFriend mGirlFriend;

    @Inject
    public Boy(GirlFriend girlFriend){
        mGirlFriend = girlFriend;
    }

    public void daydayup(){
        System.out.println("sunshine boy");
        mGirlFriend.laugh();
    }

    public void today(){
        String format = mSimpleDateFormat.format(new Date());
        System.out.println(format);
    }
}
