package com.geniusmart.scope1;

/**
 * Created by geniusmart on 2016/5/30.
 */
public class Client {

    public static void main(String[] args){
        MainConponent build = DaggerMainConponent.builder().build();
        GirlFriend girlFriend = build.injectGF();
        girlFriend.who();

        Boy boy = build.injectBoy();
        //每次实例化出来的GirlFriend对象都不是同一个
        boy.myGirlFriend();
    }
}
