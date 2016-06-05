package com.geniusmart.module2;

/**
 * Created by geniusmart on 2016/5/30.
 */
public class Client {

    public static void main(String[] args){
        GirlFriendModule girlFriendModule = new GirlFriendModule("气质美女风格");
        BoyComponent build = DaggerBoyComponent.builder().girlFriendModule(girlFriendModule).build();
        Boy boy = build.inject();
        boy.daydayup();

        boy.today();
    }
}
