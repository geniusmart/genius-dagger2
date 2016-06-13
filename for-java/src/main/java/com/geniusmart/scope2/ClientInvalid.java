package com.geniusmart.scope2;

/**
 * Created by geniusmart on 2016/5/30.
 */
public class ClientInvalid {

    public static void main(String[] args){

        MainModule mainModule = new MainModule();

        MainConponent build1 = DaggerMainConponent.builder().mainModule(mainModule).build();
        GirlFriend girlFriend1 = build1.inject();
        GirlFriend girlFriend2 = build1.inject();
        girlFriend1.who();
        girlFriend2.who();

        Boy boy = build1.injectd();
        boy.myGirlFriend();

        //此时的GirlFriend的单例失效了
        MainConponent build2 = DaggerMainConponent.builder().mainModule(mainModule).build();
        GirlFriend girlFriend3 = build2.inject();
        girlFriend3.who();

    }
}
