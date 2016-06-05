package com.geniusmart.module1;

/**
 * Created by geniusmart on 2016/5/30.
 */
public class Client {

    public static void main(String[] args){
        BoyComponent build = DaggerBoyComponent.builder().build();
        com.geniusmart.module1.Boy boy = build.inject();
        boy.daydayup();
    }
}
