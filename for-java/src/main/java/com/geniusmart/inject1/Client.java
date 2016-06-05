package com.geniusmart.inject1;

/**
 * Created by geniusmart on 2016/5/30.
 */
public class Client {
    public static void main(String[] args) {
        BoyComponent boyComponent = DaggerBoyComponent.builder().build();
        Boy boy = boyComponent.inject();
        boy.daydayup();
    }
}
