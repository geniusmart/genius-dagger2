package com.geniusmart.scope2;

/**
 * Created by geniusmart on 2016/5/30.
 */
public class Client {

    public static void main(String[] args){
        MainConponent build = DaggerMainConponent.builder().
                mainModule(new MainModule()).build();
        GirlFriend girlFriend1 = build.inject();
        GirlFriend girlFriend2 = build.inject();
        girlFriend1.who();
        girlFriend2.who();

        Boy boy = build.injectd();
        boy.myGirlFriend();
    }
}
